package com.module_codes.builder;

import java.time.LocalDate;

public class testePessoaComBuilder {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa.pessoaBuilder()
                .nome("anderson")
                .sobreNome("polioti")
                .apelido("careca")
                .dataNascimento(LocalDate.of(2003, 6, 27))
                .documento("1234568907")
                .email("123@gmail.com")
                .buildPessoa();
        System.out.println(pessoa);
    }
}
