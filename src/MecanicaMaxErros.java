
public class MecanicaMaxErros implements MecanicaDoJogo{
	// Atributos de controle do jogo.
	private Integer numeroPalavras;
	private Integer erros;
	private Integer acertos;
	private Integer dificuldade;
	private String palavra;
	// Atributo para guardar o banco de palavras.
	private BancoDePalavras banco;
	
	MecanicaMaxErros(Integer dificuldade, String nomeArquivoDados){
		// Inicializa atributos de controle.
		this.dificuldade = dificuldade;
		this.numeroPalavras = 0;
		this.erros = 0;
		this.acertos = 0;
		this.palavra = "";
		
		// Inicializa o banco de palavras.
		this.banco = new BancoDePalavras(nomeArquivoDados);
	}
	
	// Diz se o jogo acabou.
	public Boolean fimDeJogo(){
		if(dificuldade == 1){
			if(this.getErros() > 5){
				return(true);
			} else {
				return(false);
			}
		} else if (dificuldade == 2){
			if(this.getErros() > 3){
				return(true);
			} else {
				return(false);
			}
		} else if (dificuldade == 3){
			if(this.getErros() > 1){
				return(true);
			} else {
				return(false);
			}
		} else {
			System.err.printf("Erro ao inicializar a dificuldade do jogo | MecanicaMaxErros.");
			return(null);
		}
	}
	
	// Retorna o número de acertos até o momento.
	public Integer getAcertos(){
		return(this.acertos);
	}
	
	// Retorna o número de erros até o momento.
	public Integer getErros(){
		return(this.erros);
	}
	
	// Confere a resposta a atualiza as variáveis de controle.
	public Boolean confereResposta(String resposta){
		this.numeroPalavras++;
		
		if(this.palavra.equals(resposta)){
			this.acertos++;
			return(true);
		} else {
			this.erros++;
			return(false);
		}
	}
	
	// Pega uma nova palavra, guarda a versão não embaralhada dela e retorna
	// a versão embaralhada.
	public String getPalavraEmbaralhada(){
		Embaralhador e = FabricaEmbaralhadores.embaralhadorAleatorio(this.dificuldade);
		palavra = banco.palavraAleatoria();
		
		return(e.embaralha(palavra));
	}
}
