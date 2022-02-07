package br.senac.es.conta;

import br.senac.es.conta.model.ContaEspecial;
import br.senac.es.conta.model.ContaPadrao;

public class Main2 {
    public static void main2(String[] args) throws Exception {

        ContaEspecial contaEspecial = new ContaEspecial();

        try {
            contaEspecial.depositar(100.00);

            System.out.println("Saldo: " + contaEspecial.consultaSaldo());
            contaEspecial.sacar(50.00);

            System.out.println("Saldo: " + contaEspecial.consultaSaldo());
            contaEspecial.sacar(200.00);

            System.out.println("Saldo: " + contaEspecial.consultaSaldo());

        } catch (Exception e) {
            System.out.println("Erro ao sacar:\n" + e.getMessage());
        }


    }

}
