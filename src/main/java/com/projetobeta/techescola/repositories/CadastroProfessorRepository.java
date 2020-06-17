package com.projetobeta.techescola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetobeta.techescola.entities.CadastroProfessor;

@Repository
public interface CadastroProfessorRepository extends JpaRepository<CadastroProfessor,Long> {

}
