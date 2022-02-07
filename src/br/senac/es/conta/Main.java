package br.senac.es.conta;

import br.senac.es.conta.model.ContaPadrao;
import br.senac.es.conta.model.ContaPremium;

public class Main {
    public static void main(String[] args) throws Exception {


        ContaPadrao contaPadrao = new ContaPadrao();

        try {
            contaPadrao.depositar(100.00);

            System.out.println("Saldo: " + contaPadrao.consultaSaldo());
            contaPadrao.sacar(50.00);

            System.out.println("Saldo: " + contaPadrao.consultaSaldo());
            contaPadrao.sacar(200.00);

            System.out.println("Saldo: " + contaPadrao.consultaSaldo());

        } catch (Exception e) {
            System.out.println("Erro ao sacar:\n" + e.getMessage());
        }


    }

}
