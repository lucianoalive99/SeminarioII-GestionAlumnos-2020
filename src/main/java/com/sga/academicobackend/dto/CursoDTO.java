package com.sga.academicobackend.dto;

import com.sga.academicobackend.model.Curso;

import java.util.ArrayList;
import java.util.List;

public class CursoDTO {

    private Integer idCurso;
    private String  curso;
    private String  division;

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
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

    public List<CursoDTO> getCursoDTOList(List<Curso> cursosList) {
        List<CursoDTO> cursoDTOList =new ArrayList<>();
        for (Curso curso: cursosList) {
            CursoDTO cursoDTO = new CursoDTO();
            cursoDTO.setIdCurso(curso.getIdcurso());
            cursoDTO.setCurso(curso.getCurso());
            cursoDTO.setDivision(curso.getDivision());
            cursoDTOList.add(cursoDTO);

        }
        return cursoDTOList;

    }

    public CursoDTO getCursoDTO(Curso curso) {
            CursoDTO cursoDTO = new CursoDTO();
            cursoDTO.setIdCurso(curso.getIdcurso());
            cursoDTO.setCurso(curso.getCurso());
            cursoDTO.setDivision(curso.getDivision());
        return cursoDTO;
    }
}
