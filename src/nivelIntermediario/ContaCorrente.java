package nivelIntermediario;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(double saldo, TipoConta conta) {
        super(saldo, conta);
    }

    @Override
    public void depositar(double valor) {
        this.saldo+= valor;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo atual é de: " + this.saldo);
    }
}
