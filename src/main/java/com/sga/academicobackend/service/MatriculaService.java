package com.sga.academicobackend.service;

import com.sga.academicobackend.dto.MatriculaDTO;
import com.sga.academicobackend.dto.Response;
import com.sga.academicobackend.model.Matricula;
import com.sga.academicobackend.repository.MatriculaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {

    private static final Logger LOG = LoggerFactory.getLogger(MatriculaService.class);
    @Autowired
    MatriculaRepository matriculaRepository;

    public Response findAll() throws Exception {
        LOG.info("FindAll");
        Response response = new Response();
        List<Matricula> matriculaList = matriculaRepository.findAll();
        List<MatriculaDTO> matriculaDTOList = new MatriculaDTO().getMatriculaDTOList(matriculaList);
        response.setData(matriculaDTOList);
        return response;
    }

    public Response findById(Integer id) throws Exception {
        Response response = new Response();
        Matricula matricula = matriculaRepository.findById(id).get();
        MatriculaDTO matriculaDTO = new MatriculaDTO().getMatriculaDTO(matricula);
        response.setData(matriculaDTO);
        return response;

    }
}
