package nivelIntermediario;

public class Hatake extends Ninja implements ShariganInterface, AnbuInterface, HokageInterface{

    public void boaVindas( ){
        System.out.println(nome + "Eu sou Hatake");
    }

    @Override
    public void ShariganAtivado() {
        System.out.println(nome + "Ativou Sharigna");
    }

    @Override
    public void NinjaDeElite() {
        System.out.println(nome + "Eu sou um ninja de elite da Ambu");
    }

    @Override
    public void HokageAtivo() {
        System.out.println(nome + "Eu sou um hokage");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é minha estragia de batalha");
    }
}
