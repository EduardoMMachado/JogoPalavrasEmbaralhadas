import static org.junit.Assert.*;

import org.junit.Test;

public class TesteEmbaralhador {

	@Test
	public void testeEmbaralhaPorCorte() {
		Embaralhador e = new EmbaralhadorPorCorte();
		String palavra = "casa";
		String resposta = "saca";
		
		assertTrue(resposta.equals(e.embaralha(palavra)));
	}
	
	@Test
	public void testeEmbaralhaPorInversao() {
		Embaralhador e = new EmbaralhadorPorInversao();
		String palavra = "casa";
		String resposta = "asac";
		
		assertTrue(resposta.equals(e.embaralha(palavra)));
	}
	
	@Test
	public void testeEmbaralhaTotal() {
		Embaralhador e = new EmbaralhadorTotal();
		String palavra = "casa";
		String resposta = "casa";
		
		assertFalse(resposta.equals(e.embaralha(palavra)));
	}
}
