import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 27
        ArrayList<Integer> listaFibonacci = new ArrayList<>();
        System.out.println("Digite o limite do valor Fibonacci:");
        int limiteFibonacci = scanner.nextInt();
        int f = 1;
        int numero = 2;
        listaFibonacci.add(0);

        while (f < limiteFibonacci) {
            listaFibonacci.add(f);
            f = listaFibonacci.get(numero - 1) + listaFibonacci.get(numero - 2);
            numero++;
        }
        System.out.println(listaFibonacci);
    }
}
