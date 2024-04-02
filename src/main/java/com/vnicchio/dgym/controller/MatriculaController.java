package com.vnicchio.dgym.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vnicchio.dgym.entity.Matricula;
import com.vnicchio.dgym.service.Impl.MatriculaServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

  @Autowired
  private MatriculaServiceImpl service;
  
  @GetMapping
  public List<Matricula> getMatriculas(@RequestParam(value = "bairro", required = false) String bairro) {
      return service.getAll(bairro);
  }
  
}
