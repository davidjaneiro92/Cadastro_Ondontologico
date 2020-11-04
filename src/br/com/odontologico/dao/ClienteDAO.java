package br.com.odontologico.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import br.com.odontologico.model.Cliente;
import br.com.odontologico.ultil.ConnectionFactory;

public class ClienteDAO {
	
	private Cliente cliente;
	private java.sql.Connection conn;		//conect ao banco de dados 
	private java.sql.PreparedStatement ps;	//permite execultar querys
	private ResultSet rs;			//tabela

 	 public ClienteDAO() throws Exception {
 		 try {
 			conn = ConnectionFactory.getConection();
 		 }catch(Exception e) {
 			 throw new Exception("Erro ao conectar ao BD!! "+ e.getMessage());
 		 }
 	 }
 		public void salvarCadastro(Cliente cliente) throws Exception {
	 		 try {
	  			String sql = "INSERT INTO CADASTRO(CPF, NOME, RG, SEXO, ESTADO_CIVIL, "
	  					+ "DATA_NACIMENTO, ENDERECO, NUMERO, CEP, MUNICIPIO, UF, "
	  					+ "CELULAR, ALER_MEDICAMENTO)"
	  					+"values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	  			ps = conn.prepareStatement(sql);
	  			ps.setString(1, cliente.getCpf());
	  			ps.setString(2, cliente.getNome());
	  			ps.setString(3, cliente.getRg());
	  			ps.setString(4, cliente.getSexo());
	  			ps.setString(5, cliente.getEstadoCivil());
	  			ps.setString(6, cliente.getDataNacimento());
	  			ps.setString(7, cliente.getEndereco());
	  			ps.setInt(8, cliente.getNumero());
	  			ps.setString(9, cliente.getCep());
	  			ps.setString(10, cliente.getMunicipio());
	  			ps.setString(11, cliente.getUf());
	  			ps.setString(12, cliente.getCelular());
	  			ps.setString(13, cliente.getAlergiaMedicamento());
	  			ps.executeUpdate();
	  					
	  		 }catch(Exception e) {
	  			 throw new Exception("Erro ao Salvar Cadastro!!! "+ e.getMessage());
	  			
	  		 }
	 	 }
	 	 
	  public void salvarConvenio(Cliente cliente) throws Exception {
	 		 try {
	  			String sql = "INSERT INTO CONVENIO(CPF, NOME_CONVENIO, "
	  					+ "NUM_CONVENDIO, TRATAMENTO_CONV, QTS_CONSULTA, VALOR_TOTAL)"
	  					+"values(?,?,?,?,?,?)";
	  			ps = conn.prepareStatement(sql);
	  			ps.setString(1, cliente.getCpf());
	  			ps.setString(2, cliente.getNomeConvenio());
	  			ps.setString(3, cliente.getNumeroConvenio());
	  			ps.setString(4, cliente.getTratamento());
	  			ps.setInt(5, cliente.getQtsConsulta());
	  			ps.setDouble(6, cliente.getValorTotal());
	  			ps.executeUpdate();
	  					
	  		 }catch(Exception e) {
	  			 throw new Exception("Erro ao Salvar Convenio!!! "+ e.getMessage());
	  			
	  		 }
	 	 }
	 	
	 	 public void salvarPagamento(Cliente cliente) throws Exception {
	 		 try {
	  			String sql = "INSERT INTO PAGAMENTO(CPF ,TRATAMENTO_CONV, QTS_CONSULTA, "
	  					+ "FOR_PAGAMENTO, QTS_PARCELA, VALOR_TOTAL)"
	  					+"values(?,?,?,?,?,?)";
	  			ps = conn.prepareStatement(sql);
	  			ps.setString(1, cliente.getCpf());
	  			ps.setString(2, cliente.getTratamento());
	  			ps.setInt(3, cliente.getQtsConsulta());
	  			ps.setString(4, cliente.getFormaPagamento());
	  			ps.setInt(5, cliente.getQtsParcela());
	  			ps.setDouble(6, cliente.getValorTotal());
	  			ps.executeUpdate();
	  					
	  		 }catch(Exception e) {
	  			 throw new Exception("Erro ao Salvar Pagamento!!! "+ e.getMessage());
	  			
	  		 }
	 	 }
	 	 
