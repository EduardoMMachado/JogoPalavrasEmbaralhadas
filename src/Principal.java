import java.util.*;

public class Principal {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		Integer modoDeJogo;
		Integer dificuldade;
		String resposta;
		
		// Nome do arquivo do banco de palavras.
		String nomeArquivoDados = "./data/banco_de_palavras.txt";
		
		// Seta o modo de jogo.
		System.out.println("Modos de jogo:\n1.Modo Padrão\n2.Modo Max Erros");
	    modoDeJogo = scan.nextInt();
	    
	    // Limpa o console.
	    for(int i = 0; i < 100; i++) System.out.println("");
	    
	    // Explica para o jogador o modo de jogo que ele escolheu.
	    if(modoDeJogo == 1){
	    	System.out.println("Nesse modo de jogo você ira responder 10 palavras,\nindependente do quanto acertar ou errar.");
	    } else if (modoDeJogo == 2){
	    	System.out.println("Nesse modo de jogo você ira responder palavras até que\nvocê erre 5 (Fácil), 3 (Moderado) ou 1(Difícil).");
	    }
	    
	    // Seta a dificuldade.
	    System.out.println("Escolha uma dificuldade:\n1.Fácil\n2.Moderado\n3.Difícil");
	    dificuldade = scan.nextInt();
	    
	    // Inicializa a mecânica de jogo.
	    MecanicaDoJogo m = FabricaMecanicaDoJogo.getMecanica(modoDeJogo, dificuldade, nomeArquivoDados);
	    
	    // Laço de execução do jogo.
	    while(!m.fimDeJogo()){
	    	// Limpa o console.
	    	for(int i = 0; i < 100; i++) System.out.println("");
			System.out.println("Acertos: " + m.getAcertos() + "\tErros: " + m.getErros());
			System.out.println("Desembaralhe a palavra:");
			System.out.println(m.getPalavraEmbaralhada());
			
			// Lê a resposta do jogador
			resposta = scan.next();
			
			// Confere se a resposta está certa.
			m.confereResposta(resposta);
	    }
	    
	    // Limpa o console.
	    for(int i = 0; i < 100; i++) System.out.println("");
	    
	    // Finaliza o jogo.
	    System.out.println("Fim do Jogo!");
	    System.out.println("Você acertou " + m.getAcertos() + " e errou " + m.getErros() + " palavras.");
	}
}
