import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //17 - Leia N números e imprima a lista invertida
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaInvertida = new ArrayList<>();

        String entrada;
        boolean rodando = true;

        while (rodando){
            System.out.println("Informe os valores para a lista ou digite 'x' para sair:");
            entrada = scanner.nextLine();

            if (entrada.equals("x")){
                rodando = false;
            } else {
                lista.add(Integer.parseInt(entrada));
            }
        }

        for (int i = lista.size() - 1; i >= 0; i--){
            listaInvertida.add(lista.get(i));
        }

        System.out.println("Sistema finalizado");
        System.out.println("Lista original: " + lista);
        System.out.println("Lista invertida: " + listaInvertida);
    }
}
