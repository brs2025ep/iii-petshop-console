package models;


public class Pet {
    private int id;
    private final String name;
    private boolean isClean;

    public Pet(String name) {
        this.name = name;
        this.isClean = false;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    
    public boolean getIsClean() {
        return this.isClean;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String setName() {
        return this.name;
    }

    public void setIsClean(boolean clean) {
        this.isClean = clean;
    }

    @Override
    public String toString() {
        String state = "";
        if (this.isClean) {
            state = "Banho completo";
        } else {
            state= "Precisa de banho";
        }
        return "ID:"+ id + "Nome: " + name + ", Estado: " + state;
    }

}
