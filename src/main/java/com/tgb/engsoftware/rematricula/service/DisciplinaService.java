package com.tgb.engsoftware.rematricula.service;

import com.tgb.engsoftware.rematricula.model.Disciplina;
import com.tgb.engsoftware.rematricula.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    public List<Disciplina> listAllDisciplinas(){
        return disciplinaRepository.findAll();
    }
    public void addDisciplina(Disciplina disciplina){
        disciplinaRepository.save(disciplina);
    }
    public Disciplina getDisciplinaById(String id){
        return disciplinaRepository.findDisciplinaById(id);
    }
    public void updateDisciplina(Disciplina disciplina){
        disciplinaRepository.save(disciplina);
    }
    public void deleteDisciplinaById(String id){
        disciplinaRepository.deleteDisciplinaById(id);
    }
}
