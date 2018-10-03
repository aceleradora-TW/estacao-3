package com.juliane.eduarda.Proj.controllers;

import com.juliane.eduarda.Proj.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class PessoaController {


    private PessoaRepository pessoaRepository;

    @Autowired
    public PessoaController(PessoaRepository pessoaRepository){
        this.pessoaRepository = pessoaRepository;
    }

    @GetMapping(path = "/index")
    public String index(){
        return "index";
    }


    @GetMapping("/")
    public ModelAndView findAll() {

        ModelAndView listaPessoas = new ModelAndView("/post");
        listaPessoas.addObject("posts", pessoaRepository.findAll());

        return listaPessoas;
    }
}