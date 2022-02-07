package br.senac.es.conta;


import br.senac.es.conta.model.ContaEspecial;
import br.senac.es.conta.model.ContaPadrao;
import br.senac.es.conta.model.ContaPremium;

import javax.swing.*;


public class Main3 {


    public static void main(String[] args) throws Exception {


        Object[] opcoes = {"Conta Padrão", "Conta Especial", "Conta Premium", "Sair"
        };


        boolean ficar = true;

        String temp;
        while (ficar) {
            int opcaoEscolhida = JOptionPane.showOptionDialog(
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

            if (opcaoEscolhida == 0){
                //Criar uma classe ContaPadrao
                ContaPadrao conta = new ContaPadrao();
                //Interagir com o usuario
                temp =   JOptionPane.showInputDialog("Digite um valor para deposito");

                Double deposito = Double.parseDouble(temp);

                conta.depositar(deposito);

                JOptionPane.showMessageDialog(null,"O saldo da conta é "+ conta.consultaSaldo());


            }else if (opcaoEscolhida == 1){
                ContaEspecial conta = new ContaEspecial();

                temp = JOptionPane.showInputDialog("Digite um valor para deposito");

                Double deposito = Double.parseDouble(temp);

                conta.depositar(deposito);
                conta.definirLimite(200.00);

                JOptionPane.showMessageDialog(null,"O saldo da conta é " + conta.consultaSaldo());
                JOptionPane.showMessageDialog(null,"Seu limite é " + conta.consultaLimite());



            }else if (opcaoEscolhida == 2){

                ContaPremium conta = new ContaPremium();
                temp = JOptionPane.showInputDialog("Digite um valor para deposito");

                Double deposito = Double.parseDouble(temp);
                conta.depositar(deposito);
                conta.definirLimite(200.00);
                conta.realizarEmprestimo();





                JOptionPane.showMessageDialog(null,"Seu saldo é" + conta.consultaSaldo());
                JOptionPane.showMessageDialog(null,"Seu limite é " + conta.consultaLimite());
                JOptionPane.showMessageDialog(null,"Seu limite para emprestimo é" + conta.consultaEmprestimo());


            }
            else if (opcaoEscolhida == 3 || opcaoEscolhida == -1) {
                ficar = false;
            }

        }




        }

    }


