package org.example;

public class ISS extends Imposto {

    @Override
    public double calcular(Produto produto) {
        return produto.getValor() * 0.05;
    }
}
