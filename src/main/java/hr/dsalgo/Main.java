package hr.dsalgo;

import hr.dsalgo.doublylinkedlist.DoublyLinkedList;
import hr.dsalgo.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(11);
        dll.append(2);
        dll.append(23);
        dll.append(7);

        System.out.println(dll.get(2).value);

    }
}