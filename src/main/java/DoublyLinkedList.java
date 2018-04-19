import com.sun.javaws.exceptions.InvalidArgumentException;

/**
 * A Doubly Linked List of type T that has order, does
 * not allow for null elements, allows duplicate
 * elements
 */
public class DoublyLinkedList<T> {
    /**
     * A Doubly Linked List Node
     * @param <T> The type of the data
     */
    private static class Node<T>{

        /**The Next node*/
        private Node<T> next;

        /**The Prev node*/
        private Node<T> prev;

        /**The Data*/
        private T data;


        /**
         * Constructor for Node
         * @param data The data of this node
         */
        private Node(T data){
            this(null, null, data);
        }

        /**
         * Constructs a node
         * @param next The next node
         * @param prev The prev node
         * @param data The data of this node
         */
        private Node(Node<T> next, Node<T> prev, T data){
            this.next = next;
            this.prev = prev;
            this.data = data;
        }

        private Node<T> getNext() {
            return next;
        }

        private void setNext(Node<T> next) {
            this.next = next;
        }

        private Node<T> getPrev() {
            return prev;
        }

        private void setPrev(Node<T> prev) {
            this.prev = prev;
        }
    }

    private Node<T> head;
    private Node<T> tail;

    public DoublyLinkedList(){
        head = null;
        tail = null;
    }

    /**
     *TODO make a general list implementation
     * @param list
     */
    public DoublyLinkedList(DoublyLinkedList list){

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

    /**
     * TODO make a general list implementation
     * @param list
     */
    public void add (DoublyLinkedList list){

    }

    /**
     * Removes element at specified index
     * @param index index of element to remove
     * @throws IndexOutOfBoundsException when index is out of bounds
     */
    public void remove(int index) throws IndexOutOfBoundsException{

    }

    /**
     * Removes element e from list if it exists
     * @param e element to be removed
     * @return true if list was modified
     */
    public boolean remove(T e){
        return false;
    }

    /**
     *
     * @param index lo
     * @return
     * @throws InvalidArgumentException
     */
    public T get(int index) throws InvalidArgumentException{
        return null;
    }

    /**
     * returns size of list
     * @return int representation of list length
     */
    public int size(){
        return 0;
    }

    /**
     * Returns true if e is within the list
     * @param e element to be found
     * @return true if element is found
     */
    public boolean contains(T e){
        return false;
    }

}
