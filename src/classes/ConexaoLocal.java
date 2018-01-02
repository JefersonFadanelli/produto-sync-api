package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class ConexaoLocal {

	Connection conexao;
	
	public ConexaoLocal(){
		System.out.println("Inicio Conexao com Postgres");
		
		try {
			String usuario = "postgres";
			String senha = "postgres";
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
	
		//PreparedStatement pstm = conexao.prepareStatement( this.getSintaxProduto() );
		 
//		ResultSet rs = pstm.executeQuery();

//		while (rs.next()) {
			//System.out.println("Nome Aluno: " + rs.getString("descricao"));
		//}
		
		//rs.close();
		//pstm.close();
		
		this.AtualizarDadosNosCaixas();
		
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
