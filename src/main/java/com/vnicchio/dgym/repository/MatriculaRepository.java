package com.vnicchio.dgym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.vnicchio.dgym.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{


  @Query(value = "SELECT * FROM matricula m " + 
  "INNER JOIN aluno a ON m.aluno_id = a.id " +
  "WHERE a.bairro = :bairro", nativeQuery = true)
  // @Query("FROM Matricula m WHERE m.aluno.bairro = :bairro")
  List<Matricula> findAlunosMatriculadosBairro(String bairro);

}