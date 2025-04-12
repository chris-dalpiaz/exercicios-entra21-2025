import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //35
        ArrayList<Integer> numero1 = new ArrayList<>();
        numero1.add(1);
        numero1.add(2);
        numero1.add(3);
        numero1.add(4);
        numero1.add(5);
        numero1.add(6);
        numero1.add(7);
        numero1.add(8);
        numero1.add(9);
        numero1.add(10);

        ArrayList<Integer> numero2 = new ArrayList<>();
        numero2.add(1);
        numero2.add(2);
        numero2.add(3);
        numero2.add(4);
        numero2.add(5);
        numero2.add(6);
        numero2.add(7);
        numero2.add(8);
        numero2.add(9);
        numero2.add(10);

        ArrayList<Integer> multiplicacao = new ArrayList<>();
        int multiplicar = 0;

        for (int i = 0; i < numero1.size(); i++){
            multiplicar = numero1.get(i) * numero2.get(i);
            multiplicacao.add(multiplicar);
        }

        System.out.println("Primeira lista: " + numero1);
        System.out.println("Segunda lista:  " + numero2);
        System.out.println("Multiplicação:  " + multiplicacao);
    }
}
