package com.projetobeta.techescola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetobeta.techescola.entities.Serie;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long>{

}
