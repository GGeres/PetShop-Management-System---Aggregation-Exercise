public class Veterinario {
    public String nome;
    public String crmv;
    public String especialidade;
    public double salarioBase;
    public boolean emPlantao;

    public Veterinario(String nome, String crmv, String especialidade, double salario){
        this.nome = nome;
        this.crmv = crmv;
        this.especialidade = especialidade;
        this.salarioBase = salario;
        this.emPlantao = false;
    }

    public void prescreverTratamente(Animal animal, String tratamento){
        System.out.println("Dr(a). "+ nome + " prescreveu para "+ animal.nome + ": " + tratamento);
    }
}
