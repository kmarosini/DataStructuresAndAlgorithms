package hr.dsalgo;

import hr.dsalgo.doublylinkedlist.DoublyLinkedList;
import hr.dsalgo.linkedlist.LinkedList;
import hr.dsalgo.stack.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.printStack();
        stack.getHeight();
        stack.getTop();

    }
}