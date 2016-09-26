// Um embaralhador simples, visa deixar a descoberta da palavra original bem f�cil.
public class EmbaralhadorPorCorte implements Embaralhador{
	// Nesse m�todo embaralha() a palavra � apenas cortada ao meio e tem a
	// primeira metade trocada com a segunda.
	public String embaralha(String palavra){
		String aux1 = palavra.substring(0, (palavra.length()/2));
		String aux2 = palavra.substring((palavra.length()/2), palavra.length());
		
		return(aux2+aux1);
	}
}
