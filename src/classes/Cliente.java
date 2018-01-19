package classes;

import java.sql.Date;

public class Cliente {

	private Long idcliente;
	private Long idconvenio;
	private Long idpagamento;
	private Long idpromocao;
	private String ufclifor;
	private String nome;
	private String cnpjcpf;
	private String endereco;
	private String bairro;
	private Double perdesconto;
	private Date dtcadastro;
	private String fonefax;
	private String fone1;
	private String fone2;
	private String fonecelular;
	private String numcartaomag;
	private Double vallimitecredito;
	private Double vallimiteconvenio;
	private Double vallimitecheque;
	private Date dtvalidadecartao;
	private String inscrestadual;
	private String obsgeral;
	private int senhaconvenio;
	private String nomefantasia;
	private String email;
	private String tipofisicajuridica;
	private String flaginativo;
	private String flagnaoconschqserasa;
	private Date dtultimaalteracao;
	private String url;
	private Date dtalteracao;
	private String flagclientevip;
	private String descrcidade;
	private String cep;
	private String tipotestecliente;
	private String chapafolhapgto;
	private String numeroresidencial;
	private int idcidade;
	private String flagnaoconsultacheques;
	private String flagrestringeformaspagto;
	private Double perminimoentrada;
	private int idvencimentocartaoproprio;
	private String flagutilizapontuacao;
	private String descrestado;
	private String pais;
	private int codigoibge;
	private String tipocadastro;
	private String flagnaoenviadadoscliforxml;
	private Date dtinicialpromocao;
	private Date dtfinalpromocao;
	private String progpontuacao;
	
