package org.example;

public class SubsistemaCalculoImpostosProdutos {

    public static void main(String[] args) {
        System.out.println("Descrição do subsistema de cálculo de impostos de produtos:");
        System.out.println("Este subsistema é responsável por calcular o imposto de produtos.");
        System.out.println("O subsistema é composto pelas seguintes classes:");
        System.out.println("* Imposto: Classe abstrata que representa um imposto.");
        System.out.println("* ISS: Classe que representa o imposto ISS.");
        System.out.println("* ICMS: Classe que representa o imposto ICMS.");
        System.out.println("* IPI: Classe que representa o imposto IPI.");
        System.out.println("* Produto: Classe que representa um produto.");
        System.out.println("* ImpostoFactory: Classe que cria objetos das classes Imposto.");
        System.out.println("As regras de negócio para calcular o imposto de um produto são as seguintes:");
        System.out.println("* Para o imposto ISS, o valor do imposto é calculado sobre o valor do produto.");
        System.out.println("* Para o imposto ICMS, o valor do imposto é calculado sobre o valor do produto, acrescido do valor do Imposto sobre Circulação de Mercadorias e Serviços (ICMS).");
        System.out.println("* Para o imposto IPI, o valor do imposto é calculado sobre o valor do produto, acrescido do valor do Imposto sobre Produtos Industrializados (IPI).");
    }
}
