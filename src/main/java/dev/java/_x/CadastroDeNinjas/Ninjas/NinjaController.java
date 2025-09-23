package dev.java._x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Ninjas")
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
@GetMapping("/listar")
    public  String mostrarTodosOsNinjas(){

        return "Mostar ninja";
}



    //Mostrar Ninja por ID  (read)

    @GetMapping("/listaID")
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
