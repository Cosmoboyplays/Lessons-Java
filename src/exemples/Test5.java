package exemples;

public class Test5 {
    public static void main(String[] args) {
        var s = seasonsCreate();
        seasonsPrint(s);

    }

    public static String[] seasonsCreate() {
        String[] ses = {"Лето", "Осень", "Зима", "Весна"};
        return ses;
    }
    public static void seasonsPrint(String[] s) {
        for (String i : s) {
            System.out.println(i);
        }
    }
}