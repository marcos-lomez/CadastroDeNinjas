package dev.java10x.CadastroDeNinjas.missoes;

import dev.java10x.CadastroDeNinjas.Ninjas.Controller.NinjaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_missoes")
public class MisooesModel {


 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String nome;

private String dificuldade;

            @OneToMany(mappedBy = "missoes")
private NinjaModel ninja;




}
