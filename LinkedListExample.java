// Importing required classes
import java.util.*;

// Node class
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

// SinglyLinkedList class
class SinglyLinkedList {
    Node head;

    SinglyLinkedList() {
        head = null;
    }

    // Method to add a node at the beginning of the linked list
    void add(int data) {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    // Method to remove a node with a specific data value
    void remove(int data) {
        Node current = head;
        Node previous = null;

        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            if (previous != null) {
                previous.next = current.next;
            } else {
                head = current.next;
            }
        }
    }

    // Method to print the linked list
    void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

// Main class
public class LinkedListExample {

    // Driver code
    public static void main(String args[]) {
        // Creating an object of the linked list
        SinglyLinkedList linkedList = new SinglyLinkedList();

        // Adding elements to the linked list
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        // Printing the linked list
        System.out.println("Linked List:");
        linkedList.printList();

        // Removing elements from the linked list
        linkedList.remove(2);
        linkedList.remove(4);

        // Printing the modified linked list
        System.out.println("Modified Linked List:");
        linkedList.printList();
    }
}
