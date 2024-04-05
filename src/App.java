import week16.tutorial.Animal;
import week16.tutorial.Cat;
import week16.tutorial.Cow;
import week16.tutorial.Dog;
import week16.tutorial.VegAnimal;

public class App {
    public static void main(String[] args){
        Cat cat = new Cat();
        showAnimalThings(cat);
        showAnimalThings(new Dog());
        showAnimalThings(new Cow());



    }
    public static void showAnimalThings(Animal animal)
    {
        animal.makeSound();
        animal.eat();
    }


}
