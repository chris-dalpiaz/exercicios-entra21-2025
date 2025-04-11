import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //15 - Calcule a média dos valores armazenados em uma lista.
        ArrayList<Integer> lista = new ArrayList<>();

        String entrada;
        boolean rodando = true;
        int soma = 0;
        double media;

        while (rodando){
            System.out.println("Informe os valores para a lista ou digite 'lula' para sair:");
            entrada = scanner.nextLine();

            if (entrada.equals("lula")){
                rodando = false;
            } else {
                lista.add(Integer.parseInt(entrada));
                soma += Integer.parseInt(entrada);
            }
        }
        media = (double) soma /lista.size();
        System.out.println("Programa finalizado");
        System.out.println("Números informados: " + lista);
        System.out.println("Média dos números da lista: " + media);
    }
}