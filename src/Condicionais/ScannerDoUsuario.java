package Condicionais;

import java.util.Scanner;

public class ScannerDoUsuario {

    /*
    Scanner = É um jeito de trazer o usuário para dentro da aplicação
    Objetivo: O usuário vai criar um ninja e vamos validar os dados
     */
    public static void main(String[] args) {
        // Abrir op Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber o nome do ninja
        System.out.println("Escreva aqui o nome do ninja");
        String nomedoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é " + nomedoNinja);

        // Receber a idade do ninja
        System.out.println("Escreva aqui a idade do ninja");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.printf("A idade de " + nomedoNinja + " é " + idadeDoNinja + " anos\n");

        // Tratamento de Dados
        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja já é maior de idade e pode ir para missões fora da aldeia");
        } else {
            System.out.println("Esse ninja é muito novo ainda, precisa treinar mais para sair da aldeia");
        }

        // Fecha sempre o Scanner
        caixaDeTexto.close();
    }
}
