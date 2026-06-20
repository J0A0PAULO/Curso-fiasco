package nivelIntermediario;

public abstract class ContaBancaria implements Conta{

    double saldo;
    TipoConta conta;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(double saldo, TipoConta conta) {
        this(saldo);
        this.conta = conta;
    }
}
