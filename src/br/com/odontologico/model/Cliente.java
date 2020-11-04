package br.com.odontologico.model;

public class Cliente {
	
	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	private String estadoCivil;
	private String dataNacimento;
	private String endereco;
	private int	numero;
	private String cep;
	private String municipio;
	private String uf;
	private String celular;
	private String alergiaMedicamento;
	private String nomeConvenio;
	private String numeroConvenio;
	private int qtsConsulta;
	private String tratamento;
	private int quantidadeConsulta;
	private String formaPagamento;
	private int	qtsParcela;
	private double valorTotal;
	private String dataAgendamento;
	private String hora;
	private int confirmado;
	
	public Cliente () {
		
	}
	
	public Cliente(String nome, String cpf, int qtsConsulta, String tratamento, String formaPagamento, int qtsParcela,
			double valorTotal) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.qtsConsulta = qtsConsulta;
		this.tratamento = tratamento;
		this.formaPagamento = formaPagamento;
		this.qtsParcela = qtsParcela;
		this.valorTotal = valorTotal;
	}
	
	public Cliente(String nome, String cpf, String rg, String sexo, String estadoCivil, String dataNacimento,
			String endereco, int numero, String cep, String municipio, String uf, String celular,
			String alergiaMedicamento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.dataNacimento = dataNacimento;
		this.endereco = endereco;
		this.numero = numero;
		this.cep = cep;
		this.municipio = municipio;
		this.uf = uf;
		this.celular = celular;
		this.alergiaMedicamento = alergiaMedicamento;
	}



	public Cliente(String cpf, String nome, String nomeConvenio, String numeroConvenio, int qtsConsulta, String tratamento, double valorTotal) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.nomeConvenio = nomeConvenio;
		this.numeroConvenio = numeroConvenio;
		this.qtsConsulta = qtsConsulta;
		this.tratamento = tratamento;
		this.valorTotal = valorTotal;
	}

	
	public Cliente(String nome, String cpf, String tratamento, String dataAgendamento,String hora, int confirmado, String alergiaMedicamento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.tratamento = tratamento;
		this.dataAgendamento = dataAgendamento;
		this.hora = hora;
		this.confirmado = confirmado;
		this.alergiaMedicamento=alergiaMedicamento;
	}

	
	
	public Cliente(String nome, String cpf, String tratamento, String dataAgendamento, String hora, int confirmado) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.tratamento = tratamento;
		this.dataAgendamento = dataAgendamento;
		this.hora = hora;
		this.confirmado = confirmado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getDataNacimento() {
		return dataNacimento;
	}

	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getAlergiaMedicamento() {
		return alergiaMedicamento;
	}

	public void setAlergiaMedicamento(String alergiaMedicamento) {
		this.alergiaMedicamento = alergiaMedicamento;
	}

	public String getNomeConvenio() {
		return nomeConvenio;
	}

	public void setNomeConvenio(String nomeConvenio) {
		this.nomeConvenio = nomeConvenio;
	}

	public String getNumeroConvenio() {
		return numeroConvenio;
	}

	public void setNumeroConvenio(String numeroConvenio) {
		this.numeroConvenio = numeroConvenio;
	}

	public int getQtsConsulta() {
		return qtsConsulta;
	}

	public void setQtsConsulta(int qtsConsulta) {
		this.qtsConsulta = qtsConsulta;
	}

	public String getTratamento() {
		return tratamento;
	}

	public void setTratamento(String tratamento) {
		this.tratamento = tratamento;
	}

	public int getQuantidadeConsulta() {
		return quantidadeConsulta;
	}

	public void setQuantidadeConsulta(int quantidadeConsulta) {
		this.quantidadeConsulta = quantidadeConsulta;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public int getQtsParcela() {
		return qtsParcela;
	}

	public void setQtsParcela(int qtsParcela) {
		this.qtsParcela = qtsParcela;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(String dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getConfirmado() {
		return confirmado;
	}

	public void setConfirmado(int confirmado) {
		this.confirmado = confirmado;
	}

	
	
}	