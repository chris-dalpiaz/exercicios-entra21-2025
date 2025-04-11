import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //18 - Remova os números negativos de uma lista.
        int limite = 10;
        ArrayList<Integer> listaPositivos = new ArrayList<>();
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(-1);
        lista.add(-10);
        lista.add(-100);
        lista.add(-25);
        lista.add(0);
        lista.add(12);
        lista.add(112);
        lista.add(213);

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) >= 0) {
                //  System.out.println("Adicionando " + lista.get(i) + " na lista");
                listaPositivos.add(lista.get(i));
            } //else {
            //    System.out.println("Número negativo");
            //}
        }

        System.out.println("Lista anterior: " + lista);
        System.out.println("Lista positivos: " + listaPositivos);
    }
}
