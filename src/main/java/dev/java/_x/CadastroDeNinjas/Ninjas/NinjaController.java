package dev.java._x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/Boasvindas")
    public String boasVindas(){

        return "essa e minha primeira mensagem";
    }

    //Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return  "Ninja criado";
    }




    //Mostar todos os ninjas (READ)
@GetMapping("/todos")
    public  String mostrarTodosOsNinjas(){

        return "Ninja criado";
}



    //Mostrar Ninja por ID  (read)

    @GetMapping("/todosId")
    public  String mostrarTodosOsNinjasPorId(){

        return "Mostar Ninja por id";
    }




    //Alterar dados dos Ninjas (UPDATE)
@PutMapping("/alterarId")
    public String alterarNinjaPorID(){
        return "Alterar Ninja Por ID";

}




    //Deletar ninja (DELETE)
@DeleteMapping("/deletarID")
    public String deletarNinjaPorID(){
        return "ninja deletado";

    }





}
