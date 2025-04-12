import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //34
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(10);
        lista.add(100);
        lista.add(1001);
        lista.add(1058);
        lista.add(153);

        ArrayList<Integer> listaBlock = new ArrayList<>();
        listaBlock.add(1);
        listaBlock.add(10);
        listaBlock.add(100);

        ArrayList<Integer> listaFiltrada = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++){
            if (!listaBlock.contains(lista.get(i))){
                listaFiltrada.add(lista.get(i));
            }
        }
        System.out.println("Lista normal: " + lista);
        System.out.println("Lista filtrada: " + listaFiltrada);
    }
}
