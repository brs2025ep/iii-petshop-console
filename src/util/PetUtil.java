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
}