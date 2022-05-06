package C5_Java;

public class DeMorgansLaw {
    public static void main(String[] args) {
        int x = 0,y = 0;
        boolean B = !(x < 5) && !(y >= 7);
        boolean c=!((x < 5)||(y >= 7));
        System.out.println(B==c);

        int a=0,g=0,b=0;
       boolean e= !(a == b) || !(g != 5);
       boolean f=!((a==b)&&(g!=5));
        System.out.println(e==f);

        boolean d=!((x <= 8) && (y > 4));
        boolean p=!(x <= 8)||!(y > 4);
        System.out.println(d==p);

        int i=0,j=0;
        boolean h=!((i > 4) || (j <= 6));
        boolean q= !(i > 4) && !(j <= 6);
        System.out.println(h==q);

    }
}
