package AnimalGeneric;

public class Animal {
    int id;

    public Animal(){}

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }

}
