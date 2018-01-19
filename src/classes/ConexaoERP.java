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
	
	public List<Cliente> getProdutos() {
		
		List<Cliente> produtos = new ArrayList<Cliente>();
		Cliente produto;
		PreparedStatement ps;
		
		System.out.println("Buscando clientes no ERP ...");
		
		try {

			ps = conexao.prepareStatement( getSQLProduto() );
			ResultSet rs = ps.executeQuery();
			
			while( rs.next() ) {
				produto = new Cliente();
				
				produto.setIdcliente( rs.getLong( "idclifor" ) );
				produto.setIdconvenio( rs.getLong("idconvenio"));
				produto.setEmail( rs.getString( "email" ) );
				produto.setIdpagamento( rs.getLong( "idpagamento" ) );
				produto.setIdpromocao( rs.getLong( "idpromocao" ) );
				produto.setUfclifor( rs.getString( "ufclifor" ) );
				produto.setNome( rs.getString( "nome" ) );
				produto.setCnpjcpf( rs.getString( "cnpjcpf" ) );
				produto.setEndereco( rs.getString( "endereco" ) );
				produto.setBairro( rs.getString( "bairro" ) );
				produto.setPerdesconto( rs.getDouble( "perdesconto" ) );
				produto.setDtcadastro( rs.getDate( "dtcadastro" ) );
				produto.setFonefax( rs.getString( "fonefax" ) );
				produto.setFone1( rs.getString( "fone1" ) );
				produto.setFone2( rs.getString( "fone2" ) );
				produto.setFonecelular( rs.getString( "fonecelular" ) );
				produto.setInscrestadual( rs.getString( "inscrestadual" ) );
				produto.setObsgeral( rs.getString( "obsgeral" ) );
				produto.setNomefantasia( rs.getString( "nomefantasia" ) );
				produto.setEmail( rs.getString( "email" ) );
				produto.setFlaginativo( rs.getString( "flaginativo" ) );
				produto.setUrl( rs.getString( "url" ) );
				produto.setDtalteracao( rs.getDate( "dtalteracao" ) );
				produto.setFlagclientevip( rs.getString( "flagclientevip" ) );
				produto.setDescrcidade( rs.getString( "descrcidade" ) );
				produto.setCep( rs.getInt( "IdCep" ) + "" );
				produto.setNumcartaomag( rs.getString( "numcartaomag" ) );
				produto.setVallimitecredito( rs.getDouble( "vallimitecredito" ) );
				produto.setVallimiteconvenio( rs.getDouble( "vallimiteconvenio" ) );
				produto.setVallimitecheque( rs.getDouble( "vallimiteseguracachq" ) );
				produto.setDtvalidadecartao( rs.getDate( "dtvalidadecartao" ) );
				produto.setSenhaconvenio( rs.getInt( "senhaconvenio" ) );
				produto.setDtultimaalteracao( rs.getDate( "dtultimaalteracao" ) );
				produto.setTipofisicajuridica( rs.getString( "tipofisicajuridica" ) );
				produto.setFlagnaoconschqserasa( rs.getString( "flagnaoconschqserasa" ) );
				produto.setTipotestecliente( rs.getString( "tipotestecliente" ) );
				produto.setNumeroresidencial( rs.getString( "numero" ) );
				produto.setIdcidade( rs.getInt( "idcidade" ) );
				produto.setFlagnaoconsultacheques( rs.getString( "flagnaoconsultacheques" ) );
				produto.setFlagrestringeformaspagto( rs.getString( "flagusaformascomsenha" ) );
				produto.setPerminimoentrada( rs.getDouble( "perminimoentrada" ) );
				produto.setIdvencimentocartaoproprio( rs.getInt( "idvctocartao" ) );
				produto.setFlagutilizapontuacao( rs.getString( "flagpontua" ) );
				produto.setCodigoibge( rs.getInt( "codigoibge" ) );
				produto.setDescrestado( rs.getString( "descrestado" ) );
				produto.setTipocadastro( rs.getString( "tipocadastro" ) );
				produto.setFlagnaoenviadadoscliforxml( rs.getString( "flagnaoenviadadoscliforxml" ) );
				produto.setDtinicialpromocao( rs.getDate( "dtinicialpromocao" ) );
				produto.setDtfinalpromocao( rs.getDate( "dtfinalpromocao" ) );
				produto.setProgpontuacao( rs.getString( "progpontuacao" ) );

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
		
		sql = this.readFile( "c:\\sql\\sqlCliente.txt" );
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
