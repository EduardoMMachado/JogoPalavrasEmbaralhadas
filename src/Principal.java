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
		System.out.println("Modos de jogo:\n1.Modo Padr�o\n2.Modo Max Erros");
	    modoDeJogo = scan.nextInt();
	    
	    // Limpa o console.
	    for(int i = 0; i < 100; i++) System.out.println("");
	    
	    // Explica para o jogador o modo de jogo que ele escolheu.
	    if(modoDeJogo == 1){
	    	System.out.println("Nesse modo de jogo voc� ira responder 10 palavras,\nindependente do quanto acertar ou errar.");
	    } else if (modoDeJogo == 2){
	    	System.out.println("Nesse modo de jogo voc� ira responder palavras at� que\nvoc� erre 5 (F�cil), 3 (Moderado) ou 1(Dif�cil).");
	    }
	    
	    // Seta a dificuldade.
	    System.out.println("Escolha uma dificuldade:\n1.F�cil\n2.Moderado\n3.Dif�cil");
	    dificuldade = scan.nextInt();
	    
	    // Inicializa a mec�nica de jogo.
	    MecanicaDoJogo m = FabricaMecanicaDoJogo.getMecanica(modoDeJogo, dificuldade, nomeArquivoDados);
	    
	    // La�o de execu��o do jogo.
	    while(!m.fimDeJogo()){
	    	// Limpa o console.
	    	for(int i = 0; i < 100; i++) System.out.println("");
			System.out.println("Acertos: " + m.getAcertos() + "\tErros: " + m.getErros());
			System.out.println("Desembaralhe a palavra:");
			System.out.println(m.getPalavraEmbaralhada());
			
			// L� a resposta do jogador
			resposta = scan.next();
			
			// Confere se a resposta est� certa.
			m.confereResposta(resposta);
	    }
	    
	    // Limpa o console.
	    for(int i = 0; i < 100; i++) System.out.println("");
	    
	    // Finaliza o jogo.
	    System.out.println("Fim do Jogo!");
	    System.out.println("Voc� acertou " + m.getAcertos() + " e errou " + m.getErros() + " palavras.");
	}
}
