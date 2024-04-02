package com.vnicchio.dgym.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vnicchio.dgym.entity.Aluno;
import com.vnicchio.dgym.entity.AvaliacaoFisica;
import com.vnicchio.dgym.entity.dto.AlunoDTO;
import com.vnicchio.dgym.service.Impl.AlunoServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

  @Autowired
  private AlunoServiceImpl service;
  
  @GetMapping
  public List<Aluno> getAllAlunos() {
    return service.getAll();
  }

  @GetMapping("/{id}")
  public Aluno getAluno(@PathVariable Long id) {
    return service.get(id);
  }

  @PostMapping
  public Aluno criaAluno(@Valid @RequestBody AlunoDTO aluno) {
    return service.create(aluno);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deletaAluno(@PathVariable Long id) {
    service.delete(id);

    return ResponseEntity.status(204).build();
  }

  @GetMapping("/{id}/avaliacao-fisica")
  public List<AvaliacaoFisica> getAvaliacoesFisicas(@PathVariable Long id) {
    return service.getAllAvaliacoesFisicas(id);
  }

}
