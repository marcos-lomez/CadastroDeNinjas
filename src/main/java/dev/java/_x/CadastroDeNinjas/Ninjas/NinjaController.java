package dev.java._x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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
@GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
}


    //Mostrar Ninja por ID  (read)

    @GetMapping("/listaID/{id}")
    public NinjaModel listarNinjaid (@PathVariable Long id){
    return ninjaService.listarNinjaid(id);
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
