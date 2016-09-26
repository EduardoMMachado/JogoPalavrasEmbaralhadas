import java.util.Random;

public final class FabricaEmbaralhadores {	
	// Retorna um embaralhador entre os 3 existentes.
	public static Embaralhador embaralhadorAleatorio(Integer dificuldade){
		// Gerador randomico.
		Random gerador = new Random();
		// Embaralhador genérico.
		Embaralhador e;
		Integer nEmbaralhador = gerador.nextInt(dificuldade);
		
		switch(nEmbaralhador){
			case 0:
				e = new EmbaralhadorPorCorte();
				return(e);
			case 1:
				e = new EmbaralhadorPorInversao();
				return(e);
			case 2:
				e = new EmbaralhadorTotal();
				return(e);
			default:
				System.err.printf("Erro no gerador randomico | FabricaEmbaralhadores.");
				return(null);
		}
	}
}
