//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio05 {
    public static void main(String[] args) {
        //5 - Leia um número N e imprima os ímpares de 1 até N com while.
        int numero = 20;
        System.out.println("Numero informado: " + numero);
        System.out.println("Numeros ímpares: ");
        int contador = 0;

        while (contador <= numero) {
            if(contador % 2 != 0){
                System.out.println(contador);
            }
            contador++;
        }
    }
}