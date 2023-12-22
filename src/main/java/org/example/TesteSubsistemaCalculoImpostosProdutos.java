package org.example;

public class TesteSubsistemaCalculoImpostosProdutos {

    public static void main(String[] args) {
        Produto produto = new Produto("Carro", 10000.0);

        Imposto imposto = ImpostoFactory.getImposto("ISS");
        double valorImposto = imposto.calcular(produto);

        System.out.println("Valor do produto: " + produto.getValor());
        System.out.println("Valor do imposto: " + valorImposto);
        System.out.println("Valor total: " + (produto.getValor() + valorImposto));
    }
}
