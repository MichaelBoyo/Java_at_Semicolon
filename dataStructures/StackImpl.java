package dataStructures;

public class StackImpl implements HashStack{
    private ArrayList stack = new ArrayList();
    @Override
    public String peek() {
        return stack.get(stack.size() - 1);
    }

    @Override
    public String pop() {
        String lastItem = stack.get(stack.size()-1);
        stack.remove(lastItem);
        return lastItem;
    }

    @Override
    public void push(String item) {
        stack.add(item);
    }

    @Override
    public boolean empty() {
        return stack.isEmpty();
    }

    @Override
    public int search(String item) {
        int count = 0;
        for (int i = 0; i <stack.size() ; i++) {
            if (stack.get(i).equals(item)){
                return count;
            }
            count++;
        }
        return -1;
    }

    public int size(){
        return stack.size();
    }
}
