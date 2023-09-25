package br.com.alura.screenmatch.desafio_listas_colecoes.formaDePagamento;

public class Cartao extends MetodoPagamento {
    private double limiteCartao;
    private String numeroCartao;
    private String senha;

    public Cartao(double saldo, double limiteCartao, String numeroCartao, String senha) {
        super(saldo);
        this.limiteCartao = limiteCartao;
        this.numeroCartao = numeroCartao;
        this.senha = senha;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getSenha() {
        return senha;
    }
}
