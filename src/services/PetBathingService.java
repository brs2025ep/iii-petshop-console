package services;

import models.Machine;
import models.Pet;

public class PetBathingService {

    private Machine machine;


    public PetBathingService(Machine machine) {
        this.machine = machine;
    }

    private void executeBathFromService(Pet pet) {
        System.out.println("Iniciando banho do pet");
        machine.executeBathFromMachine(pet);
        pet.setIsClean(true);
    }
}
