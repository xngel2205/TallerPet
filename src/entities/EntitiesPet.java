package entities;

public class EntitiesPet {

    private String name;
    private String species;
    private String breed;
    private int age;

    public EntitiesPet(String name, int age, String breed, String species) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
