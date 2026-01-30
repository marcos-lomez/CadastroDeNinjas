package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/BoasVindas")
public String BoasVindas(){

    return "essa e minha primeira menssagem nessa rotA";
}

//Adicionar Ninja (CREATE)
  @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja Criado";

  }

//Procura Ninja por ID  (create)
@GetMapping("/todosID")
public String MostrarTodosPorID(){
    return  "Mostrar Ninja POr ID";

}


//Mostrar todos os ninjas (READ)
 @GetMapping("/todos")
    public String MostrarTodos(){
    return  "Mostarr Ninja";

 }


//Alterar dados ninjas (UPDATE)
@PutMapping("/alterarId")
    public String alterarNinjaPorId(){
        return "Alterar Ninja por ID";

}

//Deletar Ninja (DELETE)
@DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "deletado  por id";

}
}
