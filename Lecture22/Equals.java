public class Equals {
    public static void main(String[] args) {
         Student s1 = new Student(13,"Abhay");
         Student s2 = new Student(13,"Abhay");
         System.out.println(s1.equals(s2)); // false only compares references

    }
}
class Student{
    int age;
    String name;
    Student(int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object object){
        //apply constaint 
        // 1) same class type 
          if(object == null){
            return false;
          }
          if(this.getClass() != object.getClass()){
             return false;
          }
         
        Student obj = (Student)object;
        return this.age == obj.age && this.name == obj.name;
    }
}
