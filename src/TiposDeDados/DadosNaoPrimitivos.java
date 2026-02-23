package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
     /*
O que é: São tipos de dados em que pode-se colocar metodos para fazer alterações
    Dados não primitivos: String, Array, Class, enum
    Objetivo: Criar um ninja e atribuir metodos a ele.

Strings: Texto e manipulação de cadeias de caracteres.
Arrays: Estruturas para armazenar múltiplos valores em uma única variável.
Objetos: Instâncias de classes que encapsulam dados e comportamentos.
 */
        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // toUpperCase vai colocar tudo em CAPSLOCK
        System.out.println("Esse texto está em CAPSLOCK:  " + nomeUpperCase);
        System.out.println("Esse texto está normal: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase(); // toLowerCase vai colcoar tudo em caixa baixa/minusculo
        System.out.println(aldeia);
        System.out.println(aldeiaLowerCase);
    }
}
