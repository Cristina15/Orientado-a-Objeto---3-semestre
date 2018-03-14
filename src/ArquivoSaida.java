
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Vitoria Cristina
 */
public class ArquivoSaida {

    public void ArquivoSaida(List saida) {
        String arquivoDeSaida = "Arquivos/saida.txt";

        try {

            FileWriter fileWriter = new FileWriter(arquivoDeSaida);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(String.valueOf(saida));
            bufferedWriter.newLine();

           
            bufferedWriter.close();
        } catch (IOException ex) {
            System.out.println("Erro em: '" + arquivoDeSaida + "'");
        }

    }

}
