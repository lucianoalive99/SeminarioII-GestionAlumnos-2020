package com.sga.academicobackend.dto;

import com.sga.academicobackend.model.Matricula;

import java.util.ArrayList;
import java.util.List;

public class MatriculaDTO {

    private Integer idMatricula;
    private String  nombre;
    private String  apellido;
    private String  curso;
    private String  division;

    public Integer getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(Integer idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }


    public List<MatriculaDTO> getMatriculaDTOList(List<Matricula> matriculaList) {
        List<MatriculaDTO>  matriculaDTOList = new ArrayList<>();
        for (Matricula matricula:matriculaList) {
            MatriculaDTO matriculaDTO = new MatriculaDTO();
            matriculaDTO.setIdMatricula(matricula.getIdmatricula());
            matriculaDTO.setApellido(matricula.getAlumnobymatricula().getApellido());
            matriculaDTO.setNombre(matricula.getAlumnobymatricula().getNombre());
            matriculaDTO.setCurso(matricula.getCursobymatricula().getCurso());
            matriculaDTO.setDivision(matricula.getCursobymatricula().getDivision());
            matriculaDTOList.add(matriculaDTO);
        }
        return matriculaDTOList;

    }
    public MatriculaDTO getMatriculaDTO(Matricula matricula) {
        MatriculaDTO matriculaDTO = new MatriculaDTO();
        matriculaDTO.setIdMatricula(matricula.getIdmatricula());
        matriculaDTO.setApellido(matricula.getAlumnobymatricula().getApellido());
        matriculaDTO.setNombre(matricula.getAlumnobymatricula().getNombre());
        matriculaDTO.setCurso(matricula.getCursobymatricula().getCurso());
        matriculaDTO.setDivision(matricula.getCursobymatricula().getDivision());
        return matriculaDTO;
    }
}
