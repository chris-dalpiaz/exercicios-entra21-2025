import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 - Imprima os números de 1 a 10 usando um for.
        int limite = 10;
        for (int numeros = 1; numeros <= limite; numeros++){
            System.out.println(numeros);
        }
    }
}