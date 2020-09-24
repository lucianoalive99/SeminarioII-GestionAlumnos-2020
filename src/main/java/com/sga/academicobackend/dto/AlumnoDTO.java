package com.sga.academicobackend.dto;

import com.sga.academicobackend.model.Alumno;

import java.util.ArrayList;
import java.util.List;

public class AlumnoDTO {
    private int idAlumno;
    private String nombre;
    private String apellido;
    private String documento;

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public List<AlumnoDTO> getAlumnoDTOList(List<Alumno> alumnoList){
        List<AlumnoDTO> alumnoDTOList=new ArrayList<>();
        for (Alumno alumno: alumnoList) {
            AlumnoDTO alumnoDTO = new AlumnoDTO();
            alumnoDTO.setIdAlumno(alumno.getIdalumno());
            alumnoDTO.setNombre(alumno.getNombre());
            alumnoDTO.setApellido(alumno.getApellido());
            alumnoDTO.setDocumento(alumno.getDocumento());
            alumnoDTOList.add(alumnoDTO);

        }
        return alumnoDTOList;
    }
    public AlumnoDTO getAlumnoDTO(Alumno alumno){
        AlumnoDTO alumnoDTO=new AlumnoDTO();
            alumnoDTO.setIdAlumno(alumno.getIdalumno());
            alumnoDTO.setNombre(alumno.getNombre());
            alumnoDTO.setApellido(alumno.getApellido());
            alumnoDTO.setDocumento(alumno.getDocumento());
        return alumnoDTO;
    }

}
