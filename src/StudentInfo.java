import java.util.ArrayList;

public class StudentInfo {
      void testStudents(ArrayList<Student> Al, StudentChecks sc){
          for (Student s: Al){
              if (sc.check(s)){
                  System.out.println(s);
              }
          }



      }
//        void goodstudetsOvergrade(ArrayList<Student> Al, int age){
//        for (Student s : Al) {
//            if (s.age>age){
//                System.out.println(s);
//            }
//        }
//    }

}
class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Pasha", 3, 20);
        Student st2 = new Student("Gena", 3, 23);
        Student st3 = new Student("Kris", 5, 29);


        ArrayList<Student> Al = new ArrayList<>();
        Al.add(st1);
        Al.add(st2);
        Al.add(st3);

        System.out.println(Al);

        StudentInfo info = new StudentInfo();
//        info.goodstudetsOvergrade(Al, 25);
        info.testStudents(Al, (Student s) -> {return s.age>25;});


    }
}

interface StudentChecks{
    boolean check(Student s);
}