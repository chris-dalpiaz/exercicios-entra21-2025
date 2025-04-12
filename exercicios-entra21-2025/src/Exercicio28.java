import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //28
        System.out.println("Digite a quantidade de números a serem potencializados: ");
        int qtdeQuadrado = scanner.nextInt();
        int numero = 1;
        double potencia = 0;
        double total = 0;
        ArrayList<Integer> listaNumero = new ArrayList<>();

        while (numero <= qtdeQuadrado) {
            listaNumero.add(numero);
            potencia = Math.pow(numero, 2);
            total += potencia;
            numero++;
        }

        System.out.println(listaNumero + " ^ 2 = " + total);
    }
}
