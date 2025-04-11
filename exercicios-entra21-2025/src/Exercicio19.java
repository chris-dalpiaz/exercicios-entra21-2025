import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        //19 - Multiplique cada elemento de uma lista por 2.
        int duplicar;

        ArrayList<Integer> listaDuplicada = new ArrayList<>();
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(2);
        lista.add(6);
        lista.add(5);
        lista.add(4);
        lista.add(3);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        for (int i = 0; i < lista.size(); i++){
            duplicar = lista.get(i) * 2;
            listaDuplicada.add(duplicar);
        }

        System.out.println("Lista original: " + lista);
        System.out.println("Lista duplicada: " + listaDuplicada);
    }
}
