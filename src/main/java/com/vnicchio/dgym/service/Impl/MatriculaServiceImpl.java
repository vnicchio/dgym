package com.vnicchio.dgym.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vnicchio.dgym.entity.Matricula;
import com.vnicchio.dgym.entity.dto.MatriculaDTO;
import com.vnicchio.dgym.repository.MatriculaRepository;
import com.vnicchio.dgym.service.IMatriculaService;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

  @Autowired
  private MatriculaRepository repository;

  @Override
  public Matricula create(MatriculaDTO matricula) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @Override
  public Matricula get(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public List<Matricula> getAll(String bairro) {
    if (bairro == null) {
      return repository.findAll();
    } else {
      return repository.findAlunosMatriculadosBairro(bairro);
    }
  }

  @Override
  public void delete(Long id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }
  
}
