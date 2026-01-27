package dev.java10x.CadastroDeNinjas.missoes;
import java.util.List;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MisooesModel {


 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String nome;

private String dificuldade;

    @OneToMany(mappedBy = "missoes")
    private List <NinjaModel> ninjas;



}
