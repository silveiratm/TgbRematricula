package com.tgb.engsoftware.rematricula.controller;

import com.tgb.engsoftware.rematricula.model.Disciplina;
import com.tgb.engsoftware.rematricula.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisciplinasController {

    @Autowired
    private DisciplinaService disciplinaService;

    @RequestMapping("/listDisciplinas")
    public String listDisciplinas(Model disciplinaModel){
        disciplinaModel.addAttribute("disciplinas", disciplinaService.listAllDisciplinas());
        return "disciplina/listDisciplinas";
    }
    @RequestMapping("/disciplinaForm")
    public String disciplinaForm(Model disciplinaModel, Model listModel){
        disciplinaModel.addAttribute("disciplina", new Disciplina());
        listModel.addAttribute("disciplinas", disciplinaService.listAllDisciplinas());
        return "disciplina/disciplinaForm";
    }
    @RequestMapping("/addDisciplina")
    public String addDisciplina(Disciplina disciplina){
        disciplinaService.addDisciplina(disciplina);
        return "redirect:/listDisciplinas";
    }
    @RequestMapping("/editDisciplina/{id}")
    public String showDisciplina(@PathVariable String id, Model disciplinaModel, Model listModel){
        disciplinaModel.addAttribute("disciplina", disciplinaService.getDisciplinaById(id));
        listModel.addAttribute("disciplinas", disciplinaService.listAllDisciplinas());
        return "disciplina/showDisciplina";
    }
    @RequestMapping("/updateDisciplina")
    public String updateDisciplina(Disciplina disciplina){
        disciplinaService.updateDisciplina(disciplina);
        return "redirect:/listDisciplinas";
    }
    @RequestMapping("/deleteDisciplina/{id}")
    public String deleteDisciplina(@PathVariable String id){
        disciplinaService.deleteDisciplinaById(id);
        return "redirect:/listDisciplinas";
    }

}
