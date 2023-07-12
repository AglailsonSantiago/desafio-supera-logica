import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();
            String linhaDecifrada = decifrarLinha(linha);
            System.out.println(linhaDecifrada);
        }
    }

    private static String decifrarLinha(String linha) {
        int meio = linha.length() / 2;
        String linhaDecifrada = "";

        for (int i = meio - 1; i >= 0; i--) {
            linhaDecifrada += linha.charAt(i);
        }

        for (int i = linha.length() - 1; i >= meio; i--) {
            linhaDecifrada += linha.charAt(i);
        }

        return linhaDecifrada;
    }
}