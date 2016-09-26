// Aloca e retorna a mec�nica de jogo desejada.
public final class FabricaMecanicaDoJogo {
	public static MecanicaDoJogo getMecanica(Integer mecanica, Integer dificuldade, String nomeArquivoDados){
		MecanicaDoJogo m;
		
		switch(mecanica){
			case 1:
				m = new MecanicaPadrao(dificuldade, nomeArquivoDados);
				return(m);
			case 2:
				m = new MecanicaMaxErros(dificuldade, nomeArquivoDados);
				return(m);
			default:
				System.err.printf("Mecanica n�o encontrada | FabricaMecanicaDoJogo.");
				return(null);
		}
	}
}
