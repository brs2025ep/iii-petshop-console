package models;


import java.util.Map;

public class Machine {

    private Map<String, Integer> level = Map.of(
            "water", 30,
            "shampoo", 10
    );
    private Map<String, Integer> consumption = Map.of(
            "water", 10,
            "shampoo", 2
    );
    private boolean machineDirt = false;
    private Pet petInside = null;

    public int getWaterTankLevel() {
        return this.level.get("water");
    }

    public int getShampooTankLevel() {
        return this.level.get("shampoo");
    }

    public void fillWaterTank() {
        int waterIncremet = 2;
        int currentWaterLevel = this.consumption.get("water");
        int newWaterLevel = currentWaterLevel + waterIncremet;

        consumption.put("water", newWaterLevel);
    }

    public void fillShampooTank() {
        int shampooIncremet = 2;
        int currentWaterLevel = this.consumption.get("shampoo");
        int newWaterLevel = currentWaterLevel + shampooIncremet;

        consumption.put("shampoo", newWaterLevel);
    }

    public void startBathProcess() {
        if (getWaterTankLevel() < 10 || getShampooTankLevel() < 2) {
            System.out.println("\nFalha: Nível insuficiente. \nÁgua:" + getWaterTankLevel() + "\n Shampoo:" + getShampooTankLevel());
        }
    }

    public Pet getPetInside() {
        return this.petInside = petInside;
    }

    public void setPetInside(Pet pet) {
        this.petInside = pet;
    }

    public void retrievePetFromInside() {
        this.petInside = null;
    }

    public boolean isMachineDirt () {
        return machineDirt;
    }

    public boolean isMachineFull () {
        if (petInside == null) {
            return false;
        }
        return true;
    }

    public void setMachineDirt(boolean state) {
        this.machineDirt = state;
    }
}
