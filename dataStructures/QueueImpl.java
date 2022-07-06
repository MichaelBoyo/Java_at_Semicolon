package dataStructures;

public class QueueImpl implements Queue{
    private ArrayList queue = new ArrayList();
    @Override
    public void addItem(String item) {
        queue.add(item);
    }

    @Override
    public void removeItem(String item) {
        queue.remove(item);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String peek() {
        return queue.get(queue.size()-1);
    }

    @Override
    public String poll() {
        if(queue.isEmpty()){
            return null;
        }
        var obj = queue.get(0);
        queue.remove(obj);
        return obj;
    }

    @Override
    public String set(int index, String item) {
        for (int i = 0; i < queue.size(); i++) {
            if(i == index){
                queue.add(item);
            }
        }
        return item;
    }

    @Override
    public String get(int index) {
        return queue.get(index);
    }

    @Override
    public void clear() {
       queue.clear();
    }
}
