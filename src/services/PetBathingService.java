package services;

import devices.PetBathManchine;
import models.Pet;

public class PetBathingService {

    private PetBathManchine machine;


    public PetBathingService(PetBathManchine machine) {
        this.machine = machine;
    }

    private void executeBathFromService(Pet pet) {
        System.out.println("Iniciando banho do pet");
        machine.start();
        machine.executeBathFromMachine(pet);
        machine.turnoff();
        pet.setIsClean(true);
    }
}
