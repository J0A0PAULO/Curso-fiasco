package nivelIntermediario;

public class Main {
    static void main(String[] args) {

        System.out.println("-------- Naruto Uzumaki ----------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 30, 1.67);
        System.out.println("Meu nome é " + naruto.getNome());
        naruto.setNome("Naruto Uzumaki com nome alterado");


        System.out.println("---------- Sasuke Uchiha ----------");


    }
}
