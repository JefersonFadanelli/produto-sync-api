package classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConexaoERP {
	
	Connection conexao;
	
	public ConexaoERP(){
		System.out.println("Inicio Conexao com DB2");
		
		try {
			String usuario = "dba";
			String senha = "a9d9p8.E10";
			//String ip = "172.16.106.163";
			//String porta = "35000";
			//String nomeBanco = "NFCETP";
			
			String ip = "192.168.7.72";
			String porta = "50000";
			String nomeBanco = "MARKET7";
			
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			
			conexao = DriverManager.getConnection( "jdbc:db2://" + ip + ":" + porta + "/" + nomeBanco, usuario, senha);

		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public List<Produto> getProdutos() {
		
		List<Produto> produtos = new ArrayList<Produto>();
		Produto produto;
		PreparedStatement ps;
		
		System.out.println("Buscando produtos no ERP ...");
		
		try {

			ps = conexao.prepareStatement( getSQLProduto() );
			ResultSet rs = ps.executeQuery();
			
			while( rs.next() ) {
				produto = new Produto();
				
				produto.setIdproduto( rs.getLong( "idproduto" ) );
				produto.setIdsubproduto( rs.getLong( "idsubproduto" ) );
				produto.setDescricao( rs.getString( "descrresproduto" ) );
				produto.setIdcodbarprod( rs.getLong( "idcodbarprod" ) );
				produto.setValmultivendas( rs.getDouble( "valmultivendas" ) );
				produto.setDtalteracao( rs.getDate( "dtalteracao" ) );
				produto.setFlaginativo( rs.getString( "flaginativo" ) );
				produto.setIdgrupo( rs.getInt( "idgrupo" ) );
				produto.setIdsecao( rs.getInt( "idsecao" ) );
				produto.setIdsubgrupo( rs.getInt( "idsubgrupo" ) );
				produto.setIddivisao( rs.getInt( "iddivisao" ) );
				produto.setFlagpesavel( rs.getString( "flagexpbalanca" ) );
				produto.setValgramasaida( rs.getDouble( "valgramasaida" ) );
				produto.setFlagvasilhame( rs.getString( "flagvasilhame" ) );
				produto.setEmbalagemsaida( rs.getString( "embalagemsaida" ) );
				produto.setTiposituacaotributaria( rs.getString( "tiposittribsai" ) );
				produto.setAliquota( rs.getDouble( "pericmecf" ) );
				produto.setValpreco( rs.getDouble( "valprecoproduto" ) );
				produto.setTipobaixamestre( rs.getString( "tipobaixamestre" ) );
				produto.setDiasvalidade( rs.getInt( "diasvalidade" ) );
				produto.setIdinformacaonutricional( rs.getInt( "idinformacaonutricional" ) );
				produto.setFlagcestabasica( rs.getString( "flagcestabasica" ) );
				produto.setFlagprodutoacabado( rs.getString( "flagprodutoacabado" ) );
				produto.setFlaginativovenda( rs.getString( "flagbloqueiavenda" ) );
				produto.setNcm( rs.getString( "ncm" ) );
				produto.setFlagcomponente( rs.getString( "flagcomponente" ) );
				produto.setIdsubcatipireceita( rs.getInt( "idsubcatipireceita" ) );
				produto.setIdlistaservicoreceita( rs.getInt( "idlistaservicoreceita" ) );
				produto.setIdsituacaotributaria( rs.getInt( "idsittribsai" ) );
				produto.setAliquotaerp( rs.getDouble( "pericmsai" ) );
				produto.setPerreducaoaliquota( rs.getDouble( "perredtribsai" ) );
				produto.setTipopiscofins( rs.getString( "tipopiscofins" ) );
				produto.setPerpis( rs.getDouble( "perpis" ) );
				produto.setPercofins( rs.getDouble( "percofins" ) );
				produto.setValprecopromocao( rs.getDouble( "valprecopromocao" ) );
				produto.setDtinipromocao( rs.getDate( "dtinipromocao" ) );
				produto.setDtfimpromocao( rs.getDate( "dtfimpromocao" ) );
				produto.setQtdminimapromocao( rs.getInt( "qtdminpromvarejo" ) );
				produto.setIdprodutovasilhame( rs.getInt( "idprodutovasilhame" ) );
				produto.setIdsubprodutovasilhame( rs.getInt( "idsubprodutovasilhame" ) );
				produto.setFlagevidencia( rs.getString( "flagevidencia" ) );
				produto.setFlagiss( rs.getString( "flagiss" ) );
				produto.setIdsubprodutoexterno( rs.getInt( "idsubprodutoexterno" ) );
				produto.setIdcenariofiscal( rs.getInt( "idcenariofiscal" ) );
				produto.setPercargatributaria( rs.getDouble( "percargatributaria" ) );
				produto.setValprecounidademedida( rs.getDouble( "valprecoproduto" ) );
				produto.setValprecopromocaounidademedida( rs.getDouble( "valprecopromocao" ) );
				produto.setCodcest( rs.getString( "codcest" ) );
				produto.setIdcstpiscofins( rs.getInt( "idcstpiscofins" ) );
				produto.setFlagsolicitapesagem( rs.getString( "flagsolicitapesagem" ) );
				produto.setPerfcep( rs.getDouble( "perfcep" ) );
				produto.setPesobruto( rs.getDouble( "pesobruto" ) );
				produto.setPeraliquotafederal( rs.getDouble( "peraliqfederal" ) );
				produto.setPeraliquotaestadual( rs.getDouble( "peraliqestadual" ) );
				produto.setPeraliquotamunicipal( rs.getDouble( "peraliqmunicipal" ) );
				produto.setCodigoibpt( rs.getString( "codigoibpt" ) );
				produto.setFlagproduzidoescalanaorelevante( rs.getString( "flagproduzidoescalanaorelevante" ) );
				produto.setCnpjfabricante( rs.getString( "cnpjfabricante" ) );

				produtos.add( produto );
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return produtos;
	}
	
	public void Desconectar(){
		try {
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private String getSQLProduto() {
		String sql;
		
		sql = this.readFile( "c:\\sql\\sqlProduto.txt" );
		//System.out.println(sql);

		return sql;
	}
	
	private String readFile(String file) {
	    BufferedReader reader = null;
		
	    try {
			reader = new BufferedReader(new FileReader (file));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	    
	    String         line = null;
	    StringBuilder  stringBuilder = new StringBuilder();
	    String         ls = System.getProperty("line.separator");

	    try {
	        
			while((line = reader.readLine()) != null) {
			    stringBuilder.append(line);
			    stringBuilder.append(ls);
			}
			
			reader.close();
	        
			return stringBuilder.toString();
	    } catch (IOException e) {
	    	
	    }
	    
	    return "Erro ao capturar SQL";
	}

}
