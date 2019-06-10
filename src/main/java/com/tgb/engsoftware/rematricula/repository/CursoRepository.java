package com.tgb.engsoftware.rematricula.repository;

import com.tgb.engsoftware.rematricula.model.Aluno;
import com.tgb.engsoftware.rematricula.model.Curso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CursoRepository extends MongoRepository<Curso, String> {
    Curso findCursoByNome(String nome);
    Curso findCursoById(String id);
    void deleteCursoById(String id);
}
