package Interfaces;


public class One implements Icharacters {
    int age;

    public One(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getStr() {
        return Icharacters.super.getStr()+" из класса";
    }
}
