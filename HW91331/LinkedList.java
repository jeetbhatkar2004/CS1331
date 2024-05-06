//I worked on the homework assignment alone, using only course materials.
import java.util.ArrayList;
import java.util.NoSuchElementException;
/**
 * /**
 *@author Jeet Bhatkar
 @version 1.0
 @param <T>
 This class represents a linked list
 */

public class LinkedList<T> {
    /**
     *
     */
    private Node<T> head;
    private int size;

    /**
     *
     */
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    /**
     * @param data data
     * @param index indez of the head
     */
    public void addAtIndex(T data, int index) {
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Index out of bounds.");
        }

        if (index == 0) {
            head = new Node<>(data, head);
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            current.setNext(new Node<>(data, current.getNext()));
        }
        size++;
    }

    /**
     * @param index index
     * @return retuens data
     */
    public T removeFromIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index out of bounds.");
        }

        T removedData;

        if (index == 0) {
            removedData = head.getData();
            head = head.getNext();
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            removedData = current.getNext().getData();
            current.setNext(current.getNext().getNext());
        }
        size = size - 1;
        return removedData;
    }

    /**
     *  returns nothing
     */
    public void clear() {
        if (head == null) {
            throw new NoSuchElementException("LinkedList is already empty.");
        }

        head = null;
        size = 0;
    }

    /**
     * @param index index
     * @return return data
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Index out of bounds.");
        }

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }

    /**
     * @return returns size
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * @return retuens list  ew
     */
    public ArrayList<T> toArrayList() {
        ArrayList<T> list = new ArrayList<>();
        Node<T> current = head;
        while (current != null) {
            list.add(current.getData());
            current = current.getNext();
        }
        return list;
    }

    /**
     * @return returns new list
     */
    public LinkedList<String> fizzBuzzLinkedList() {
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            int position = i + 1;
            T data = get(i);

            if (position % 3 == 0 && position % 5 == 0) {
                list.addAtIndex("FizzBuzz", i);
            } else if (position % 3 == 0) {
                list.addAtIndex("Fizz", i);
            } else if (position % 5 == 0) {
                list.addAtIndex("Buzz", i);
            } else {
                list.addAtIndex(position + ": " + data.toString(), i);
            }
        }
        return list;
    }
}
