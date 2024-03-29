package com.vnicchio.dgym.entity.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoDTO {
  private String nome;

  private String cpf;

  private String bairro;

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate dataDeNascimento;
}
