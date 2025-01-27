import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class EnumCheck {
    public static void main(String[] args) {
        Enuum en = Enuum.C;
        System.out.println(en.ordinal());

        List<String> list = new ArrayList<>();

    }
}

//    private static final int dog = 0;
//    private static final int cat = 1;
//    private static final int frog = 2;
//
//    public static void main(String[] args){
//        int Animal = dog;
//
//        switch (Animal){
//            case dog:
//                System.out.println("Собака");
//                break;
//            case cat:
//                System.out.println("Кот");
//                break;
//            case frog:
//                System.out.println("Лягуха");
//                break;
//            default:
//                System.out.println("Не животное");
//        }

