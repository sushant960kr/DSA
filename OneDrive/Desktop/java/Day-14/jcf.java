import java.util.*;

public class jcf {
    public static void main(String[] args) {
        // Create LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // ✅ Adding elements
        list.add("A");
        list.add("B");
        list.add("C");
        list.addFirst("Start"); // add at beginning
        list.addLast("End");    // add at end
        System.out.println("After adding: " + list);

        // ✅ Accessing elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // ✅ Modifying
        list.set(2, "X"); // replace element at index 2
        System.out.println("After set: " + list);

        // ✅ Removing
        list.remove();           // removes first element
        list.removeLast();       // removes last element
        list.remove("B");        // removes object "B"
        System.out.println("After removing: " + list);

        // ✅ Queue/Deque functions
        list.offer("Y");         // add at end
        list.offerFirst("Z");    // add at start
        list.offerLast("W");     // add at end
        System.out.println("After offer: " + list);

        System.out.println("poll(): " + list.poll());       // remove and return first
        System.out.println("pollLast(): " + list.pollLast());// remove and return last
        System.out.println("peek(): " + list.peek());       // get first (not remove)
        System.out.println("peekLast(): " + list.peekLast());// get last (not remove)
        System.out.println("After poll & peek: " + list);

        // ✅ Searching
        System.out.println("Contains 'X'? " + list.contains("X"));
        System.out.println("Index of 'X': " + list.indexOf("X"));
        System.out.println("Last index of 'X': " + list.lastIndexOf("X"));

        // ✅ Iterating
        System.out.println("Forward iteration:");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();

        System.out.println("Backward iteration:");
        Iterator<String> it = list.descendingIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // ✅ Clear
        list.clear();
        System.out.println("After clear: " + list);
    }
}
