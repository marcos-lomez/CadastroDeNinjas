package edv.java._x.cadastroDeNinjas.Ninjas.Controller.Missoes;


import edv.java._x.cadastroDeNinjas.Ninjas.Controller.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
 @Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private  String nome;

    private  String dificuldade;


    // uma missao pode ter varios ninjas
      @OneToMany(mappedBy = "missoes")

   private List<NinjaModel>ninjas;








}