	 	 public void salvarAgendamento(Cliente cliente) throws Exception {
	 		 try {
	  			String sql = "INSERT INTO AGENDAMENTO(CPF ,TRATAMENTO_CONV,DATA_AGENDAMENTO, HORARIO,"
	  					+ "CONFIRMADO)"
	  					+"values(?,?,?,?,?)";
	  			ps = conn.prepareStatement(sql);
	  			ps.setString(1, cliente.getCpf());
	  			ps.setString(2, cliente.getTratamento());
	  			ps.setString(3, cliente.getDataAgendamento());
	  			ps.setString(4, cliente.getHora());
	  			ps.setInt(5, cliente.getConfirmado());
	  			ps.executeUpdate();
	  					
	  		 }catch(Exception e) {
	  			 throw new Exception("Erro ao Salvar Agendamento!!! "+ e.getMessage());
	  			
	  		 }
	 	 }
	 	 
	 	
	 	public ArrayList<Cliente> listarTodos(String dataAgendamento) throws Exception {
	 		ArrayList<Cliente> lista = new ArrayList<Cliente>();
	 		 try {
	 			 ps = (PreparedStatement) conn.prepareStatement("SELECT AGE.*, CAD.NOME "
	 			 		+ "FROM AGENDAMENTO AGE JOIN CADASTRO CAD ON AGE.CPF = CAD.CPF WHERE AGE.DATA_AGENDAMENTO=?");
	 			ps.setString(1, dataAgendamento);
	 			 rs = ps.executeQuery();
	 			 while(rs.next()) {
	 				 String cpf = rs.getString("AGE.CPF");
	  				 String nome = rs.getString("CAD.NOME");
	  				 String tratamento = rs.getString("AGE.TRATAMENTO_CONV");
	  				 //String dataAgendamento = rs.getString("AGE.DATA_AGENDAMENTO");
	  				 String hora = rs.getString("AGE.HORARIO");
	  				 int confirmado = rs.getInt("AGE.CONFIRMADO");
	  				cliente = new Cliente(nome, cpf, tratamento, dataAgendamento, hora, confirmado);
	 				 lista.add(cliente);
	 			 }
	 		 return lista;
	 		 }catch(Exception e) {
	  			 throw new Exception("Erro ao lista "+ e.getMessage());
	  		 }
	 	 }
	 	 
	 	public ArrayList<Cliente> listaCadastro() throws Exception {
	 		ArrayList<Cliente> lista = new ArrayList<Cliente>();
	 		 try {
	 			 ps = (PreparedStatement) conn.prepareStatement("SELECT * FROM CADASTRO");
	 			 rs = ps.executeQuery();
	 			 while(rs.next()) {
	 				 String nome = rs.getString("nome");
	 				 String cpf = rs.getString("CPF");
	  				 String rg = rs.getString("RG");
	  				 String sexo = rs.getString("SEXO");
	  				 String estadoCivil = rs.getString("ESTADO_CIVIL");
	  				 String dataNacimento = rs.getString("DATA_NACIMENTO");
	  				 String endereco = rs.getString("endereco");
	  				 int numero = rs.getInt("NUMERO");
	  				 String cep = rs.getString("cep");
	  				 String municipio = rs.getString("municipio");
	  				 String uf = rs.getString("uf");
	  				 String celular = rs.getString("celular");
	  				 String alergiaMedicamento = rs.getString("ALER_MEDICAMENTO");
	  				cliente = new Cliente(nome, cpf, rg, sexo, estadoCivil, dataNacimento,
	  						 endereco,  numero,  cep,  municipio,  uf,  celular, 
	  						  alergiaMedicamento);
	 				 lista.add(cliente);
	 			 }
	 		 return lista;
	 		 }catch(Exception e) {
	  			 throw new Exception("Erro ao lista "+ e.getMessage());
	  		 }
	 	 }
	 	
