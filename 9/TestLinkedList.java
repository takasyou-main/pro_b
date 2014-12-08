// TestLinkedList.java
import java.util.*;

public class TestLinkedList {
    public static void main(String[] args) {
	List list = new LinkedList();
	list.add(8);
	list.add(7);
	list.add(1);
	list.add(2);
	list.add(5);
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	Collections.reverse(list);
	System.out.println(list);
    }
}
