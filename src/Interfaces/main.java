package Interfaces;

public class main {
    public static void main(String[] args) {
        Icharacters one = new One(2);
        System.out.println(one.getStr());


        // Приведение типа для доступа к методу getAge()
        One specificOne = null;
        if (one instanceof One) { // Проверяем, является ли one экземпляром класса One
            specificOne = (One) one;
            System.out.println(specificOne.getAge()); // Теперь можем вызвать getAge()
        }
        specificOne.setAge(65);
        System.out.println(specificOne.getAge());
        System.out.println(one.getStr());
    }
}

//В этом коде:
//
//Мы создаем объект класса One и присваиваем его переменной типа Icharacters.
//Используем оператор instanceof, чтобы проверить, является ли one экземпляром класса One.
//Если это так, мы приводим one к типу One и можем безопасно вызывать метод getAge().
//Такой подход позволяет вам использовать полиморфизм, сохраняя при этом возможность доступа к специфическим методам класса.

