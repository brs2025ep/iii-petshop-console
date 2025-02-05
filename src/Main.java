import factories.PetshopFactory;
import models.Pet;
import models.Petshop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Petshop petshop = PetshopFactory.buildPetshop("Petshop da Dona Maria");
        Pet pet1 = new Pet("spike");
        petshop.executeBath(pet1);


        Scanner scanner = new Scanner(System.in);

        // Exibe o menu para o usuário
        System.out.println("Menu:");
        System.out.println("1 - App A");
        System.out.println("2 - App B");
        System.out.println("3 - Sair");
        System.out.print("Digite uma opção: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Cadastrar Pet");

//                AplicacaoA.aplicacaoAMenu();
                break;
            case 2:
//                AplicacaoB.aplicacaoBMenu();
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}