package DSA_.LinkedList;

public class BasicList {
    Node head;
    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
        }
    }
    
    // add at front
    public void addFront(String string){
        Node node = new Node(string);
        if(head == null){
            head = node;
            return ;
        }
        node.next = head;
        head = node;
    }

    // add at the end
    public void addLast(String string){
        Node node = new Node(string);
        if(head == null){
            head = node;
            return ;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
         temp.next = node;
    }
    
    // print the node
    public void print(){
        Node temp  = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    // remove from front 
    public void removeFront(){
        if(head == null){
            System.out.println("Not allowed to remove");
            return ;
        }
        
        head = head.next;
        return ;
    }

    // remove from end
    public void removeEnd(){
        if(head == null){
            System.out.println("Not able to remove");
            return ;
        }
        else if(head.next == null){
            head = null;
            return ;
        }
        Node temp = head;
        while(temp.next.next != null){
          temp = temp.next;
        }
        temp.next = null;
        return ;
    }

    
    public static void main(String[] args) {
         BasicList list = new BasicList();
         list.addFront("3");
         list.addFront("2");
         list.addFront("1");
         list.addLast("4");
         list.addLast("5");
         list.addLast("6");
         list.print();
         list.removeFront();
         System.out.println("After remove from front");
         list.print();
         list.removeEnd();
         System.out.println("After remove from back");
         list.print();

    }

}
