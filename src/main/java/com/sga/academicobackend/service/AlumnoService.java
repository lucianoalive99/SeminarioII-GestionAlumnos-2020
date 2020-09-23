package com.sga.academicobackend.service;

import com.sga.academicobackend.dto.AlumnoDTO;
import com.sga.academicobackend.dto.Response;
import com.sga.academicobackend.model.Alumno;
import com.sga.academicobackend.repository.AlumnoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {

    private static final Logger LOG= LoggerFactory.getLogger(AlumnoService.class);
    @Autowired
    AlumnoRepository alumnoRepository;
    
    public Response findAll() throws Exception{
        LOG.info("FindAll");
        Response response = new Response();
        List<Alumno> alumnoList = alumnoRepository.findAll();
        List<AlumnoDTO> alumnoDTOList=new AlumnoDTO().getAlumnoDTOList(alumnoList);
//        for (Alumno elAlumno : alumnoList) {
//            LOG.info("Alumno: " + elAlumno.getIdAlumno() + " - " + elAlumno.getNombre() + " - " + elAlumno.getApellido());
//        }
        response.setData(alumnoDTOList);
        return response;
    }

    public Response findById(Integer id) throws Exception{
        Response response = new Response();
        Alumno alumno = alumnoRepository.findById(id).get();
        AlumnoDTO alumnoDTO=new AlumnoDTO().getAlumnoDTO(alumno);
//        for (Alumno elAlumno : alumnoList) {
//            LOG.info("Alumno: " + elAlumno.getIdAlumno() + " - " + elAlumno.getNombre() + " - " + elAlumno.getApellido());
//        }
        response.setData(alumnoDTO);
        return response;
    }
}
