package com.vnicchio.dgym.service;

import java.util.List;

import com.vnicchio.dgym.entity.Aluno;
import com.vnicchio.dgym.entity.AvaliacaoFisica;
import com.vnicchio.dgym.entity.dto.AlunoDTO;
import com.vnicchio.dgym.entity.dto.AlunoUpdateDTO;

public interface IAlunoService {
  Aluno create(AlunoDTO aluno);

  Aluno get(Long id);

  List<Aluno> getAll(String dataDeNascimento);

  Aluno update(AlunoUpdateDTO aluno);

  void delete(Long id);

  List<AvaliacaoFisica> getAllAvaliacoesFisicas(Long id);
}
