package Condicionais;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Ternarios: são maneiras de reduzir o codigo
        * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
         */

        short numerodeMissoes = 11;
        String nivelDoNinja = (numerodeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivelDoNinja);
    }
}
