package recursions;

public class ReverseString {
   /* public static String reverse(String str)
    {
        // TODO
        int length= str.length()-1;
        if(length<0){
            return "-1";
        }
        if( length == 0){
            return String.valueOf(str.charAt(0));
        }

        return str.charAt(str.length()-1)+ reverse(str.substring(0,length));

    }*/

    public static String reverse(String str)
    {
        if (str.isEmpty())
            return str;
        //Calling Function Recursively
        return reverse(str.substring(1)) + str.charAt(0);
    }



    public static void main(String[] args) {
        String str1 = "java".substring(0);
        System.out.println(str1);
        System.out.println(reverse("Java"));
    }
}
