import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio08 {
    public static void main(String[] args) {
        //8 - Leia um número e verifique se ele é primo
        Scanner scanner = new Scanner(System.in);
        double numeroInformado = scanner.nextInt();
        boolean numeroDivisivel = false;
        for (int i = 2; i < numeroInformado; i++) {
            if (numeroInformado % i == 0) {
                numeroDivisivel = true;
            }
        }
        if (numeroDivisivel) {
            System.out.println(numeroInformado + " não é primo");
        } else {
            System.out.println(numeroInformado + " é primo");
        }
    }
}