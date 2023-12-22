package org.example;

public class IPI extends Imposto {

    @Override
    public double calcular(Produto produto) {
        return produto.getValor() * 0.15;
    }
}
