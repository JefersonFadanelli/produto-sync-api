package classes;

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
			String usuario = "usuario";
			String senha = "senha";
			String ip = "172.16.168.72";
			String porta = "35000";
			String nomeBanco = "NFCETP";
			
			Class.forName("com.ibm.db2.jcc.DB2Driver");
			
			conexao = DriverManager.getConnection( "jdbc:db2://" + ip + ":" + porta + "/" + nomeBanco, usuario, senha);

		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	public List<Produto> getProdutos() {
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		Produto produto = new Produto();

		produtos.add( produto );
		
		return produtos;
	}
	
	public void Desconectar(){
		try {
			conexao.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
