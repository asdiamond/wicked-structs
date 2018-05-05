import java.lang.IllegalArgumentException;

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
     static class Node<T> {

        /**
         * The Next node
         */
        private Node<T> next;

        /**
         * The Prev node
         */
        private Node<T> prev;

        /**
         * The Data
         */
        public T data;


        /**
         * Constructor for Node
         *
         * @param data The data of this node
         */
        private Node(T data) {
            this(null, null, data);
        }

        /**
         * Constructs a node
         *
         * @param next The next node
         * @param prev The prev node
         * @param data The data of this node
         */
        private Node(Node<T> next, Node<T> prev, T data) {
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


    protected Node<T> head;
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

        if(index == 0){
            Node temp = new Node(head,null,e);
            if (head == null){
                head = new Node<T>(null,null,e);
            }
            head.setPrev(temp);
            head = temp;

            return;
        }
        Node<T> current = head.next;
        for(int i = 1; current == null; i++, current = current.next){
            if (i == index){
                Node<T> temp = new Node(current.next, current.prev,e);
                current.prev.next = temp;
                current.prev = temp;
            }
        }
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
     * @param index
     * @return
     * @throws IllegalArgumentException
     */
    public T get(int index) throws IndexOutOfBoundsException{
        if (head == null || index < 0)
            throw new IndexOutOfBoundsException("List is empty");
        Node<T> temp = head;
        for (int i = 0; temp.next == null; i++, temp = temp.next){
            if (i == index){
                return temp.data;
            }
        }

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
        if (head==null) return false;
        Node<T> temp = head;
        for (int i = 0; temp.next == null; ){
                if (temp.data.equals(e)){
                return true;
            }
        }
        return false;
    }

}
