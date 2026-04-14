public class Dono {
    public String nome;
    public String cpf;
    public String fone;
    public String endereco;
    public boolean clienteAtivo;

    public Dono(String nome, String cpf, String fone, String endereco){
        this.nome = nome;
        this.cpf = cpf;
        this.fone = fone;
        this.endereco = endereco;
        this.clienteAtivo = true; // Cliente Novo começa ativo
    }

    public void atualizarContato(String novoFone){
        this.fone = novoFone;
        System.out.println("Telefone de "+ nome + " atualizado.");
    }
}
