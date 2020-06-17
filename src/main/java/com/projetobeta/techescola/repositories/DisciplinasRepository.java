package com.projetobeta.techescola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetobeta.techescola.entities.Disciplinas;

@Repository
public interface DisciplinasRepository extends JpaRepository<Disciplinas, Long>{

}
