package br.senac.es.conta.model;



public class ContaEspecial extends ContaBasica   {

    public ContaEspecial() {
        super.limite = 0.0;
        super.saldo = 0.0;
    }

    @Override
    public void depositar(Double valor) {
        super.saldo += valor;
    }

    @Override
    public void sacar(Double valor) {
        if( (saldo+limite) - valor >= 0 ){
            super.saldo -= valor;
        }
    }

    @Override
    public Double consultaSaldo() {
        return super.saldo;
    }

    public void definirLimite(Double valor){
        super.limite = valor;
    }

    public Double consultaLimite(){
        return super.limite;
    }



}