	 	public ArrayList<Cliente> listarCovenio() throws Exception {
	 		ArrayList<Cliente> lista = new ArrayList<Cliente>();
	 		 try {
	 			 ps = (PreparedStatement) conn.prepareStatement("SELECT CON.*, CAD.NOME FROM CONVENIO CON JOIN CADASTRO CAD ON CAD.CPF = CON.CPF");
	 			 rs = ps.executeQuery();
	 			 while(rs.next()) {
	 			 String cpf = rs.getString("CON.CPF");
	 			 String nome = rs.getString("CAD.nome");
 				 String nomeConvenio = rs.getString("CON.NOME_CONVENIO");
 				 String numeroConvenio = rs.getString("CON.NUM_CONVENDIO");
 				 String tratamentoConvenio = rs.getString("CON.TRATAMENTO_CONV");
 				 int qtsConsulta = rs.getInt("CON.QTS_CONSULTA");
 				 double valorTotal = rs.getDouble("CON.VALOR_TOTAL");
 				cliente = new Cliente(cpf, nome, nomeConvenio, numeroConvenio, qtsConsulta, tratamentoConvenio, valorTotal);
	 				 lista.add(cliente);
	 		 }
	 		 return lista;
	 		 }catch(Exception e) {
	  			 throw new Exception("Erro ao lista "+ e.getMessage());
	  		 }
	 	 }
	 	public ArrayList<Cliente> listarPagamento() throws Exception {
	 		ArrayList<Cliente> lista = new ArrayList<Cliente>();
	 		 try {
	 			 ps = (PreparedStatement) conn.prepareStatement("SELECT PAG.*, CAD.NOME FROM PAGAMENTO PAG JOIN CADASTRO CAD ON CAD.CPF = PAG.CPF");
	 			 rs = ps.executeQuery();
	 			 while(rs.next()) {
	 				 String cpf = rs.getString("PAG.CPF");
	 				 String nome = rs.getString("CAD.nome");
		  			 int qtsConsulta = rs.getInt("PAG.QTS_CONSULTA");
	  				 String tratamento = rs.getString("PAG.TRATAMENTO_CONV");
	  				 String formaPagamento = rs.getString("PAG.FOR_PAGAMENTO");
	  				 int qtsParcela = rs.getInt("PAG.QTS_PARCELA");
	  				 double valorTotal = rs.getDouble("PAG.VALOR_TOTAL");
	  				 
	  				cliente = new Cliente(nome, cpf,  qtsConsulta,  tratamento,  formaPagamento,  qtsParcela, valorTotal);
	 				 lista.add(cliente);
	 		 }
	 		 return lista;
	 		 }catch(Exception e) {
	  			 throw new Exception("Erro ao lista "+ e.getMessage());
	  		 }
	 	 }
	 	 
	 	public Cliente consultarCadastro (String cpf) throws Exception {
	  		 try {
	  			 ps = conn.prepareStatement("SELECT * FROM CADASTRO WHERE CPF=?");
	  			 ps.setString(1, cpf);
	  			 rs = ps.executeQuery();
	  			 if(rs.next()) {
	  				 String nome = rs.getString("nome");
	  				 String rg = rs.getString("RG");
	  				 String sexo = rs.getString("SEXO");
	  				 String estadoCivil = rs.getString("ESTADO_CIVIL");
	  				 String dataNacimento = rs.getString("DATA_NACIMENTO");
	  				 String endereco = rs.getString("endereco");
	  				 int numero = rs.getInt("NUMERO");
	  				 String cep = rs.getString("cep");
	  				 String municipio = rs.getString("municipio");
	  				 String uf = rs.getString("uf");
	  				 String celular = rs.getString("celular");
	  				 String alergiaMedicamento = rs.getString("ALER_MEDICAMENTO");
	  				 
	  				cliente = new Cliente(nome, cpf, rg, sexo, estadoCivil, dataNacimento,
	  						 endereco,  numero,  cep,  municipio,  uf,  celular, 
	  						  alergiaMedicamento);
	  			 }
	  		 return cliente;
	  		 }catch(Exception e) {
	   			 throw new Exception("Erro ao Consultar Cadastro "+ e.getMessage());
	   		 }
	  	 }
	 	
	 	
	 	
