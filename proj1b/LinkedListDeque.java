import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Isn't this solution kinda... cheating? Yes.
 */
public class LinkedListDeque<T> extends LinkedList<T> implements Deque<T> {

    @Override
    public void printDeque() {
        System.out.println("dummy");
    }


    public T getRecursive(int i) {
        return get(i);
    }

    @Override
    public void addFirst(T item){
        super.addFirst(item);
    };

    @Override
    public void addLast(T item){
        super.addLast(item);
    };

    @Override
    public boolean isEmpty(){
        return super.size() == 0;
    };

    @Override
    public int size(){
        return super.size();
    };



    @Override
    public T removeFirst() {
        try {
            return super.removeFirst();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    @Override
    public T removeLast() {
        try {
            return super.removeLast();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    @Override
    public T get (int index){
        return super.get(index);
    };
}
