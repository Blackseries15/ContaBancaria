package br.senac.es.conta;

import javax.swing.*;

public class MainUsandoDoWhile {

    public static void main(String[] args) {

            String entrada = JOptionPane.showInputDialog("Digite um " +
                    "nome ou texto qualquer");

            JOptionPane.showMessageDialog(null,
                    "Você digitou: " + entrada,
                    "Exemplo de JOptionPAne",
                    JOptionPane.ERROR_MESSAGE);

        //Declarando, Instanciando
        // e Inicializando um array em uma única linha
        Object[] opcoes = {"Sacar", "Depositar",
                "Consultar Saldo", "Sair"};

        int opcaoEscolhida;
        do {
            opcaoEscolhida = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "Menu",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            System.out.println("A opção escolhida foi: "
                    + opcaoEscolhida);

        } while (opcaoEscolhida != 3);
    }//fim do main
}//fim da classe
