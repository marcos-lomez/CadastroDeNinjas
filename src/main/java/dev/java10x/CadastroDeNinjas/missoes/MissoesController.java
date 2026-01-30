package dev.java10x.CadastroDeNinjas.missoes;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {


   @GetMapping("/listar")
   public String listarMissao(){
       return "Missoes listadas com sucesso";
   }


  @PostMapping("/criar")
    public String criarMissao(){
      return "Missao Criada com sucesso";
  }

@PutMapping("/alterar")
    public String alterarMissao(){
      return "Missao alterada com sucesso";

}
@DeleteMapping("/deletar")
    public String deletarMissao(){
      return "missao deletada com sucesso";
}








}
