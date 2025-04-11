import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio02 {
    public static void main(String[] args) {
        //2 - Leia um número N e calcule a soma de 1 até N usando um for.
        int limite = 10;
        int soma = 0;
        for (int i = 0; i <= limite; i++){
            soma += i;
        }
        System.out.println(soma);
    }
}