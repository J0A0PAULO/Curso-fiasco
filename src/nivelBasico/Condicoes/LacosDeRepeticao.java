package nivelBasico.Condicoes;

public class LacosDeRepeticao {
    static void main(String[] args) {
        /*
        * Lacos de repeticao: Vao repetir  infinitamente ou até voce atingir o parametro desejado
        * WHILE = FOR
        * */

        //while
        //WHILE (CONDICAO) {tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

//        while (numeroDeClones <= numeroMaximoDeClones) {
//            System.out.println("O naruto fez um clone " + numeroDeClones);
//            numeroDeClones++;
//        }

        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O naruto fez um clone " + i);
        }



     }
}
