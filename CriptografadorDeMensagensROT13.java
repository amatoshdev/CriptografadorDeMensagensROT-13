import java.util.Scanner;

public class CriptografadorDeMensagensROT13 {

    // Método para aplicar ROT-13 (tanto para criptografar quanto para descriptografar)
    public static String rot13 (String texto) {

        StringBuilder resultado = new StringBuilder();

        for (char c : texto.toCharArray()) {

            if (c >= 'a' && c <= 'z') {

                resultado.append((char) ((c - 'a' + 13) % 26 + 'a'));

            } else if (c >= 'A' && c <= 'Z') {

                resultado.append((char) ((c - 'A' + 13) % 26 + 'A'));

            } else {

                resultado.append(c);  // Mantém outros caracteres inalterado.
            }
        }

        return resultado.toString();
    }

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("\nBem vindo ao gerador de senhas ROT-13!");

        do {

            System.out.println("\n1. Criptografar");
            System.out.println("2. Descriptografar");
            System.out.println("3. Sair\n");

            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            if (opcao == 1 || opcao == 2) {

                System.out.print("\nDigite a palavra: ");
                String palavra = scanner.nextLine();
                String resultado = rot13(palavra);
                System.out.println("\nResultado: " + resultado);
                System.out.println("______________________________");

            } else if (opcao == 3) {

                System.out.println("\nSaindo...");

            } else {

                System.out.println("\nOpção inválida. Digite novamente.");
                System.out.println("______________________________");
            }

        } while (opcao != 3);
    }
}