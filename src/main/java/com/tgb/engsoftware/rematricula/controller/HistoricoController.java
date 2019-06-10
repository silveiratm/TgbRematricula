package com.tgb.engsoftware.rematricula.controller;

import com.tgb.engsoftware.rematricula.service.AlunoService;
import com.tgb.engsoftware.rematricula.service.DisciplinaService;
import com.tgb.engsoftware.rematricula.service.HistoricoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HistoricoController {
    @Autowired
    private HistoricoService historicoService;
    @Autowired
    private AlunoService alunoService;
    @Autowired
    private DisciplinaService disciplinaService;

    @RequestMapping("/listHistoricos")
    public String listHistoricos(Model historicoModel, Model alunoModel, Model disciplinaModel){
        historicoModel.addAttribute("historicos", historicoService.getAllHistoricos());
        alunoModel.addAttribute("alunos", alunoService.getAllAlunos());
        disciplinaModel.addAttribute("disciplinas", disciplinaService.listAllDisciplinas());
        return "historico/listHistoricos";
    }

}
