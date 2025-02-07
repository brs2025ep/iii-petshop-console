package config;

import models.Machine;
import services.PetBathingService;

public class ServiceLocator {
    public static PetBathingService petBathingService;

    public static PetBathingService getPetBathingService() {
        if (petBathingService == null) {
            petBathingService = new PetBathingService(new Machine());
        }

        return petBathingService;
    }
}