	 	public Cliente consultarConvenio (String cpf) throws Exception {
	  		 try {
	  			 ps = conn.prepareStatement("SELECT CON.*, CAD.NOME FROM CONVENIO CON JOIN CADASTRO CAD ON CAD.CPF = CON.CPF WHERE CON.CPF=?");
	  			 ps.setString(1, cpf);
	  			 rs = ps.executeQuery();
	  			 if(rs.next()) {
	  				 String nome = rs.getString("CAD.nome");
	  				 String nomeConvenio = rs.getString("CON.NOME_CONVENIO");
	  				 String numeroConvenio = rs.getString("CON.NUM_CONVENDIO");
	  				 String tratamentoConvenio = rs.getString("CON.TRATAMENTO_CONV");
	  				 int qtsConsulta = rs.getInt("CON.QTS_CONSULTA");
	  				 double valorTotal = rs.getDouble("CON.VALOR_TOTAL");
	  				 
	  				cliente = new Cliente(cpf, nome, nomeConvenio, numeroConvenio, qtsConsulta, tratamentoConvenio, valorTotal);
	  			 }
	  		 return cliente;
	  		 }catch(Exception e) {
	   			 throw new Exception("Erro ao Consultar Convenio "+ e.getMessage());
	   		 }
	  	 }
	 	 
	 	public Cliente consultarPagamento (String cpf) throws Exception {
	  		 try {
	  			 ps = conn.prepareStatement("SELECT PAG.*, CAD.NOME FROM PAGAMENTO PAG JOIN CADASTRO CAD ON CAD.CPF = PAG.CPF WHERE PAG.CPF =?");
	  			 ps.setString(1, cpf);
	  			 rs = ps.executeQuery();
	  			 if(rs.next()) {
	  			 String nome = rs.getString("CAD.nome");
	  			 int qtsConsulta = rs.getInt("PAG.QTS_CONSULTA");
  				 String tratamento = rs.getString("PAG.TRATAMENTO_CONV");
  				 String formaPagamento = rs.getString("PAG.FOR_PAGAMENTO");
  				 int qtsParcela = rs.getInt("PAG.QTS_PARCELA");
  				 double valorTotal = rs.getDouble("PAG.VALOR_TOTAL");
  				 
  				cliente = new Cliente(nome, cpf,  qtsConsulta,  tratamento,  formaPagamento,  qtsParcela, valorTotal);
	  			 }
	  		 return cliente;
	  		 }catch(Exception e) {
	   			 throw new Exception("Erro ao Consultar Pagamento !!!"+ e.getMessage());
	   		 }
	  	 }
	 	 
