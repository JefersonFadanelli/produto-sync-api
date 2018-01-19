package classes;

import java.sql.Date;

public class Produto {

	private Long idproduto;
	
	private Long idsubproduto;

	private String descricao;
	
	private Long idcodbarprod;
	
	private Double valmultivendas;
	
	private String flaginativo;
	
	private Date dtalteracao;
	
	private int idgrupo;
	
	private int idsecao;
	
	private int idsubgrupo;
	
	private int iddivisao;
	
	private String flagpesavel;
	
	private Double valgramasaida;
	
	private String flagvasilhame;
	
	private String embalagemsaida;
	
	private int idvasilhame;
	
	private String tiposituacaotributaria;
	
	private Double aliquota;
	
	private Double valpreco;
	
	private String tipobaixamestre;
	
	private String flagpromocaocomprouganhou;
	private String flagpromocaocomprexganhe1;
	private int idsituacaotributaria;
	private Double aliquotaerp;
	
	private Double perreducaoaliquota;
	private String tipopiscofins;
	private Double perpis;
	private Double percofins;
	private Double valprecopromocao;
	private Date dtinipromocao;
	private Date dtfimpromocao;
	
	private int idinformacaonutricional;
	private int idfornecedor;
	private int diasvalidade;
	private int idprodutovasilhame;
	private int idsubprodutovasilhame;
	private String flagcestabasica;
	private String flagprodutoacabado;
	
	private int qtdminimapromocao;
	private String flaginativovenda;
	private int idpromocao;
	private String flagevidencia;
	private String ncm;
	private int idsubcatipireceita;
	private int idlistaservicoreceita;
	private String flagcomponente;
	private String flagiss;
	
	private int idsubprodutoexterno;
	private int idcenariofiscal;
	private Double percargatributaria;
	private Double peraliquotafederal;
	private Double peraliquotaestadual;
	private Double peraliquotamunicipal;
	private String codigoibpt;
	private int idcstpiscofins;
	private Double valprecounidademedida;
	private Double valprecopromocaounidademedida;
	private String codcest;
	private String flagsolicitapesagem;
	private Double perfcep;
	private Double pesobruto;
	private String flagproduzidoescalanaorelevante;
	private String cnpjfabricante;

	public Long getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(Long idproduto) {
		this.idproduto = idproduto;
	}
	
	public Long getIdsubproduto() {
		return idsubproduto;
	}

