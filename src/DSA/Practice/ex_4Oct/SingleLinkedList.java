package DSA.Practice.ex_4Oct;

import java.sql.SQLOutput;

public class SingleLinkedList {

    // Node class
    static class Node {
        int data;  // This variable holds the data for the node
        Node next; // This variable holds the reference to the next node

        // Constructor to create a new node
        Node(int data) {
            this.data = data;  // Assign the provided data to this node
            this.next = null;  // Initially, the next node is null
        }
    }

    // Declaring head of the linked list
    Node head;

    // displaying the Linkedlist
    public void display(){
        Node current = head;

        while(current != null){
            System.out.print(current.data+ "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    // length of Linked list
    public int lengthOfLinkedlist(){
        int length = 0;
        Node current = head;
        if(current == null){
            return 0;
        }
        while (current != null){
            current = current.next;
            length++;
        }

        return length;
    }

    // Insert node at the beginning of the Linked list
    public void insertAtBeginning(int data){
          Node newNode = new Node(data);
          newNode.next = head;
          head = newNode;
    }

    // Insert node at the End of the Linked list
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node current = head;
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;
    }

    // Insert at a given position
    public void insertAtGivenPosition(int data, int position){


        // insert at beginning
        if(position == 1){
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        int index = 1;

        while(index < position -1){
            current = current.next;
            index++;
        }

        newNode.next = current.next;
        current.next = newNode;

    }

    //Delete first node of the linked list
    public void deleteFirstNode(){
        if(head == null) return;
        head = head.next;
    }

    // Delete last node of the linked list
    public void deleteLastNode(){
        // checking if no node or one is present
        if(head == null){
            return;
        }
        else if(head.next == null) {
            // instead of assigning the head to head.next which is null we can directly assign it
            // head = head.next;
            head = null;
            return;
        }

        Node current = head;
        Node prev = null;
        while(current.next != null){
            prev = current;
            current = current.next;

        }
        prev.next = null;
    }

    public static void main(String[] args) {
        SingleLinkedList Sl = new SingleLinkedList(); // Create an instance of SingleLinkedList
        Sl.head = new Node(10); // Create the first node with data 10

        // Create additional nodes
        Node second = new Node(1);
        Node third = new Node(8);
        Node fourth = new Node(11);

        // Linking the nodes together
        Sl.head.next = second;  // The first node points to the second node
        second.next = third;    // The second node points to the third node
        third.next = fourth;    // The third node points to the fourth node
        fourth.next = null;     // The fourth node points to null (end of the list)

        // displaying the linked list
        Sl.display();

        // displaying length of linked list
        System.out.println("Length of Linked list is "+ Sl.lengthOfLinkedlist());

        // inserting the Node at beginning
        Sl.insertAtBeginning(23);

        // Again displaying the Linked list after inserting at beginning
        Sl.display();

        // displaying length of linked list
        System.out.println("Length of Linked list is "+ Sl.lengthOfLinkedlist());

        // insert at End of Linked list
        Sl.insertAtEnd(40);
        Sl.insertAtEnd(48);

        // Again displaying the Linked list after inserting at beginning
        Sl.display();

        // displaying length of linked list
        System.out.println("Length of Linked list is "+ Sl.lengthOfLinkedlist());

        // display at given position
        Sl.insertAtGivenPosition(34,4);

        // display the linked list
        Sl.display();

        // Deleting the first node
        Sl.deleteFirstNode();

        // display the linked list
        System.out.println("Linked list after deleting the first element");
        Sl.display();

        // Deleting the last node
        Sl.deleteLastNode();

        // display
        Sl.display();

    }
}
