package com.tgb.engsoftware.rematricula.repository;

import com.tgb.engsoftware.rematricula.model.Disciplina;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends MongoRepository<Disciplina, String> {
    Disciplina findDisciplinaById(String id);
    void deleteDisciplinaById(String id);
}
