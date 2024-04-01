package Personage;

public class Personage {
    private String id;
    private char breed;
    private int energyLevel;
    private int offensiveCapacity;
    private int defensiveCapacity;

    public Personage(String id, char breed, int energyLevel, int offensiveCapacity, int defensiveCapacity) {
        this.id = id;
        this.breed = breed;
        this.energyLevel = energyLevel;
        this.offensiveCapacity = offensiveCapacity;
        this.defensiveCapacity = defensiveCapacity;
    }

    public Personage() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getBreed() {
        return breed;
    }

    public void setBreed(char breed) {
        this.breed = breed;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int getOffensiveCapacity() {
        return offensiveCapacity;
    }

    public void setOffensiveCapacity(int offensiveCapacity) {
        this.offensiveCapacity = offensiveCapacity;
    }

    public int getDefensiveCapacity() {
        return defensiveCapacity;
    }

    public void setDefensiveCapacity(int defensiveCapacity) {
        this.defensiveCapacity = defensiveCapacity;
    }

    @Override
    public String toString() {
        return "****Personaje****" + "\n" +
                "Nombre= " + id + "\n" +
                "Raza= " + breed + "\n" +
                "Nivel de energía= " + energyLevel + "\n" +
                "offensiveCapacity= " + offensiveCapacity + "\n" +
                "defensiveCapacity= " + defensiveCapacity + "\n";
    }
}
