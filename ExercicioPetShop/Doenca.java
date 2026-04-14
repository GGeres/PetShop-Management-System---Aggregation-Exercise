public class Doenca{
    public String nome;
    public String codigoCID;
    public String sintomasPrincipais;
    public boolean contagiosa;
    public int gravidade; //1 (Leve) e 5 (gravissima)

    public Doenca(String nome, String codigoCID, String sintomas, boolean contagiosa, int gravidade){
        this.nome = nome;
        this.codigoCID = codigoCID;
        this.sintomasPrincipais = sintomas;
        this.contagiosa = contagiosa;
        this.gravidade = gravidade;
    }

    public void exibirResumoClinico(){
        System.out.println("Desease: " + nome + " (CID: "+ codigoCID + ") - Gravidade: "+ gravidade);
    }

}