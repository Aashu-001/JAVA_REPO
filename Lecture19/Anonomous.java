public class Anonomous {
    public static void main(String[] args) {
        //   Animal dog = new Dog();
        //   dog.eat();

          Animal dog = new Animal(){
             @Override
            public void eat(){
                System.out.println("Dog is eating ");
                drink();
            }
            public void drink(){
                System.out.println("Dog drinks after eat");
            }
          };
          dog.eat();
        //   dog.drink(); // not possible as drink is not the member of Animal class

    }
}

class Animal{
    public void eat(){
        System.out.println("Animal is eating ");
    }
}

// we have to execute the dog eat only once 
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog is eating ");
    }
}