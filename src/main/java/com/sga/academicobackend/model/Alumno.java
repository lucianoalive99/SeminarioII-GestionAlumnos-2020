package com.sga.academicobackend.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Alumno {
    private int idalumno;
    private String nombre;
    private String apellido;
    private String documento;
    private Date fechanacimiento;
    private String direccion;
    private Collection<Matricula> matriculalist;

    @Id
    @Column(name = "idalumno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(int idalumno) {
        this.idalumno = idalumno;
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
    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
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
        return idalumno == alumno.idalumno &&
                Objects.equals(nombre, alumno.nombre) &&
                Objects.equals(apellido, alumno.apellido) &&
                Objects.equals(documento, alumno.documento) &&
                Objects.equals(fechanacimiento, alumno.fechanacimiento) &&
                Objects.equals(direccion, alumno.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idalumno, nombre, apellido, documento, fechanacimiento, direccion);
    }

    @OneToMany(mappedBy = "alumnobymatricula")
    public Collection<Matricula> getMatriculalist() {
        return matriculalist;
    }

    public void setMatriculalist(Collection<Matricula> matriculalist) {
        this.matriculalist = matriculalist;
    }
}
