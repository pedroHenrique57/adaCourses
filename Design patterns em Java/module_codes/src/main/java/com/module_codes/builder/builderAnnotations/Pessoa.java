package com.module_codes.builder.builderAnnotations;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@Builder
@ToString

public class Pessoa {

    private String nome;

    private String sobreNome;

    private String documento;

    private String email;

    private String apelido;

    private LocalDate dataNascimento;

}
