import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //22
        boolean rodando = true;
        String entrada;

        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaUnica = new ArrayList<>();

        while (rodando) {
            System.out.println("Digite o valor ou digite 'x' para sair");
            entrada = scanner.nextLine();

            if (entrada.equals("x")) {
                rodando = false;
            } else {
                lista.add(Integer.parseInt(entrada));

                if (!listaUnica.contains(Integer.parseInt(entrada))) {
                    listaUnica.add(Integer.parseInt(entrada));
                }
            }
        }

        System.out.println("Sistema finalizado");
        System.out.println("Lista original: " + lista);
        System.out.println("Lista sem duplicata: " + listaUnica);
    }
}
