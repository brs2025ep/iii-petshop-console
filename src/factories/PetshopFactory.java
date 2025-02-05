package factories;

import models.Petshop;
import services.PetBathingService;
import devices.PetBathManchine;

public class PetshopFactory {
    public static Petshop buildPetshop(String petshopName) {
        PetBathManchine machine = new PetBathManchine();
        PetBathingService petBathing = new PetBathingService(machine);
        return new Petshop(petshopName, petBathing);
    }
}
