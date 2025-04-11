//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio04 {
    public static void main(String[] args) {
        //4 - Leia um número N e imprima os pares de 0 até N com for.
        int numero = 10;
        System.out.println("Numero informado: " + numero);
        System.out.println("Numeros pares: ");
        for (int i = 0; i <= numero ; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}