package DSA_.String;
import java.util.*;
public class Basic {
     public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
         sc.nextLine();  // next 
        String[] arr=  new String[n];
        for(int i =  0 ;i < n;i++){
          String str ;
          str = sc.nextLine();
          arr[i] = str;
        }
        
        int len  =0 ;
        for(int i =0;i < n;i++){
            System.out.println(arr[i]);
           len += arr[i].length();
        }

        System.out.println("The length of complete string is : " + len);

     }
}
