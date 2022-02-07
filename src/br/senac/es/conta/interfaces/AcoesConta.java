package br.senac.es.conta.interfaces;

public interface AcoesConta {
    /**
     * Em uma interface, todos os métodos
     * devem ser abstratos.
     * */
    public void depositar(Double valor) throws Exception;
    public void sacar(Double valor) throws Exception;
    public Double consultaSaldo() throws Exception;
}
