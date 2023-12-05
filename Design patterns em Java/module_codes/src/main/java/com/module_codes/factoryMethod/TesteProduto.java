package com.module_codes.factoryMethod;

public class TesteProduto {

    public static void main(String[] args) {

        Produto produtoBaseDigitalFactory = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);

        Produto produtoBase = Produto.builder() 
        .descricao("descrição generica.")
        .preco(199.99)
        .build();

        System.out.println(produtoBase);

        ProdutoDigital produtoBaseDigital = ProdutoDigital.builder()
        .possuiDimensoesFisicas(false)
        .tipoProduto(TipoProdutoEnum.DIGITAL)
        .build();

        System.out.println(produtoBaseDigital);

        System.out.println(produtoBaseDigitalFactory);
    }
}
