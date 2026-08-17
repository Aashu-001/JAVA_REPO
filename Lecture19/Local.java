public class Local {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.understand();;
    }
}


// concept of effective final variable
interface Runable{
    public void print();
}
class Outer{
    Runable  run(){
        int x = 5;
        // x++; // not allowed to increase the local varibale within the same scope of local class
        class Inner implements Runable{
            @Override
           public void print(){
             System.out.println(x);
           }
        }
        Inner inner = new Inner();
        inner.print();
        return inner;
    }
    public void understand(){
        Runable receiveInner= run();
        receiveInner.print();
        
    }
}
