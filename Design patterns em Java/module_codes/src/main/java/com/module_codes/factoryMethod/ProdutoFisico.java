package com.module_codes.factoryMethod;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)

@Getter @Setter public class ProdutoFisico extends Produto{

    private Boolean possuiDimensoesFisicas;

    private TipoProdutoEnum tipoProduto;
}
