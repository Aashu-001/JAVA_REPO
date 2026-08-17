public class Static{
    public static void main(String[] args){
        // Outer.Inner inner = new Outer.Inner();
        // inner.Greet();

        // Outer outer = new Outer();
        // Outer.Inner inner = new Outer.Inner(outer);
        // inner.Greet();

        // Outer1.Lion lion = new Outer1.Lion();
        // lion.run();
        // lion.speak();

        BankAccount bank = new BankAccount();
        System.out.println(bank.calculateIntrest(5000.00, 7.52));
    } 
}

//1) static inner class can access static attribute directly and non-static indirectly 
class Outer{
    static String varStatic = "Aashu";
    String varNonStatic = "Abhay";
    static class Inner{
        Outer outer ;
        Inner(Outer outer){
             this.outer = outer;
        }

        public void Greet(){
        //  System.out.println("Hello Everyone , My Name is "+varStatic);
        System.out.println("Hello everyone , My name is " + outer.varNonStatic);
       }

    }
}

//2)  abstract inner class can inherit any class
abstract class Animal{
  abstract void run();
  abstract void speak();
};


class Outer1{
    static class Lion extends Animal{
       @Override
       public void run(){
         System.out.println("Lion run here in forest");
       }
       @Override
       public void speak(){
        System.out.println("Lion speaks here in forest");
       }
    }

}


// 3) Bank intrest calculation only within the bankAccount class 
class BankAccount{
    private static class CalculateIntrest{
        public static double intrestAnually(double principal,double rate){
            return (principal*rate)/100;
        }
        public static double intrestMonthly(double principal,double rate){
            return (principal*rate)/100;
        }
    }

    public double calculateIntrest(double principal,double rate){
        return CalculateIntrest.intrestAnually(principal,rate);
    }
}