package com.tgb.engsoftware.rematricula.repository;

import com.tgb.engsoftware.rematricula.model.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlunoRepository extends MongoRepository<Aluno, String> {
    Aluno findAlunoById(String id);
    void deleteAlunoById(String id);
}
