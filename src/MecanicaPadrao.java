
public class MecanicaPadrao implements MecanicaDoJogo{
	// Atributos de controle do jogo.
	private Integer numeroPalavras;
	private Integer erros;
	private Integer acertos;
	private Integer dificuldade;
	private String palavra;
	// Atributo para guardar o banco de palavras.
	private BancoDePalavras banco;
	
	MecanicaPadrao(Integer dificuldade, String nomeArquivoDados){
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
		if(numeroPalavras >= 10){
			return(true);
		} else {
			return(false);
		}
	}
	
	// Retorna o n�mero de acertos at� o momento.
	public Integer getAcertos(){
		return(this.acertos);
	}
	
	// Retorna o n�mero de erros at� o momento.
	public Integer getErros(){
		return(this.erros);
	}
	
	// Confere a resposta a atualiza as vari�veis de controle.
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
	
	// Pega uma nova palavra, guarda a vers�o n�o embaralhada dela e retorna
	// a vers�o embaralhada.
	public String getPalavraEmbaralhada(){
		Embaralhador e = FabricaEmbaralhadores.embaralhadorAleatorio(this.dificuldade);
		this.palavra = banco.palavraAleatoria();
		
		return(e.embaralha(this.palavra));
	}
}
