import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio10 {
    public static void main(String[] args) {
        //10 - Leia um número N e faça uma contagem regressiva até 0.
        Scanner scanner = new Scanner(System.in);
        int contagem = scanner.nextInt();
        for (int i = contagem; i >= 0; i--){
            System.out.println(i);
        }
    }
}