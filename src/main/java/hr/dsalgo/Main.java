package hr.dsalgo;

import hr.dsalgo.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList(4);
        linkedList.append(2);
        linkedList.removeFirst();
        linkedList.printList();

    }
}