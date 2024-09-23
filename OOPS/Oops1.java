
class Pen{
    String color;
    String type;//gel, ball

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name, int age){ //parametric constructor
        this.name = name;
        this.age = age;
    }
}
public class Oops1 {
    public static void main(String args[]){
       Student s1 = new Student("Sujal", 21);//new = constructors, name of costructor =  class name

       s1.printInfo();
    }
}
