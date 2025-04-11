import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio13 {
    public static void main(String[] args) {
        //13 - Leia N números e exiba o maior e o menor valor armazenado.
        Scanner scanner = new Scanner(System.in);
        boolean querInformar = true;
        ArrayList<Integer> inteiros = new ArrayList<>();
        int maiorNum = 0, menorNum = 0;

        while (querInformar){
            System.out.println("Informe um número para a lista, ou digite x para sair:");
            String entrada = scanner.nextLine();

            if (entrada.equals("x")){
                querInformar = false;
            } else {
                inteiros.add(Integer.parseInt(entrada));
                menorNum = inteiros.get(0);

                if(Integer.parseInt(entrada) > maiorNum){
                    maiorNum = Integer.parseInt(entrada);
                }

                if (Integer.parseInt(entrada) < menorNum){
                    menorNum = Integer.parseInt(entrada);
                }
            }
        }
        System.out.println("Sistema Finalizado");
        System.out.println("Maior número informado: " + maiorNum);
        System.out.println("Menor número informado: " + menorNum);
    }
}