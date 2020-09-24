package com.sga.academicobackend.repository;

import com.sga.academicobackend.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso,Integer> {
}
