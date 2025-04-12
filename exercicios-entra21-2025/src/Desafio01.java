import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        //EXERCÍCIO 1
        boolean calculadoraAtiva = true;

        while (calculadoraAtiva) {
            System.out.println("Digite a operação de sua escolha:\n" +
                    "1 - adição\n" +
                    "2 - subtração\n" +
                    "3 - multiplicação\n" +
                    "4 - divisão\n" +
                    "x - sair");
            String operacao = scanner.nextLine();

            switch (operacao) {
                case "1": // adição
                    System.out.println("Informe o primeiro número:");
                    String add1 = scanner.nextLine();

                    System.out.println("Informe o segundo número:");
                    String add2 = scanner.nextLine();

                    double add = Double.parseDouble(add1) + Double.parseDouble(add2);
                    System.out.println(add1 + " + " + add2 + " = " + add);
                    dormindo();
                    break;

                case "2": // subtração
                    System.out.println("Informe o primeiro número:");
                    String sub1 = scanner.nextLine();

                    System.out.println("Informe o segundo número:");
                    String sub2 = scanner.nextLine();

                    double sub = Double.parseDouble(sub1) - Double.parseDouble(sub2);
                    System.out.println(sub1 + " - " + sub2 + " = " + sub);
                    dormindo();
                    break;

                case "3": // multiplicação
                    System.out.println("Informe o primeiro número:");
                    String mult1 = scanner.nextLine();

                    System.out.println("Informe o segundo número:");
                    String mult2 = scanner.nextLine();

                    double mult = Double.parseDouble(mult1) * Double.parseDouble(mult2);
                    System.out.println(mult1 + " * " + mult2 + " = " + mult);
                    dormindo();
                    break;

                case "4": // divisão
                    System.out.println("Informe o primeiro número:");
                    String div1 = scanner.nextLine();

                    System.out.println("Informe o segundo número:");
                    String div2 = scanner.nextLine();

                    double div = Double.parseDouble(div1) / Double.parseDouble(div2);
                    System.out.println(div1 + " / " + div2 + " = " + div);
                    dormindo();
                    break;

                case "x": // sair
                    calculadoraAtiva = false;
                    break;

                default:
                    System.out.println("Operação Inválida!");
                    dormindo();
            }
        }
    }

    static void dormindo() throws InterruptedException {
        Thread.sleep(3000);
    }
}

