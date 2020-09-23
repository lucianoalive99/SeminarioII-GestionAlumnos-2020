package com.sga.academicobackend.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Alumno {
    private int idAlumno;
    private String nombre;
    private String apellido;
    private String documento;
    private Date fechaNacimiento;
    private String direccion;
    private Curso curso;

    @Id
    @Column(name = "id_alumno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    @Basic
    @Column(name = "nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "apellido")
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Basic
    @Column(name = "documento")
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Basic
    @Column(name = "fechanacimiento")
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Basic
    @Column(name = "direccion")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return idAlumno == alumno.idAlumno &&
                Objects.equals(nombre, alumno.nombre) &&
                Objects.equals(apellido, alumno.apellido) &&
                Objects.equals(documento, alumno.documento) &&
                Objects.equals(fechaNacimiento, alumno.fechaNacimiento) &&
                Objects.equals(direccion, alumno.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlumno, nombre, apellido, documento, fechaNacimiento, direccion);
    }

    @ManyToOne
    @JoinColumn(name = "curso_id", referencedColumnName = "id_curso", nullable = false)
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
