package Condicionais;

public class IfEElse {
    public static void main(String[] args) {
        /*
        IF e ELSE - Condicionais

         */

        // Ninja Naruto
        String nome = "Naruto";
        String rank;

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        if (numeroDeMissoes == 10 && idade > 15 ) {
            System.out.println("Rank: Chuunin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Genin");
        }
    }
}
