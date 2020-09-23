package com.sga.academicobackend.repository;

import com.sga.academicobackend.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
}
