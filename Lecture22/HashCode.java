import java.util.Objects;
public class HashCode {
    public static void main(String[] args) {
        Student s1 = new Student(12,"Aashu");
        Student s2 = new Student(12,"Aashu");
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode()); //but it should be equal as ss1.equals(s2)=> 

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
    @Override
    public int hashCode(){
        // int result = 17; // prime number 
        // result = result*23+age;
        // result = result*23+name.hashCode();
        // return result;
        return Objects.hash(name,age);
    }
}

