// Um embaralhador que usa o método da inversão.
public class EmbaralhadorPorInversao implements Embaralhador{
	private StringBuffer aux;
	
	// O método embaralha() retorna a palavra de entrada invertida.
	public String embaralha(String palavra){
		aux = new StringBuffer(palavra);
		
		return(aux.reverse().toString());
	}
}
