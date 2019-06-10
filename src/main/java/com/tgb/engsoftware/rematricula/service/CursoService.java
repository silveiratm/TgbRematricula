package com.tgb.engsoftware.rematricula.service;

import com.tgb.engsoftware.rematricula.model.Curso;
import com.tgb.engsoftware.rematricula.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> getAllCursos(){
        return cursoRepository.findAll();
    }
    public Curso getCursoByName(String nome){
        return cursoRepository.findCursoByNome(nome);
    }
    public void addCurso(Curso curso){
        cursoRepository.save(curso);
    }
    public Curso getCursoById(String id){
        return cursoRepository.findCursoById(id);
    }
    public void deleteCursoById(String id){
        cursoRepository.deleteCursoById(id);
    }
    public void updateCurso(Curso curso){
        cursoRepository.save(curso);
    }
}
