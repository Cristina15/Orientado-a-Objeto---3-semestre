
import java.util.Scanner;


/**
 *
 * @author Vitória Cristina
 */
public class Principal {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LerArquivo lerArquivo = new LerArquivo();
        ArquivoSaida saida = new ArquivoSaida();
        
        lerArquivo.LerArquivo1();
        lerArquivo.LerArquivo2();
        saida.ArquivoSaida(lerArquivo.saida);
        
        System.out.println("BYE, quero 1 ponto");
        
        
        
        
    }
    
}
