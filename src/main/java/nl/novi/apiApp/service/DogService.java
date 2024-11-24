package nl.novi.apiApp.service;

public class DogService {

    private String name;
    private String breed;
    private double age;

    public DogService(String name, String breed, double age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String bark() {
        return "Woof!";
    }
}
