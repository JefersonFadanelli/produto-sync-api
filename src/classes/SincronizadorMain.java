package classes;

import java.util.ArrayList;
import java.util.List;

public class SincronizadorMain {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		long inicio;
		List<Produto> produtos;
		ConexaoLocal conexaoLocal;
		ConexaoERP conexaoERP;
		
		conexaoERP = new ConexaoERP();
		conexaoLocal = new ConexaoLocal();
		
		int contador = 0;

		while( true ){
			
			produtos = new ArrayList<Produto>(); 
						
			inicio = System.currentTimeMillis();
			
			produtos = conexaoERP.getProdutos();
			
			if( produtos.size() > 0 ) {
				

				conexaoLocal.salvar( produtos );

				long atual = System.currentTimeMillis() - inicio;
				System.out.println("Atualização completada - Tempo: " + atual + "ms");
				
			}else{
				System.out.println("Nenhuma atualização");				
			}
			
			try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }


			//break;

			if(contador < 3){
				contador++;
			}else{
				break;
			}

		}
		
		conexaoLocal.Desconectar();
		conexaoERP.Desconectar();

	}

}
