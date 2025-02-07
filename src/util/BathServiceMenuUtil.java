package util;

import models.Machine;
import models.Pet;

import java.util.List;
import java.util.Scanner;


public class BathServiceMenuUtil {

    public static void displayPetMenu(Scanner scanner, Machine machine, PetsManager petsManager) {
        int option;
        do {
            System.out.println("\nServiços de Banho Pet");
            System.out.println("1 - Colocar pet na máquina;");
            System.out.println("2 - Verificar pet na máquina;");

            System.out.println("3 - Retirar pet da máquina;");
            System.out.println("1 - Dar banho no pet");

            System.out.println("5 - Limpar máquina");
            System.out.println("6 - Abastecer máquina");


            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("1 - Colocar pet na máquina");
                    MachineUtil.placePetInside(scanner, machine, petsManager.getPets());
                    break;
                case 2:
                    System.out.println("2 - Verificar pet na máquina");
                    MachineUtil.checkVacancy(scanner, machine);
                    break;
                case 3:
                    System.out.println("3 - Retirar pet da máquina");
                    MachineUtil.takePetFromMachine(scanner, machine);
                    break;
                case 4:
                    System.out.println("4 - Banhar pet");
                    MachineUtil.startBathProcess(scanner, machine);
                    break;
                case 5:
                    System.out.println("5 - Limpar máquina");
                    MachineUtil.cleanMachine(scanner, machine);
                    break;
                case 6:
                    System.out.println("6 - Abastecendo a máquina");
                    MachineUtil.refuelMachine(scanner, machine);
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (option != 0);
    }
}