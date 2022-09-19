package recursions;

public class FindFirstUppercase {

    static char first(String str) {
        //   TODO
        if(str.isEmpty()) {
            return ' ';
        }
        if (str.charAt(0) >= 65 && str.charAt(0) <= 91)
            return str.charAt(0);

        return first(str.substring(1, str.length()));

    }

    public static void main(String[] args) {
        System.out.println(first("jDvU"));
    }
}
