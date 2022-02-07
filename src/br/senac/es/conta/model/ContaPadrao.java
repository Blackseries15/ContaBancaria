package br.senac.es.conta.model;

public class ContaPadrao extends ContaBasica {

    public ContaPadrao() {
        super.limite = 0.0;
        super.saldo = 0.0;
    }

    @Override
    public void depositar(Double valor) {
        //super.saldo = super.saldo + valor;
        super.saldo += valor;
    }

    @Override
    public void sacar(Double valor) throws Exception {
        if (super.saldo - valor >= 0) {
            super.saldo -= valor;
        } else {
            throw new Exception(valor + " excede o limite disponível que é " + super.saldo);
        }
    }

    @Override
    public Double consultaSaldo() {
        return super.saldo;
    }
}
