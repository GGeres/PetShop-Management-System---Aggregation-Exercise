# PetShop-Management-System---Aggregation-Exercise

classDiagram
    class Animal {
        +String nome
        +String especie
        +Dono proprietario
        +List~Doenca~ historicoMedico
        +fazerBarulho()
        +associarDono(Dono d)
    }
    class Dono {
        +String nome
        +String telefone
        +atualizarContato(String novo)
    }
    class Veterinario {
        +String nome
        +String crmv
        +prescreverTratamento(Animal a, String t)
    }
    class Doenca {
        +String nome
        +int gravidade
        +exibirResumoClinico()
    }

    Animal o-- Dono : agrega
    Animal o-- Doenca : agrega
