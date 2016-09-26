// Um embaralhador que usa o m�todo da invers�o.
public class EmbaralhadorPorInversao implements Embaralhador{
	private StringBuffer aux;
	
	// O m�todo embaralha() retorna a palavra de entrada invertida.
	public String embaralha(String palavra){
		aux = new StringBuffer(palavra);
		
		return(aux.reverse().toString());
	}
}
