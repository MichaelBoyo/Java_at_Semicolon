package C6_Java;


import java.util.Scanner;

public class BeautifyingStrings {
    private static String addFullStop(String string){
        String result = null;
        int n = string.length();

        char last= string.charAt(n-1);
        if (last !='.'){
           result =string +'.';
        }
        return result;
    }
    private static String capitalizeFirstLetter(String string){
        String result;
        String upper = string.toUpperCase();
        char firstUpper = upper.charAt(0);
        char firstString = string.charAt(0);

        boolean uppercase = Character.isUpperCase(firstString);
        if(uppercase){
            result= string;
        }else{
            result = firstUpper+string.substring(1);
        }
        return result;
    }
    private static String beautifyString(String string){
        String s = capitalizeFirstLetter(string);
       return addFullStop(s);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a word:");
        String in = input.next();
        System.out.println("your word has been to: "+beautifyString(in));
    }
}
