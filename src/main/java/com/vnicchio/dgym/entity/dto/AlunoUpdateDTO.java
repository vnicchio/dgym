package com.vnicchio.dgym.entity.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoUpdateDTO {
  private String nome;

  private String bairro;

  private LocalDate dataDeNascimento;
}
