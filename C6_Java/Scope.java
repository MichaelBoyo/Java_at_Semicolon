package C6_Java;

public class Scope {
    private static int x=1;

    public static void main(String[] args) {
        int x = 5;
        System.out.println("local x in main is "+ x);

        useLocalVariable();
        useField();

    }
    public static void useLocalVariable(){
        int x = 25;

        System.out.println("local x on entering method useLocalVariable is "+x);
        ++x;
        System.out.println("local x on entering method useLocalVariable is "+x);

    }

    public static void useField(){
        System.out.println("field x on entering method useField is "+ x);
        x*=10;
        System.out.println("field x on entering method useField is "+x);
    }

}
