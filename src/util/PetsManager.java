package util;

import models.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetsManager {

    private List<Pet> pets;

    public PetsManager() {
        this.pets = new ArrayList<>();
    }

    public void addPet(String name) {
        Pet pet = new Pet(name);
        pet.setId(pets.size() + 1 );
        this.pets.add(pet);
    }

    public List<Pet> getPets() {
        return this.pets;
    }
}
