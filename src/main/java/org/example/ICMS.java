package org.example;

public class ICMS extends Imposto {

    @Override
    public double calcular(Produto produto) {
        return produto.getValor() * 0.12;
    }
}
