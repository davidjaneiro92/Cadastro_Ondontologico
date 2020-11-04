package br.com.odontologico.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;


import br.com.odontologico.dao.ClienteDAO;
import br.com.odontologico.model.Cliente;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.TextArea;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.Toolkit;



public class Tela extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArquivo;
	private JTabbedPane tabbedPane;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblNome_1;
	private JLabel lblRh_1;
	private JLabel lblCpf_1;
	private JLabel lblSexo_1;
	private JLabel lblEstadoCivil_1;
	private JLabel lblEndereo_1;
	private JLabel lblDataNacimeno_1;
	private JLabel lblNumero_1;
	private JTextField txtNome;
	private JComboBox cbxSexo;
	private JComboBox cbxEstadoCivil;
	private JTextField txtEndereco;
	private JTextField txtNumero;
	private JLabel lblCep;
	private JLabel lblMunicipio;
	private JLabel lblUf;
	private JTextField txtMunicipio;
	private JComboBox cbxUf;
	private JLabel lblAlergiaHAugum;
	private JLabel lblCpf;
	private JLabel lblTratamento;
	private JLabel lblNumero;
	private JLabel lblNomeDaCovenio;
	private JLabel lblQuantasConsuta;
	private JLabel lblCpf_2;
	private JLabel lblNomeDaCovenio_1;
	private JLabel lblNumero_2;
	private JLabel lblTratamento_1;
	private JLabel lblQuantasConsuta_1;
	private JLabel lblParcelamento;
	private JComboBox cbxTratamentoPagamento;
	private JComboBox cbxQtsConsultaPagamento;
	private JComboBox cbxFormaPagamento;
	private JComboBox cbxParcelamentoPagamento;
	private JLabel lblValorDaParcela;
	private JLabel txtValorParcelaPagamento;
	private JComboBox cbxNomeConvenio;
	private JTextField txtNumeroConvenio;
	private JComboBox cbxTratamentoConvenio;
	private JComboBox cbxQtsConsultaConvenio;
	private JTextField txtValorTotalPagamento;
	private JLabel lblNumero_3;
	private JTextField txtValorTotalConvenio;
	private JLabel lblCpf_3;
	private JLabel lblNumero_4;
	private JLabel lblTratamento_2;
	private JComboBox cbxTratamentoAgendamento;
	private JLabel lblNumero_5;
	private JLabel lblData;
	private JCheckBox ckcbxConfimadoAgendamento;
	private JLabel lblConfirmado;
	private JLabel lblAlergiaDeMedicamento;
	private JMenuItem mntmSalvar;
	private JMenuItem mntmAlterar;
	private JMenuItem mntmExcluir;
	private JMenuItem mntmConsultar;
	private JMenuItem mntmSair;
	private JMenu mnConvenio;
	private JMenuItem mntmSalvar_1;
	private JMenuItem mntmAlterar_1;
	private JMenuItem mntmExcluir_1;
	private JMenuItem mntmConsultar_1;
	private JMenu mnNewMenu;
	private JMenuItem mntmSalvar_2;
	private JMenuItem mntmAlterar_2;
	private JMenuItem mntmConsltar;
	private JMenuItem mntmExcluir_2;
	private JMenu mnAgendamento;
	private JMenuItem mntmSalvar_3;
	private JMenuItem mntmAlterar_3;
	private JMenuItem mntmExcluir_3;
	private JMenuItem mntmConsultar_2;
	private JTextField txtAlegiaMedicamento;
	private JPanel panel_4;
	private JLabel lblData_1;
	private JFormattedTextField txtDataBuscar;
	private JLabel lblCelular;
	private Cliente cliente;
	private ClienteDAO dao;
	private JFormattedTextField txtCpf;
	private JFormattedTextField txtRg;
	private JFormattedTextField txtDataNacimeto;
	private JFormattedTextField txtCep;
	private JFormattedTextField txtCelular;
	private JLabel txtNomeConvenio;
	private JLabel txtNomeAgendamento;
	private JLabel txtAlergiaAgendamento;
	private JFormattedTextField txtCpfConvenio;
	private JFormattedTextField txtCpfPagamento;
	private JFormattedTextField txtCpfAgendamento;
	private JFormattedTextField txtDataAgendamento;
	private JLabel txtNomePagamento;
	private JLabel label_1;
	private JMenuItem mntmNovo;
	private JMenuItem mntmNovo_1;
	private JMenuItem mntmNovo_2;
	private JMenuItem mntmNovo_3;
	private JButton btnBuscar;
	private JLabel lblHora;
	private JFormattedTextField txtHora;
	private TextArea txtLista;
	private JButton btnNovo;
	private JButton btnSalvar;
	private JButton btnAlterar;
	private JButton btnExcluir;
	private JButton btnSair;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton btnListarCadastro;
	private JButton btnListaConvenio;
	private JButton btnListaPagamento;
	private JButton btnNovo_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws ParseException 
	 */
	public Tela() throws ParseException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\download1223.png"));
		setTitle("Smart Odonto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 585);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.inactiveCaption);
		setJMenuBar(menuBar);
		
		mnArquivo = new JMenu("Cadastro");
		menuBar.add(mnArquivo);
		
		mntmSalvar = new JMenuItem("Salvar");
		mntmSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//===============  salvar cadastro============
				try {
					
					cliente = new Cliente();
					cliente.setNome(txtNome.getText());
					cliente.setCpf(txtCpf.getText());
					cliente.setRg(txtRg.getText());
					String sexo;
					sexo = (String) cbxSexo.getSelectedItem();
					if(sexo.equals("Selecione uma Opção")) {
						JOptionPane.showMessageDialog(null,"Selecione umas das Opção do Sexo");
					}else if(sexo.equals("Mascolino")){
						cliente.setSexo("M");
					}else if(sexo.equals("Feminino")){
						cliente.setSexo("F");
					}
					
					String civil;
					civil = (String) cbxEstadoCivil.getSelectedItem();
					if(civil.equals("Selecione uma Opção")) {
						JOptionPane.showMessageDialog(null,"Selecione umas das Opção do Sexo");
					}else if(civil.equals("Casado(a)")){
						cliente.setEstadoCivil("C");
					}else if(civil.equals("Solteiro(a)")){
						cliente.setEstadoCivil("S");
					}
					
					cliente.setDataNacimento(txtDataNacimeto.getText());
					cliente.setEndereco(txtEndereco.getText());
					cliente.setNumero(Integer.parseInt(txtNumero.getText()));
					cliente.setCep(txtCep.getText());
					cliente.setMunicipio(txtMunicipio.getText());
					cliente.setUf((String) cbxUf.getSelectedItem());
					cliente.setCelular(txtCelular.getText());
					cliente.setAlergiaMedicamento(txtAlegiaMedicamento.getText());
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					
					dao.salvarCadastro(cliente);
					JOptionPane.showMessageDialog(null,"Salvo com Sucesso ");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Gravar "+e0.getMessage());
					}
				}
				
			
		});
		
		mntmNovo_3 = new JMenuItem("Novo");
		mntmNovo_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//====Novo Cadastro======================
				
				txtNome.setText(null);
				txtCpf.setText(null);
				txtRg.setText(null);
				cbxSexo.setSelectedIndex(0);
				cbxEstadoCivil.setSelectedIndex(0);
				txtDataNacimeto.setText(null);
				txtEndereco.setText(null);
				txtNumero.setText(null);
				txtCep.setText(null);
				txtMunicipio.setText(null);
				cbxUf.setSelectedIndex(0);
				txtCelular.setText(null);
				txtAlegiaMedicamento.setText(null);
			}
		});
		mnArquivo.add(mntmNovo_3);
		mnArquivo.add(mntmSalvar);
		
		mntmAlterar = new JMenuItem("Alterar");
		mntmAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//==============Altera Cadastro===============
	try {
					
					cliente = new Cliente();
					cliente.setNome(txtNome.getText());
					cliente.setCpf(txtCpf.getText());
					cliente.setRg(txtRg.getText());
					String sexo;
					sexo = (String) cbxSexo.getSelectedItem();
					if(sexo.equals("Selecione uma Opção")) {
						JOptionPane.showMessageDialog(null,"Selecione umas das Opção do Sexo");
					}else if(sexo.equals("Mascolino")){
						cliente.setSexo("M");
					}else if(sexo.equals("Feminino")){
						cliente.setSexo("F");
					}
					
					String civil;
					civil = (String) cbxEstadoCivil.getSelectedItem();
					if(civil.equals("Selecione uma Opção")) {
						JOptionPane.showMessageDialog(null,"Selecione umas das Opção do Sexo");
					}else if(civil.equals("Casado(a)")){
						cliente.setEstadoCivil("C");
					}else if(civil.equals("Solteiro(a)")){
						cliente.setEstadoCivil("S");
					}
					
					cliente.setDataNacimento(txtDataNacimeto.getText());
					cliente.setEndereco(txtEndereco.getText());
					cliente.setNumero(Integer.parseInt(txtNumero.getText()));
					cliente.setCep(txtCep.getText());
					cliente.setMunicipio(txtMunicipio.getText());
					cliente.setUf((String) cbxUf.getSelectedItem());
					cliente.setCelular(txtCelular.getText());
					cliente.setAlergiaMedicamento(txtAlegiaMedicamento.getText());
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					
					dao.alterarCadastro(cliente);
					JOptionPane.showMessageDialog(null,"Alterdo com Sucesso ");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Alterar "+e0.getMessage());
					}
				
			}
		});
		mnArquivo.add(mntmAlterar);
		
		mntmExcluir = new JMenuItem("Excluir");
		mntmExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=============Excluir Cadastro====================
				try {
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					int res;
					res = JOptionPane.showConfirmDialog( null,"Tem Certeza quer Excluir o Cadastro? ","Confirma",JOptionPane.YES_NO_OPTION);
					if( res == 0) {
						dao.excluirCadastro(txtCpf.getText());
					}else {
						
					}
					
					
					JOptionPane.showMessageDialog(null,"Excluido Com Sucesso.");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Excluir "+e0.getMessage());
					}
			}
		});
		
		mntmConsultar = new JMenuItem("Consultar");
		mntmConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=============consultar Cadastro====================
				
				try {
					
					dao = new ClienteDAO();
					cliente = dao.consultarCadastro(txtCpf.getText());
					txtNome.setText(cliente.getNome());
					txtCpf.setText( cliente.getCpf());
					txtRg.setText( cliente.getRg());
					
					String sexo = cliente.getSexo();
					
					if(sexo.equals("Selecione uma Opção")) {
						cbxSexo.setSelectedIndex(0);
						
					}else if(sexo.equals("M")) {
						cbxSexo.setSelectedIndex(1);
						
					}else if(sexo.equals("F")) {
						cbxSexo.setSelectedIndex(2);
					}
					
					String civil = cliente.getEstadoCivil();
					
					if(civil.equals("Selecione uma Opção")) {
						cbxEstadoCivil.setSelectedIndex(0);
						
					}else if(civil.equals("C")) {
						cbxEstadoCivil.setSelectedIndex(1);
						
					}else if(civil.equals("S")) {
						cbxEstadoCivil.setSelectedIndex(2);
					}
					
					txtDataNacimeto.setText(cliente.getDataNacimento());
					txtEndereco.setText(cliente.getEndereco());
					txtNumero.setText(Integer.toString(cliente.getNumero()));
					txtCep.setText(cliente.getCep());
					txtMunicipio.setText(cliente.getMunicipio());
					
					String tipo = cliente.getUf();
					
					if(tipo.equals("Selecione uma Opção")) {
						cbxUf.setSelectedIndex(0);
						
					}else if(tipo.equals("AC")) {
						cbxUf.setSelectedIndex(1);
						
					}else if(tipo.equals("AL")) {
						cbxUf.setSelectedIndex(2);
						
					}else if(tipo.equals("AM")) {
						cbxUf.setSelectedIndex(3);
						
					}else if(tipo.equals("BA")) {
						cbxUf.setSelectedIndex(4);
						
					}else if(tipo.equals("SE")) {
						cbxUf.setSelectedIndex(5);
						
					}else if(tipo.equals("DF")) {
						cbxUf.setSelectedIndex(6);
						
					}else if(tipo.equals("SP")) {
						cbxUf.setSelectedIndex(7);
						
					}else if(tipo.equals("SE")) {
						cbxUf.setSelectedIndex(8);
						
					}else {
						cbxUf.setSelectedIndex(9);
					}
					
					txtCelular.setText(cliente.getCelular());
					txtAlegiaMedicamento.setText(cliente.getAlergiaMedicamento());
					
				
		}catch(Exception e0) {
			JOptionPane.showMessageDialog(null,"Erro ao Listar "+e0.getMessage());
		}
		
			}
		});
		mnArquivo.add(mntmConsultar);
		mnArquivo.add(mntmExcluir);
		
		mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int res;
				res = JOptionPane.showConfirmDialog( null,"Tem Certeza que quer Fechar?","Confirma",JOptionPane.YES_NO_OPTION);
				if( res == 0) {
					System.exit(0);
				}else {
					
				}
			}
		});
		mntmSair.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.LIGHT_GRAY, null));
		mnArquivo.add(mntmSair);
		
		mnConvenio = new JMenu("Convenio");
		menuBar.add(mnConvenio);
		
		mntmSalvar_1 = new JMenuItem("Salvar");
		mntmSalvar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//=============salvar convenio=================
				try {
					
					cliente = new Cliente();
					cliente.setCpf(txtCpfConvenio.getText());
					cliente.setNomeConvenio((String)cbxNomeConvenio.getSelectedItem());
					cliente.setNumeroConvenio(txtNumeroConvenio.getText());
					cliente.setTratamento((String)cbxTratamentoConvenio.getSelectedItem());
					cliente.setQtsConsulta(Integer.parseInt((String) cbxQtsConsultaConvenio.getSelectedItem()));
					cliente.setValorTotal(Double.parseDouble(txtValorTotalConvenio.getText()));
					
						
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					
					dao.salvarConvenio(cliente);
					JOptionPane.showMessageDialog(null,"Salvo com Sucesso ");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Gravar "+e0.getMessage());
					}
				
				
			}
		});
		
		mntmNovo_2 = new JMenuItem("Novo");
		mntmNovo_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//===========Novo Convenio=============

				
			txtCpfConvenio.setText(null);
			txtNomeConvenio.setText(null);
			cbxNomeConvenio.setSelectedIndex(0);
			txtNumeroConvenio.setText(null);
			cbxTratamentoConvenio.setSelectedIndex(0);
			cbxQtsConsultaConvenio.setSelectedIndex(0);
			txtValorTotalConvenio.setText(null);
				
			}
		});
		mnConvenio.add(mntmNovo_2);
		mnConvenio.add(mntmSalvar_1);
		
		mntmAlterar_1 = new JMenuItem("Alterar");
		mntmAlterar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//=============Altatr convenio===================
				try {
					
					cliente = new Cliente();
					cliente.setCpf(txtCpfConvenio.getText());
					cliente.setNomeConvenio((String)cbxNomeConvenio.getSelectedItem());
					cliente.setNumeroConvenio(txtNumeroConvenio.getText());
					cliente.setTratamento((String)cbxTratamentoConvenio.getSelectedItem());
					cliente.setQtsConsulta(Integer.parseInt((String) cbxQtsConsultaConvenio.getSelectedItem()));
					cliente.setValorTotal(Double.parseDouble(txtValorTotalConvenio.getText()));
					
						
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					
					dao.alterarConvenio(cliente);
					JOptionPane.showMessageDialog(null,"Altera com Sucesso ");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Altera "+e0.getMessage());
					}
				
			}
		});
		mnConvenio.add(mntmAlterar_1);
		
		mntmExcluir_1 = new JMenuItem("Excluir");
		mntmExcluir_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=============Excluir Convenio====================
				try {
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					int res;
					res = JOptionPane.showConfirmDialog( null,"Tem Certeza quer Excluir o Convenio? ","Confirma",JOptionPane.YES_NO_OPTION);
					if( res == 0) {
						dao.excluirConvenio(txtCpfConvenio.getText());
					}else {
						
					}
					
					
					JOptionPane.showMessageDialog(null,"Excluido Com Sucesso.");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Excluir "+e0.getMessage());
					}
				
			}
		});
		
		mntmConsultar_1 = new JMenuItem("Consultar");
		mntmConsultar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//---------------consultar convenio -----------------
				
				try {
					
					dao = new ClienteDAO();
					
					cliente = dao.consultarConvenio(txtCpfConvenio.getText());
					txtNomeConvenio.setText(cliente.getNome());
					
					String convenio = cliente.getNomeConvenio();
					
					if(convenio.equals("Selecione uma Opção")) {
						cbxNomeConvenio.setSelectedIndex(0);
						
					}else if(convenio.equals("Amil")) {
						cbxNomeConvenio.setSelectedIndex(1);
						
					}else if(convenio.equals("Bradesco Odonto")) {
						cbxNomeConvenio.setSelectedIndex(2);
						
					}else if(convenio.equals("Notre Dame Intermédica")) {
						cbxNomeConvenio.setSelectedIndex(3);
						
					}else if(convenio.equals("Porto Seguro")) {
						cbxNomeConvenio.setSelectedIndex(4);
						
					}else if(convenio.equals("Santa Helena Saúde")) {
						cbxNomeConvenio.setSelectedIndex(5);
						
					}else if(convenio.equals("Unimed")) {
						cbxNomeConvenio.setSelectedIndex(6);
						
					}else if(convenio.equals("Sul América Saúde")) {
						cbxNomeConvenio.setSelectedIndex(7);
					}
					txtNumeroConvenio.setText(cliente.getNumeroConvenio());
					
					String tratamento = cliente.getTratamento();
					
					switch(tratamento) {
					case "Selecione um Opção":
						cbxTratamentoConvenio.setSelectedIndex(0);
						break;
						
					case "Ortodontia":
						cbxTratamentoConvenio.setSelectedIndex(1);
						break;
						
					case "Implante dentário":
						cbxTratamentoConvenio.setSelectedIndex(2);
						break;
						
					case "Clínica geral":
						cbxTratamentoConvenio.setSelectedIndex(3);
						break;
						
					case "Clareamento":
						cbxTratamentoConvenio.setSelectedIndex(4);
						break;
						
					case "Prótese dentária móvel":
						cbxTratamentoConvenio.setSelectedIndex(5);
						break;
						
					case "Periodontia: tratamento das gengivas":
						cbxTratamentoConvenio.setSelectedIndex(6);
						break;
						
					case "Endodontia: tratamento de canal":
						cbxTratamentoConvenio.setSelectedIndex(7);
						break;
					}
					
					int qtsConsulta = cliente.getQtsConsulta();
					switch(qtsConsulta) {
					case 1:
						cbxQtsConsultaConvenio.setSelectedIndex(1);
						break;
						
					case 2:
						cbxQtsConsultaConvenio.setSelectedIndex(2);
						break;
						
					case 3:
						cbxQtsConsultaConvenio.setSelectedIndex(3);
						break;
						
					case 4:
						cbxQtsConsultaConvenio.setSelectedIndex(4);
						break;
						
					case 5:
						cbxQtsConsultaConvenio.setSelectedIndex(5);
						break;
						
					case 6:
						cbxQtsConsultaConvenio.setSelectedIndex(6);
						break;
						
					case 7:
						cbxQtsConsultaConvenio.setSelectedIndex(7);
						break;
						
					case 8:
						cbxQtsConsultaConvenio.setSelectedIndex(8);
						break;
						
					case 9:
						cbxQtsConsultaConvenio.setSelectedIndex(9);
						break;
					
					case 10:
						cbxQtsConsultaConvenio.setSelectedIndex(10);
						break;
						
					case 11:
						cbxQtsConsultaConvenio.setSelectedIndex(11);
						break;
						
					case 12:
						cbxQtsConsultaConvenio.setSelectedIndex(12);
						break;
						
					case 13:
						cbxQtsConsultaConvenio.setSelectedIndex(13);
						break;
						
					case 14:
						cbxQtsConsultaConvenio.setSelectedIndex(14);
						break;
						
					case 15:
						cbxQtsConsultaConvenio.setSelectedIndex(15);
						break;
						
					case 16:
						cbxQtsConsultaConvenio.setSelectedIndex(16);
						break;
						
					case 17:
						cbxQtsConsultaConvenio.setSelectedIndex(17);
						break;
						
					case 18:
						cbxQtsConsultaConvenio.setSelectedIndex(18);
						break;
						
					case 19:
						cbxQtsConsultaConvenio.setSelectedIndex(19);
						break;
						
					case 20:
						cbxQtsConsultaConvenio.setSelectedIndex(20);
						break;
					}
					
					txtValorTotalConvenio.setText(Double.toString(cliente.getValorTotal()));
					
		}catch(Exception e0) {
			JOptionPane.showMessageDialog(null,"Erro ao Consultar Convenio "+ e0.getMessage());
		}
				
				
			}
		});
		mnConvenio.add(mntmConsultar_1);
		mnConvenio.add(mntmExcluir_1);
		
		mnNewMenu = new JMenu("Pagamento");
		menuBar.add(mnNewMenu);
		
		mntmSalvar_2 = new JMenuItem("Salvar");
		mntmSalvar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//=============salvar Pagamento=================
				try {
									
									cliente = new Cliente();
									cliente.setCpf(txtCpfPagamento.getText());
									cliente.setTratamento((String)cbxTratamentoPagamento.getSelectedItem());
									cliente.setQtsConsulta(Integer.parseInt((String) cbxQtsConsultaPagamento.getSelectedItem()));
									cliente.setFormaPagamento((String) cbxFormaPagamento.getSelectedItem());
									cliente.setQtsParcela(Integer.parseInt((String) cbxParcelamentoPagamento.getSelectedItem()));
									cliente.setValorTotal(Double.parseDouble(txtValorTotalPagamento.getText()));
									
										
									
									//aqui ele vai abri a conexão
									dao = new ClienteDAO();
									
									dao.salvarPagamento(cliente);
									JOptionPane.showMessageDialog(null,"Salvo com Sucesso ");
									}catch(Exception e0) {
										JOptionPane.showMessageDialog(null,"Erro ao Gravar "+e0.getMessage());
									}
			}
		});
		
		mntmNovo_1 = new JMenuItem("Novo");
		mntmNovo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=========Novo Pagamento=================
				
				
				txtCpfPagamento.setText(null);
				txtNomePagamento.setText(null);
				cbxTratamentoPagamento.setSelectedIndex(0);
				cbxQtsConsultaPagamento.setSelectedIndex(0);
				cbxFormaPagamento.setSelectedIndex(0);
				cbxParcelamentoPagamento.setSelectedIndex(0);
				txtValorTotalPagamento.setText(null);
				txtValorParcelaPagamento.setText(null);
				
				
			}
		});
		mnNewMenu.add(mntmNovo_1);
		mnNewMenu.add(mntmSalvar_2);
		
		mntmAlterar_2 = new JMenuItem("Alterar");
		mntmAlterar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//==============Altera Pagamento========
				
				try {
					
					cliente = new Cliente();
					cliente.setCpf(txtCpfPagamento.getText());
					cliente.setTratamento((String)cbxTratamentoPagamento.getSelectedItem());
					cliente.setQtsConsulta(Integer.parseInt((String) cbxQtsConsultaPagamento.getSelectedItem()));
					cliente.setFormaPagamento((String) cbxFormaPagamento.getSelectedItem());
					cliente.setQtsParcela(Integer.parseInt((String) cbxParcelamentoPagamento.getSelectedItem()));
					cliente.setValorTotal(Double.parseDouble(txtValorTotalPagamento.getText()));
					
						
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					
					dao.alterarPagamento(cliente);
					JOptionPane.showMessageDialog(null,"Alterado com Sucesso ");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Altera "+e0.getMessage());
					}

			
			}
		});
		mnNewMenu.add(mntmAlterar_2);
		
		mntmConsltar = new JMenuItem("Consultar");
		mntmConsltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//==========Consultar Pagamento====================
				
				try {
				
					dao = new ClienteDAO();
					
					cliente = dao.consultarPagamento(txtCpfPagamento.getText());
					txtNomePagamento.setText(cliente.getNome());
					
				
					String tratamento = cliente.getTratamento();
					switch(tratamento) {
					case "Selecione um Opção":
						cbxTratamentoPagamento.setSelectedIndex(0);
						break;
						
					case "Ortodontia":
						cbxTratamentoPagamento.setSelectedIndex(1);
						break;
						
					case "Implante dentário":
						cbxTratamentoPagamento.setSelectedIndex(2);
						break;
						
					case "Clínica geral":
						cbxTratamentoPagamento.setSelectedIndex(3);
						break;
						
					case "Clareamento":
						cbxTratamentoPagamento.setSelectedIndex(4);
						break;
						
					case "Prótese dentária móvel":
						cbxTratamentoPagamento.setSelectedIndex(4);
						break;
						
					case "Periodontia: tratamento das gengivas":
						cbxTratamentoPagamento.setSelectedIndex(5);
						break;
						
					case "Endodontia: tratamento de canal":
						cbxTratamentoPagamento.setSelectedIndex(6);
						break;
					}
					
					int qtsConsult = cliente.getQtsConsulta();
					switch(qtsConsult) {
					case 1:
						cbxQtsConsultaPagamento.setSelectedIndex(1);
						break;
						
					case 2:
						cbxQtsConsultaPagamento.setSelectedIndex(2);
						break;
						
					case 3:
						cbxQtsConsultaPagamento.setSelectedIndex(3);
						break;
						
					case 4:
						cbxQtsConsultaPagamento.setSelectedIndex(4);
						break;
						
					case 5:
						cbxQtsConsultaPagamento.setSelectedIndex(5);
						break;
						
					case 6:
						cbxQtsConsultaPagamento.setSelectedIndex(6);
						break;
						
					case 7:
						cbxQtsConsultaPagamento.setSelectedIndex(7);
						break;
						
					case 8:
						cbxQtsConsultaPagamento.setSelectedIndex(8);
						break;
						
					case 9:
						cbxQtsConsultaPagamento.setSelectedIndex(9);
						break;
					
					case 10:
						cbxQtsConsultaPagamento.setSelectedIndex(10);
						break;
						
					case 11:
						cbxQtsConsultaPagamento.setSelectedIndex(11);
						break;
						
					case 12:
						cbxQtsConsultaPagamento.setSelectedIndex(12);
						break;
						
					case 13:
						cbxQtsConsultaPagamento.setSelectedIndex(13);
						break;
						
					case 14:
						cbxQtsConsultaPagamento.setSelectedIndex(14);
						break;
						
					case 15:
						cbxQtsConsultaPagamento.setSelectedIndex(15);
						break;
						
					case 16:
						cbxQtsConsultaPagamento.setSelectedIndex(16);
						break;
						
					case 17:
						cbxQtsConsultaPagamento.setSelectedIndex(17);
						break;
						
					case 18:
						cbxQtsConsultaPagamento.setSelectedIndex(18);
						break;
						
					case 19:
						cbxQtsConsultaPagamento.setSelectedIndex(19);
						break;
						
					case 20:
						cbxQtsConsultaPagamento.setSelectedIndex(20);
						break;
					}
					
					
					String forma = cliente.getFormaPagamento();
					
					switch(forma) {
					case "Selecione um Opção":
						cbxFormaPagamento.setSelectedIndex(0);
						break;
						
					case "A VISTA":
						cbxFormaPagamento.setSelectedIndex(1);
						break;
						
					case "CARTAO CREDITO":
						cbxFormaPagamento.setSelectedIndex(2);
						break;
						
					case "CARTAO DEBITO":
						cbxFormaPagamento.setSelectedIndex(3);
						break;
					}
					
					int qtsParcel = cliente.getQtsConsulta();
					switch(qtsParcel) {
					case 01:
						cbxParcelamentoPagamento.setSelectedIndex(1);
						break;
						
					case 02:
						cbxParcelamentoPagamento.setSelectedIndex(2);
						break;
						
					case 03:
						cbxParcelamentoPagamento.setSelectedIndex(3);
						break;
						
					case 04:
						cbxParcelamentoPagamento.setSelectedIndex(4);
						break;
						
					case 05:
						cbxParcelamentoPagamento.setSelectedIndex(5);
						break;
						
					case 06:
						cbxParcelamentoPagamento.setSelectedIndex(6);
						break;
						
					case 07:
						cbxParcelamentoPagamento.setSelectedIndex(7);
						break;
						
					case 8:
						cbxParcelamentoPagamento.setSelectedIndex(8);
						break;
						
					case 9:
						cbxParcelamentoPagamento.setSelectedIndex(9);
						break;
					
					case 10:
						cbxParcelamentoPagamento.setSelectedIndex(10);
						break;
						
					case 11:
						cbxParcelamentoPagamento.setSelectedIndex(11);
						break;
						
					case 12:
						cbxParcelamentoPagamento.setSelectedIndex(12);
						break;
					}
					double resu =  cliente.getValorTotal() / cliente.getQtsConsulta();
					
					  DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
				        decimalFormat.setRoundingMode(RoundingMode.DOWN);
				       // System.out.println( decimalFormat.format(resu) );
					
					txtValorParcelaPagamento.setText(decimalFormat.format(resu));
					
					txtValorTotalPagamento.setText(Double.toString(cliente.getValorTotal()));
					
		}catch(Exception e0) {
			JOptionPane.showMessageDialog(null,"Erro ao Consultar Pagamento "+ e0.getMessage());
		}
		
			}
		});
		mnNewMenu.add(mntmConsltar);
		
		mntmExcluir_2 = new JMenuItem("Excluir");
		mntmExcluir_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=============Excluir Pagamento====================
				try {
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					int res;
					res = JOptionPane.showConfirmDialog( null,"Tem Certeza quer Excluir o Pagamento? ","Confirma",JOptionPane.YES_NO_OPTION);
					if( res == 0) {
						dao.excluirPagamento(txtCpfPagamento.getText());
					}else {
						
					}
					
					
					JOptionPane.showMessageDialog(null,"Excluido Com Sucesso.");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Excluir "+e0.getMessage());
					}
			}
		});
		mnNewMenu.add(mntmExcluir_2);
		
		mnAgendamento = new JMenu("Agendamento");
		menuBar.add(mnAgendamento);
		
		mntmSalvar_3 = new JMenuItem("Salvar");
		mntmSalvar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=======Salvar Agendamento =================
				try {
					
					cliente = new Cliente();
					cliente.setCpf(txtCpfAgendamento.getText());
					cliente.setTratamento((String)cbxTratamentoAgendamento.getSelectedItem());
					cliente.setDataAgendamento(txtDataAgendamento.getText());
					cliente.setHora(txtHora.getText());
					boolean confirmado = ckcbxConfimadoAgendamento.isSelected();
					if(confirmado == true) {
						cliente.setConfirmado(1);
					}else if(confirmado == false){
						cliente.setConfirmado(0);
					}
					
					
					dao = new ClienteDAO();
					
					dao.salvarAgendamento(cliente);
					JOptionPane.showMessageDialog(null,"Salvo com Sucesso ");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Gravar "+e0.getMessage());
					}
			}
		});
		
		mntmNovo = new JMenuItem("Novo");
		mntmNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//================Novo Agendamento===================
				
				
				txtCpfAgendamento.setText(null);
				txtNomeAgendamento.setText(null);
				cbxTratamentoAgendamento.setSelectedIndex(0);
				txtDataAgendamento.setText(null);
				txtHora.setText(null);
				ckcbxConfimadoAgendamento.setSelected(false);
				txtAlergiaAgendamento.setText(null);
				
			}
		});
		mnAgendamento.add(mntmNovo);
		mnAgendamento.add(mntmSalvar_3);
		
		mntmAlterar_3 = new JMenuItem("Alterar");
		mntmAlterar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//==========Alterar Agendamento==============
				try {
					
					cliente = new Cliente();
					cliente.setCpf(txtCpfAgendamento.getText());
					cliente.setTratamento((String)cbxTratamentoAgendamento.getSelectedItem());
					cliente.setDataAgendamento(txtDataAgendamento.getText());
					cliente.setHora(txtHora.getText());
					boolean confirmado = ckcbxConfimadoAgendamento.isSelected();
					if(confirmado == true) {
						cliente.setConfirmado(1);
					}else if(confirmado == false){
						cliente.setConfirmado(0);
					}
					
					cliente.setAlergiaMedicamento(txtAlergiaAgendamento.getText());
					
					
					dao = new ClienteDAO();
					
					dao.alterarAgendamento(cliente);
					JOptionPane.showMessageDialog(null,"Alterado com Sucesso ");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Altera "+e0.getMessage());
					}

			}
		});
		mnAgendamento.add(mntmAlterar_3);
		
		mntmExcluir_3 = new JMenuItem("Excluir");
		mntmExcluir_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=============Excluir Agendamento
				try {
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					int res;
					res = JOptionPane.showConfirmDialog( null,"Tem Certeza quer Excluir o Agendamento? ","Confirma",JOptionPane.YES_NO_OPTION);
					if( res == 0) {
						dao.excluirAgendamento(txtCpfAgendamento.getText());
					}else {
						
					}
					
					
					JOptionPane.showMessageDialog(null,"Excluido Com Sucesso.");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Excluir "+e0.getMessage());
					}
			}
		});
		
		mntmConsultar_2 = new JMenuItem("Consultar");
		mntmConsultar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//================Consultar Agendamento=============
				
				try {
					
					dao = new ClienteDAO();
					
					cliente = dao.consultarAgendamento(txtCpfAgendamento.getText());
					txtNomeAgendamento.setText(cliente.getNome());
					
					System.out.println(cliente.getTratamento());
					String tratamento = cliente.getTratamento();
					switch(tratamento) {
					case "Selecione um Opção":
						cbxTratamentoAgendamento.setSelectedIndex(0);
						break;
						
					case "Ortodontia":
						cbxTratamentoAgendamento.setSelectedIndex(1);
						break;
						
					case "Implante dentário":
						cbxTratamentoAgendamento.setSelectedIndex(2);
						break;
						
					case "Clínica geral":
						cbxTratamentoAgendamento.setSelectedIndex(3);
						break;
						
					case "Clareamento":
						cbxTratamentoAgendamento.setSelectedIndex(4);
						break;
						
					case "Prótese dentária móvel":
						cbxTratamentoAgendamento.setSelectedIndex(4);
						break;
						
					case "Periodontia: tratamento das gengivas":
						cbxTratamentoAgendamento.setSelectedIndex(5);
						break;
						
					case "Endodontia: tratamento de canal":
						cbxTratamentoAgendamento.setSelectedIndex(6);
						break;
					}
					
					txtDataAgendamento.setText(cliente.getDataAgendamento());
					txtHora.setText(cliente.getHora());
					int confirmado = cliente.getConfirmado();
					if(confirmado == 1) {
						ckcbxConfimadoAgendamento.setSelected(true);
					}else if(confirmado == 0){
						ckcbxConfimadoAgendamento.setSelected(false);
					}
					txtAlergiaAgendamento.setText(cliente.getAlergiaMedicamento());
					
		}catch(Exception e0) {
			JOptionPane.showMessageDialog(null,"Erro ao Consultar Agendamento "+ e0.getMessage());
		}
			}
		});
		mnAgendamento.add(mntmConsultar_2);
		mnAgendamento.add(mntmExcluir_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(SystemColor.textInactiveText);
		tabbedPane.setBounds(0, 0, 671, 525);
		contentPane.add(tabbedPane);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Cadastro de Pacientes", null, panel, null);
		panel.setLayout(null);
		
		lblNome_1 = new JLabel("Nome");
		lblNome_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNome_1.setBounds(25, 65, 46, 14);
		panel.add(lblNome_1);
		
		lblRh_1 = new JLabel("RG");
		lblRh_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRh_1.setBounds(348, 34, 28, 14);
		panel.add(lblRh_1);
		
		lblCpf_1 = new JLabel("CPF");
		lblCpf_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCpf_1.setBounds(25, 34, 46, 14);
		panel.add(lblCpf_1);
		
		lblSexo_1 = new JLabel("Sexo");
		lblSexo_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSexo_1.setBounds(25, 100, 46, 14);
		panel.add(lblSexo_1);
		
		lblEstadoCivil_1 = new JLabel("Estado Civil");
		lblEstadoCivil_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEstadoCivil_1.setBounds(321, 100, 84, 14);
		panel.add(lblEstadoCivil_1);
		
		lblEndereo_1 = new JLabel("Endere\u00E7o");
		lblEndereo_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEndereo_1.setBounds(25, 157, 72, 14);
		panel.add(lblEndereo_1);
		
		lblDataNacimeno_1 = new JLabel("Data Nacimeto");
		lblDataNacimeno_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDataNacimeno_1.setBounds(25, 127, 101, 14);
		panel.add(lblDataNacimeno_1);
		
		lblNumero_1 = new JLabel("Numero");
		lblNumero_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumero_1.setBounds(436, 157, 58, 14);
		panel.add(lblNumero_1);
		
		txtNome = new JTextField();
		txtNome.setBounds(81, 63, 517, 20);
		panel.add(txtNome);
		txtNome.setColumns(10);
		
		cbxSexo = new JComboBox();
		cbxSexo.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma Op\u00E7\u00E3o", "Mascolino", "Feminino"}));
		cbxSexo.setToolTipText("");
		cbxSexo.setBounds(81, 94, 183, 20);
		panel.add(cbxSexo);
		
		cbxEstadoCivil = new JComboBox();
		cbxEstadoCivil.setModel(new DefaultComboBoxModel(new String[] {"Selecione um Op\u00E7\u00E3o", "Casado(a)", "Solteiro(a)"}));
		cbxEstadoCivil.setToolTipText("");
		cbxEstadoCivil.setBounds(415, 94, 183, 20);
		panel.add(cbxEstadoCivil);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(81, 155, 334, 20);
		panel.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(497, 155, 101, 20);
		panel.add(txtNumero);
		txtNumero.setColumns(10);
		
		lblCep = new JLabel("CEP");
		lblCep.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCep.setBounds(25, 186, 30, 14);
		panel.add(lblCep);
		
		lblMunicipio = new JLabel("Municipio");
		lblMunicipio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMunicipio.setBounds(256, 186, 66, 14);
		panel.add(lblMunicipio);
		
		lblUf = new JLabel("UF");
		lblUf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblUf.setBounds(483, 186, 21, 14);
		panel.add(lblUf);
		
		txtMunicipio = new JTextField();
		txtMunicipio.setBounds(332, 184, 141, 20);
		panel.add(txtMunicipio);
		txtMunicipio.setColumns(10);
		
		cbxUf = new JComboBox();
		cbxUf.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma Op\u00E7\u00E3o", "AC", "AL", "AM", "BA", "SE", "DF", "SP", "SE", "TO"}));
		cbxUf.setToolTipText("");
		cbxUf.setBounds(514, 184, 84, 20);
		panel.add(cbxUf);
		
		lblAlergiaHAugum = new JLabel("Alergia de Medicamento?");
		lblAlergiaHAugum.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAlergiaHAugum.setBounds(25, 252, 164, 20);
		panel.add(lblAlergiaHAugum);
		
		txtAlegiaMedicamento = new JTextField();
		txtAlegiaMedicamento.setBounds(186, 253, 412, 20);
		panel.add(txtAlegiaMedicamento);
		txtAlegiaMedicamento.setColumns(10);
		
		lblCelular = new JLabel("Celular");
		lblCelular.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCelular.setBounds(25, 215, 46, 14);
		panel.add(lblCelular);
		
		txtCpf = new JFormattedTextField(new MaskFormatter("###-###-###/##"));
		txtCpf.setBounds(81, 32, 203, 20);
		panel.add(txtCpf);
		
		txtRg = new JFormattedTextField(new MaskFormatter("##.###.###-#"));
		txtRg.setBounds(386, 32, 212, 20);
		panel.add(txtRg);
		
		txtDataNacimeto = new JFormattedTextField(new MaskFormatter("##/##/####"));
		txtDataNacimeto.setBounds(123, 125, 141, 20);
		panel.add(txtDataNacimeto);
		
		txtCep = new JFormattedTextField(new MaskFormatter("#####-###"));
		txtCep.setBounds(81, 184, 165, 20);
		panel.add(txtCep);
		
		txtCelular = new JFormattedTextField(new MaskFormatter("(##)#####-####"));
		txtCelular.setBounds(81, 213, 141, 20);
		panel.add(txtCelular);
		
		btnNovo = new JButton("");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//====Novo Cadastro======================
				
				txtNome.setText(null);
				txtCpf.setText(null);
				txtRg.setText(null);
				cbxSexo.setSelectedIndex(0);
				cbxEstadoCivil.setSelectedIndex(0);
				txtDataNacimeto.setText(null);
				txtEndereco.setText(null);
				txtNumero.setText(null);
				txtCep.setText(null);
				txtMunicipio.setText(null);
				cbxUf.setSelectedIndex(0);
				txtCelular.setText(null);
				txtAlegiaMedicamento.setText(null);
				
			}
		});
		btnNovo.setToolTipText("Novo");
		btnNovo.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\Actions-bookmark-new-icon.png"));
		btnNovo.setBounds(25, 300, 89, 61);
		panel.add(btnNovo);
		
		btnSalvar = new JButton("");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//===============menu  salvar cadastro============
				try {
					
					cliente = new Cliente();
					cliente.setNome(txtNome.getText());
					cliente.setCpf(txtCpf.getText());
					cliente.setRg(txtRg.getText());
					String sexo;
					sexo = (String) cbxSexo.getSelectedItem();
					if(sexo.equals("Selecione uma Opção")) {
						JOptionPane.showMessageDialog(null,"Selecione umas das Opção do Sexo");
					}else if(sexo.equals("Mascolino")){
						cliente.setSexo("M");
					}else if(sexo.equals("Feminino")){
						cliente.setSexo("F");
					}
					
					String civil;
					civil = (String) cbxEstadoCivil.getSelectedItem();
					if(civil.equals("Selecione uma Opção")) {
						JOptionPane.showMessageDialog(null,"Selecione umas das Opção do Sexo");
					}else if(civil.equals("Casado(a)")){
						cliente.setEstadoCivil("C");
					}else if(civil.equals("Solteiro(a)")){
						cliente.setEstadoCivil("S");
					}
					
					cliente.setDataNacimento(txtDataNacimeto.getText());
					cliente.setEndereco(txtEndereco.getText());
					cliente.setNumero(Integer.parseInt(txtNumero.getText()));
					cliente.setCep(txtCep.getText());
					cliente.setMunicipio(txtMunicipio.getText());
					cliente.setUf((String) cbxUf.getSelectedItem());
					cliente.setCelular(txtCelular.getText());
					cliente.setAlergiaMedicamento(txtAlegiaMedicamento.getText());
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					
					dao.salvarCadastro(cliente);
					JOptionPane.showMessageDialog(null,"Salvo com Sucesso ");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Gravar "+e0.getMessage());
					}
			}
		});
		btnSalvar.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\salvar-\u00EDcone-de-disco-flex\u00EDvel-o-bot\u00E3o-quadrado-azul-89658451.jpg"));
		btnSalvar.setToolTipText("Salvar");
		btnSalvar.setBounds(146, 300, 89, 61);
		panel.add(btnSalvar);
		
		btnAlterar = new JButton("");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//==============Altera Cadastro===============
				try {
								
								cliente = new Cliente();
								cliente.setNome(txtNome.getText());
								cliente.setCpf(txtCpf.getText());
								cliente.setRg(txtRg.getText());
								String sexo;
								sexo = (String) cbxSexo.getSelectedItem();
								if(sexo.equals("Selecione uma Opção")) {
									JOptionPane.showMessageDialog(null,"Selecione umas das Opção do Sexo");
								}else if(sexo.equals("Mascolino")){
									cliente.setSexo("M");
								}else if(sexo.equals("Feminino")){
									cliente.setSexo("F");
								}
								
								String civil;
								civil = (String) cbxEstadoCivil.getSelectedItem();
								if(civil.equals("Selecione uma Opção")) {
									JOptionPane.showMessageDialog(null,"Selecione umas das Opção do Sexo");
								}else if(civil.equals("Casado(a)")){
									cliente.setEstadoCivil("C");
								}else if(civil.equals("Solteiro(a)")){
									cliente.setEstadoCivil("S");
								}
								
								cliente.setDataNacimento(txtDataNacimeto.getText());
								cliente.setEndereco(txtEndereco.getText());
								cliente.setNumero(Integer.parseInt(txtNumero.getText()));
								cliente.setCep(txtCep.getText());
								cliente.setMunicipio(txtMunicipio.getText());
								cliente.setUf((String) cbxUf.getSelectedItem());
								cliente.setCelular(txtCelular.getText());
								cliente.setAlergiaMedicamento(txtAlegiaMedicamento.getText());
								
								//aqui ele vai abri a conexão
								dao = new ClienteDAO();
								
								dao.alterarCadastro(cliente);
								JOptionPane.showMessageDialog(null,"Alterdo com Sucesso ");
								}catch(Exception e0) {
									JOptionPane.showMessageDialog(null,"Erro ao Alterar "+e0.getMessage());
								}
							
			}
		});
		btnAlterar.setToolTipText("Alterar");
		btnAlterar.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\altrar.png"));
		btnAlterar.setBounds(272, 300, 89, 61);
		panel.add(btnAlterar);
		
		btnExcluir = new JButton("");
		btnExcluir.setToolTipText("Consultar");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	//=============consultar Cadastro====================
				
				try {
					
					dao = new ClienteDAO();
					cliente = dao.consultarCadastro(txtCpf.getText());
					txtNome.setText(cliente.getNome());
					txtCpf.setText( cliente.getCpf());
					txtRg.setText( cliente.getRg());
					
					String sexo = cliente.getSexo();
					
					if(sexo.equals("Selecione uma Opção")) {
						cbxSexo.setSelectedIndex(0);
						
					}else if(sexo.equals("M")) {
						cbxSexo.setSelectedIndex(1);
						
					}else if(sexo.equals("F")) {
						cbxSexo.setSelectedIndex(2);
					}
					
					String civil = cliente.getEstadoCivil();
					
					if(civil.equals("Selecione uma Opção")) {
						cbxEstadoCivil.setSelectedIndex(0);
						
					}else if(civil.equals("C")) {
						cbxEstadoCivil.setSelectedIndex(1);
						
					}else if(civil.equals("S")) {
						cbxEstadoCivil.setSelectedIndex(2);
					}
					
					txtDataNacimeto.setText(cliente.getDataNacimento());
					txtEndereco.setText(cliente.getEndereco());
					txtNumero.setText(Integer.toString(cliente.getNumero()));
					txtCep.setText(cliente.getCep());
					txtMunicipio.setText(cliente.getMunicipio());
					
					String tipo = cliente.getUf();
					
					if(tipo.equals("Selecione uma Opção")) {
						cbxUf.setSelectedIndex(0);
						
					}else if(tipo.equals("AC")) {
						cbxUf.setSelectedIndex(1);
						
					}else if(tipo.equals("AL")) {
						cbxUf.setSelectedIndex(2);
						
					}else if(tipo.equals("AM")) {
						cbxUf.setSelectedIndex(3);
						
					}else if(tipo.equals("BA")) {
						cbxUf.setSelectedIndex(4);
						
					}else if(tipo.equals("SE")) {
						cbxUf.setSelectedIndex(5);
						
					}else if(tipo.equals("DF")) {
						cbxUf.setSelectedIndex(6);
						
					}else if(tipo.equals("SP")) {
						cbxUf.setSelectedIndex(7);
						
					}else if(tipo.equals("SE")) {
						cbxUf.setSelectedIndex(8);
						
					}else {
						cbxUf.setSelectedIndex(9);
					}
					
					txtCelular.setText(cliente.getCelular());
					txtAlegiaMedicamento.setText(cliente.getAlergiaMedicamento());
					
				
		}catch(Exception e0) {
			JOptionPane.showMessageDialog(null,"Erro ao Listar "+e0.getMessage());
		}
			}
		});
		btnExcluir.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\lupa_org_20170315094946.png"));
		btnExcluir.setBounds(386, 300, 89, 61);
		panel.add(btnExcluir);
		
		btnSair = new JButton("");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					int res;
					res = JOptionPane.showConfirmDialog( null,"Tem Certeza quer Excluir o Cadastro? ","Confirma",JOptionPane.YES_NO_OPTION);
					if( res == 0) {
						dao.excluirCadastro(txtCpf.getText());
					}else {
						
					}
					
					
					JOptionPane.showMessageDialog(null,"Excluido Com Sucesso.");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Excluir "+e0.getMessage());
					}
				
			}
		});
		btnSair.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\Excluir3.png"));
		btnSair.setToolTipText("Excluir");
		btnSair.setBounds(509, 300, 89, 61);
		panel.add(btnSair);
		
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Convenio", null, panel_1, null);
		panel_1.setLayout(null);
		
		lblCpf_2 = new JLabel("CPF");
		lblCpf_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCpf_2.setBounds(10, 32, 46, 14);
		panel_1.add(lblCpf_2);
		
		lblNomeDaCovenio_1 = new JLabel("Nome da Covenio");
		lblNomeDaCovenio_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDaCovenio_1.setBounds(10, 106, 137, 14);
		panel_1.add(lblNomeDaCovenio_1);
		
		lblNumero_2 = new JLabel("Numero do Convenio");
		lblNumero_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumero_2.setBounds(10, 147, 137, 14);
		panel_1.add(lblNumero_2);
		
		lblTratamento_1 = new JLabel("Tratamento");
		lblTratamento_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTratamento_1.setBounds(10, 196, 101, 14);
		panel_1.add(lblTratamento_1);
		
		lblQuantasConsuta_1 = new JLabel("Quantas consuta ");
		lblQuantasConsuta_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuantasConsuta_1.setBounds(10, 242, 137, 14);
		panel_1.add(lblQuantasConsuta_1);
		
		cbxNomeConvenio = new JComboBox();
		cbxNomeConvenio.setModel(new DefaultComboBoxModel(new String[] {"Selecione um Op\u00E7\u00E3o", "Amil", "Bradesco Odonto", "Notre Dame Interm\u00E9dica", "Porto Seguro", "Santa Helena Sa\u00FAde", "Unimed", "Sul Am\u00E9rica Sa\u00FAde"}));
		cbxNomeConvenio.setBounds(157, 103, 401, 20);
		panel_1.add(cbxNomeConvenio);
		
		txtNumeroConvenio = new JTextField();
		txtNumeroConvenio.setBounds(157, 144, 401, 20);
		panel_1.add(txtNumeroConvenio);
		txtNumeroConvenio.setColumns(10);
		
		cbxTratamentoConvenio = new JComboBox();
		cbxTratamentoConvenio.setModel(new DefaultComboBoxModel(new String[] {"Selecione um Op\u00E7\u00E3o", "Ortodontia", "Implante dent\u00E1rio", "Cl\u00EDnica geral", "Clareamento", "Pr\u00F3tese dent\u00E1ria m\u00F3vel", "Periodontia: tratamento das gengivas", "Endodontia: tratamento de canal"}));
		cbxTratamentoConvenio.setBounds(157, 193, 401, 20);
		panel_1.add(cbxTratamentoConvenio);
		
		cbxQtsConsultaConvenio = new JComboBox();
		cbxQtsConsultaConvenio.setModel(new DefaultComboBoxModel(new String[] {"Selecione um Op\u00E7\u00E3o", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		cbxQtsConsultaConvenio.setBounds(157, 239, 202, 20);
		panel_1.add(cbxQtsConsultaConvenio);
		
		lblNumero_3 = new JLabel("Valor Total");
		lblNumero_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumero_3.setBounds(10, 284, 107, 14);
		panel_1.add(lblNumero_3);
		
		txtValorTotalConvenio = new JTextField();
		txtValorTotalConvenio.setColumns(10);
		txtValorTotalConvenio.setBounds(157, 282, 202, 20);
		panel_1.add(txtValorTotalConvenio);
		
		lblNumero_4 = new JLabel("Nome");
		lblNumero_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumero_4.setBounds(10, 69, 137, 14);
		panel_1.add(lblNumero_4);
		
		txtNomeConvenio = new JLabel("");
		txtNomeConvenio.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.LIGHT_GRAY, null));
		txtNomeConvenio.setBounds(157, 60, 401, 20);
		panel_1.add(txtNomeConvenio);
		
		txtCpfConvenio = new JFormattedTextField(new MaskFormatter("###-###-###/##"));
		txtCpfConvenio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//---------------consultar convenio -----------------
				
				try {
					
					dao = new ClienteDAO();
					
					cliente = dao.consultarCadastro(txtCpfConvenio.getText());
					txtNomeConvenio.setText(cliente.getNome());
					
					
		}catch(Exception e0) {
			JOptionPane.showMessageDialog(null,"Erro ao Consultar  "+ e0.getMessage());
		}
			}
		});
		txtCpfConvenio.setBounds(157, 30, 202, 20);
		panel_1.add(txtCpfConvenio);
		
		button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=============Excluir Convenio====================
				try {
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					int res;
					res = JOptionPane.showConfirmDialog( null,"Tem Certeza quer Excluir o Convenio? ","Confirma",JOptionPane.YES_NO_OPTION);
					if( res == 0) {
						dao.excluirConvenio(txtCpfConvenio.getText());
					}else {
						
					}
					
					
					JOptionPane.showMessageDialog(null,"Excluido Com Sucesso.");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Excluir "+e0.getMessage());
					}
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\Excluir3.png"));
		button.setToolTipText("Excluir");
		button.setBounds(509, 335, 89, 61);
		panel_1.add(button);
		
		button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//===========Novo Convenio=============

				
				txtCpfConvenio.setText(null);
				txtNomeConvenio.setText(null);
				cbxNomeConvenio.setSelectedIndex(0);
				txtNumeroConvenio.setText(null);
				cbxTratamentoConvenio.setSelectedIndex(0);
				cbxQtsConsultaConvenio.setSelectedIndex(0);
				txtValorTotalConvenio.setText(null);
					
			}
		});
		button_1.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\Actions-bookmark-new-icon.png"));
		button_1.setToolTipText("Novo");
		button_1.setBounds(25, 335, 89, 61);
		panel_1.add(button_1);
		
		button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=============salvar convenio=================
				try {
					
					cliente = new Cliente();
					cliente.setCpf(txtCpfConvenio.getText());
					cliente.setNomeConvenio((String)cbxNomeConvenio.getSelectedItem());
					cliente.setNumeroConvenio(txtNumeroConvenio.getText());
					cliente.setTratamento((String)cbxTratamentoConvenio.getSelectedItem());
					cliente.setQtsConsulta(Integer.parseInt((String) cbxQtsConsultaConvenio.getSelectedItem()));
					cliente.setValorTotal(Double.parseDouble(txtValorTotalConvenio.getText()));
					
						
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					
					dao.salvarConvenio(cliente);
					JOptionPane.showMessageDialog(null,"Salvo com Sucesso ");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Gravar "+e0.getMessage());
					}
			}
		});
		button_2.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\salvar-\u00EDcone-de-disco-flex\u00EDvel-o-bot\u00E3o-quadrado-azul-89658451.jpg"));
		button_2.setToolTipText("Salvar");
		button_2.setBounds(146, 335, 89, 61);
		panel_1.add(button_2);
		
		button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
