import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio14 {
    public static void main(String[] args) {
        //14 - Leia N números e exiba quantos são pares.
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listaPares = new ArrayList<>();

        boolean rodando = true;
        String entrada;
        int qtdePares = 0;

        while (rodando) {
            System.out.println("Informe o valor pra a lista, ou digite x para sair");
            entrada = scanner.nextLine();

            //saida do sistema
            if (entrada.equals("x")) {
                rodando = false;
            } else {
                lista.add(Integer.parseInt(entrada));

                if (Integer.parseInt(entrada) % 2 == 0) {
                    listaPares.add(Integer.parseInt(entrada));
                    qtdePares++;
                }
            }
        }
        System.out.println("Sistema finalizado.");
        System.out.println("Números informados: " + lista);
        System.out.println("Números pares: " + listaPares);
        System.out.println("Quantidade de n° pares: " + qtdePares);
    }
}