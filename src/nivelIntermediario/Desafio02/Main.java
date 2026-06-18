package nivelIntermediario.Desafio02;

public class Main {

    static void main(String[] args) {

        NinjaBasico ninja1 = new NinjaBasico(
                "Narutinho",
                15,
                "Muilti clones da sombras"
        );
        ninja1.executarHabilidade();
        ninja1.mostrarInformacoes();

        System.out.println("================");

        NinjaAvancado ninja2 = new NinjaAvancado(
            "Sasuke",
                16,
                "Raikiri",
                "Assasino"
        );
        ninja2.executarHabilidade();
        ninja2.mostrarInformacoes();
    }
}
