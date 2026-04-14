public class MainPetShop {
    public static void main(String[] args) {
        // 1. Instanciar 2 Donos
        Dono dono1 = new Dono("Carlos Silva", "123.456.789-00", "(11) 98888-7777", "Rua A, 100");
        Dono dono2 = new Dono("Gabriel Torres", "987.654.321-11", "(21) 99999-8888", "Rua B, 200");

        // 2. Instanciar 2 Doenças
        Doenca d1 = new Doenca("Parvovirose", "CID-V01", "Vômito, Diarreia, Prostração", true, 5);
        Doenca d2 = new Doenca("Dermatite Alérgica", "CID-D05", "Coceira, Vermelhidão", false, 2);

        // 3. Instanciar 2 Veterinários
        Veterinario v1 = new Veterinario("Dr. Arthur", "CRMV-SP 1234", "Clinica Geral", 5000.0);
        Veterinario v2 = new Veterinario("Dra. Luana", "CRMV-SC 5678", "Dermatologia", 6500.0);

        // 4. Instanciar 2 Animais
        Animal a1 = new Animal("Rex", "Cachorro", "Pastor Alemão", 3, 35.0);
        Animal a2 = new Animal("Mingau", "Gato", "Siamês", 2, 4.5);

        // 5. Preencher as agragações

        // Associando os Donos aos Animais
        a1.associarDono(dono1); //Rex pertence a Carlos
        a2.associarDono(dono2); // Mingau pertence a Gabriel

        // Adicionando Doenças ao Histórico (Agregação)
        a1.addDoenca(d1); // Rex teve Parvovirose
        a1.addDoenca(d2); // Rex teve Dermatite também

        a2.addDoenca(d2); // Mingau teve Dermatite

        // 6. Testando comportamentos e Mostrando relações
        System.out.println("--- Dados do PetShop ---");
        System.out.println("Animal: " + a1.nome + " | Dono: " + a1.proprietario.nome);
        System.out.println("Historico de "+ a1.nome + ":");
        for(Doenca d : a1.historicoMedico){
            System.out.println(" - " + d.nome);
        }

        System.out.println("\n--- Atendimento ---");
        v2.prescreverTratamente(a1, "Shampoo especial para dermatite");
        //v1.prescreverTratamente(a2, "Creme para a pele para a dermatite");
    }
}
