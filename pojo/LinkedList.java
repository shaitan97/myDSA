package pojo;

public class LinkedList {

    //head of the linked list
    public ListNode head;

    //method to push the nodes
    public void push(int data) {
        ListNode newNode = new ListNode();
        newNode.val = data;
        newNode.next = head;
        head = newNode;
    }
}
