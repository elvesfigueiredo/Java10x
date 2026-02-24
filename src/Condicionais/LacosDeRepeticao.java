package Condicionais;

public class LacosDeRepeticao {
    public static void main(String[] args) {


        /*
         * Laços de Repetição: vão repetir infinitamente ou até você atingir o parametro desejado
         * WHILE = FOR
         */

        // While
        // while (condicao) (tudo aqui vai acontecer)

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones < numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);
        }

        // FOR

        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O Sasuke fez um clone " + i);
        }

        int anoDeNascimento = 2005;

        for (int ano = anoDeNascimento; ano <= 2026; ano++) {

            int idade = ano - anoDeNascimento;
                System.out.println("Em " + ano + " Jamilly tem " + idade + " anos");
            }
        }
    }
