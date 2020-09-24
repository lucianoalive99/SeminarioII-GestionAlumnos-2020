package com.sga.academicobackend.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Curso {
    private int idcurso;
    private String curso;
    private String division;
    private Collection<Matricula> matriculalist;

    @Id
    @Column(name = "idcurso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
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
        return idcurso == curso1.idcurso &&
                Objects.equals(curso, curso1.curso) &&
                Objects.equals(division, curso1.division);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcurso, curso, division);
    }

    @OneToMany(mappedBy = "cursobymatricula")
    public Collection<Matricula> getMatriculalist() {
        return matriculalist;
    }

    public void setMatriculalist(Collection<Matricula> matriculalist) {
        this.matriculalist = matriculalist;
    }
}
