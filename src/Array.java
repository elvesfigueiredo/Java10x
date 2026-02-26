public class Array {
    public static void main(String[] args) {

        /* Arrays são tipo refêrencia!
            * São estáticos, fixos, não aumentam nem diminuem sozinhos não são flexiveis.
            * String inicializam como NULL
         */
        String[] ninja = new String[6];
        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println(ninja);

        // int inicializam como 0
        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[1]);

        // Boolean incializam como FALSE
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

        // Doubles incializam como 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);

        /*
        String nome1 = "Naruto Uzumaki";
        String nome2 = "Sasuke Uchiha";
        String nome3 = "Sakura Haruno";
         */
        String nomeDoNinja1 = "Gaara";
        String nomeDoNinja2 = "Rock Lee";
    }
}
