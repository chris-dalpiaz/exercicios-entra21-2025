import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //25
        int valorFixo = scanner.nextInt();
        int mult;

        ArrayList<Integer> listaMultiplicada = new ArrayList<>();
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(8);
        lista.add(10);
        lista.add(9);
        lista.add(7);

        for (int i = 0; i < lista.size(); i++) {
            mult = lista.get(i) * valorFixo;
            listaMultiplicada.add(mult);
        }

        System.out.println("Lista original: " + lista);
        System.out.println("Lista duplicada: " + listaMultiplicada);
    }
}
