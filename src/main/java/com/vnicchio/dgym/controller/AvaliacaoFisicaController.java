package com.vnicchio.dgym.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vnicchio.dgym.entity.AvaliacaoFisica;
import com.vnicchio.dgym.entity.dto.AvaliacaoFisicaDTO;
import com.vnicchio.dgym.service.Impl.AvaliacaoFisicaServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/avaliacao-fisica")
public class AvaliacaoFisicaController {

  @Autowired
  private AvaliacaoFisicaServiceImpl service;
  
  @PostMapping
  public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaDTO avaliacaoFisica) {
      return service.create(avaliacaoFisica);
  }
  
}
