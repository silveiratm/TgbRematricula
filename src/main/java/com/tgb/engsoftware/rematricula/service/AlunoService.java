package com.tgb.engsoftware.rematricula.service;

import com.tgb.engsoftware.rematricula.model.Aluno;
import com.tgb.engsoftware.rematricula.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {
    @Autowired
    private AlunoRepository alunoRepository;

    public List<Aluno> getAllAlunos(){
        return alunoRepository.findAll();
    }
    public void addAluno(Aluno aluno){
        alunoRepository.save(aluno);
    }
    public Aluno getAlunoById(String id){
        return alunoRepository.findAlunoById(id);
    }
    public void editAluno(Aluno aluno){
        alunoRepository.save(aluno);
    }
    public void deleteAluno(String id) {
        alunoRepository.deleteAlunoById(id);
    }
}
