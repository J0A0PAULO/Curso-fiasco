package nivelBasico.Array;

public class Array {
    static void main(String[] args) {

        int contador = 0;

        String[] ninjas = new String[3];
        ninjas[0] = "Naruto Uzumaki";
        ninjas[1] = "Sasuke Uchiha";
        ninjas[2] = "Sakura Haruno";

        for (int i = 0; i < ninjas.length; i++) {
            System.out.println(ninjas[i]);
        }



    }
}
