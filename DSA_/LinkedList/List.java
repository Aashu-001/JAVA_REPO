package DSA_.LinkedList;

import java.util.LinkedList;

class List{
    public static void main(String[] args){
        LinkedList<String>list = new LinkedList<String>();
        list.addFirst("A");
        list.addLast("B");
        list.add("C");
        System.out.println(list);


        list.removeFirst();
        System.out.println(list);
        list.removeLast();

         list.addFirst("A");
        list.addLast("B");
        list.add("C");
        list.remove(0);

        
        System.out.println(list);
    }
}