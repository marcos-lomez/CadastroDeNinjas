package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService){
        this.ninjaService = ninjaService;

    }

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
@GetMapping("/listarID")
public String MostrarTodosPorID(){
    return  "Mostrar Ninja POr ID";

}


//Mostrar todos os ninjas (READ)
 @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
    return ninjaService.listarNinjas();

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
