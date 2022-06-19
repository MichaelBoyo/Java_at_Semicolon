package gigs;

import java.net.URI;

public class CuriosityGigs {
    public static void main(String[] args) {
        try{
            URI uri = new URI("https://forms.gle/w1hGgJu35TpMpMCY7");
            java.awt.Desktop.getDesktop().browse(uri);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
