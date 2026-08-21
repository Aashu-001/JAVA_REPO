package DSA_.String;

public class ReverseString {
      public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");

        //reverse the string 
        for(int i =0;i < str.length()/2;i++){
            int beg = i;
            int end = str.length()-1-i;

            char beg_char = str.charAt(beg);
            char end_char = str.charAt(end);

            str.setCharAt(beg,end_char);
            str.setCharAt(end, beg_char);
        }
        System.out.println(str);
      }
}
