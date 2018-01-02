package classes;

import java.util.ArrayList;
import java.util.List;

public class SincronizadorMain {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		
		while( true ){
			long inicio = System.currentTimeMillis();

			List<Produto> produtos = new ArrayList<Produto>(); 
			ConexaoLocal conexaoLocal = new ConexaoLocal();
			ConexaoERP conexaoERP = new ConexaoERP();

			produtos = conexaoERP.getProdutos();
			
			if( produtos.size() > 0 ) {
				//ConexaoLocal conexaoLocal = new ConexaoLocal();

				conexaoLocal.salvar( produtos );

				long atual = System.currentTimeMillis() - inicio;
				System.out.println("Atualização completada - Tempo: " + atual + "ms");
			}else{
				System.out.println("Nenhuma atualização");				
			}

			conexaoLocal.Desconectar();
			conexaoERP.Desconectar();
			
			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }

		}

	}

}
