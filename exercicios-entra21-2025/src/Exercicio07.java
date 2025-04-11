//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exercicio07 {
    public static void main(String[] args) {
        //7 - Leia um número e calcule a soma dos seus dígitos.
        int unidade, dezena, centena, valor = 123, total;
        unidade = valor % 10;
        dezena = (valor / 10) % 10;
        centena = (valor / 100) % 100;
        total = unidade + dezena + centena;
        System.out.println(centena + " + " + dezena + " + " + unidade + " = " + total);
    }
}