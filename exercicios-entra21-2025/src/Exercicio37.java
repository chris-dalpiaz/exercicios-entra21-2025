import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //37
        int repeticoes = 1;
        int maiorRepeticao = 0;
        int numeroRepetido = 0;

        ArrayList<Integer> listaModa = new ArrayList<>();
        listaModa.add(1);
        listaModa.add(369);
        listaModa.add(369);
        listaModa.add(2);
        listaModa.add(2);
        listaModa.add(2);
        listaModa.add(5);
        listaModa.add(5);

        Collections.sort(listaModa);

        for (int i = 1; i < listaModa.size(); i++) {
            int numAnterior = listaModa.get(i-1);
            if (listaModa.get(i) == numAnterior){
                repeticoes++;
                if (repeticoes > maiorRepeticao){
                    maiorRepeticao = repeticoes;
                    numeroRepetido = listaModa.get(i);
                }
            } else {
                repeticoes = 1;
            }
        }
        System.out.println("O número mais repetido foi " + numeroRepetido);
        System.out.println("Ele repetiu " + maiorRepeticao + " vezes");
    }
}
