package dev.java._x.CadastroDeNinjas.Ninjas;

import dev.java._x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;

@Entity
@Table(name ="tb_cadastro")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;
 private String nome;

 @Column(unique = true)
 private String email;

 private int idade;

// um ninja tem uma unica missao
 @ManyToOne
 @JoinColumn(name = "missoes_id")
private  MissoesModel missoes;






}
