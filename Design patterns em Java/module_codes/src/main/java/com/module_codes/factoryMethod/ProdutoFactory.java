package com.module_codes.factoryMethod;

public class ProdutoFactory {

    public static Produto getInstance(TipoProdutoEnum tipoProdutoEnum) {

        switch (tipoProdutoEnum) {
            case FISICO:
                ProdutoFisico produtoFisico = ProdutoFisico.builder()
                .tipoProduto(tipoProdutoEnum)
                .possuiDimensoesFisicas(true)
                .build();
                return produtoFisico;

            case DIGITAL:
                ProdutoDigital produtoDigital = ProdutoDigital.builder()
                .tipoProduto(tipoProdutoEnum)
                .possuiDimensoesFisicas(false)
                .build();
                return produtoDigital;
        
            default:
                throw new IllegalArgumentException("Tipo de produto não disponível");
        }
    }
}
