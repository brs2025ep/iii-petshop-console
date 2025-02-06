package util;

import java.util.Scanner;

public class PetBathServiceMenuUtil {

    public static void displayPetMenu(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\nServiços de Banho Pet");
            System.out.println("1 - Colocar pet na máquina;");
            System.out.println("1 - Verificar pet na máquina;");
            System.out.println("1 - Retirar pet da máquina;");
            System.out.println("1 - Dar banho no pet");

            System.out.println("1 - Ver níveis de água e shampoo");
            System.out.println("1 - Limpar máquina");

            System.out.println("2 - Abastecer com água;");
            System.out.println("3 - Abastecer com shampoo;");

            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Agendando Raio X do Braço...");
                    // Implementar agendamento (lógica específica para Braço)
                    break;
                case 2:
                    System.out.println("Agendando Raio X do Tórax...");
                    // Implementar agendamento (lógica específica para Tórax)
                    break;
                case 3:
                    System.out.println("Agendando Raio X da Perna...");
                    // Implementar agendamento (lógica específica para Perna)
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}