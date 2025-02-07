package util;

import java.util.List;
import java.util.Scanner;

import models.Pet;

public class PetUtil {

    public static void signUpPet(Scanner scanner) {
        System.out.println("\nCadastrar Pet");

        System.out.print("Insira o nome do Pet: ");
        String name = scanner.nextLine();


        System.out.println("\nPet cadastrado com sucesso:");
        System.out.println("Nome: " + name);
    }

    public static void displayPetList(List<Pet> pets) {
        System.out.println("\nListando Pets Cadastrados");

        pets.forEach(System.out::println);
        pets.forEach(pet -> {
            System.out.println("ID: " + pet.getId() + " Nome: " + pet.getName() + "Estado: " + pet.getIsClean());
        });
    }

    public static void sendPetToBath(Scanner scanner, List<Pet> petList) {
        System.out.println("\nListando Pets Cadastrados");

        System.out.print("Insira o ID do Pet: ");
        int petId = scanner.nextInt();

        petList.stream().filter(
                i -> i.getId() == petId
        ).findFirst().ifPresent(selectedPet -> System.out.println("\n Enviando pet: " + selectedPet.getId() + " - "+ selectedPet.toString()));
    }
}