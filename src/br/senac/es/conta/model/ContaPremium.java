package br.senac.es.conta.model;

import br.senac.es.conta.interfaces.AcoesContaPremium;

public class ContaPremium extends ContaEspecial implements AcoesContaPremium {
    protected Double emprestimo;

    public ContaPremium() {
        super.limite = 0.0;
        super.saldo = 0.0;

    }

    @Override
    public void depositar(Double valor) {
        super.saldo += valor;
    }

    @Override
    public void sacar(Double valor) {
        if ((saldo + limite) - valor >= 0) {
            super.saldo -= valor;
        }


    }

    @Override
    public Double consultaSaldo() {
        return super.saldo;
    }

    public void definirLimite(Double valor) {
        super.limite = valor;
    }

    public Double consultaLimite() {
        return super.limite;
    }

    @Override
    public void realizarEmprestimo() throws Exception {
        Double calculo = limite * 12;
        calculo = calculo * 1.30;

        if (calculo <= 0) {
            throw new Exception("Valor Invalido");
        } else {
            emprestimo = calculo;

        }



    }

    @Override
    public Double consultaEmprestimo() throws Exception {
        return emprestimo;
    }
}
