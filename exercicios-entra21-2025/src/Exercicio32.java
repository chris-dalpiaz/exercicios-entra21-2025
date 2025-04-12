import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //32
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(2);
        lista1.add(3);
        lista1.add(4);
        lista1.add(5);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(6);
        lista2.add(7);
        lista2.add(8);
        lista2.add(9);
        lista2.add(0);

        ArrayList<Integer> listaCompleta = new ArrayList<>();
        listaCompleta.addAll(lista1);
        listaCompleta.addAll(lista2);

        System.out.println(listaCompleta);
    }
}
