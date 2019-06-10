package com.tgb.engsoftware.rematricula.controller;

import com.tgb.engsoftware.rematricula.model.Aluno;
import com.tgb.engsoftware.rematricula.service.AlunoService;
import com.tgb.engsoftware.rematricula.service.CursoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class AlunoController {

    @Autowired
    private AlunoService alunoService;
    @Autowired
    private CursoService cursoService;

    @RequestMapping("/listAlunos")
    public String listAllAlunos(Model alunoModel, Model cursoModel){
        alunoModel.addAttribute("alunos", alunoService.getAllAlunos());
        cursoModel.addAttribute("cursos", cursoService.getAllCursos());
        return "aluno/listAlunos";
    }
    @RequestMapping("/alunoForm")
    public String alunoForm(Model alunoModel, Model cursoModel){
        alunoModel.addAttribute("aluno", new Aluno());
        cursoModel.addAttribute("cursos", cursoService.getAllCursos());
        return "aluno/alunoForm";
    }
    @RequestMapping("/addAluno")
    public String addAluno(Aluno aluno){
        alunoService.addAluno(aluno);
        return"redirect:/listAlunos";
    }
    @RequestMapping("/editAluno/{id}")
    public String showAluno(@PathVariable String id, Model alunoModel, Model cursoModel){

        alunoModel.addAttribute("aluno", alunoService.getAlunoById(id));
        cursoModel.addAttribute("cursos", cursoService.getAllCursos());
        return "aluno/showAluno";
    }
    @RequestMapping("/updateAluno")
    public String updateAluno(Aluno aluno){
        alunoService.editAluno(aluno);
        return "redirect:/listAlunos";
    }
    @RequestMapping("/deleteAluno/{id}")
    public String deleteAluno (@PathVariable String id){
        alunoService.deleteAluno(id);
        return "redirect:/listAlunos";
    }
}