	 	public Cliente consultarAgendamento (String cpf) throws Exception {
	  		 try {
	  			 ps = conn.prepareStatement("SELECT AGE.*, CAD.NOME, CAD.ALER_MEDICAMENTO FROM AGENDAMENTO AGE JOIN CADASTRO CAD ON CAD.CPF = AGE.CPF WHERE AGE.CPF =?");
	  			 ps.setString(1, cpf);
	  			 rs = ps.executeQuery();
	  			 if(rs.next()) {
	  				 String nome = rs.getString("CAD.NOME");
	  				 String tratamento = rs.getString("AGE.TRATAMENTO_CONV");
	  				 String dataAgendamento = rs.getString("AGE.DATA_AGENDAMENTO");
	  				 String hora = rs.getString("AGE.HORARIO");
	  				 int confirmado = rs.getInt("AGE.CONFIRMADO");
	  				 String alergiaMedicamento = rs.getString("CAD.ALER_MEDICAMENTO");
	  				cliente = new Cliente( nome,  cpf,  tratamento,  dataAgendamento, hora,  confirmado, alergiaMedicamento);
	  			 }
	  		 return cliente;
	  		 }catch(Exception e) {
	   			 throw new Exception("Erro ao Consultar Nota e Falta "+ e.getMessage());
	   		 }
	  	 }
	 	/*
	 	
	 	
	 	public Aluno consultarBoletim (int rgmLeitor, String diciplinaAluno, String semestreAluno) throws Exception {
	  		 try {
	  			 ps = conn.prepareStatement("SELECT DAD.CURCO, DAP.NOME, NTF.* "
	  			 		+ "FROM DADOS DAD JOIN DADOS_PESSOAL DAP ON DAD.RGM = DAP.RGM "
	  			 		+ "JOIN NOTAS_FALTAS NTF ON DAP.RGM = NTF.RGM WHERE NTF.RGM=? AND NTF.DICIPLINA=? AND NTF.SEMESTRE=?");
	  			 ps.setInt(1, rgmLeitor);
	  			 ps.setString(2, diciplinaAluno);
		  		 ps.setString(3, semestreAluno);
	  			 rs = ps.executeQuery();
	  			 if(rs.next()) {
	  				 String nomeAluno = rs.getString("DAP.NOME");
	  				 String curcoAluno = rs.getString("DAD.CURCO");
	  				 String notaAluno = rs.getString("NTF.NOTA");
	  				 int faltaAluno = rs.getInt("FALTA");
	  				aluno = new Aluno(rgmLeitor,nomeAluno, curcoAluno, diciplinaAluno, semestreAluno, notaAluno, faltaAluno);
	  			 }
	  		 return aluno;
	  		 }catch(Exception e) {
	   			 throw new Exception("Erro ao Consultar Nota e Falta  "+ e.getMessage());
	   		 }
	  	 }
	 	 */
	 		 public void alterarCadastro(Cliente cliente) throws Exception {
	 	 		 try {
	 	  			String sql = "UPDATE CADASTRO SET NOME=?,"
	 	  					+ " RG=?, SEXO=?, ESTADO_CIVIL=?, DATA_NACIMENTO=?, "
	 	  					+ "ENDERECO=?, NUMERO=?, CEP=?, MUNICIPIO=?, UF=?, CELULAR=?, ALER_MEDICAMENTO=?"
	 	  					+"WHERE CPF=?";
	 	  			ps = conn.prepareStatement(sql);
	 	  			ps.setString(1, cliente.getNome());
	 	  			ps.setString(2, cliente.getRg());
	 	  			ps.setString(3, cliente.getSexo());
	 	  			ps.setString(4, cliente.getEstadoCivil());
	 	  			ps.setString(5, cliente.getDataNacimento());
	 	  			ps.setString(6, cliente.getEndereco());
	 	  			ps.setInt(7, cliente.getNumero());
	 	  			ps.setString(8, cliente.getCep());
	 	  			ps.setString(9, cliente.getMunicipio());
	 	  			ps.setString(10, cliente.getUf());
	 	  			ps.setString(11, cliente.getCelular());
	 	  			ps.setString(12, cliente.getAlergiaMedicamento());
	 	  			ps.setString(13, cliente.getCpf());
	 	  			ps.executeUpdate();		
	 	  		 }catch(Exception e) {
	 	  		 throw new Exception("Erro ao altera cadastro "+ e.getMessage());
	 	 	 }
	 	 }
	 		 
	 		public void alterarConvenio(Cliente cliente) throws Exception {
	 		 try {
	 	  			String sql = "UPDATE CONVENIO SET  NOME_CONVENIO=?, NUM_CONVENDIO=?, TRATAMENTO_CONV=?, QTS_CONSULTA=?, VALOR_TOTAL=?"
	 	  					+"WHERE CPF=?";
	 	  			ps = conn.prepareStatement(sql);
	 	  			ps.setString(1, cliente.getNomeConvenio());
	 	  			ps.setString(2, cliente.getNumeroConvenio());
	 	  			ps.setString(3, cliente.getTratamento());
	 	  			ps.setInt(4, cliente.getQtsConsulta());
	 	  			ps.setDouble(5, cliente.getValorTotal());
	 	  			ps.setString(6, cliente.getCpf());
	 	  			ps.executeUpdate();		
	 	  		 }catch(Exception e) {
	 	  		 throw new Exception("Erro ao altera "+ e.getMessage());
	 	 	 }
	 	 } 
	 		
