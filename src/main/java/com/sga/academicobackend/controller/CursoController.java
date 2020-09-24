package com.sga.academicobackend.controller;

import com.sga.academicobackend.dto.Response;
import com.sga.academicobackend.service.CursoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/cursos")
public class CursoController {

    private static final Logger LOG = LoggerFactory.getLogger(AlumnoController.class);

    @Autowired
    private CursoService cursoService;
    @GetMapping(value = "/lista-cursos")
    public ResponseEntity<Response> list() throws Exception {
        LOG.info("list");
        Response response = cursoService.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping(value = "/id/{id}")
    public ResponseEntity<Response> getById(@PathVariable("id")Integer id) throws Exception {
        Response response = cursoService.findById(id);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
