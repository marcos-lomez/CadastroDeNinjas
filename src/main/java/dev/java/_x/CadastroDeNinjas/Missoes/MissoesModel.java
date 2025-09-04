package dev.java._x.CadastroDeNinjas.Missoes;

import dev.java._x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_missoes" )
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {


     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private  String nome;

    private  String dificuldade;


    private NinjaModel ninja;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;


}
