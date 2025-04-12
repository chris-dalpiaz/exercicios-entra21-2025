import java.util.ArrayList;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        //EXERCÍCIO 2
        boolean estaAtivo = true;
        ArrayList<String> tTodas = new ArrayList<>();
        ArrayList<String> tPendentes = new ArrayList<>();
        ArrayList<String> tConcluidas = new ArrayList<>();
        String entrada;

        while (estaAtivo) {
            System.out.println("O que você deseja fazer?\n" +
                    "1 - Adicionar uma nova tarefa\n" +
                    "2 - Listar todas as tarefas\n" +
                    "3 - Remover uma tarefa\n" +
                    "4 - Concluir uma tarefa\n" +
                    "x - Finalizar programa");

            String acao = scanner.nextLine();

            boolean sim = true;
            switch (acao) {

                case "1": // Adicionar uma nova tarefa
                    while (sim) {
                        System.out.println("Digite o nome da nova tarefa:");
                        entrada = scanner.nextLine();

                        if (!tPendentes.contains(entrada) && !tTodas.contains(entrada)){
                            tPendentes.add(entrada);
                            tTodas.add(entrada);
                            System.out.println("Adicionado com sucesso!\n");
                        } else {
                            System.out.println("<<ERRO!>> ESSA TAREFA JÁ EXISTE EM UMA DAS LISTAS (TODAS E/OU PENDENTES!!");
                        }

                        System.out.println("Deseja adicionar uma nova tarefa? s/n");

                        entrada = scanner.nextLine();
                        if (entrada.equals("n")) {
                            sim = false;
                        } else if (entrada.equals("s")) {
                            sim = true;
                        } else {
                            System.out.println("Entrada inválida!");
                            sim = false;
                        }
                    }
                    System.out.println("Voltando ao Menu");
                    dormindo();
                    break;

                case "2": // Listar todas as tarefas
                    System.out.println("Qual lista deseja visualizar?\n" +
                            "1 - Lista completa\n" +
                            "2 - Lista pendentes\n" +
                            "3 - Lista concluídas");

                    entrada = scanner.nextLine();
                    switch (entrada) {
                        case "1":
                            System.out.println("Todas as tarefas:\n" + tTodas);
                            break;

                        case "2":
                            System.out.println("Tarefas pendentes:\n" + tPendentes);
                            break;

                        case "3":
                            System.out.println("Tarefas concluídas\n" + tConcluidas);
                            break;

                        default:
                            System.out.println("Entrada Inválida!");
                    }
                    System.out.println("Voltando ao Menu");
                    dormindo();
                    break;

                case "3": // Remover uma tarefa
                    System.out.println("De qual lista você deseja remover a tarefa?\n" +
                            "1 - Lista completa\n" +
                            "2 - Lista pendentes\n" +
                            "3 - Ambas as listas");

                    entrada = scanner.nextLine();
                    switch (entrada) {
                        case "1":
                            System.out.println("Digite o nome da tarefa a ser removida " +
                                    "da LISTA COMPLETA:\n" + tTodas);
                            acao = scanner.nextLine();
                            tTodas.remove(acao);
                            System.out.println("Removida com sucesso!");

                            break;

                        case "2":
                            System.out.println("Digite o nome da tarefa a ser removida " +
                                    "da LISTA PENDENTES:\n " + tPendentes);
                            acao = scanner.nextLine();
                            tPendentes.remove(acao);
                            System.out.println("Removida com sucesso!");
                            break;

                        case "3":
                            System.out.println("Digite o nome da tarefa a ser removida " +
                                    "de AMBAS AS LISTAS:\n" +
                                    "TODAS> " + tTodas + "\n" +
                                    "PENDENTES> " + tPendentes);

                            acao = scanner.nextLine();
                            if (tTodas.contains(acao) && tPendentes.contains(acao)) {
                                tTodas.remove(acao);
                                tPendentes.remove(acao);
                                System.out.println("Removidas com sucesso!");
                            } else {
                                System.out.println("<<ERRO!>> ESSA TAREFA NÃO EXISTE NAS DUAS LISTAS!!");
                            }
                            break;

                        default:
                            System.out.println("Entrada Inválida!");
                    }
                    System.out.println("Voltando ao Menu");
                    dormindo();
                    break;

                case "4": // Concluir uma tarefa
                    System.out.println("Escreva o nome da tarefa a ser marcada como concluída:\n" + tPendentes);
                    entrada = scanner.nextLine();

                    if (tPendentes.contains(entrada)){
                        tPendentes.remove(entrada);
                        tConcluidas.add(entrada);
                        System.out.println("Tarefa concluída!");
                    } else {
                        System.out.println("<<ERRO!>> ESSA TAREFA NÃO EXISTE NA LISTA PENDENTES!!!");
                    }
                    dormindo();
                    break;

                case "x": // Encerrar o programa
                    estaAtivo = false;
                    System.out.println("Finalizando o Programa");
                    break;

                default:
                    System.out.println("Operação Inválida!");
            }

            System.out.println("Todas as tarefas:\n " + tTodas + "\n");
            System.out.println("Tarefas pendentes:\n " + tPendentes + "\n");
            System.out.println("Tarefas concluídas:\n " + tConcluidas);
        }
    }

    static void dormindo() throws InterruptedException {
        Thread.sleep(3000);
    }
}