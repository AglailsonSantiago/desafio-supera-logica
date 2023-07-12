import java.util.Arrays;
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int n = scanner.nextInt();

        System.out.print("Digite o valor alvo: ");
        int k = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithDifference(arr, k);
        System.out.println("O número de pares com diferença igual a " + k + " é: " + count);
    }

    private static int countPairsWithDifference(int[] arr, int k) {
        Arrays.sort(arr); // Ordena o array em ordem crescente

        int count = 0;
        int i = 0;
        int j = 1;

        while (j < arr.length) {
            int diff = arr[j] - arr[i];

            if (diff == k) {
                count++;
                i++;
                j++;
            } else if (diff < k) {
                j++;
            } else {
                i++;
            }

            // Para evitar contar pares repetidos
            if (i == j) {
                j++;
            }
        }

        return count;
    }
}