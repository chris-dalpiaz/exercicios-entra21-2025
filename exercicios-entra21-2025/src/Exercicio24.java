import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //24
        int soma = 0;
        double media = 0;

        ArrayList<Integer> listaImpar = new ArrayList<>();
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
            if (lista.get(i) % 2 != 0) {
                listaImpar.add(lista.get(i));
                soma += lista.get(i);
            }
        }

        media = (double) soma / listaImpar.size();
        System.out.println("Lista original: " + lista);
        System.out.println("Lista ímpares: " + listaImpar);
        System.out.println("Média dos ímpares: " + media);
    }
}
