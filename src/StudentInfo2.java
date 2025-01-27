import java.util.ArrayList;

public class StudentInfo2 {
    void strmethod(ArrayList<String> strList, checkBrathers cb ){
        for (String s: strList){
            System.out.println(cb.checkLength(s));
        }
    }

}

class Test22{
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Брат");
        strList.add("Брат2");
        strList.add("Брат3");
        strList.add("Брат33");

        System.out.println(strList);

        StudentInfo2 info = new StudentInfo2();
        info.strmethod(strList, (s) ->  {System.out.println( "Вывод из лямбды" + " " + s); return s.length();});

    }
}

interface checkBrathers{
     int checkLength(String str);
}


