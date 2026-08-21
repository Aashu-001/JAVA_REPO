package DSA_.String;
// import java.lang.*;
public class stringBuilder {
    // create
  public static void main(String[] args) {
    //string creation
    StringBuilder str = new StringBuilder("hello");
       
        // character at 
        System.out.println(str.charAt(str.length()-1));
        
        //insert => .insert(index,charcter)
        str.insert(0,"a");
        System.out.println("inserted => "+str);


        //update => .update(ind , updated_character)
        str.setCharAt(0,'B');
         System.out.println("update =>" + str);


        //delete => .delete(beg_ind , end_ind)
        str.delete(0,1);
        System.out.println("deleted =>" + str);
  }
 
}
