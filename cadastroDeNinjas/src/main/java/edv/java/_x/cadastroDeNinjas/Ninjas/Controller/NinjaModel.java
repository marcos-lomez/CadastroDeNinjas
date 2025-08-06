package edv.java._x.cadastroDeNinjas.Ninjas.Controller;



import edv.java._x.cadastroDeNinjas.Ninjas.Controller.Missoes.MissoesModel;
import jakarta.persistence.*;



@Entity
@Table(name ="tb_cadastro")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private   String nome;

    private   String email;

    private   int idade;

    //UM NINJA UMA UNICA MISSAO

          @ManyToOne
          @JoinColumn(name ="missoes_id") //chave estrangeira
  private MissoesModel missoes;



public NinjaModel(){

}
public NinjaModel(String nome,String email ,int idade){
    this.nome = nome;
    this.email=email;
    this.idade=idade;

}


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
