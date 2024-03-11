package com.vnicchio.dgym.entity;

import java.time.LocalDate;
import java.util.List;

public class Aluno {
  
  private Long id;

  private String nome;

  private String cpf;

  private String bairro;

  private LocalDate dataDeNascimento;

  private List<AvaliacaoFisica> avaliacoesFisica;
}
