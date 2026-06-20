package nivelIntermediario;

public class Main {


    static void main(String[] args) {

        System.out.println("------------- Naurto Uzumaki --------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16);
        System.out.println(naruto);
        naruto.metodoProvissorio();

        System.out.println("------------- Sasuke Uchiha --------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 18);
        System.out.println(sasuke);

        Anbu anbu = new Anbu();
        anbu.nome = "aa";

    }
}
