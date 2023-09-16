import java.util.Random;

public class questao2 {
    public static void main(String[] args) {
        int[] vetor = new int[50];
        
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            vetor[i] = random.nextInt(100);
        }

        bubbleSortOrder(vetor);
        
        System.out.println("\nVetor ordenado:");
        mostrarVetorOrdernado(vetor);
        pesquisaBinaria(vetor, 25);
    }

    public static void bubbleSortOrder(int[] vetor){
        int tamanho = vetor.length;
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void mostrarVetorOrdernado(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int pesquisaBinaria(int[] vetor, int valor){
        int esquerda = 0;
        int direita = vetor.length - 1;
        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            
            if (vetor[meio] == valor) {
                return meio;
            }
            
            if (vetor[meio] < valor) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }
        return -999;
    }
}