package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }


    //listar todos os meu ninjas

    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

//Listar todos os Ninjas Por ID

 public NinjaModel ListarNinjasPorID(Long id){
     Optional<NinjaModel> ninjaporid = ninjaRepository.findById(id);
     return  ninjaporid.orElse(null);

 }

 //Criar um novo Ninja

 public NinjaModel criarNinja(NinjaModel ninja){
       return  ninjaRepository.save(ninja);
 }


//deletar o ninja  - tem que ser um metodo void

 public void deletarPorId(Long id){
        ninjaRepository.deleteById(id);


 }

 //Atualizar Ninja
    public  NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado){
        if(ninjaRepository.existsById(id)){
            ninjaAtualizado.setId(id);
            return  ninjaRepository.save(ninjaAtualizado);
        }
        return  null;


    }






}
