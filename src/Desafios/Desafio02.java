package Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

        // Entra de Dados
        Scanner scanner = new Scanner(System.in);

        // Array
        int numero_MAX = 5;
        String[] ninjnas = new String[numero_MAX];

        // Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        // Menu
        System.out.println("\n=====Menu Ninja =====");
        System.out.println("1. Cadastrar Ninja");
        System.out.println("2. Listar Ninjas");
        System.out.println("3. Sair");
        System.out.println("Escolha uma opção: ");
    }
}