	public void setIdsubproduto(Long idsubproduto) {
		this.idsubproduto = idsubproduto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getIdcodbarprod() {
		return idcodbarprod;
	}

	public void setIdcodbarprod(Long idcodbarprod) {
		this.idcodbarprod = idcodbarprod;
	}

	public Double getValmultivendas() {
		return valmultivendas;
	}

	public void setValmultivendas(Double valmultivendas) {
		this.valmultivendas = valmultivendas;
	}

	public String getFlaginativo() {
		return flaginativo;
	}

	public void setFlaginativo(String flaginativo) {
		this.flaginativo = flaginativo;
	}

	public Date getDtalteracao() {
		return dtalteracao;
	}

	public void setDtalteracao(Date dtalteracao) {
		this.dtalteracao = dtalteracao;
	}

	public int getIdgrupo() {
		return idgrupo;
	}

	public void setIdgrupo(int idgrupo) {
		this.idgrupo = idgrupo;
	}

	public int getIdsecao() {
		return idsecao;
	}

	public void setIdsecao(int idsecao) {
		this.idsecao = idsecao;
	}

	public int getIdsubgrupo() {
		return idsubgrupo;
	}

	public void setIdsubgrupo(int idsubgrupo) {
		this.idsubgrupo = idsubgrupo;
	}

	public int getIddivisao() {
		return iddivisao;
	}

	public void setIddivisao(int iddivisao) {
		this.iddivisao = iddivisao;
	}

	public String getFlagpesavel() {
		return flagpesavel;
	}

	public void setFlagpesavel(String flagpesavel) {
		this.flagpesavel = flagpesavel;
	}

	public Double getValgramasaida() {
		return valgramasaida;
	}

	public void setValgramasaida(Double valgramasaida) {
		this.valgramasaida = valgramasaida;
	}

	public String getFlagvasilhame() {
		return flagvasilhame;
	}

	public void setFlagvasilhame(String flagvasilhame) {
		this.flagvasilhame = flagvasilhame;
	}

	public String getEmbalagemsaida() {
		return embalagemsaida;
	}

	public void setEmbalagemsaida(String embalagemsaida) {
		this.embalagemsaida = embalagemsaida;
	}

	public int getIdvasilhame() {
		return idvasilhame;
	}

	public void setIdvasilhame(int idvasilhame) {
		this.idvasilhame = idvasilhame;
	}

	public String getTiposituacaotributaria() {
		return tiposituacaotributaria;
	}

	public void setTiposituacaotributaria(String tiposituacaotributaria) {
		this.tiposituacaotributaria = tiposituacaotributaria;
	}

	public Double getAliquota() {
		return aliquota;
	}

	public void setAliquota(Double aliquota) {
		this.aliquota = aliquota;
	}

	public Double getValpreco() {
		return valpreco;
	}

	public void setValpreco(Double valpreco) {
		this.valpreco = valpreco;
	}

	public String getTipobaixamestre() {
		return tipobaixamestre;
	}

	public void setTipobaixamestre(String tipobaixamestre) {
		this.tipobaixamestre = tipobaixamestre;
	}

	public String getFlagpromocaocomprouganhou() {
		return flagpromocaocomprouganhou;
	}

	public void setFlagpromocaocomprouganhou(String flagpromocaocomprouganhou) {
		this.flagpromocaocomprouganhou = flagpromocaocomprouganhou;
	}

	public String getFlagpromocaocomprexganhe1() {
		return flagpromocaocomprexganhe1;
	}

	public void setFlagpromocaocomprexganhe1(String flagpromocaocomprexganhe1) {
		this.flagpromocaocomprexganhe1 = flagpromocaocomprexganhe1;
	}

	public int getIdsituacaotributaria() {
		return idsituacaotributaria;
	}

	public void setIdsituacaotributaria(int idsituacaotributaria) {
		this.idsituacaotributaria = idsituacaotributaria;
	}

	public Double getAliquotaerp() {
		return aliquotaerp;
	}

	public void setAliquotaerp(Double aliquotaerp) {
		this.aliquotaerp = aliquotaerp;
	}

	public Double getPerreducaoaliquota() {
		return perreducaoaliquota;
	}

	public void setPerreducaoaliquota(Double perreducaoaliquota) {
		this.perreducaoaliquota = perreducaoaliquota;
	}

	public String getTipopiscofins() {
		return tipopiscofins;
	}

	public void setTipopiscofins(String tipopiscofins) {
		this.tipopiscofins = tipopiscofins;
	}

	public Double getPerpis() {
		return perpis;
	}

	public void setPerpis(Double perpis) {
		this.perpis = perpis;
	}

	public Double getPercofins() {
		return percofins;
	}

	public void setPercofins(Double percofins) {
		this.percofins = percofins;
	}

	public Double getValprecopromocao() {
		return valprecopromocao;
	}

	public void setValprecopromocao(Double valprecopromocao) {
		this.valprecopromocao = valprecopromocao;
	}

	public Date getDtinipromocao() {
		return dtinipromocao;
	}

	public void setDtinipromocao(Date dtinipromocao) {
		this.dtinipromocao = dtinipromocao;
	}

	public Date getDtfimpromocao() {
		return dtfimpromocao;
	}

	public void setDtfimpromocao(Date dtfimpromocao) {
		this.dtfimpromocao = dtfimpromocao;
	}

	public int getIdinformacaonutricional() {
		return idinformacaonutricional;
	}

	public void setIdinformacaonutricional(int idinformacaonutricional) {
		this.idinformacaonutricional = idinformacaonutricional;
	}

	public int getIdfornecedor() {
		return idfornecedor;
	}

	public void setIdfornecedor(int idfornecedor) {
		this.idfornecedor = idfornecedor;
	}

	public int getDiasvalidade() {
		return diasvalidade;
	}

	public void setDiasvalidade(int diasvalidade) {
		this.diasvalidade = diasvalidade;
	}

	public int getIdprodutovasilhame() {
		return idprodutovasilhame;
	}

	public void setIdprodutovasilhame(int idprodutovasilhame) {
		this.idprodutovasilhame = idprodutovasilhame;
	}

	public int getIdsubprodutovasilhame() {
		return idsubprodutovasilhame;
	}

	public void setIdsubprodutovasilhame(int idsubprodutovasilhame) {
		this.idsubprodutovasilhame = idsubprodutovasilhame;
	}

	public String getFlagcestabasica() {
		return flagcestabasica;
	}

	public void setFlagcestabasica(String flagcestabasica) {
		this.flagcestabasica = flagcestabasica;
	}

	public String getFlagprodutoacabado() {
		return flagprodutoacabado;
	}

	public void setFlagprodutoacabado(String flagprodutoacabado) {
		this.flagprodutoacabado = flagprodutoacabado;
	}

	public int getQtdminimapromocao() {
		return qtdminimapromocao;
	}

	public void setQtdminimapromocao(int qtdminimapromocao) {
		this.qtdminimapromocao = qtdminimapromocao;
	}

	public String getFlaginativovenda() {
		return flaginativovenda;
	}

	public void setFlaginativovenda(String flaginativovenda) {
		this.flaginativovenda = flaginativovenda;
	}

	public int getIdpromocao() {
		return idpromocao;
	}

	public void setIdpromocao(int idpromocao) {
		this.idpromocao = idpromocao;
	}

	public String getFlagevidencia() {
		return flagevidencia;
	}

	public void setFlagevidencia(String flagevidencia) {
		this.flagevidencia = flagevidencia;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public int getIdsubcatipireceita() {
		return idsubcatipireceita;
	}

	public void setIdsubcatipireceita(int idsubcatipireceita) {
		this.idsubcatipireceita = idsubcatipireceita;
	}

	public int getIdlistaservicoreceita() {
		return idlistaservicoreceita;
	}

	public void setIdlistaservicoreceita(int idlistaservicoreceita) {
		this.idlistaservicoreceita = idlistaservicoreceita;
	}

	public String getFlagcomponente() {
		return flagcomponente;
	}

	public void setFlagcomponente(String flagcomponente) {
		this.flagcomponente = flagcomponente;
	}

	public String getFlagiss() {
		return flagiss;
	}

	public void setFlagiss(String flagiss) {
		this.flagiss = flagiss;
	}

	public int getIdsubprodutoexterno() {
		return idsubprodutoexterno;
	}

	public void setIdsubprodutoexterno(int idsubprodutoexterno) {
		this.idsubprodutoexterno = idsubprodutoexterno;
	}

	public int getIdcenariofiscal() {
		return idcenariofiscal;
	}

	public void setIdcenariofiscal(int idcenariofiscal) {
		this.idcenariofiscal = idcenariofiscal;
	}

	public Double getPercargatributaria() {
		return percargatributaria;
	}

	public void setPercargatributaria(Double percargatributaria) {
		this.percargatributaria = percargatributaria;
	}

	public Double getPeraliquotafederal() {
		return peraliquotafederal;
	}

	public void setPeraliquotafederal(Double peraliquotafederal) {
		this.peraliquotafederal = peraliquotafederal;
	}

	public Double getPeraliquotaestadual() {
		return peraliquotaestadual;
	}

	public void setPeraliquotaestadual(Double peraliquotaestadual) {
		this.peraliquotaestadual = peraliquotaestadual;
	}

	public Double getPeraliquotamunicipal() {
		return peraliquotamunicipal;
	}

	public void setPeraliquotamunicipal(Double peraliquotamunicipal) {
		this.peraliquotamunicipal = peraliquotamunicipal;
	}

	public String getCodigoibpt() {
		return codigoibpt;
	}

	public void setCodigoibpt(String codigoibpt) {
		this.codigoibpt = codigoibpt;
	}

	public int getIdcstpiscofins() {
		return idcstpiscofins;
	}

	public void setIdcstpiscofins(int idcstpiscofins) {
		this.idcstpiscofins = idcstpiscofins;
	}

	public Double getValprecounidademedida() {
		return valprecounidademedida;
	}

	public void setValprecounidademedida(Double valprecounidademedida) {
		this.valprecounidademedida = valprecounidademedida;
	}

	public Double getValprecopromocaounidademedida() {
		return valprecopromocaounidademedida;
	}

	public void setValprecopromocaounidademedida(Double valprecopromocaounidademedida) {
		this.valprecopromocaounidademedida = valprecopromocaounidademedida;
	}

	public String getCodcest() {
		return codcest;
	}

	public void setCodcest(String codcest) {
		this.codcest = codcest;
	}

	public String getFlagsolicitapesagem() {
		return flagsolicitapesagem;
	}

	public void setFlagsolicitapesagem(String flagsolicitapesagem) {
		this.flagsolicitapesagem = flagsolicitapesagem;
	}

	public Double getPerfcep() {
		return perfcep;
	}

	public void setPerfcep(Double perfcep) {
		this.perfcep = perfcep;
	}

	public Double getPesobruto() {
		return pesobruto;
	}

	public void setPesobruto(Double pesobruto) {
		this.pesobruto = pesobruto;
	}

	public String getFlagproduzidoescalanaorelevante() {
		return flagproduzidoescalanaorelevante;
	}

	public void setFlagproduzidoescalanaorelevante(String flagproduzidoescalanaorelevante) {
		this.flagproduzidoescalanaorelevante = flagproduzidoescalanaorelevante;
	}

	public String getCnpjfabricante() {
		return cnpjfabricante;
	}

	public void setCnpjfabricante(String cnpjfabricante) {
		this.cnpjfabricante = cnpjfabricante;
	}

}
