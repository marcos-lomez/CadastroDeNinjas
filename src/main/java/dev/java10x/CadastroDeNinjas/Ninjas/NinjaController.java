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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
  }

//Procura Ninja por ID  (create)
@GetMapping("/listar/{id}")
public NinjaModel listarNinjasPorID(@PathVariable Long id){
  return  ninjaService.ListarNinjasPorID(id);

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
@DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id) {
    ninjaService.deletarPorId(id);

}

}
