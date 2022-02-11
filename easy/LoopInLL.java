package easy;

/* Detect a loop in a LinkedList.
This implementation uses Floyd's algorithm which uses two pointers
to travers the linked list. It has time complexity of O(n).
*/

//driver class
public class LoopInLL {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);

        linkedList.head.next.next.next = linkedList.head;

        linkedList.detect_loop();

    }
}


//linked list class
class LinkedList{

    //head of the linked list
    Node head;

    //inner class for node structure
    class Node{

        int data;
        Node next;
    }

    //method to push the nodes
    void push(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }

    //method which detects loops
    void detect_loop(){

        //initializing two pointers to head of the linked list
        Node slowPtr = head, fastPtr = head;

        //flag to mark as loop detected
        boolean loopFlag = false;

        //traversing the linked list
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next; //move one step ahead
            fastPtr = fastPtr.next.next; // move two steps ahead
            if (slowPtr == fastPtr){
                loopFlag = true; //set the flag if loop detected
                break;
            }
        }
        if (loopFlag)
            System.out.println("Detected loop in the Linked List");
        else System.out.println("No loop found");
    }
}