	 	public void alterarPagamento (Cliente cliente) throws Exception {
		 		 try {
		 	  			String sql ="UPDATE PAGAMENTO SET TRATAMENTO_CONV=?, QTS_CONSULTA=?, FOR_PAGAMENTO=?, QTS_PARCELA=?, VALOR_TOTAL=?"
		 	  					+ "WHERE CPF=?";
		 	  			ps = conn.prepareStatement(sql);
		 	  			ps.setString(1, cliente.getTratamento());
		 	  			ps.setInt(2, cliente.getQtsConsulta());
		 	  			ps.setString(3, cliente.getFormaPagamento());
		 	  			ps.setInt(4, cliente.getQtsParcela());
		 	  			ps.setDouble(5, cliente.getValorTotal());
		 	  			ps.setString(6, cliente.getCpf());
		 	  			ps.executeUpdate();		
		 	  		 }catch(Exception e) {
		 	  		 throw new Exception("Erro ao altera "+ e.getMessage());
		 	 	 }
		 	 } 
	 		
	 	public void alterarAgendamento (Cliente cliente) throws Exception {
	 		 try {
	 	  			String sql ="UPDATE AGENDAMENTO SET TRATAMENTO_CONV=?, DATA_AGENDAMENTO=?, CONFIRMADO=? WHERE CPF=?";
	 	  			ps = conn.prepareStatement(sql);
	 	  			ps.setString(1, cliente.getTratamento());
	 	  			ps.setString(2, cliente.getDataAgendamento());
	 	  			ps.setInt(3, cliente.getConfirmado());
	 	  			ps.setString(4, cliente.getCpf());
	 	  			ps.executeUpdate();		
	 	  		 }catch(Exception e) {
	 	  		 throw new Exception("Erro ao altera "+ e.getMessage());
	 	 	 }
	 	 } 
		
	 	public void excluirCadastro(String cpf) throws Exception {
	 		 try {
	  			String sql = "DELETE FROM CADASTRO "
	  					+"WHERE CPF=?";
	  			ps = conn.prepareStatement(sql);
	  			ps.setString(1, cpf);
	  			ps.executeUpdate();	
	  		 }catch(Exception e) {
	  		throw new Exception("Erro ao excluir "+ e.getMessage());
	  	}
	 }
	 	
	 		public void excluirConvenio(String cpf) throws Exception {
		 		 try {
		  			String sql = "DELETE FROM CONVENIO "
		  					+"WHERE CPF=?";
		  			ps = conn.prepareStatement(sql);
		  			ps.setString(1, cpf);
		  			ps.executeUpdate();	
		  		 }catch(Exception e) {
		  		throw new Exception("Erro ao excluir "+ e.getMessage());
		  	}
		 }
	
	 		public void excluirPagamento(String cpf) throws Exception {
		 		 try {
		  			String sql = "DELETE FROM PAGAMENTO "
		  					+"WHERE CPF=?";
		  			ps = conn.prepareStatement(sql);
		  			ps.setString(1, cpf);
		  			ps.executeUpdate();	
		  		 }catch(Exception e) {
		  		throw new Exception("Erro ao excluir "+ e.getMessage());
		  	}
		 }
	 	
	 		public void excluirAgendamento(String cpf) throws Exception {
		 		 try {
		  			String sql = "DELETE FROM AGENDAMENTO "
		  					+"WHERE CPF=? ";
		  			ps = conn.prepareStatement(sql);
		  			ps.setString(1, cpf);
		  			ps.executeUpdate();	
		  		 }catch(Exception e) {
		  		throw new Exception("Erro ao excluir "+ e.getMessage());
		  	}
		 }

		
	}

