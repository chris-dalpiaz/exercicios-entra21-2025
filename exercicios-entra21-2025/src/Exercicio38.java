import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //38
        Random random = new Random();
        ArrayList<Integer> listaBlock = new ArrayList<>();
        int quantidadeN = scanner.nextInt();

        for (int i = 0; i <= quantidadeN; i++) {
            int nAleatorios = random.nextInt(20);
            if (!listaBlock.contains(nAleatorios)){
                System.out.println(nAleatorios);
                listaBlock.add(nAleatorios);
            }
        }
    }
}
