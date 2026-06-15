package nivelBasico.Condicoes;

public class IfElse {
    static void main(String[] args) {

        /*
          if e ELS - condicoes
          else if
        * Objeto : Passar o ninja de nivel de acordo com o numero de missoes
        * */

        String nome = "Naruto Uzumaki";
        int idade = 10;
        String rank;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        //se(condicao){faça isso}
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunin");
        } else if(numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        }
        else {
            System.out.println("Rank: Genin");
        }


    }
}
