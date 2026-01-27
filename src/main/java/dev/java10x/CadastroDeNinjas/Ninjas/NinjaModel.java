package dev.java10x.CadastroDeNinjas.Ninjas;
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
    @Column(name = "id")
   long id;
   @Column(name = "nome")
   private String nome;

   @Column(unique = true)
   private String email;

   @Column(name = "idade")
   private int idade;

    @Column(name = "imgUrl")
   private String imgUrl;

   @ManyToOne
   @JoinColumn(name="missoes_id") // foreina key ou chave estrangeira
   private List<MisooesModel> missoes;


}
