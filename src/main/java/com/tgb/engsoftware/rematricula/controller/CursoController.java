package com.tgb.engsoftware.rematricula.controller;

import com.tgb.engsoftware.rematricula.model.Curso;
import com.tgb.engsoftware.rematricula.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @RequestMapping("/listCursos")
    public String listCursos(Model cursoModel){
        cursoModel.addAttribute("cursos", cursoService.getAllCursos());
        return "curso/listCursos";
    }
    @RequestMapping("/cursoForm")
    public String cursoForm(Model cursoModel){
        cursoModel.addAttribute("curso", new Curso());
        return "curso/cursoForm";
    }
    @RequestMapping("/addCurso")
    public String addCurso(Curso curso){
        cursoService.addCurso(curso);
        return "redirect:/listCursos";
    }
    @RequestMapping("/editCurso/{id}")
    public String showCurso(@PathVariable String id, Model cursoModel){
        cursoModel.addAttribute("curso", cursoService.getCursoById(id));
        return "curso/showCurso";
    }
    @RequestMapping("/updateCurso")
    public String updateCurso(Curso curso){
        cursoService.updateCurso(curso);
        return "redirect:/listCursos";
    }
    @RequestMapping("/deleteCurso/{id}")
    public String deleteCurso(@PathVariable String id){
        cursoService.deleteCursoById(id);
        return "redirect:/listCursos";
    }
}
