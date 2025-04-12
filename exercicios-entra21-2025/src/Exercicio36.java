import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //36
        boolean estaOrganizada = true;
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        lista.add(8);
        lista.add(9);
        lista.add(10);

        ArrayList<Integer> listaOrganizada = new ArrayList<>();
        listaOrganizada.addAll(lista);
        Collections.sort(listaOrganizada);

        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i) != listaOrganizada.get(i)){
                estaOrganizada = false;
            }
        }
        System.out.println("Lista: " + lista);
        System.out.println("ListaOrganizada: " + listaOrganizada);

        if (estaOrganizada){
            System.out.println("A lista está em ordem crescente");
        } else {
            System.out.println("A lista está uma bagunça");
        }
    }
}
