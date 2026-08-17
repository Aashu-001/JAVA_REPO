public class Inner {
    public static void main(String[] args) {
         // intanciate the inner object

        //  Outer outer = new Outer();
        //  Outer.Inner inner = outer.new Inner();
        //  inner.Greet();

        // Outer.Inner inner = new Outer().new Inner();
        // inner.Greet();

        OuterNumber.InnerNumber inner = new OuterNumber().new InnerNumber();
        inner.access();
        inner.runNumber();
        OuterNumber.InnerNumber.runNumber();
    }
}

//1) Access to static and non-static attributes/methods
class Outer{
    static String name_static ="Aashu";
     String nameNonStatic = "Abhay";
    class Inner{
       public void Greet(){
        System.out.println(name_static);
        System.out.println(Outer.this); // have the reference to outer class to call non static methods and attributes 

       }
    }
}

//2) Priority of accessing the variables in from outer or inner
class OuterNumber{
    int x  =10;
    class InnerNumber{
        int x = 20;
        public void access(){
             System.out.println(x);
             System.out.println(OuterNumber.this.x);
        }
        public static void runNumber(){ // addon after java 16 
            System.out.println("Number is executing");
        }
    }
}
