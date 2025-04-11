import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio12 {
    public static void main(String[] args) {
        //12 - Leia N números em um ArrayList<Integer> e calcule a soma total.
        Scanner scanner = new Scanner(System.in);
        boolean querInformar = true;
        ArrayList<Integer> inteiros = new ArrayList<>();
        int soma = 0;

        while (querInformar){
            System.out.println("Informe um número para a lista, ou digite x para sair:");
            String entrada = scanner.nextLine();

            if (entrada.equals("x")){
                querInformar = false;
            } else {
                inteiros.add(Integer.parseInt(entrada));
            }
        }

        for (int i = 0; i < inteiros.size(); i++){
            soma += inteiros.get(i);
        }

        System.out.println("Sistema finalizado\n" +
                "Sua lista:\n" +
                inteiros);
        System.out.println("Valor da Soma: " + soma);
    }
}