try {
					
					cliente = new Cliente();
					cliente.setCpf(txtCpfConvenio.getText());
					cliente.setNomeConvenio((String)cbxNomeConvenio.getSelectedItem());
					cliente.setNumeroConvenio(txtNumeroConvenio.getText());
					cliente.setTratamento((String)cbxTratamentoConvenio.getSelectedItem());
					cliente.setQtsConsulta(Integer.parseInt((String) cbxQtsConsultaConvenio.getSelectedItem()));
					cliente.setValorTotal(Double.parseDouble(txtValorTotalConvenio.getText()));
					
						
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					
					dao.alterarConvenio(cliente);
					JOptionPane.showMessageDialog(null,"Altera com Sucesso ");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Altera "+e0.getMessage());
					}
			}
		});
		button_3.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\altrar.png"));
		button_3.setToolTipText("Alterar");
		button_3.setBounds(272, 335, 89, 61);
		panel_1.add(button_3);
		
		button_4 = new JButton("");
		button_4.setToolTipText("Consultar");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//---------------consultar convenio -----------------
				
				try {
					
					dao = new ClienteDAO();
					
					cliente = dao.consultarConvenio(txtCpfConvenio.getText());
					txtNomeConvenio.setText(cliente.getNome());
					
					String convenio = cliente.getNomeConvenio();
					
					if(convenio.equals("Selecione uma Opção")) {
						cbxNomeConvenio.setSelectedIndex(0);
						
					}else if(convenio.equals("Amil")) {
						cbxNomeConvenio.setSelectedIndex(1);
						
					}else if(convenio.equals("Bradesco Odonto")) {
						cbxNomeConvenio.setSelectedIndex(2);
						
					}else if(convenio.equals("Notre Dame Intermédica")) {
						cbxNomeConvenio.setSelectedIndex(3);
						
					}else if(convenio.equals("Porto Seguro")) {
						cbxNomeConvenio.setSelectedIndex(4);
						
					}else if(convenio.equals("Santa Helena Saúde")) {
						cbxNomeConvenio.setSelectedIndex(5);
						
					}else if(convenio.equals("Unimed")) {
						cbxNomeConvenio.setSelectedIndex(6);
						
					}else if(convenio.equals("Sul América Saúde")) {
						cbxNomeConvenio.setSelectedIndex(7);
					}
					txtNumeroConvenio.setText(cliente.getNumeroConvenio());
					
					String tratamento = cliente.getTratamento();
					
					switch(tratamento) {
					case "Selecione um Opção":
						cbxTratamentoConvenio.setSelectedIndex(0);
						break;
						
					case "Ortodontia":
						cbxTratamentoConvenio.setSelectedIndex(1);
						break;
						
					case "Implante dentário":
						cbxTratamentoConvenio.setSelectedIndex(2);
						break;
						
					case "Clínica geral":
						cbxTratamentoConvenio.setSelectedIndex(3);
						break;
						
					case "Clareamento":
						cbxTratamentoConvenio.setSelectedIndex(4);
						break;
						
					case "Prótese dentária móvel":
						cbxTratamentoConvenio.setSelectedIndex(5);
						break;
						
					case "Periodontia: tratamento das gengivas":
						cbxTratamentoConvenio.setSelectedIndex(6);
						break;
						
					case "Endodontia: tratamento de canal":
						cbxTratamentoConvenio.setSelectedIndex(7);
						break;
					}
					
					int qtsConsulta = cliente.getQtsConsulta();
					switch(qtsConsulta) {
					case 1:
						cbxQtsConsultaConvenio.setSelectedIndex(1);
						break;
						
					case 2:
						cbxQtsConsultaConvenio.setSelectedIndex(2);
						break;
						
					case 3:
						cbxQtsConsultaConvenio.setSelectedIndex(3);
						break;
						
					case 4:
						cbxQtsConsultaConvenio.setSelectedIndex(4);
						break;
						
					case 5:
						cbxQtsConsultaConvenio.setSelectedIndex(5);
						break;
						
					case 6:
						cbxQtsConsultaConvenio.setSelectedIndex(6);
						break;
						
					case 7:
						cbxQtsConsultaConvenio.setSelectedIndex(7);
						break;
						
					case 8:
						cbxQtsConsultaConvenio.setSelectedIndex(8);
						break;
						
					case 9:
						cbxQtsConsultaConvenio.setSelectedIndex(9);
						break;
					
					case 10:
						cbxQtsConsultaConvenio.setSelectedIndex(10);
						break;
						
					case 11:
						cbxQtsConsultaConvenio.setSelectedIndex(11);
						break;
						
					case 12:
						cbxQtsConsultaConvenio.setSelectedIndex(12);
						break;
						
					case 13:
						cbxQtsConsultaConvenio.setSelectedIndex(13);
						break;
						
					case 14:
						cbxQtsConsultaConvenio.setSelectedIndex(14);
						break;
						
					case 15:
						cbxQtsConsultaConvenio.setSelectedIndex(15);
						break;
						
					case 16:
						cbxQtsConsultaConvenio.setSelectedIndex(16);
						break;
						
					case 17:
						cbxQtsConsultaConvenio.setSelectedIndex(17);
						break;
						
					case 18:
						cbxQtsConsultaConvenio.setSelectedIndex(18);
						break;
						
					case 19:
						cbxQtsConsultaConvenio.setSelectedIndex(19);
						break;
						
					case 20:
						cbxQtsConsultaConvenio.setSelectedIndex(20);
						break;
					}
					
					txtValorTotalConvenio.setText(Double.toString(cliente.getValorTotal()));
					
		}catch(Exception e0) {
			JOptionPane.showMessageDialog(null,"Erro ao Consultar Convenio "+ e0.getMessage());
		}
			}
		});
		button_4.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\lupa_org_20170315094946.png"));
		button_4.setBounds(386, 335, 89, 61);
		panel_1.add(button_4);
		
		panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Pagamento", null, panel_3, null);
		panel_3.setLayout(null);
		
		lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCpf.setBounds(10, 32, 46, 14);
		panel_3.add(lblCpf);
		
		lblTratamento = new JLabel("Tratamento");
		lblTratamento.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTratamento.setBounds(10, 103, 81, 14);
		panel_3.add(lblTratamento);
		
		lblNumero = new JLabel("Valor Total");
		lblNumero.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumero.setBounds(10, 248, 107, 14);
		panel_3.add(lblNumero);
		
		lblNomeDaCovenio = new JLabel("Forma de Pagamento");
		lblNomeDaCovenio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNomeDaCovenio.setBounds(10, 192, 130, 14);
		panel_3.add(lblNomeDaCovenio);
		
		lblQuantasConsuta = new JLabel("Quantas Consultas ");
		lblQuantasConsuta.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQuantasConsuta.setBounds(10, 138, 119, 14);
		panel_3.add(lblQuantasConsuta);
		
		lblParcelamento = new JLabel("Parcelamento");
		lblParcelamento.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblParcelamento.setBounds(362, 189, 93, 14);
		panel_3.add(lblParcelamento);
		
		cbxTratamentoPagamento = new JComboBox();
		cbxTratamentoPagamento.setModel(new DefaultComboBoxModel(new String[] {"Selecione um Op\u00E7\u00E3o", "Ortodontia", "Implante dent\u00E1rio", "Cl\u00EDnica geral", "Clareamento", "Pr\u00F3tese dent\u00E1ria m\u00F3vel", "Periodontia: tratamento das gengivas", "Endodontia: tratamento de canal"}));
		cbxTratamentoPagamento.setBounds(150, 101, 489, 20);
		panel_3.add(cbxTratamentoPagamento);
		
		cbxQtsConsultaPagamento = new JComboBox();
		cbxQtsConsultaPagamento.setModel(new DefaultComboBoxModel(new String[] {"Selecione um Op\u00E7\u00E3o", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
		cbxQtsConsultaPagamento.setBounds(150, 138, 202, 20);
		panel_3.add(cbxQtsConsultaPagamento);
		
		cbxFormaPagamento = new JComboBox();
		cbxFormaPagamento.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma Op\u00E7\u00E3o", "A VISTA", "CARTAO CREDITO", "CARTAO DEBITO"}));
		cbxFormaPagamento.setBounds(150, 186, 202, 20);
		panel_3.add(cbxFormaPagamento);
		
		cbxParcelamentoPagamento = new JComboBox();
		cbxParcelamentoPagamento.setModel(new DefaultComboBoxModel(new String[] {"Selecione um Op\u00E7\u00E3o", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		cbxParcelamentoPagamento.setBounds(479, 186, 160, 20);
		panel_3.add(cbxParcelamentoPagamento);
		
		lblValorDaParcela = new JLabel("Valor Da Parcela");
		lblValorDaParcela.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblValorDaParcela.setBounds(362, 245, 107, 14);
		panel_3.add(lblValorDaParcela);
		
		txtValorParcelaPagamento = new JLabel("");
		txtValorParcelaPagamento.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.LIGHT_GRAY, null));
		txtValorParcelaPagamento.setBounds(479, 242, 160, 20);
		panel_3.add(txtValorParcelaPagamento);
		
		txtValorTotalPagamento = new JTextField();
		txtValorTotalPagamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//==========valor parcela =========
				try {
					
				
				
					String vez = (String) cbxParcelamentoPagamento.getSelectedItem();
					
					double a = Double.parseDouble(vez);
					
					String b = txtValorTotalPagamento.getText();
					double c = Double.parseDouble(b);
					
				
				double resul = c /a;
				
				  DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
			        decimalFormat.setRoundingMode(RoundingMode.DOWN);
			       
				
				txtValorParcelaPagamento.setText(decimalFormat.format(resul));
				}catch(Exception e0) {
					JOptionPane.showMessageDialog(null,"Erro ao caucular "+e0.getMessage());
				}
			}
		});
		txtValorTotalPagamento.setBounds(150, 242, 202, 20);
		panel_3.add(txtValorTotalPagamento);
		txtValorTotalPagamento.setColumns(10);
		
		txtCpfPagamento = new JFormattedTextField(new MaskFormatter("###-###-###/##"));
		txtCpfPagamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//---------------consultar convenio -----------------
				
				try {
					
					dao = new ClienteDAO();
					
					cliente = dao.consultarCadastro(txtCpfPagamento.getText());
					txtNomePagamento.setText(cliente.getNome());
					
					
		}catch(Exception e0) {
			JOptionPane.showMessageDialog(null,"Erro ao Consultar  "+ e0.getMessage());
		}
			}
		});
		txtCpfPagamento.setBounds(150, 30, 202, 20);
		panel_3.add(txtCpfPagamento);
		
		txtNomePagamento = new JLabel("");
		txtNomePagamento.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.LIGHT_GRAY, null));
		txtNomePagamento.setBounds(150, 70, 401, 20);
		panel_3.add(txtNomePagamento);
		
		label_1 = new JLabel("Nome");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(10, 70, 81, 14);
		panel_3.add(label_1);
		
		button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=============Excluir Pagamento====================
				try {
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					int res;
					res = JOptionPane.showConfirmDialog( null,"Tem Certeza quer Excluir o Pagamento? ","Confirma",JOptionPane.YES_NO_OPTION);
					if( res == 0) {
						dao.excluirPagamento(txtCpfPagamento.getText());
					}else {
						
					}
					
					
					JOptionPane.showMessageDialog(null,"Excluido Com Sucesso.");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Excluir "+e0.getMessage());
					}
			}
		});
		button_5.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\Excluir3.png"));
		button_5.setToolTipText("Excluir");
		button_5.setBounds(505, 312, 89, 61);
		panel_3.add(button_5);
		
		button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=========Novo Pagamento=================
				
				
				txtCpfPagamento.setText(null);
				txtNomePagamento.setText(null);
				cbxTratamentoPagamento.setSelectedIndex(0);
				cbxQtsConsultaPagamento.setSelectedIndex(0);
				cbxFormaPagamento.setSelectedIndex(0);
				cbxParcelamentoPagamento.setSelectedIndex(0);
				txtValorTotalPagamento.setText(null);
				txtValorParcelaPagamento.setText(null);
				
				
			}
		});
		button_6.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\Actions-bookmark-new-icon.png"));
		button_6.setToolTipText("Novo");
		button_6.setBounds(21, 312, 89, 61);
		panel_3.add(button_6);
		
		button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=============salvar Pagamento=================
				try {
									
									cliente = new Cliente();
									cliente.setCpf(txtCpfPagamento.getText());
									cliente.setTratamento((String)cbxTratamentoPagamento.getSelectedItem());
									cliente.setQtsConsulta(Integer.parseInt((String) cbxQtsConsultaPagamento.getSelectedItem()));
									cliente.setFormaPagamento((String) cbxFormaPagamento.getSelectedItem());
									cliente.setQtsParcela(Integer.parseInt((String) cbxParcelamentoPagamento.getSelectedItem()));
									cliente.setValorTotal(Double.parseDouble(txtValorTotalPagamento.getText()));
									
										
									
									//aqui ele vai abri a conexão
									dao = new ClienteDAO();
									
									dao.salvarPagamento(cliente);
									JOptionPane.showMessageDialog(null,"Salvo com Sucesso ");
									}catch(Exception e0) {
										JOptionPane.showMessageDialog(null,"Erro ao Gravar "+e0.getMessage());
									}
			}
		});
		button_7.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\salvar-\u00EDcone-de-disco-flex\u00EDvel-o-bot\u00E3o-quadrado-azul-89658451.jpg"));
		button_7.setToolTipText("Salvar");
		button_7.setBounds(142, 312, 89, 61);
		panel_3.add(button_7);
		
		button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//==============Altera Pagamento========
				
				try {
					
					cliente = new Cliente();
					cliente.setCpf(txtCpfPagamento.getText());
					cliente.setTratamento((String)cbxTratamentoPagamento.getSelectedItem());
					cliente.setQtsConsulta(Integer.parseInt((String) cbxQtsConsultaPagamento.getSelectedItem()));
					cliente.setFormaPagamento((String) cbxFormaPagamento.getSelectedItem());
					cliente.setQtsParcela(Integer.parseInt((String) cbxParcelamentoPagamento.getSelectedItem()));
					cliente.setValorTotal(Double.parseDouble(txtValorTotalPagamento.getText()));
					
						
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					
					dao.alterarPagamento(cliente);
					JOptionPane.showMessageDialog(null,"Alterado com Sucesso ");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Altera "+e0.getMessage());
					}
			}
		});
		button_8.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\altrar.png"));
		button_8.setToolTipText("Alterar");
		button_8.setBounds(268, 312, 89, 61);
		panel_3.add(button_8);
		
		button_9 = new JButton("");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//==========Consultar Pagamento====================
				
				try {
				
					dao = new ClienteDAO();
					
					cliente = dao.consultarPagamento(txtCpfPagamento.getText());
					txtNomePagamento.setText(cliente.getNome());
					
				
					String tratamento = cliente.getTratamento();
					switch(tratamento) {
					case "Selecione um Opção":
						cbxTratamentoPagamento.setSelectedIndex(0);
						break;
						
					case "Ortodontia":
						cbxTratamentoPagamento.setSelectedIndex(1);
						break;
						
					case "Implante dentário":
						cbxTratamentoPagamento.setSelectedIndex(2);
						break;
						
					case "Clínica geral":
						cbxTratamentoPagamento.setSelectedIndex(3);
						break;
						
					case "Clareamento":
						cbxTratamentoPagamento.setSelectedIndex(4);
						break;
						
					case "Prótese dentária móvel":
						cbxTratamentoPagamento.setSelectedIndex(4);
						break;
						
					case "Periodontia: tratamento das gengivas":
						cbxTratamentoPagamento.setSelectedIndex(5);
						break;
						
					case "Endodontia: tratamento de canal":
						cbxTratamentoPagamento.setSelectedIndex(6);
						break;
					}
					
					int qtsConsult = cliente.getQtsConsulta();
					switch(qtsConsult) {
					case 1:
						cbxQtsConsultaPagamento.setSelectedIndex(1);
						break;
						
					case 2:
						cbxQtsConsultaPagamento.setSelectedIndex(2);
						break;
						
					case 3:
						cbxQtsConsultaPagamento.setSelectedIndex(3);
						break;
						
					case 4:
						cbxQtsConsultaPagamento.setSelectedIndex(4);
						break;
						
					case 5:
						cbxQtsConsultaPagamento.setSelectedIndex(5);
						break;
						
					case 6:
						cbxQtsConsultaPagamento.setSelectedIndex(6);
						break;
						
					case 7:
						cbxQtsConsultaPagamento.setSelectedIndex(7);
						break;
						
					case 8:
						cbxQtsConsultaPagamento.setSelectedIndex(8);
						break;
						
					case 9:
						cbxQtsConsultaPagamento.setSelectedIndex(9);
						break;
					
					case 10:
						cbxQtsConsultaPagamento.setSelectedIndex(10);
						break;
						
					case 11:
						cbxQtsConsultaPagamento.setSelectedIndex(11);
						break;
						
					case 12:
						cbxQtsConsultaPagamento.setSelectedIndex(12);
						break;
						
					case 13:
						cbxQtsConsultaPagamento.setSelectedIndex(13);
						break;
						
					case 14:
						cbxQtsConsultaPagamento.setSelectedIndex(14);
						break;
						
					case 15:
						cbxQtsConsultaPagamento.setSelectedIndex(15);
						break;
						
					case 16:
						cbxQtsConsultaPagamento.setSelectedIndex(16);
						break;
						
					case 17:
						cbxQtsConsultaPagamento.setSelectedIndex(17);
						break;
						
					case 18:
						cbxQtsConsultaPagamento.setSelectedIndex(18);
						break;
						
					case 19:
						cbxQtsConsultaPagamento.setSelectedIndex(19);
						break;
						
					case 20:
						cbxQtsConsultaPagamento.setSelectedIndex(20);
						break;
					}
					
					
					String forma = cliente.getFormaPagamento();
					
					switch(forma) {
					case "Selecione um Opção":
						cbxFormaPagamento.setSelectedIndex(0);
						break;
						
					case "A VISTA":
						cbxFormaPagamento.setSelectedIndex(1);
						break;
						
					case "CARTAO CREDITO":
						cbxFormaPagamento.setSelectedIndex(2);
						break;
						
					case "CARTAO DEBITO":
						cbxFormaPagamento.setSelectedIndex(3);
						break;
					}
					
					int qtsParcel = cliente.getQtsConsulta();
					switch(qtsParcel) {
					case 01:
						cbxParcelamentoPagamento.setSelectedIndex(1);
						break;
						
					case 02:
						cbxParcelamentoPagamento.setSelectedIndex(2);
						break;
						
					case 03:
						cbxParcelamentoPagamento.setSelectedIndex(3);
						break;
						
					case 04:
						cbxParcelamentoPagamento.setSelectedIndex(4);
						break;
						
					case 05:
						cbxParcelamentoPagamento.setSelectedIndex(5);
						break;
						
					case 06:
						cbxParcelamentoPagamento.setSelectedIndex(6);
						break;
						
					case 07:
						cbxParcelamentoPagamento.setSelectedIndex(7);
						break;
						
					case 8:
						cbxParcelamentoPagamento.setSelectedIndex(8);
						break;
						
					case 9:
						cbxParcelamentoPagamento.setSelectedIndex(9);
						break;
					
					case 10:
						cbxParcelamentoPagamento.setSelectedIndex(10);
						break;
						
					case 11:
						cbxParcelamentoPagamento.setSelectedIndex(11);
						break;
						
					case 12:
						cbxParcelamentoPagamento.setSelectedIndex(12);
						break;
					}
					double resu =  cliente.getValorTotal() / cliente.getQtsConsulta();
					
					  DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
				        decimalFormat.setRoundingMode(RoundingMode.DOWN);
				       // System.out.println( decimalFormat.format(resu) );
					
					txtValorParcelaPagamento.setText(decimalFormat.format(resu));
					
					txtValorTotalPagamento.setText(Double.toString(cliente.getValorTotal()));
					
		}catch(Exception e0) {
			JOptionPane.showMessageDialog(null,"Erro ao Consultar Pagamento "+ e0.getMessage());
		}
			}
		});
		button_9.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\lupa_org_20170315094946.png"));
		button_9.setToolTipText("Consultar");
		button_9.setBounds(382, 312, 89, 61);
		panel_3.add(button_9);
		
		panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Agendamento", null, panel_2, null);
		panel_2.setLayout(null);
		
		lblCpf_3 = new JLabel("CPF");
		lblCpf_3.setBounds(10, 39, 46, 14);
		lblCpf_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_2.add(lblCpf_3);
		
		lblTratamento_2 = new JLabel("Tratamento");
		lblTratamento_2.setBounds(10, 101, 81, 14);
		lblTratamento_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_2.add(lblTratamento_2);
		
		cbxTratamentoAgendamento = new JComboBox();
		cbxTratamentoAgendamento.setModel(new DefaultComboBoxModel(new String[] {"Selecione um Op\u00E7\u00E3o", "Ortodontia", "Implante dent\u00E1rio", "Cl\u00EDnica geral", "Clareamento", "Pr\u00F3tese dent\u00E1ria m\u00F3vel", "Periodontia: tratamento das gengivas", "Endodontia: tratamento de canal"}));
		cbxTratamentoAgendamento.setBounds(150, 95, 477, 20);
		panel_2.add(cbxTratamentoAgendamento);
		
		lblNumero_5 = new JLabel("Nome");
		lblNumero_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNumero_5.setBounds(10, 67, 137, 14);
		panel_2.add(lblNumero_5);
		
		lblData = new JLabel("Data ");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblData.setBounds(10, 126, 46, 14);
		panel_2.add(lblData);
		
		ckcbxConfimadoAgendamento = new JCheckBox("Confimado");
		ckcbxConfimadoAgendamento.setBackground(SystemColor.activeCaption);
		ckcbxConfimadoAgendamento.setFont(new Font("Tahoma", Font.BOLD, 12));
		ckcbxConfimadoAgendamento.setBounds(150, 195, 97, 23);
		panel_2.add(ckcbxConfimadoAgendamento);
		
		lblConfirmado = new JLabel("Confirmado");
		lblConfirmado.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfirmado.setBounds(10, 200, 81, 14);
		panel_2.add(lblConfirmado);
		
		lblAlergiaDeMedicamento = new JLabel("Alergia de Medicamento");
		lblAlergiaDeMedicamento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAlergiaDeMedicamento.setBounds(10, 255, 137, 14);
		panel_2.add(lblAlergiaDeMedicamento);
		
		txtNomeAgendamento = new JLabel("");
		txtNomeAgendamento.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.LIGHT_GRAY, null));
		txtNomeAgendamento.setBounds(150, 64, 477, 20);
		panel_2.add(txtNomeAgendamento);
		
		txtAlergiaAgendamento = new JLabel("");
		txtAlergiaAgendamento.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, Color.LIGHT_GRAY, null));
		txtAlergiaAgendamento.setBounds(150, 255, 477, 20);
		panel_2.add(txtAlergiaAgendamento);
		
		txtCpfAgendamento = new JFormattedTextField(new MaskFormatter("###-###-###/##"));
		txtCpfAgendamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//---------------consultar convenio -----------------
				
				try {
					
					dao = new ClienteDAO();
					
					cliente = dao.consultarCadastro(txtCpfAgendamento.getText());
					txtNomeAgendamento.setText(cliente.getNome());
					
					
		}catch(Exception e0) {
			JOptionPane.showMessageDialog(null,"Erro ao Consultar  "+ e0.getMessage());
		}
			}
		});
		txtCpfAgendamento.setBounds(150, 37, 238, 20);
		panel_2.add(txtCpfAgendamento);
		
		txtDataAgendamento = new JFormattedTextField(new MaskFormatter("##/##/####"));
		txtDataAgendamento.setBounds(150, 126, 238, 19);
		panel_2.add(txtDataAgendamento);
		
		lblHora = new JLabel("Hora");
		lblHora.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHora.setBounds(10, 160, 46, 14);
		panel_2.add(lblHora);
		
		txtHora = new JFormattedTextField(new MaskFormatter("##:##"));
		txtHora.setBounds(150, 156, 238, 19);
		panel_2.add(txtHora);
		
		button_10 = new JButton("");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=============Excluir Agendamento
				try {
					
					//aqui ele vai abri a conexão
					dao = new ClienteDAO();
					int res;
					res = JOptionPane.showConfirmDialog( null,"Tem Certeza quer Excluir o Agendamento? ","Confirma",JOptionPane.YES_NO_OPTION);
					if( res == 0) {
						dao.excluirAgendamento(txtCpfAgendamento.getText());
					}else {
						
					}
					
					
					JOptionPane.showMessageDialog(null,"Excluido Com Sucesso.");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Excluir "+e0.getMessage());
					}
			}
		});
		button_10.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\Excluir3.png"));
		button_10.setToolTipText("Excluir");
		button_10.setBounds(522, 315, 89, 61);
		panel_2.add(button_10);
		
		button_11 = new JButton("");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//================Novo Agendamento===================
				
				
				txtCpfAgendamento.setText(null);
				txtNomeAgendamento.setText(null);
				cbxTratamentoAgendamento.setSelectedIndex(0);
				txtDataAgendamento.setText(null);
				txtHora.setText(null);
				ckcbxConfimadoAgendamento.setSelected(false);
				txtAlergiaAgendamento.setText(null);
				
			
			}
		});
		button_11.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\Actions-bookmark-new-icon.png"));
		button_11.setToolTipText("Novo");
		button_11.setBounds(38, 315, 89, 61);
		panel_2.add(button_11);
		
		button_12 = new JButton("");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=======Salvar Agendamento =================
				try {
					
					cliente = new Cliente();
					cliente.setCpf(txtCpfAgendamento.getText());
					cliente.setTratamento((String)cbxTratamentoAgendamento.getSelectedItem());
					cliente.setDataAgendamento(txtDataAgendamento.getText());
					cliente.setHora(txtHora.getText());
					boolean confirmado = ckcbxConfimadoAgendamento.isSelected();
					if(confirmado == true) {
						cliente.setConfirmado(1);
					}else if(confirmado == false){
						cliente.setConfirmado(0);
					}
					
					
					dao = new ClienteDAO();
					
					dao.salvarAgendamento(cliente);
					JOptionPane.showMessageDialog(null,"Salvo com Sucesso ");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Gravar "+e0.getMessage());
					}
			}
		});
		button_12.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\salvar-\u00EDcone-de-disco-flex\u00EDvel-o-bot\u00E3o-quadrado-azul-89658451.jpg"));
		button_12.setToolTipText("Salvar");
		button_12.setBounds(159, 315, 89, 61);
		panel_2.add(button_12);
		
		button_13 = new JButton("");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//==========Alterar Agendamento==============
				try {
					
					cliente = new Cliente();
					cliente.setCpf(txtCpfAgendamento.getText());
					cliente.setTratamento((String)cbxTratamentoAgendamento.getSelectedItem());
					cliente.setDataAgendamento(txtDataAgendamento.getText());
					cliente.setHora(txtHora.getText());
					boolean confirmado = ckcbxConfimadoAgendamento.isSelected();
					if(confirmado == true) {
						cliente.setConfirmado(1);
					}else if(confirmado == false){
						cliente.setConfirmado(0);
					}
					
					cliente.setAlergiaMedicamento(txtAlergiaAgendamento.getText());
					
					
					dao = new ClienteDAO();
					
					dao.alterarAgendamento(cliente);
					JOptionPane.showMessageDialog(null,"Alterado com Sucesso ");
					}catch(Exception e0) {
						JOptionPane.showMessageDialog(null,"Erro ao Altera "+e0.getMessage());
					}
			}
		});
		button_13.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\altrar.png"));
		button_13.setToolTipText("Alterar");
		button_13.setBounds(285, 315, 89, 61);
		panel_2.add(button_13);
		
		button_14 = new JButton("");
		button_14.setToolTipText("Consultar");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//================Consultar Agendamento=============
				
				try {
					
					dao = new ClienteDAO();
					
					cliente = dao.consultarAgendamento(txtCpfAgendamento.getText());
					txtNomeAgendamento.setText(cliente.getNome());
					
					System.out.println(cliente.getTratamento());
					String tratamento = cliente.getTratamento();
					switch(tratamento) {
					case "Selecione um Opção":
						cbxTratamentoAgendamento.setSelectedIndex(0);
						break;
						
					case "Ortodontia":
						cbxTratamentoAgendamento.setSelectedIndex(1);
						break;
						
					case "Implante dentário":
						cbxTratamentoAgendamento.setSelectedIndex(2);
						break;
						
					case "Clínica geral":
						cbxTratamentoAgendamento.setSelectedIndex(3);
						break;
						
					case "Clareamento":
						cbxTratamentoAgendamento.setSelectedIndex(4);
						break;
						
					case "Prótese dentária móvel":
						cbxTratamentoAgendamento.setSelectedIndex(4);
						break;
						
					case "Periodontia: tratamento das gengivas":
						cbxTratamentoAgendamento.setSelectedIndex(5);
						break;
						
					case "Endodontia: tratamento de canal":
						cbxTratamentoAgendamento.setSelectedIndex(6);
						break;
					}
					
					txtDataAgendamento.setText(cliente.getDataAgendamento());
					txtHora.setText(cliente.getHora());
					int confirmado = cliente.getConfirmado();
					if(confirmado == 1) {
						ckcbxConfimadoAgendamento.setSelected(true);
					}else if(confirmado == 0){
						ckcbxConfimadoAgendamento.setSelected(false);
					}
					txtAlergiaAgendamento.setText(cliente.getAlergiaMedicamento());
					
		}catch(Exception e0) {
			JOptionPane.showMessageDialog(null,"Erro ao Consultar Agendamento "+ e0.getMessage());
		}
			}
		});
		button_14.setIcon(new ImageIcon("C:\\Users\\david\\OneDrive\\\u00C1rea de Trabalho\\Nova pasta (2)\\Tecnica de programa\u00E7\u00E3o\\workspace\\Imagem\\lupa_org_20170315094946.png"));
		button_14.setBounds(399, 315, 89, 61);
		panel_2.add(button_14);
		
		panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.activeCaption);
		tabbedPane.addTab("Agendados", null, panel_4, null);
		panel_4.setLayout(null);
		
		lblData_1 = new JLabel("Data");
		lblData_1.setBounds(10, 27, 46, 14);
		panel_4.add(lblData_1);
		
		txtDataBuscar = new JFormattedTextField(new MaskFormatter("##/##/####"));
		txtDataBuscar.setBounds(40, 24, 85, 17);
		panel_4.add(txtDataBuscar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//=======listar===========
				try {
				ArrayList<Cliente> lista = new ArrayList<Cliente>();
				dao = new ClienteDAO();
				lista = dao.listarTodos(txtDataBuscar.getText());
				
				for(Cliente cliente : lista) {
					
					txtLista.append("CPF: "+cliente.getCpf()+"\n");
					txtLista.append("Nome: "+cliente.getNome()+"\n");
					txtLista.append("Data: "+cliente.getDataAgendamento()+"\n");
					txtLista.append("Hora "+cliente.getHora()+"\n");
					int c =cliente.getConfirmado();
					if(c==1) {
						txtLista.append("Confirmado: Sim"+"\n\n");
					}else {
						txtLista.append("Confirmado: Não"+"\n\n");
					}
					
				
				}
				}catch(Exception e0) {
					JOptionPane.showMessageDialog(null,"Erro ao Listar "+e0.getMessage());
				}
			}
			
		});
		btnBuscar.setBounds(135, 23, 89, 23);
		panel_4.add(btnBuscar);
		
		txtLista = new TextArea();
		txtLista.setBounds(10, 82, 646, 405);
		panel_4.add(txtLista);
		
		btnListarCadastro = new JButton("Listar Cadastro");
		btnListarCadastro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=======cadastro listar===========
				try {
				ArrayList<Cliente> lista = new ArrayList<Cliente>();
				dao = new ClienteDAO();
				lista = dao.listaCadastro();
				
				for(Cliente cliente : lista) {
				
					
					txtLista.append("\nNome: "+cliente.getNome()+"\n");
					txtLista.append("CPF: "+cliente.getCpf()+"\n");
					txtLista.append("RG: "+cliente.getRg()+"\n");
					
					String sexo = cliente.getSexo();
					
					if(sexo.equals("Selecione uma Opção")) {
						txtLista.append("Sexo: "+"\n");
						
					}else if(sexo.equals("M")) {
						txtLista.append("Sexo: Mascolino"+"\n");
						
					}else if(sexo.equals("F")) {
						txtLista.append("Sexo: Feminino"+"\n");
					}
					
					String civil = cliente.getEstadoCivil();
					
					if(civil.equals("Selecione uma Opção")) {
						txtLista.append("Estado Civil: "+"\n");
						
					}else if(civil.equals("C")) {
						txtLista.append("Estado Civil: Casado(a)"+"\n");
						
					}else if(civil.equals("S")) {
						txtLista.append("Estado Civil: Soteiro(a)"+"\n");
					}
					
					txtLista.append("Data Nacimeto: "+cliente.getDataNacimento()+"\n");
					txtLista.append("Endereço: "+cliente.getEndereco()+"\n");
					txtLista.append("Numero: "+cliente.getNumero()+"\n");
					txtLista.append("CEP: "+cliente.getCep()+"\n");
					txtLista.append("Municipio: "+cliente.getMunicipio()+"\n");
					
					String tipo = cliente.getUf();
					
					if(tipo.equals("Selecione uma Opção")) {
						txtLista.append("UF: "+"\n");
						
					}else if(tipo.equals("AC")) {
						txtLista.append("UF: AC"+"\n");
						
					}else if(tipo.equals("AL")) {
						txtLista.append("UF: Al"+"\n");
						
					}else if(tipo.equals("AM")) {
						txtLista.append("UF: AL"+"\n");
						
					}else if(tipo.equals("BA")) {
						txtLista.append("UF: BA"+"\n");
						
					}else if(tipo.equals("SE")) {
						txtLista.append("UF: SE"+"\n");
						
					}else if(tipo.equals("DF")) {
						txtLista.append("UF: DF"+"\n");
						
					}else if(tipo.equals("SP")) {
						txtLista.append("UF: SP"+"\n");
						
					}else if(tipo.equals("SE")) {
						txtLista.append("UF: SE"+"\n");
						
					}else {
						txtLista.append("UF: "+"\n\n");
					}
					txtLista.append("Celular: "+cliente.getCelular()+"\n");
					txtLista.append("Alergia de Medicamento: "+cliente.getAlergiaMedicamento()+"\n");
				
				}
				}catch(Exception e0) {
					JOptionPane.showMessageDialog(null,"Erro ao Listar "+e0.getMessage());
				}
			}
		});
		btnListarCadastro.setBounds(234, 23, 133, 23);
		panel_4.add(btnListarCadastro);
		
		btnListaConvenio = new JButton("Lista Convenio");
		btnListaConvenio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=======listar convenio===========
				try {
					ArrayList<Cliente> lista = new ArrayList<Cliente>();
					dao = new ClienteDAO();
					lista = dao.listarCovenio();
					for(Cliente cliente : lista) {
					
					txtLista.append("\nCPF: "+cliente.getCpf()+"\n");
					txtLista.append("Nome: "+cliente.getNome()+"\n");
				
					String convenio = cliente.getNomeConvenio();
					
					if(convenio.equals("Selecione uma Opção")) {
						txtLista.append("Covenio: "+"\n");
						
					}else if(convenio.equals("Amil")) {
						txtLista.append("Covenio: Amil"+"\n");
						
					}else if(convenio.equals("Bradesco Odonto")) {
						txtLista.append("Covenio: Bradesco Odonto"+"\n");
						
					}else if(convenio.equals("Notre Dame Intermédica")) {
						txtLista.append("Covenio: Notre Dame Intermédica"+"\n");
						
					}else if(convenio.equals("Porto Seguro")) {
						txtLista.append("Covenio: Notre Dame Intermédica"+"\n");
						
					}else if(convenio.equals("Santa Helena Saúde")) {
						txtLista.append("Covenio: Porto Seguro"+"\n");
						
					}else if(convenio.equals("Unimed")) {
						txtLista.append("Covenio: Unimed"+"\n");
						
					}else if(convenio.equals("Sul América Saúde")) {
						txtLista.append("Covenio: Sul América Saúde"+"\n");
					}
					txtLista.append("Numero do Convenio: "+cliente.getNumeroConvenio()+"\n");
					
					String tratamento = cliente.getTratamento();
					
					switch(tratamento) {
					case "Selecione um Opção":
						txtLista.append("Tratamento: "+"\n");
						break;
						
					case "Ortodontia":
						txtLista.append("Tratamento: Ortodontia"+"\n");
						break;
						
					case "Implante dentário":
						txtLista.append("Tratamento: Implante dentário"+"\n");
						break;
						
					case "Clínica geral":
						txtLista.append("Tratamento: Clínica geral"+"\n");
						break;
						
					case "Clareamento":
						txtLista.append("Tratamento: Clareamento"+"\n");
						break;
						
					case "Prótese dentária móvel":
						txtLista.append("Tratamento: Prótese dentária móvel"+"\n");
						break;
						
					case "Periodontia: tratamento das gengivas":
						txtLista.append("Tratamento: Periodontia: tratamento das gengivas"+"\n");
						break;
						
					case "Endodontia: tratamento de canal":
						txtLista.append("Tratamento: Endodontia: tratamento de canal"+"\n");
						break;
					}
					
					int qtsConsulta = cliente.getQtsConsulta();
					switch(qtsConsulta) {
					case 1:
						txtLista.append("QTS Consulta 1"+"\n");
						break;
						
					case 2:
						txtLista.append("QTS Consulta 2"+"\n");
						break;
						
					case 3:
						txtLista.append("QTS Consulta 3"+"\n");
						break;
						
					case 4:
						txtLista.append("QTS Consulta 4"+"\n");
						break;
						
					case 5:
						txtLista.append("QTS Consulta 5"+"\n");
						break;
						
					case 6:
						txtLista.append("QTS Consulta 6"+"\n");
						break;
						
					case 7:
						txtLista.append("QTS Consulta 7"+"\n");
						break;
						
					case 8:
						txtLista.append("QTS Consulta 8"+"\n");
						break;
						
					case 9:
						txtLista.append("QTS Consulta 9"+"\n");
						break;
					
					case 10:
						txtLista.append("QTS Consulta 10"+"\n");
						break;
						
					case 11:
						txtLista.append("QTS Consulta 11"+"\n");
						break;
						
					case 12:
						txtLista.append("QTS Consulta 12"+"\n");
						break;
						
					case 13:
						txtLista.append("QTS Consulta 13"+"\n");
						break;
						
					case 14:
						txtLista.append("QTS Consulta 14"+"\n");
						break;
						
					case 15:
						txtLista.append("QTS Consulta 15"+"\n");
						break;
						
					case 16:
						txtLista.append("QTS Consulta 16"+"\n");
						break;
						
					case 17:
						txtLista.append("QTS Consulta 17"+"\n");
						break;
						
					case 18:
						txtLista.append("QTS Consulta 18"+"\n");
						break;
						
					case 19:
						txtLista.append("QTS Consulta 19"+"\n");
						break;
						
					case 20:
						txtLista.append("QTS Consulta 20"+"\n");
						break;
					}
					
					txtLista.append("Valor Total: "+cliente.getValorTotal()+"\n\n");
				
				}
				}catch(Exception e0) {
					JOptionPane.showMessageDialog(null,"Erro ao Listar "+e0.getMessage());
				}
			}
		});
		btnListaConvenio.setBounds(377, 23, 133, 23);
		panel_4.add(btnListaConvenio);
		
		btnListaPagamento = new JButton("Lista Pagamento");
		btnListaPagamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=======listar===========
				try {
				ArrayList<Cliente> lista = new ArrayList<Cliente>();
				dao = new ClienteDAO();
				lista = dao.listarPagamento();
				
				for(Cliente cliente : lista) {
					
					txtLista.append("\nCPF: "+cliente.getCpf()+"\n");
					txtLista.append("Nome: "+cliente.getNome()+"\n");
					
					
					String tratamento = cliente.getTratamento();
					
					switch(tratamento) {
					case "Selecione um Opção":
						txtLista.append("Tratamento: "+"\n");
						break;
						
					case "Ortodontia":
						txtLista.append("Tratamento: Ortodontia"+"\n");
						break;
						
					case "Implante dentário":
						txtLista.append("Tratamento: Implante dentário"+"\n");
						break;
						
					case "Clínica geral":
						txtLista.append("Tratamento: Clínica geral"+"\n");
						break;
						
					case "Clareamento":
						txtLista.append("Tratamento: Clareamento"+"\n");
						break;
						
					case "Prótese dentária móvel":
						txtLista.append("Tratamento: Prótese dentária móvel"+"\n");
						break;
						
					case "Periodontia: tratamento das gengivas":
						txtLista.append("Tratamento: Periodontia: tratamento das gengivas"+"\n");
						break;
						
					case "Endodontia: tratamento de canal":
						txtLista.append("Tratamento: Endodontia: tratamento de canal"+"\n");
						break;
					}
					
					
					int qtsConsulta = cliente.getQtsConsulta();
					switch(qtsConsulta) {
					case 1:
						txtLista.append("QTS Consulta 1"+"\n");
						break;
						
					case 2:
						txtLista.append("QTS Consulta 2"+"\n");
						break;
						
					case 3:
						txtLista.append("QTS Consulta 3"+"\n");
						break;
						
					case 4:
						txtLista.append("QTS Consulta 4"+"\n");
						break;
						
					case 5:
						txtLista.append("QTS Consulta 5"+"\n");
						break;
						
					case 6:
						txtLista.append("QTS Consulta 6"+"\n");
						break;
						
					case 7:
						txtLista.append("QTS Consulta 7"+"\n");
						break;
						
					case 8:
						txtLista.append("QTS Consulta 8"+"\n");
						break;
						
					case 9:
						txtLista.append("QTS Consulta 9"+"\n");
						break;
					
					case 10:
						txtLista.append("QTS Consulta 10"+"\n");
						break;
						
					case 11:
						txtLista.append("QTS Consulta 11"+"\n");
						break;
						
					case 12:
						txtLista.append("QTS Consulta 12"+"\n");
						break;
						
					case 13:
						txtLista.append("QTS Consulta 13"+"\n");
						break;
						
					case 14:
						txtLista.append("QTS Consulta 14"+"\n");
						break;
						
					case 15:
						txtLista.append("QTS Consulta 15"+"\n");
						break;
						
					case 16:
						txtLista.append("QTS Consulta 16"+"\n");
						break;
						
					case 17:
						txtLista.append("QTS Consulta 17"+"\n");
						break;
						
					case 18:
						txtLista.append("QTS Consulta 18"+"\n");
						break;
						
					case 19:
						txtLista.append("QTS Consulta 19"+"\n");
						break;
						
					case 20:
						txtLista.append("QTS Consulta 20"+"\n");
						break;
					}
					
					
					
					String forma = cliente.getFormaPagamento();
					
					switch(forma) {
					case "Selecione um Opção":
						txtLista.append("Forma Pagamento: "+"\n");
						break;
						
					case "A VISTA":
						txtLista.append("Forma Pagamento: A VISTA"+"\n");
						break;
						
					case "CARTAO CREDITO":
						txtLista.append("Forma Pagamento: CARTAO CREDITO"+"\n");
						break;
						
					case "CARTAO DEBITO":
						txtLista.append("Forma Pagamento: CARTAO DEBITO"+"\n");
						break;
					}
					
					int qtsParcel = cliente.getQtsConsulta();
					switch(qtsParcel) {
					case 1:
						txtLista.append("QTS Parcela 1"+"\n");
						break;
						
					case 2:
						txtLista.append("QTS Parcela 2"+"\n");
						break;
						
					case 3:
						txtLista.append("QTS Parcela 3"+"\n");
						break;
						
					case 4:
						txtLista.append("QTS Parcela 4"+"\n");
						break;
						
					case 5:
						txtLista.append("QTS Parcela 5"+"\n");
						break;
						
					case 6:
						txtLista.append("QTS Parcela 6"+"\n");
						break;
						
					case 7:
						txtLista.append("QTS Parcela 7"+"\n");
						break;
						
					case 8:
						txtLista.append("QTS Parcela 8"+"\n");
						break;
						
					case 9:
						txtLista.append("QTS Parcela 9"+"\n");
						break;
					
					case 10:
						txtLista.append("QTS Parcela 10"+"\n");
						break;
						
					case 11:
						txtLista.append("QTS Parcela 11"+"\n");
						break;
						
					case 12:
						txtLista.append("QTS Parcela 12"+"\n");
						break;
					}
					
					txtLista.append("Valor Total: "+cliente.getValorTotal()+"\n\n");
				
				}
				}catch(Exception e0) {
					JOptionPane.showMessageDialog(null,"Erro ao Listar "+e0.getMessage());
				}
			}
		});
		btnListaPagamento.setBounds(520, 23, 136, 23);
		panel_4.add(btnListaPagamento);
		
		btnNovo_1 = new JButton("Novo");
		btnNovo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLista.setText(null);
			}
		});
		btnNovo_1.setBounds(135, 53, 89, 23);
		panel_4.add(btnNovo_1);
	}
}
