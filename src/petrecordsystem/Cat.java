package petrecordsystem;

public class Cat extends Animal {
    private int age;

    public Cat(String petId, String name, String owner, int age) {
        super(petId, name, owner);
        this.age = age;
    }

    public void makeSound()
    {
        System.out.println("Meow Meow");
    }





}
