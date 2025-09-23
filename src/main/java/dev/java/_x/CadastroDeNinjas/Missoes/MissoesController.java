package dev.java._x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

//localhost:8080
@RestController
@RequestMapping("missoes")
public class MissoesController {

    //GET -- mandar uma requisao para mostra as missoes

    @GetMapping("/listar")
     public String ListarMissao(){
        return "Missoes listadas com suceso";
    }


 // POST -- mandar uma requisao para criar as misoes

    @PostMapping("/criar")
    public String  criarMissao(){
        return "missao criada";
    }


// PUT -- mandar uma requisao para alterar  as missoes

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "missao alterada com suceso";
    }

    //delete -- deletar as missoes


    @DeleteMapping("/deletar")
    public String deletamissao(){
        return "missao deletada";
    }













}
