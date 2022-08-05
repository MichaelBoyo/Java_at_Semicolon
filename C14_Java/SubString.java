package C14_Java;

public class SubString {
    public static void main(String[] args) {
        String letters = "abcdefghijklmabcdefghikjlm";
        System.out.printf("Substring from index 20 to end is \"%s\"%n",
                letters.substring(20));
        System.out.printf("%s \"%s\"%n",
                "Substring from index 3 up to, but not including, 6 is",
                letters.substring(3, 6));

        String s1 = "happy ";
        String s2 = "Birthday";
        System.out.println(s1.concat(s2));
        System.out.println("   yolo  -1  ".trim());
        StringBuilder buffer = new StringBuilder();
        buffer.insert(0, 12);
        System.out.println(buffer);

    }
}
