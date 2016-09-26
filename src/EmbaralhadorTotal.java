import java.util.*;

public class EmbaralhadorTotal implements Embaralhador {

	// Nesse m�todo embaralha a inten��o � tentar embaralhar as palavras de
	// forma mais aleat�ria pess�vel.
	public String embaralha(String palavra){
		List<String> letras = Arrays.asList(palavra.split(""));
	    Collections.shuffle(letras);
	    StringBuilder aux = new StringBuilder(palavra.length());
	    
	    for (String k : letras) {
	        aux.append(k);
	    }
	    
	    return (aux.toString());
	}
}
