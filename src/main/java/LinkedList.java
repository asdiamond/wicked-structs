/**
 * A Linked List of type T that has order, does
 * not allow for null elements, allows duplicate
 * elements
 */
public class LinkedList<T> {
    class Node{

    }

    private Node head;
    private Node tail;

    public LinkedList(){
        head = null;
        tail = null;
    }

    /**
     *
     * @param list
     */
    public LinkedList(LinkedList list){

    }

    /**
     * Adds element to top of list
     * @param e The Element to be added
     */
    public void add(T e){
        add(0, e);
    }

    /**
     *
     * @param index the index to be added at
     * @param e the element to be added
     */
    public void add(int index, T e){

    }

}
