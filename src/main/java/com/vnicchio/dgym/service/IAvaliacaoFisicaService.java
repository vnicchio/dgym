package com.vnicchio.dgym.service;

import java.util.List;

import com.vnicchio.dgym.entity.AvaliacaoFisica;
import com.vnicchio.dgym.entity.dto.AvaliacaoFisicaDTO;
import com.vnicchio.dgym.entity.dto.AvaliacaoFisicaUpdateDTO;


public interface IAvaliacaoFisicaService {
  AvaliacaoFisica create(AvaliacaoFisicaDTO avaliacaoFisica);

  AvaliacaoFisica get(Long id);

  List<AvaliacaoFisica> getAll();

  AvaliacaoFisica update(AvaliacaoFisicaUpdateDTO avaliacaoFisica);

  void delete(Long id);
}
