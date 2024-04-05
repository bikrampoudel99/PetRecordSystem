package petrecordsystem;

public abstract class Animal {
    private String petId;
    private String name;
    private String owner;


    public Animal(String petId, String name, String owner) {
        this.petId = petId;
        this.name = name;
        this.owner = owner;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void display()
    {
        System.out.println("Pet id: "+getPetId());
        System.out.println("Pet name: "+getName());
        System.out.println("Pet Owner: "+getOwner());
    }
    public abstract void makeSound();

}
