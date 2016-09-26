import java.util.*;

public class EmbaralhadorTotal implements Embaralhador {

	// Nesse método embaralha a intenção é tentar embaralhar as palavras de
	// forma mais aleatória pessível.
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
