package dev.java._x.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class Controller {

    @GetMapping("/Boasvindas")
    public String boasVindas(){

        return "essa e minha primeira mensagem";
    }






}
