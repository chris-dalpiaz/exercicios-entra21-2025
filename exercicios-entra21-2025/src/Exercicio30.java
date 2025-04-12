import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //30
        String numero = scanner.nextLine();
        char digito;
        ArrayList<Character> digitos = new ArrayList<>();

        for (int i = 0; i < numero.length(); i++) {
            digito = numero.charAt(i);
            digitos.add(digito);
        }

        System.out.println("O número " + numero + " possui " + digitos.size() + " dígitos");
    }
}
