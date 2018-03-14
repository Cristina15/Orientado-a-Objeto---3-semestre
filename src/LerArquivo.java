
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vitoria Cristina
 */
public class LerArquivo {

    String arquivo1 = "Arquivos/pib.txt";
    String arquivo2 = "Arquivos/regioes.txt";

    List saida = new ArrayList();
    String linha = null;
    String valor = "";
    String nome = "";
    double total = 0;
    double[] estado = new double[27];
    String[] nomeestado = new String[27];

    public List LerArquivo1() {
        try {
            FileReader fileReader1 = new FileReader(arquivo1);

            BufferedReader bufferedReader = new BufferedReader(fileReader1);

            // Aqui está fazendo um está cada linha do arquivo
            while ((linha = bufferedReader.readLine()) != null) {
                saida.add(linha);
                if (linha.contains(";")) {
                    for (int i = 1; i < linha.length(); i++) {
                        if (String.valueOf(linha.charAt(i)).equals(";")) {
                            int j = 0;
                            int separador = 2;
                            separador++;

                            for (j = i + 1; j < linha.length(); j++) {
                                valor = valor + String.valueOf(linha.charAt(j));
                                estado[i] = Double.valueOf(valor);

                            }
                            for (int k = 0; k < linha.length() - separador; k++) {
                                nome = nome + String.valueOf(linha.charAt(k));

                            }
                            
                            System.out.println("nome: " + nome);

                            total = total + Double.parseDouble(valor);
                            System.out.printf("Percentual: %.2f %n", estado[i] / total);

                        }

                    }
                    valor = "";
                    nome = "";

                }

            }
            System.out.printf("O total é: %.2f", total);

            // feche o arquivo
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Não existe este arquivo: '" + arquivo1 + "'");
        } catch (IOException ex) {
            System.out.println("Erro no arquivo '" + arquivo1 + "'");
        }
        return saida;
    }

    public void LerArquivo2() {

        List sudeste = new ArrayList();
        List sul = new ArrayList();
        List norte = new ArrayList();
        List nordeste = new ArrayList();
        List centroeste = new ArrayList();

        try {
            FileReader fileReader2 = new FileReader(arquivo2);

            BufferedReader bufferedReader = new BufferedReader(fileReader2);

            // Aqui está lendo o arquivo 2 que é o nome das regiões que contém os Estados
            while ((linha = bufferedReader.readLine()) != null) {

                if (linha.contains("Sudeste")) {
                    for (int i = 0; i < 4; i++) {
                        sudeste.add(bufferedReader.readLine());

                    }
                    System.out.println(sudeste);

                } else if (linha.contains("Centro-Oeste")) {
                    for (int i = 0; i < 4; i++) {
                        centroeste.add(bufferedReader.readLine());

                    }
                    System.out.println(centroeste);

                } else if (linha.contains("Sul")) {
                    for (int i = 0; i < 3; i++) {
                        sul.add(bufferedReader.readLine());

                    }
                    System.out.println(sul);

                } else if (linha.contains("Nordeste")) {
                    for (int i = 0; i < 9; i++) {
                        nordeste.add(bufferedReader.readLine());

                    }
                    System.out.println(nordeste);

                } else if (linha.contains("Norte")) {
                    for (int i = 0; i < 7; i++) {
                        norte.add(bufferedReader.readLine());

                    }
                    System.out.println(norte);

                }
            }

           
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Não existe este arquivo: '" + arquivo2 + "'");
        } catch (IOException ex) {
            System.out.println("Ero no arquivo: '" + arquivo2 + "'");
        }
    }
}
