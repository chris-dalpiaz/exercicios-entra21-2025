//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio06 {
    public static void main(String[] args) {
        //6 - Calcule N! (N fatorial) usando um for.
        int fatorial = 5, vezes = 1, anterior;
        for (int i = fatorial; i > 0; i--) {
            anterior = vezes;
            vezes *= i;
            if (anterior != 1) {
                System.out.println(anterior + " * " + i + " = " + vezes);
            }
        }
    }
}