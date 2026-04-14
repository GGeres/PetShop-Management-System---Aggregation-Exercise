
import java.util.ArrayList;
import java.util.List;

public class Animal {
    public String nome;
    public String especie;
    public String raca;
    public int idade;
    public double peso;

    //Agregação: Referência para um objeto Dono
    public Dono proprietario;

    //Agregação: Lista de referências para objetos Doença
    public List<Doenca> historicoMedico = new ArrayList<>();

    public Animal(String nome, String especie, String raca, int idade, double peso){
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
    }

    public void fazerBarulho(){
        if(especie.equalsIgnoreCase("Cachorro")){
            System.out.println(nome + " diz: Au Au!");
        } else if (especie.equalsIgnoreCase("Gato")) {
            System.out.println(nome + "diz: Miau!");
        } else{
            System.out.println(nome + " fez um barulho.");
        }
    }

    //Metodo para preencher a agragação de Dono
    public void associarDono(Dono d){
        this.proprietario = d;
    }

    //Metodo para preencher a agregação de Doença
    public void addDoenca(Doenca d){
        this.historicoMedico.add(d);
    }
}
