import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio09 {
    public static void main(String[] args) {
        //9 - Imprima os N primeiros termos da sequência de Fibonacci (0 1 1 2 3 5 8 13 21 ...).
        Scanner scanner = new Scanner(System.in);
        int numeroInformado = scanner.nextInt();
        int soma;
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);
        for(int i = 1; i <= numeroInformado; i++){
            soma = fibonacci.get(i) + fibonacci.get(i-1);
            fibonacci.add(soma);
            System.out.println(soma);
        }
        System.out.println(fibonacci);
    }
}