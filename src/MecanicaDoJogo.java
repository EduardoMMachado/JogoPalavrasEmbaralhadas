// Interface que padroniza o que os modos de jogo precisam ter.
public interface MecanicaDoJogo {
	public Boolean fimDeJogo();
	public Integer getAcertos();
	public Integer getErros();
	public Boolean confereResposta(String resposta);
	public String getPalavraEmbaralhada();
}
