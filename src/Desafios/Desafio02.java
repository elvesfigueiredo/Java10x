package Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        // Entra de Dados
        Scanner scanner = new Scanner(System.in);

        // Array
        int numero_MAX = 5;
        String[] ninjas = new String[numero_MAX];

        // Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {
            // Menu
            System.out.println("\n=====Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < numero_MAX) {
                        System.out.println("Digite o nome do Ninja");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        // Somando mais um ninja na minha lista
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso");
                    } else {
                        System.out.println("A lista de ninjas está cheia");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja encontrado");
                    } else {
                        System.out.println("========== Listas de ninjas ==========");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Estamos terminando o programa... Aguarde...");
                    break;

                default:
                    System.out.println("Essa opção não é válida");
                    break;
            }
        }
    }
}