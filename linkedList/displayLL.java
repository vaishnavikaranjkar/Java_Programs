package linkedList;
/*
 * Create a class Node which has two attributes: data and next. Next is a pointer to the next node.
Create another class which has two attributes: head and tail.
addNode() will add a new node to the list:
Create a new node.
It first checks, whether the head is equal to null which means the list is empty.
If the list is empty, both head and tail will point to the newly added node.
If the list is not empty, the new node will be added to end of the list such that tail's next will point to the newly added node. This new node will become the new tail of the list.
a. display() will display the nodes present in the list:

Define a node current which initially points to the head of the list.
Traverse through the list till current points to null.
Display each node by making current to point to node next to it in each iteration.
 */
public class displayLL {

    //This is a node
    class Node
    {
        public int data;
        public Node next;
        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    //head and tail of the list
    public static Node head=null;
    public static Node tail=null;

    //addNode func
    public static void addNode(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
    }

    //display func
    public static void display()
    {
        Node current=head;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        while(current!=null)
        {
            System.out.println(current.data+" ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        addNode(1);
        addNode(2);
        addNode(3);
        addNode(4);
        display();
    }
}
