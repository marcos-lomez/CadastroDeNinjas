package dev.java._x.CadastroDeNinjas.Ninjas;

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


public List<NinjaModel> listarNinjas() {
        return  ninjaRepository.findAll();
}

public  NinjaModel listarNinjaid(Long id){
    Optional<NinjaModel> ninjaPorid = ninjaRepository.findById(id);
    return ninjaPorid.orElse(null);
}











}
