class Node
{
    int data;
    Node next;
    
    Node(int d)
    {
        data=d;
        next=null;
    }
}
 
public class BinarySearch
{
    static Node push(Node head, int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head=newNode;
        return head;
    }
    static Node middleNode(Node start, Node last)
    {
        if (start == null)
            return null;
 
        Node slow=start;
        Node fast=start.next;
 
        while(fast!= last)
        {
            fast=fast.next;
            if (fast!=last)
            {
                slow=slow.next;
                fast=fast.next;
            }
        }
        return slow;
    }
    static Node binarySearch(Node head, int value)
    {
        Node start=head;
        Node last=null;
        do
        {
            Node mid = middleNode(start, last);   //f for middle
            if (mid==null)
                return null;
 
            if (mid.data==value)
                return mid;
                
            else if (mid.data > value)
            {
                start=mid.next;
            }
            else
                last = mid;
        } while(last == null||last!=start);
 
        return null;
    }
    public static void main(String[] args)
    {
        Node head = null;
        
        head = push(head,1);
        head = push(head,4);
        head = push(head,7);
        head = push(head,8);
        head = push(head,9);
        head = push(head,10);
        int value = 7;
 
        if (binarySearch(head, value) == null)
        {
            System.out.println("Value not present");
        }
        else
        {
            System.out.println("Present");
        }
    }
}

// Constructor to create a new node(6)
// function to insert a node at the beginning
// of the Singaly Linked List(15)
// Function to find middle element
// using Fast and Slow pointers(22)
// function to insert a node at the beginning
// of the Singly Linked List(41)
// If value is present at middle(51)
// If value is less than mid(54)
// If value is less than mid