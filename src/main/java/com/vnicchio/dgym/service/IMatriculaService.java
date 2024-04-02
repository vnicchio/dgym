package com.vnicchio.dgym.service;

import java.util.List;

import com.vnicchio.dgym.entity.Matricula;
import com.vnicchio.dgym.entity.dto.MatriculaDTO;

public interface IMatriculaService {
  Matricula create(MatriculaDTO matricula);

  Matricula get(Long id);

  List<Matricula> getAll(String bairro);

  void delete(Long id);
}
