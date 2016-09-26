import java.io.*;
import java.util.*;

// Esta classe é usada para armazenar as palavras e retornar aleatóriamente uma
// atravez do método palavraAleatoria().
public class BancoDePalavras {
	// Lista de palavras do banco de palavras.
	private ArrayList<String> palavras;
	
	// Atributos para a leitura do arquivo de palavras.
	private FileReader arquivo;
	private BufferedReader leituraArquivo;
	
	// Gerador randomico.
	private Random gerador;
	
	// Construtor do objeto que recebe como parâmetro o nome do arquivo onde
	// estão as palavras.
	BancoDePalavras(String nomeArquivo){
		palavras = new ArrayList<String>();
		String palavra;
		
		gerador = new Random();
		
		try{
			this.arquivo = new FileReader(nomeArquivo);
			this.leituraArquivo = new BufferedReader(arquivo);
			
			palavra = leituraArquivo.readLine();
			while(palavra != null){
				palavras.add(palavra);
				palavra = leituraArquivo.readLine();
			}
		} catch(IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
		}
	}
	
	// Retorna uma palavra aleatória contida no banco de palavras.
	public String palavraAleatoria(){
		return(palavras.get(gerador.nextInt(palavras.size())));
	}
}
