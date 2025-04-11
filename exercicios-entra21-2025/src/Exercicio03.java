//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio03 {
    public static void main(String[] args) {
        //3 - Peça um número e exiba a tabuada de 1 a 10 usando for.
        int numero = 5, total;
        for (int i = 0; i <= 10; i++) {
            total = numero * i;
            System.out.println(numero + " * " + i + " = " + total);
        }
    }
}