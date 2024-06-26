class LL {
    Node head;
    private int size;

    LL(){
        this.size = 0;
    }
    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;  
            size++; 
        }
        
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");

    }

    public void deleteFirst(){
        if(head == null)
        {
            System.out.println("List is Empty");
        }
        size--;
        head = head.next;

        
    }

    public void deleteLast(){
        if(head == null)
        {
            System.out.println("List is Empty");
            return;
        }
        size--;

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode =  head.next;

        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;

    }

    public int getSize(){
        return size;        
    }

    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static void main(String args[])
    {
        LL list = new LL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();
 
        list.head = list.reverseRecursive(list.head);
        System.out.println("");
        System.out.println("Linked List After Reversal: ");
        list.printList();
        
    }
}