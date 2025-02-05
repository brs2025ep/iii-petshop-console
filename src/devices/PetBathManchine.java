package devices;


import models.Pet;

import java.util.List;

public class PetBathManchine {

    private int petSpots = 1;
    private int waterTankLevel = 30;
    private int shampooTankLevel = 10;
    private boolean isMachineOn = false;
    private boolean isMachineDirt = false;
    private List<Pet> petsInside;

    public void start() {
        System.out.println("A Máquina de Banho foi ligada");
        this.isMachineDirt = true;
    }

    public void turnoff() {
        System.out.println("A Máquina de Banho foi desligada");
        this.isMachineDirt = false;

    }
    // 4 - Checar nível de água
    public int getWaterTankLevel() {
        return this.waterTankLevel;
    }

    // 5 - Checar nível de shampoo
    public int getShampooTankLevel() {
        return this.shampooTankLevel;
    }

    // 2 - Abastecer com água
    private void fillWaterTank() {
        this.waterTankLevel += 2;
    }

    // 3 - Abastecer com shampoo
    private void fillShampooTank() {
        this.shampooTankLevel += 2;
    }

    // 7 - Colocar pet no interior da máquina
    private void positionPetInside(Pet pet) {
        if (this.isMachineDirt == true ) {
            System.out.println("Falha: A máquina está suja");
            return;
        }

        if (this.petSpots < 1) {
            System.out.println("Falha: A máquina não tem vaga para um novo pet.");
            return;
        }

        this.petSpots -= 1;

    }

    public void executeBathFromMachine(Pet pet) {
        System.out.println("Banhando o pet " + pet.getName());

    };

    private void retrievePetFromInside(Pet pet) {
        if(pet.getIsClean() != true ){
            this.isMachineDirt = true;
        }
        this.petSpots = 1;
    }

    // 6 - Checar pet no banho
    private boolean hasPetsInside() {
        if (this.petsInside.size() == 0) {
            return false;
        } else {
            return true;
        }
    }

    // 9 - LIMPAR MAQUINA
    private void cleanMachine() {
        this.isMachineDirt = false;
    }




}
