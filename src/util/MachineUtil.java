package util;

import java.util.List;
import java.util.Scanner;

import models.Pet;
import models.Machine;

public class MachineUtil {

    public static void cleanMachine(Scanner scanner, Machine machine) {
        machine.setMachineDirt(false);
        System.out.println("\nA máquina foi limpa");
    }

    public static void refuelMachine(Scanner scanner, Machine machine) {
        System.out.println("\nA máquina tem :");
        System.out.println(machine.getShampooTankLevel() + " litros de shampoo");
        System.out.println(machine.getWaterTankLevel() + "litros de água");

        if(machine.getWaterTankLevel() <30 ) {
            machine.fillWaterTank();
            System.out.println("\nO tanque de Água aumentou 2 litros e agora tem :" + machine.getWaterTankLevel());
        }

        if(machine.getShampooTankLevel() <30 ) {
            machine.fillShampooTank();
            System.out.println("\nO tanque de Shampoo aumentou 2 litros e agora tem :" + machine.getShampooTankLevel());
        }
    }

    public static String checkVacancy(Scanner scanner, Machine machine) {
        machine.isMachineFull();
        return "A máquina está vazia";
    }

    public static void placePetInside(Scanner scanner, Machine machine, List<Pet> pets) {
       if (machine.isMachineFull()) {
           System.out.println("Falha: A máquina está lotada");
        }

       if (machine.isMachineDirt()) {
           System.out.println("Falha: A máquina está suja");
       }

        System.out.println("\nListando Pets Cadastrados");
        pets.forEach(System.out::println);

        System.out.print("Insira o ID do Pet: ");

        int petId = scanner.nextInt();

        pets.stream().filter(
                i -> i.getId() == petId
        ).findFirst().ifPresent(machine::setPetInside);

        System.out.println("Sucesso: O pet foi para a máquina");
    }

    public static void startBath(Scanner scanner, Machine machine) {
        if (machine.getPetInside() == null) {
            System.out.println("Falha: Nenhum pet foi colocado na máquina");
            return;
        }

        if (machine.isMachineDirt()) {
            System.out.println("Falha: A máquina está suja");
            return;
        }
        System.out.println("Banhando pet");
    }
    public static void takePetFromMachine(Scanner scanner, Machine machine) {
        if (!machine.isMachineFull()) {
            System.out.println("A máquina já está vazia");
        }
        machine.retrievePetFromInside();
    }
}