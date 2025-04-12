import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //20 - Leia N números e ordene em ordem crescente usando Collections.sort().
        boolean rodando = true;
        String entrada;

        ArrayList<Integer> lista = new ArrayList<>();

        while (rodando) {
            System.out.println("Digite o valor ou digite 'x' para sair");
            entrada = scanner.nextLine();

            if (entrada.equals("x")) {
                rodando = false;
            } else {
                lista.add(Integer.parseInt(entrada));
            }
        }

        System.out.println("Sistema finalizado");
        System.out.println("Ordem original: " + lista);
        Collections.sort(lista);
        System.out.println("Ordem crescente: " + lista);
    }
}
