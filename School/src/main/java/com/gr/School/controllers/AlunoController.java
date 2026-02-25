package com.gr.School.controllers;

import com.gr.School.models.AlunoModel;
import com.gr.School.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/alunos")
public class AlunoController {

    @Autowired //
    private AlunoService alunoService;

    @PostMapping
    public AlunoModel criarAluno(@RequestBody AlunoModel alunoModel) {
        return alunoService.criaraluno(alunoModel);
    }

    @GetMapping
    public List<AlunoModel> buscarTodosAlunos() {
        return alunoService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletarAluno( @PathVariable Long id) {
        alunoService.deletarAluno(id);
    }




}
