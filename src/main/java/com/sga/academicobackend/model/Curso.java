package com.sga.academicobackend.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Curso {
    private int idCurso;
    private String curso;
    private String division;
    private Collection<Alumno> alumnoList;

    @Id
    @Column(name = "id_curso")
    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    @Basic
    @Column(name = "curso")
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Basic
    @Column(name = "division")
    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso1 = (Curso) o;
        return idCurso == curso1.idCurso &&
                Objects.equals(curso, curso1.curso) &&
                Objects.equals(division, curso1.division);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCurso, curso, division);
    }

    @OneToMany(mappedBy = "curso")
    public Collection<Alumno> getAlumnoList() {
        return alumnoList;
    }

    public void setAlumnoList(Collection<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }
}
