package br.senac.es.conta.model;

import br.senac.es.conta.interfaces.AcoesConta;

public abstract class ContaBasica implements AcoesConta {
    protected Double saldo;
    protected Double limite;
}
