package com.module_codes.factoryMethod;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@ToString

@Getter @Setter public class Produto {

    private String descricao;

    private double preco;

    public String getDescricao() { return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}
}
