package com.gr.School.services;

import com.gr.School.models.AlunoModel;
import com.gr.School.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public AlunoModel criaraluno(AlunoModel alunoModel) {
        return alunoRepository.save(alunoModel);
    }

    public List<AlunoModel> findAll() {
        return alunoRepository.findAll();
    }

    public void deletarAluno(Long id) {
        alunoRepository.deleteById(id);
    }


}
