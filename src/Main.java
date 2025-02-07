import util.BathServiceMenuUtil;
import util.MachineUtil;
import util.PetUtil;
import util.PetsManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PetsManager manager = new PetsManager();

        manager.addPet("Spike");
        manager.addPet("Lup");
        manager.addPet("Husk");
        manager.addPet("Pin");
        manager.addPet("Flare");

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
                PetUtil.displayPetList(manager.getPets());
                break;
            case 3:
                System.out.println("3 - Serviço de Banho Pet");
                BathServiceMenuUtil.displayPetMenu(scanner);
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