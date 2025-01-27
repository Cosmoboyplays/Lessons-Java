
public class countChars {
    public static void main(String[] args) {
        System.out.println(countChars("OpPa", 'p'));
    }
    public static int countChars(String str, char ch) {
        str = str.toLowerCase();
        ch = Character.toLowerCase(ch);
        var result = 0;
        int i = 0;


        while (i < str.length()) {
            if (str.charAt(i) == ch ) {
                result += 1;
            }
            i += 1;
        }
        return  result;
    }
}