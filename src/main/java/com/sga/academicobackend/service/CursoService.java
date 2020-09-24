package com.sga.academicobackend.service;

import com.sga.academicobackend.dto.CursoDTO;
import com.sga.academicobackend.dto.Response;
import com.sga.academicobackend.model.Curso;
import com.sga.academicobackend.repository.CursoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private static final Logger LOG = LoggerFactory.getLogger(CursoService.class);
    @Autowired
    CursoRepository cursoRepository;

    public Response findAll() throws Exception {
        LOG.info("FindAll");
        Response response = new Response();
        List<Curso> cursosList = cursoRepository.findAll();
        List<CursoDTO> cursosDTOList = new CursoDTO().getCursoDTOList(cursosList);
        response.setData(cursosDTOList);
        return response;
    }

    public Response findById(Integer id) throws Exception {
        Response response = new Response();
        Curso curso = cursoRepository.findById(id).get();
        CursoDTO cursoDTO = new CursoDTO().getCursoDTO(curso);
        response.setData(cursoDTO);
        return response;

    }
}
