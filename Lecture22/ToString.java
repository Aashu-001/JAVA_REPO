public class ToString{
    public static void main(String[] args){
         Student stu = new Student(12,"Abhay");
        //  System.out.println(stu.toString());
         System.out.println(stu);
    }
}

class Student{
    int age;
    String name;
    Student(int age,String name){
        this.age = age;
        this.name = name;
    }

    //override toString
    @Override 
    public String toString(){
        return this.name + " is "+this.age+" years old";
    }


}