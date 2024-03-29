package com.vnicchio.dgym.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vnicchio.dgym.entity.Aluno;
import com.vnicchio.dgym.entity.AvaliacaoFisica;
import com.vnicchio.dgym.entity.dto.AlunoDTO;
import com.vnicchio.dgym.entity.dto.AlunoUpdateDTO;
import com.vnicchio.dgym.repository.AlunoRepository;
import com.vnicchio.dgym.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService{

  @Autowired
  private AlunoRepository repository;

  @Override
  public Aluno create(AlunoDTO aluno) {
    Aluno novoAluno = new Aluno();
    novoAluno.setNome(aluno.getNome());
    novoAluno.setCpf(aluno.getCpf());
    novoAluno.setBairro(aluno.getBairro());
    novoAluno.setDataDeNascimento(aluno.getDataDeNascimento());

    return repository.save(novoAluno);
  }

  @Override
  public Aluno get(Long id) {
    return repository.getReferenceById(id);
  }

  @Override
  public List<Aluno> getAll() {
    return repository.findAll();
  }

  @Override
  public Aluno update(AlunoUpdateDTO aluno) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(Long id) {
    Aluno aluno = this.get(id);
    repository.delete(aluno);
  }

  @Override
  public List<AvaliacaoFisica> getAllAvaliacoesFisicas(Long id) {
    Aluno aluno = this.get(id);
    return aluno.getAvaliacoesFisica();
  }
  
}
