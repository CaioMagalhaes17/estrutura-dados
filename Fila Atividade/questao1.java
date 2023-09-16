import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class questao1 {

    public static Stack<String> lerArquivoEConstruirPilha(String nomeArquivo) {
        Stack<String> pilha = new Stack<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                pilha.push(linha.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return pilha;
    }

    public static void mostrarTop10Frases(Stack<String> pilha) {
        System.out.println("Top 10 frases mais buscadas:");
        int count = 0;
        while (count < 10 && !pilha.isEmpty()) {
            System.out.println(pilha.pop());
            count++;
        }
    }

    public static void main(String[] args) {
        String nomeArquivo = "frases.txt";
        Stack<String> pilha = lerArquivoEConstruirPilha(nomeArquivo);
        mostrarTop10Frases(pilha);
    }
}