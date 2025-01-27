public class encrypt {
    public static void main(String[] args) {
        System.out.println(encrypt("go!"));

    }
    public static String encrypt(String str) {
        var result = "";
        var len = str.length();

        for (int i = 0; i <= len; i += 2) {
            if (i < len-1) {
                result = result + str.charAt(i+1) + str.charAt(i);
            }
            else if (i == len-1) {
                result = result + str.charAt(i);
            }
            else return result;
        }
        return result;
    }
}

//Вам предстоит написать программу, которая шифрует сообщения по следующему алгоритму: она берёт текст и переставляет в нём каждые два подряд идущих символа.
//
//Если количество символов нечётное, то последний символ остаётся на своём месте:
//
//encrypt("move"); // "omev"
//encrypt("attack"); // "taatkc"
//// Если число символов нечётное,
//// то последний символ остается на своем месте
//encrypt("go!"); // "og!"
//Реализуйте статический метод App.encrypt(), который принимает на вход исходное сообщение и возвращает зашифрованное.