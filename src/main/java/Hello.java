/**
 * Author: Aleksandr Diamond on 4/18/2018
 * Assignment: wickedstructs
 * Purpose:
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println(
                "Hello?"
        );

        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        list.add(0, new Integer(1));

        list.remove(1);
    }
}
