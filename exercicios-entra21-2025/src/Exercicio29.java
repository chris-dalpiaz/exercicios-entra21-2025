import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //29
        String palavra = scanner.nextLine();
        String palavraInvertida = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida += "" + palavra.charAt(i);
        }

        System.out.println("Palavra informada: " + palavra);
        System.out.println("Palavra invertida: " + palavraInvertida);

        if (palavra.equals(palavraInvertida)) {
            System.out.println("A palavra " + palavra + " é palíndroma");
        } else {
            System.out.println("Essa palavra " + palavra + "não é palíndroma");
        }
    }
}
