package br.com.alura.screenmatch.desafio_listas_colecoes.formaDePagamento;

import br.com.alura.screenmatch.desafio_listas_colecoes.formaDePagamento.MetodoPagamento;

public class Compra {
    private String descricaoCompra;
    private double valorCompra;

    public Compra(String descricaoCompra, double valorCompra) {
        this.descricaoCompra = descricaoCompra;
        this.valorCompra = valorCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public String calculaValorCompra(MetodoPagamento metodoPagamento, double valorPagamento) {
        if (valorPagamento > metodoPagamento.saldo()) {
            return "Saldo insuficiente";
        }
        metodoPagamento.saldo() -= valorPagamento;
        return "Compra realizada!";
    }
}
