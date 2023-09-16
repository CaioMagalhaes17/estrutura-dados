import java.util.Random;

public class questao1 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            vetor[i] = random.nextInt(100);
        }
        
        System.out.println("Vetor gerado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
        
        int elementoBuscado = 19;
        int posicaoEncontrada = -999;
        
        for (int i = 0; i < 10; i++) {
            if (vetor[i] == elementoBuscado) {
                posicaoEncontrada = i;
                break;
            }
        }
        
        if (posicaoEncontrada != -999) {
            System.out.println("Elemento encontrado na posição: " + posicaoEncontrada);
        } else {
            System.out.println("Elemento não encontrado no vetor.");
        }
    }
}