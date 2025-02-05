package models;


public class Pet {
    private final String name;
    private boolean isClean;

    public Pet(String name) {
        this.name = name;
        this.isClean = false;
    }
    public String getName() {
        return this.name;
    }
    
    public boolean getIsClean() {
        return this.isClean;
    }

    public void setIsClean(boolean clean) {
        this.isClean = clean;
    }

}
