public class Questão5 {
    public static void main(String[] args) {
        String string = "Ola mundo";
        System.out.println(inverteString(string));
    }

    public static String inverteString(String string) {
        String stringInvertida = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            stringInvertida += string.charAt(i);
        }
        return stringInvertida;
    }
}
