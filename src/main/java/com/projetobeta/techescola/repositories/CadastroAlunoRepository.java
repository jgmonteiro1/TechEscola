package com.projetobeta.techescola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetobeta.techescola.entities.CadastroAluno;

@Repository
public interface CadastroAlunoRepository extends JpaRepository<CadastroAluno, Long>{

}
