package dataStructures;

public class Set implements HashSet{
    private ArrayList set = new ArrayList();

    @Override
    public void addItem(String item) {
        for (int i = 0; i <set.size() ; i++) {
            if(set.get(i).equals(item)){
                set.remove(set.get(i));
                set.add(item);
                return;
            }
        }
        set.add(item);
    }

    @Override
    public void removeItem(int index) {
        for (int i = 0; i <set.size(); i++) {
            if (i==index){
                set.remove(set.get(i));
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public int size() {
        return set.size();
    }
    public String getItem(int index){
        for (int i = 0; i <set.size() ; i++) {
            if(i == index){
                return set.get(i);
            }
        }
        return null;
    }
}
