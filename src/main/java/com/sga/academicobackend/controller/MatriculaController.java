package com.sga.academicobackend.controller;

import com.sga.academicobackend.dto.Response;
import com.sga.academicobackend.service.AlumnoService;
import com.sga.academicobackend.service.MatriculaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/matricula")
public class MatriculaController {
    private static final Logger LOG = LoggerFactory.getLogger(AlumnoController.class);

    @Autowired
    private MatriculaService matriculaService;
    @GetMapping(value = "/lista-matriculas")
    public ResponseEntity<Response> list() throws Exception {
        LOG.info("list");
        Response response = matriculaService.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/matricula-id/{id}")
    public ResponseEntity<Response> getById(@PathVariable("id")Integer id) throws Exception {
        Response response = matriculaService.findById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
