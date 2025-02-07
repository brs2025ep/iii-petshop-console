package models;


import java.util.Map;

public class Machine {

    private Map<String, Integer> level = Map.of(
            "water", 30,
            "shampoo", 10
    );
    private final Map<String, Integer> consumption = Map.of(
            "water", 10,
            "shampoo", 2
    );
    private boolean machineDirt = false;
    private boolean machineOn = false;
    private Pet petInside = null;

    public int getWaterTankLevel() {
        return this.level.get("water");
    }

    public void setWaterTankLevel(int waterLevel) {
        this.level.put("water", waterLevel);
    }

    public int getShampooTankLevel() {
        return this.level.get("shampoo");
    }

    public void setShampooTankLevel(int shampooLevel) {
        this.level.put("shampoo", shampooLevel);
    }

    public int getWaterConsumption(){
        return this.consumption.get("water");
    }

    public int getShampooConsumption(){
        return this.consumption.get("shampoo");
    }

    public Pet getPetInside() {
        return this.petInside;
    }

    public void setPetInside(Pet pet) {
        this.petInside = pet;
    }

    public boolean isMachineDirt() {
        return machineDirt;
    }

    public boolean isMachineOn() {
        return this.machineOn;
    }

    public void setMachineOn(boolean state) {
        this.machineOn = state;
    }

    public void setMachineDirt(boolean state) {
        this.machineDirt = state;
    }
}