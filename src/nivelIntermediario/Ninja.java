package nivelIntermediario;

public class Ninja {

    String nome;
    String aldeia;
    int idade;

    // criar  um metodo public personalizado


    /*
    * Metodo String vai ter que retornar uma String
    * */
    public String EuSouUmNinja() {
        return "Eu Sou um Ninja";
    }

    /*
    * Metodo int vai ter que retornar um int
    * */


    public int anosParaSeTornaHokage(int idadeMinimaPraSerHokage) {
        return idadeMinimaPraSerHokage - idade;
    }


}
