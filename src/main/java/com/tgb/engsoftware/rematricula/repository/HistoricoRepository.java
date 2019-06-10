package com.tgb.engsoftware.rematricula.repository;

import com.tgb.engsoftware.rematricula.model.Historico;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoricoRepository extends MongoRepository<Historico, String> {
    Historico findHistoricoById(String id);
    List<Historico> findHistoricoByAlunoId(String alunoId);
}
