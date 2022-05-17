package C6_Java;

public class Sports {
    public static final String a = "It’s a lovely weather for sports today!";
    public static final String b = "It’s reasonable weather for sports today";
    public static final String c = "Please exercise with care today, watch out for the weather!";

    public static String sportsRecommender(int celsius){
        String reccomendation = null;
        switch (celsius) {
            case 10, 40 -> reccomendation = b;
            case 20, 30 -> reccomendation = a;
            default -> {
                reccomendation = c;
            }
        }
        return reccomendation;
    }

    public static void main(String[] args) {
        System.out.println(sportsRecommender(10));
    }

}
