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



}
