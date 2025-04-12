import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //31
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(1);
        listaNumeros.add(2);
        listaNumeros.add(3);
        listaNumeros.add(4);
        listaNumeros.add(5);
        listaNumeros.add(6);
        listaNumeros.add(7);
        listaNumeros.add(8);
        listaNumeros.add(9);
        listaNumeros.add(10);

        ArrayList<Character> listaLetras = new ArrayList<>();
        listaLetras.add('a');
        listaLetras.add('b');
        listaLetras.add('c');
        listaLetras.add('d');
        listaLetras.add('e');
        listaLetras.add('f');
        listaLetras.add('g');
        listaLetras.add('h');
        listaLetras.add('i');
        listaLetras.add('j');

        ArrayList<String> listaIntercalada = new ArrayList<>();

        for (int i = 0; i < listaNumeros.size() && i < listaLetras.size(); i++) {
            if (i % 2 == 0) {
                listaIntercalada.add(String.valueOf(listaNumeros.get(i)));
            } else {
                listaIntercalada.add(String.valueOf(listaLetras.get(i)));
            }
        }

        System.out.println(listaIntercalada);
    }
}
