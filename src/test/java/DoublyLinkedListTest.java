import linkedlist.DoublyLinkedList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kevinparker on 4/18/18.
 */
public class DoublyLinkedListTest {
    DoublyLinkedList<String> list;

    @Before
    public void setUp() throws Exception {
        System.out.println("DoublyLinkedListTest.setUp");
        list = new DoublyLinkedList<>();
    }

    @Test
    public void add() throws Exception {
        list.add("Beginning");

    }

    @Test
    public void add1() throws Exception {

    }


    @Test(expected=IndexOutOfBoundsException.class)
    public void getTest(){
        list.add("Hello");
        assertEquals(list.get(0), "Hello");
        list.get(-1);
        list.get(1000);

    }

}