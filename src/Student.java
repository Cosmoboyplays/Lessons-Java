import java.util.Objects;

public class Student {
    String name;
    Integer grade;
    Integer age;


    public Student(String name, Integer grade, Integer age){
        this.name = name;
        this.grade = grade;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return Objects.equals(name, student.name) && Objects.equals(grade, student.grade) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade, age);
    }
}
