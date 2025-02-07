package models;


import java.util.List;
import java.util.Scanner;
import models.Pet;

public class Machine {

    private int waterTankLevel = 30;
    private int shampooTankLevel = 10;
    private boolean machineDirt = false;
    private Pet petInside = null;

    public int getWaterTankLevel() {
        return this.waterTankLevel;
    }

    public int getShampooTankLevel() {
        return this.shampooTankLevel;
    }

    public void fillWaterTank() {
        this.waterTankLevel += 2;
    }

    public void fillShampooTank() {
        this.shampooTankLevel += 2;
    }

    public void executeBathFromMachine(Pet pet) {
        System.out.println("Banhando o pet " + pet.getName());
    };

    // 7 - Colocar pet no interior da máquina
    public void placePetInside(Pet pet) {
        this.petInside = pet;
    }

    public void retrievePetFromInside() {
        this.petInside = null;
    }

    public boolean isMachineDirt () {
        return machineDirt;
    }

    public boolean isMachineFull () {
        return petInside
    }

    public void setMachineDirt(boolean state) {
        this.machineDirt = state;
    }
}
