package com.vnicchio.dgym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vnicchio.dgym.entity.Aluno;
import java.util.List;
import java.time.LocalDate;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

  List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);

}
