package com.vnicchio.dgym.entity.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoFisicaUpdateDTO {

  @NotNull(message = "Preencha o campo corretamente")
  @Positive(message = "O '${validatedValue}' precisa ser positivo")
  private double peso;

  @NotNull(message = "Preencha o campo corretamente")
  @Positive(message = "O '${validatedValue}' precisa ser positivo")
  @DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}")
  private double altura;
}
