package com.tgb.engsoftware.rematricula.service;

import com.tgb.engsoftware.rematricula.model.Historico;
import com.tgb.engsoftware.rematricula.repository.HistoricoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricoService {
    @Autowired
    private HistoricoRepository historicoRepository;

    public List<Historico> getAllHistoricos(){
        return historicoRepository.findAll();
    }

}