	public Long getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(Long idcliente) {
		this.idcliente = idcliente;
	}
	public Long getIdconvenio() {
		return idconvenio;
	}
	public void setIdconvenio(Long idconvenio) {
		this.idconvenio = idconvenio;
	}
	public Long getIdpagamento() {
		return idpagamento;
	}
	public void setIdpagamento(Long idpagamento) {
		this.idpagamento = idpagamento;
	}
	public Long getIdpromocao() {
		return idpromocao;
	}
	public void setIdpromocao(Long idpromocao) {
		this.idpromocao = idpromocao;
	}
	public String getUfclifor() {
		return ufclifor;
	}
	public void setUfclifor(String ufclifor) {
		this.ufclifor = ufclifor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpjcpf() {
		return cnpjcpf;
	}
	public void setCnpjcpf(String cnpjcpf) {
		this.cnpjcpf = cnpjcpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public Double getPerdesconto() {
		return perdesconto;
	}
	public void setPerdesconto(Double perdesconto) {
		this.perdesconto = perdesconto;
	}
	public Date getDtcadastro() {
		return dtcadastro;
	}
	public void setDtcadastro(Date dtcadastro) {
		this.dtcadastro = dtcadastro;
	}
	public String getFonefax() {
		return fonefax;
	}
	public void setFonefax(String fonefax) {
		this.fonefax = fonefax;
	}
	public String getFone1() {
		return fone1;
	}
	public void setFone1(String fone1) {
		this.fone1 = fone1;
	}
	public String getFone2() {
		return fone2;
	}
	public void setFone2(String fone2) {
		this.fone2 = fone2;
	}
	public String getFonecelular() {
		return fonecelular;
	}
	public void setFonecelular(String fonecelular) {
		this.fonecelular = fonecelular;
	}
	public String getNumcartaomag() {
		return numcartaomag;
	}
	public void setNumcartaomag(String numcartaomag) {
		this.numcartaomag = numcartaomag;
	}
	public Double getVallimitecredito() {
		return vallimitecredito;
	}
	public void setVallimitecredito(Double vallimitecredito) {
		this.vallimitecredito = vallimitecredito;
	}
	public Double getVallimiteconvenio() {
		return vallimiteconvenio;
	}
	public void setVallimiteconvenio(Double vallimiteconvenio) {
		this.vallimiteconvenio = vallimiteconvenio;
	}
	public Double getVallimitecheque() {
		return vallimitecheque;
	}
	public void setVallimitecheque(Double vallimitecheque) {
		this.vallimitecheque = vallimitecheque;
	}
	public Date getDtvalidadecartao() {
		return dtvalidadecartao;
	}
	public void setDtvalidadecartao(Date dtvalidadecartao) {
		this.dtvalidadecartao = dtvalidadecartao;
	}
	public String getInscrestadual() {
		return inscrestadual;
	}
	public void setInscrestadual(String inscrestadual) {
		this.inscrestadual = inscrestadual;
	}
	public String getObsgeral() {
		return obsgeral;
	}
	public void setObsgeral(String obsgeral) {
		this.obsgeral = obsgeral;
	}
	public int getSenhaconvenio() {
		return senhaconvenio;
	}
	public void setSenhaconvenio(int senhaconvenio) {
		this.senhaconvenio = senhaconvenio;
	}
	public String getNomefantasia() {
		return nomefantasia;
	}
	public void setNomefantasia(String nomefantasia) {
		this.nomefantasia = nomefantasia;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTipofisicajuridica() {
		return tipofisicajuridica;
	}
	public void setTipofisicajuridica(String tipofisicajuridica) {
		this.tipofisicajuridica = tipofisicajuridica;
	}
	public String getFlaginativo() {
		return flaginativo;
	}
	public void setFlaginativo(String flaginativo) {
		this.flaginativo = flaginativo;
	}
	public String getFlagnaoconschqserasa() {
		return flagnaoconschqserasa;
	}
	public void setFlagnaoconschqserasa(String flagnaoconschqserasa) {
		this.flagnaoconschqserasa = flagnaoconschqserasa;
	}
	public Date getDtultimaalteracao() {
		return dtultimaalteracao;
	}
	public void setDtultimaalteracao(Date dtultimaalteracao) {
		this.dtultimaalteracao = dtultimaalteracao;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getDtalteracao() {
		return dtalteracao;
	}
	public void setDtalteracao(Date dtalteracao) {
		this.dtalteracao = dtalteracao;
	}
	public String getFlagclientevip() {
		return flagclientevip;
	}
	public void setFlagclientevip(String flagclientevip) {
		this.flagclientevip = flagclientevip;
	}
	public String getDescrcidade() {
		return descrcidade;
	}
	public void setDescrcidade(String descrcidade) {
		this.descrcidade = descrcidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTipotestecliente() {
		return tipotestecliente;
	}
	public void setTipotestecliente(String tipotestecliente) {
		this.tipotestecliente = tipotestecliente;
	}
	public String getChapafolhapgto() {
		return chapafolhapgto;
	}
	public void setChapafolhapgto(String chapafolhapgto) {
		this.chapafolhapgto = chapafolhapgto;
	}
	public String getNumeroresidencial() {
		return numeroresidencial;
	}
	public void setNumeroresidencial(String numeroresidencial) {
		this.numeroresidencial = numeroresidencial;
	}
	public int getIdcidade() {
		return idcidade;
	}
	public void setIdcidade(int idcidade) {
		this.idcidade = idcidade;
	}
	public String getFlagnaoconsultacheques() {
		return flagnaoconsultacheques;
	}
	public void setFlagnaoconsultacheques(String flagnaoconsultacheques) {
		this.flagnaoconsultacheques = flagnaoconsultacheques;
	}
	public String getFlagrestringeformaspagto() {
		return flagrestringeformaspagto;
	}
	public void setFlagrestringeformaspagto(String flagrestringeformaspagto) {
		this.flagrestringeformaspagto = flagrestringeformaspagto;
	}
	public Double getPerminimoentrada() {
		return perminimoentrada;
	}
	public void setPerminimoentrada(Double perminimoentrada) {
		this.perminimoentrada = perminimoentrada;
	}
	public int getIdvencimentocartaoproprio() {
		return idvencimentocartaoproprio;
	}
	public void setIdvencimentocartaoproprio(int idvencimentocartaoproprio) {
		this.idvencimentocartaoproprio = idvencimentocartaoproprio;
	}
	public String getFlagutilizapontuacao() {
		return flagutilizapontuacao;
	}
	public void setFlagutilizapontuacao(String flagutilizapontuacao) {
		this.flagutilizapontuacao = flagutilizapontuacao;
	}
	public String getDescrestado() {
		return descrestado;
	}
	public void setDescrestado(String descrestado) {
		this.descrestado = descrestado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getCodigoibge() {
		return codigoibge;
	}
	public void setCodigoibge(int codigoibge) {
		this.codigoibge = codigoibge;
	}
	public String getTipocadastro() {
		return tipocadastro;
	}
	public void setTipocadastro(String tipocadastro) {
		this.tipocadastro = tipocadastro;
	}
	public String getFlagnaoenviadadoscliforxml() {
		return flagnaoenviadadoscliforxml;
	}
	public void setFlagnaoenviadadoscliforxml(String flagnaoenviadadoscliforxml) {
		this.flagnaoenviadadoscliforxml = flagnaoenviadadoscliforxml;
	}
	public Date getDtinicialpromocao() {
		return dtinicialpromocao;
	}
	public void setDtinicialpromocao(Date dtinicialpromocao) {
		this.dtinicialpromocao = dtinicialpromocao;
	}
	public Date getDtfinalpromocao() {
		return dtfinalpromocao;
	}
	public void setDtfinalpromocao(Date dtfinalpromocao) {
		this.dtfinalpromocao = dtfinalpromocao;
	}
	public String getProgpontuacao() {
		return progpontuacao;
	}
	public void setProgpontuacao(String progpontuacao) {
		this.progpontuacao = progpontuacao;
	}
	
}
