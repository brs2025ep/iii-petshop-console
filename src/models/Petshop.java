package models;

import config.ServiceLocator;
import services.PetBathingService;

public class Petshop {
    private String name;
    private PetBathingService petBathingService;

    public Petshop(String name, PetBathingService petBathingService) {
        this.name = name;
        this.petBathingService = petBathingService;
    }

    public String getName() {
        return this.name;
    }
    public void executeBath(Pet pet) {
        System.out.println("Petshop " + name + " realizando banho o Pet " + pet.getName());

    }
}
