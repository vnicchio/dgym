package com.vnicchio.dgym.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vnicchio.dgym.entity.Aluno;
import com.vnicchio.dgym.entity.AvaliacaoFisica;
import com.vnicchio.dgym.entity.dto.AvaliacaoFisicaDTO;
import com.vnicchio.dgym.entity.dto.AvaliacaoFisicaUpdateDTO;
import com.vnicchio.dgym.repository.AvaliacaoFisicaRepository;
import com.vnicchio.dgym.service.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService{

  @Autowired
  private AvaliacaoFisicaRepository repository;

  @Autowired
  private AlunoServiceImpl alunoService;

  @Override
  public AvaliacaoFisica create(AvaliacaoFisicaDTO avaliacaoFisica) {
    Aluno aluno = alunoService.get(avaliacaoFisica.getAlunoId());

    AvaliacaoFisica newAvaliacaoFisica = new AvaliacaoFisica();

    newAvaliacaoFisica.setAluno(aluno);
    newAvaliacaoFisica.setPeso(avaliacaoFisica.getPeso());
    newAvaliacaoFisica.setAltura(avaliacaoFisica.getAltura());

    repository.save(newAvaliacaoFisica);

    return newAvaliacaoFisica;
  }

  @Override
  public AvaliacaoFisica get(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public List<AvaliacaoFisica> getAll() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAll'");
  }

  @Override
  public AvaliacaoFisica update(AvaliacaoFisicaUpdateDTO avaliacaoFisica) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }
  
}
