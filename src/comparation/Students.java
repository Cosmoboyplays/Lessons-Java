package comparation;

import java.util.Objects;

class Students implements Comparable<Students>{
    int id;
    String name;
    String surname;
    Integer salary;

    public Students(int id, String name, String surname, int salary){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public int compareTo(Students anotherstud) {
//        if (this.id == anotherstud.id ){
//            return 0;
//        }
//        else if (this.id < anotherstud.id ){
//            return -1;
//        }
//        else {return 1;}
        return this.id - anotherstud.id;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Students students)) return false;
        return id == students.id && Objects.equals(name, students.name) && Objects.equals(surname, students.surname) && Objects.equals(salary, students.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, salary);
    }
}