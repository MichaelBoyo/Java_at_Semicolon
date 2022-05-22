public class BooleanComparison {
    public boolean compare(String[] herray, String[] himray){
        if(herray.length==himray.length){
           return true;
        }
        for (int i = 0; i <herray.length ; i++) {
            if(herray[i]==himray[i]){
                return true;
            }
        }
        return false;
    }
}
