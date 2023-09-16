import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class questao2 {

    public static Queue<String> lerArquivoEConstruirFila(String nomeArquivo) {
        Queue<String> fila = new ArrayDeque<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                fila.offer(linha.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fila;
    }

    public static void exibirIngressosVIP(Queue<String> fila, int numIngressosVIP) {
        System.out.println("Ingressos VIP (10 primeiros):");
        int count = 0;
        while (count < numIngressosVIP && !fila.isEmpty()) {
            System.out.println(fila.poll());
            count++;
        }
    }

    public static void sortearPessoaSorteada(Queue<String> fila) {
        if (!fila.isEmpty()) {
            int filaSize = fila.size();
            Random random = new Random();
            int posicaoSorteada = random.nextInt(filaSize);

            System.out.println("\nPessoa Sorteada para conhecer a banda:");
            for (int i = 0; i < filaSize; i++) {
                String pessoa = fila.poll();
                if (i == posicaoSorteada) {
                    System.out.println(pessoa + " (Posição sorteada: " + (i + 1) + ")");
                }
            }
        } else {
            System.out.println("\nNão há mais ingressos para sortear.");
        }
    }

    public static void main(String[] args) {
        String nomeArquivo = "ingressos.txt";  // Nome do arquivo contendo os ingressos
        Queue<String> fila = lerArquivoEConstruirFila(nomeArquivo);

        int numIngressosVIP = 10;
        exibirIngressosVIP(fila, numIngressosVIP);
        sortearPessoaSorteada(fila);
    }
}
