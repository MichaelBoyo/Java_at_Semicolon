package C12_Java;

public class Strings {
    public static void main(String[] args) {
        String a = "abcdabcdabca";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a') {
                count++;
            }
        }
        int res = indexOff(a,'z');
//        System.out.println(res);
        MyStrings ab = new MyStrings("ehis");
        int result = ab.indexOf('a',true);
        result =ab.indexOf("is",true);
        System.out.println(result);
//        System.out.println(count);
    }
    public static int  indexOff(String ob, char find){
        char[] arr = ob.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] == find){
                return i;
            }
        }
        return -1;

    }


}
