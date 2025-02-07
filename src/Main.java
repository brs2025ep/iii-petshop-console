import util.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PetsManager petManager = new PetsManager();
        MachineManager machineManager = new MachineManager();

        petManager.addPet("Spike");
        petManager.addPet("Lup");
        petManager.addPet("Husk");
        petManager.addPet("Pin");
        petManager.addPet("Flare");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Serviço de Banho Pet " );
        System.out.println("1 - Cadastrar Novo Pet para Banho");
        System.out.println("2 - Exibir Fila de Pets");
        System.out.println("3 - Serviço de Banho Pet");
        System.out.println("4 - Sair");
        System.out.print("Digite uma opção: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("1 - Cadastro Pet");
                PetUtil.signUpPet(scanner);
                break;
            case 2:
                System.out.println("2 - Listando Pets");
                PetUtil.displayPetList(petManager.getPets());
                break;
            case 3:
                System.out.println("3 - Serviço de Banho Pet");
                BathServiceMenuUtil.displayPetMenu(scanner, machineManager.getMachine(), petManager);
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}