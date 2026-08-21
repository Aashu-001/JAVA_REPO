package DSA_;
   /* We have to take the input from the user number of rows and column then take the element as the inputs . 
Then take the element from the user to search then search in the array 

*/
import java.util.*;
public class TwoDArray {
 


    public static void main(String[] args) {
         int n;
         int m;

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of rows and column ");
         n = sc.nextInt();
         m = sc.nextInt();
         int[][] arr = new int[n][m];
         System.out.println("Enter the values in the row and column ");
         for(int i =0;i < n;i++){
            for(int j = 0 ;j< m;j++){
                arr[i][j]  = sc.nextInt();
            }
         }
         System.out.println("Enter the target to be  search");
         int target ;
         target = sc.nextInt();

         for(int i =0;i < n;i++){
            for(int j =0;j < m;j++){
                if(target == arr[i][j]){
                    System.out.println("row is :" + i + " Column is : " + j);
                    return;
                }
            }
         }

    }

}
