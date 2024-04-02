package com.vnicchio.dgym.entity.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaDTO {

  @NotNull(message = "Preencha o campo corretamente")
  @Positive(message = "O Id precisa ser positivo")
  private Long alunoId;
}
