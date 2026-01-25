package dev.java10x.CadastroDeNinjas.Ninjas.Controller;
import dev.java10x.CadastroDeNinjas.missoes.MisooesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class NinjaModel {
//alteração
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   long id;
   private String nome;

   private String email;

   private int idade;

   @ManyToOne
   @JoinColumn(name="missoes_id") // foreina key ou chave estrangeira
   private List<MisooesModel> missoes;

}
