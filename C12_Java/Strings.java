package C12_Java;

public class Strings {
    public static void main(String[] args) {
        String a = "abcdabcdabca";
        int count = 0;
        char[] ae = a.toCharArray();
//        char[] de = new char[a.length()];

        for (int i = 0; i <a.length();  i++) {
            if(a.contains("a")){
                ae[i] = 'x';
                a = a.replace("a", "X");
                count++;
            }
//            if(a.contentEquals("a")){
//                count++;
//            }
//            if(a.charAt(i) =='a'){
//                count++;
//            }
//            if(de[i] == 'a'){
//                count++;
//            }
        }
        System.out.println(count);
    }
}
