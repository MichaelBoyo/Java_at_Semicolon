package C12_Java;

public class MyStrings {
    private char[] charArray;

    public MyStrings(String s) {
        this.charArray = s.toCharArray();
    }

    public static void main(String[] args) {
        MyStrings s = new MyStrings("ehis");
        int a = s.indexOf("is", true);
        System.out.println(a);
    }

    public int indexOf(char cha, boolean ignoreCase) {
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == cha) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(String subString, boolean ignoreCase) {
        char[] subStringChars = subString.toCharArray();
        int length = subString.length();
        int s = 0;
        char[] ch = new char[length];
        for (int i = 0; i < charArray.length; i++) {

            for (int j = s; j < length + s; j++) {
                if (s == charArray.length) return -1;
                if(length>1 && s == charArray.length -1)return -1;
                ch[j - s] = charArray[j];
            }
            for (int j = 0; j < length; j++) {
                if(ignoreCase){
                    if (String.valueOf(ch[j]).equalsIgnoreCase(String.valueOf(subStringChars[j]))) {
                        if (j == length - 1) return i;
                    } else{ s++; break;}
                }else{
                    if(ch[j] == subStringChars[j]){
                        if (j == length - 1) return i;
                    }else{ s++;break;}
                }
            }
        }
        return -1;
    }

}