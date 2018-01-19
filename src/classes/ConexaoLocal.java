package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ConexaoLocal {

	Connection conexao;
	
	public ConexaoLocal(){
		System.out.println("Inicio Conexao com Postgres");
		
		try {
			String usuario = "dba";
			String senha = "mobile";
			String ip = "127.0.0.1";
			String porta = "5432";
			String nomeBanco = "produto";
			
			Class.forName("org.postgresql.Driver");
			
			conexao = DriverManager.getConnection( "jdbc:postgresql://" + ip + ":" + porta + "/" + nomeBanco, usuario, senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

	public void salvar(List<Produto> produtos) {
		
		System.out.println("Inserindo produtos...");

		try {
			
			String insert = "INSERT INTO produto ( idproduto, idsubproduto, descricao, idcodbarprod, valmultivendas, dtalteracao, Flaginativo, Idgrupo, Idsecao, Idsubgrupo, Iddivisao, Flagpesavel, Valgramasaida, Flagvasilhame, Embalagemsaida, Tiposituacaotributaria, Aliquota, Valpreco, Tipobaixamestre, Diasvalidade, Idinformacaonutricional, Flagcestabasica, Flagprodutoacabado, Flaginativovenda, Ncm, Flagcomponente, Idsubcatipireceita, Idlistaservicoreceita, Idsituacaotributaria, Aliquotaerp, Perreducaoaliquota, Tipopiscofins, Perpis, Percofins, Valprecopromocao, Dtinipromocao, Dtfimpromocao, Qtdminimapromocao, Idprodutovasilhame, Idsubprodutovasilhame, Flagevidencia, Flagiss, Idsubprodutoexterno, Idcenariofiscal, Percargatributaria, Valprecounidademedida, Valprecopromocaounidademedida, Codcest, Idcstpiscofins, Flagsolicitapesagem, Perfcep, Pesobruto, Peraliquotafederal, Peraliquotaestadual, Peraliquotamunicipal, Codigoibpt, Flagproduzidoescalanaorelevante, Cnpjfabricante  ) ";
			insert += " VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) ";

			PreparedStatement ps = conexao.prepareStatement( insert );
			
			for( Produto p : produtos){
				
				ps.setLong( 1, p.getIdproduto() );
				ps.setLong( 2, p.getIdsubproduto( ) );
				ps.setString( 3, p.getDescricao( ) );
				ps.setLong( 4, p.getIdcodbarprod( ) );
				ps.setDouble( 5, p.getValmultivendas(  ) );
				ps.setDate( 6, p.getDtalteracao( ) );
				ps.setString( 7, p.getFlaginativo( ) );
				ps.setInt( 8, p.getIdgrupo( ) );
				ps.setInt( 9, p.getIdsecao( ) );
				ps.setInt( 10, p.getIdsubgrupo( ) );
				ps.setInt( 11, p.getIddivisao( ) );
				ps.setString( 12, p.getFlagpesavel( ) );
				ps.setDouble( 13, p.getValgramasaida( ) );
				ps.setString( 14, p.getFlagvasilhame( ) );
				ps.setString( 15, p.getEmbalagemsaida( ) );
				ps.setString( 16, p.getTiposituacaotributaria( ) );
				ps.setDouble( 17, p.getAliquota( ) );
				ps.setDouble( 18, p.getValpreco( ) );
				ps.setString( 19, p.getTipobaixamestre( ) );
				ps.setInt( 20, p.getDiasvalidade( ) );
				ps.setInt( 21, p.getIdinformacaonutricional( ) );
				ps.setString( 22, p.getFlagcestabasica( ) );
				ps.setString( 23, p.getFlagprodutoacabado( ) );
				ps.setString( 24, p.getFlaginativovenda( ) );
				ps.setString( 25, p.getNcm( ) );
				ps.setString( 26, p.getFlagcomponente( ) );
				ps.setInt( 27, p.getIdsubcatipireceita( ) );
				ps.setInt( 28, p.getIdlistaservicoreceita( ) );
				ps.setInt( 29, p.getIdsituacaotributaria( ) );
				ps.setDouble( 30, p.getAliquotaerp( ) );
				ps.setDouble( 31, p.getPerreducaoaliquota( ) );
				ps.setString( 32, p.getTipopiscofins( ) );
				ps.setDouble( 33, p.getPerpis( ) );
				ps.setDouble( 34, p.getPercofins( ) );
				ps.setDouble( 35, p.getValprecopromocao( ) );
				ps.setDate( 36, p.getDtinipromocao( ) );
				ps.setDate( 37, p.getDtfimpromocao( ) );
				ps.setDouble( 38, p.getQtdminimapromocao( ) );
				ps.setInt( 39, p.getIdprodutovasilhame( ) );
				ps.setInt( 40, p.getIdsubprodutovasilhame( ) );
				ps.setString( 41, p.getFlagevidencia( ) );
				ps.setString( 42, p.getFlagiss( ) );
				ps.setLong( 43, p.getIdsubprodutoexterno( ) );
				ps.setInt( 44, p.getIdcenariofiscal( ) );
				ps.setDouble( 45, p.getPercargatributaria(  ) );
				ps.setDouble( 46, p.getValprecounidademedida( ) );
				ps.setDouble( 47, p.getValprecopromocaounidademedida( ) );
				ps.setString( 48, p.getCodcest( ) );
				ps.setInt( 49, p.getIdcstpiscofins( ) );
				ps.setString( 50, p.getFlagsolicitapesagem( ) );
				ps.setDouble( 51, p.getPerfcep( ) );
				ps.setDouble( 52, p.getPesobruto( ) );
				ps.setDouble( 53, p.getPeraliquotafederal( ) );
				ps.setDouble( 54, p.getPeraliquotaestadual( ) );
				ps.setDouble( 55, p.getPeraliquotamunicipal( ) );
				ps.setString( 56, p.getCodigoibpt( ) );
				ps.setString( 57, p.getFlagproduzidoescalanaorelevante( ) );
				ps.setString( 58, p.getCnpjfabricante( ) );
				
				ps.addBatch();
			}
			
			ps.executeBatch();
			ps.close();

			System.out.println("Produtos inseridos");			
						
			this.AtualizarDadosNosCaixas();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
	}

	private void AtualizarDadosNosCaixas() {

	}
	
	public void Desconectar(){
		try {
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
