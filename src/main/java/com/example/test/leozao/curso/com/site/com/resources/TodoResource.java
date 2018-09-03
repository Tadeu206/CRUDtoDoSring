package com.example.test.leozao.curso.com.site.com.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/todolist")
public class TodoResource {

    @RequestMapping(method =RequestMethod.GET)
    public String listar(){
        return "O rest esta funcionando!";
    }
}
