import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //16 - Leia N números e um número X, verifique se X está na lista.
        ArrayList<Integer> lista = new ArrayList<>();

        String entrada;
        boolean rodando = true;

        while (rodando) {
            System.out.println("Informe os valores para a lista ou digite 'x' para sair:");
            entrada = scanner.nextLine();

            if (entrada.equals("x")) {
                rodando = false;
            } else {
                lista.add(Integer.parseInt(entrada));
            }
        }

        System.out.println("Digite o número para ser conferido:");
        entrada = scanner.nextLine();

        if (lista.contains(Integer.parseInt(entrada))) {
            System.out.println("Esse número está na lista");
        } else {
            System.out.println("Esse número não está na lista");
        }

        System.out.println("Lista dos números: " + lista);
    }
}
