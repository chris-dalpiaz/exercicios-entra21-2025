import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //26
        boolean ehPrimo = true;
        System.out.println("Digite a quantidade de n° primos:");
        int qtdePrimo = scanner.nextInt();
        ArrayList<Integer> listaPrimos = new ArrayList<>();

        for (int numero = 2; listaPrimos.size() < qtdePrimo; numero++) {
            for (int i = 2; i <= numero - 1; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                }
            }

            if (ehPrimo) {
                listaPrimos.add(numero);
            }

            ehPrimo = true;
        }

        System.out.println("Lista de n° primos: " + listaPrimos);
    }
}
