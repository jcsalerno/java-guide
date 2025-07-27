package Md04;

import java.util.Scanner;

public class Exercise002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println(" # Bem-vindo ao Jira CLI # ");
        System.out.println("-----------------------------");

        do {
            System.out.println("1 - Criar tarefa");
            System.out.println("2 - Criar projeto");
            System.out.println("3 - Sair");
            System.out.print("Digite uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer após nextInt()

            if (opcao == 1) {
                System.out.print("Digite o nome da tarefa: ");
                String nomeTarefa = scanner.nextLine();
                System.out.println("Tarefa '" + nomeTarefa + "' criada com sucesso!");
            } else if (opcao == 2) {
                System.out.print("Digite o nome do projeto: ");
                String nomeProjeto = scanner.nextLine();
                System.out.println("Projeto '" + nomeProjeto + "' criado com sucesso!");
            } else if (opcao == 3) {
                System.out.println("SISTEMA FINALIZADO");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println(); // Linha em branco para separar iterações

        } while (opcao != 3);

        scanner.close();
    }
}
