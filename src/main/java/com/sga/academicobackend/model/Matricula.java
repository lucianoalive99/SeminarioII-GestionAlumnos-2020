package com.sga.academicobackend.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Matricula {
    private int idmatricula;
    private Curso cursobymatricula;
    private Alumno alumnobymatricula;

    @Id
    @Column(name = "idmatricula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdmatricula() {
        return idmatricula;
    }

    public void setIdmatricula(int idmatricula) {
        this.idmatricula = idmatricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matricula matricula = (Matricula) o;
        return idmatricula == matricula.idmatricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idmatricula);
    }

    @ManyToOne
    @JoinColumn(name = "idcurso", referencedColumnName = "idcurso", nullable = false)
    public Curso getCursobymatricula() {
        return cursobymatricula;
    }

    public void setCursobymatricula(Curso cursobymatricula) {
        this.cursobymatricula = cursobymatricula;
    }

    @ManyToOne
    @JoinColumn(name = "idalumno", referencedColumnName = "idalumno", nullable = false)
    public Alumno getAlumnobymatricula() {
        return alumnobymatricula;
    }

    public void setAlumnobymatricula(Alumno alumnobymatricula) {
        this.alumnobymatricula = alumnobymatricula;
    }
}
