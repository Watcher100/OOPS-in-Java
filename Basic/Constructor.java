class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    /*constructor - same as class name,nothing return no return type,
    each object can call it only one time,call auto when a object is created.*/
    
        //non parameterized constructor
    // Student(){
    //     System.out.println("Constructor Called");
    // }
        
        //parameterized constructor
    // Student(String name1,int age1){
    //     this.name = name1;
    //     this.age = age1;
    // }
        
    //Copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    /*copy constractor banaici tai auto constractor create hocce na,
    tai nijera banalam(when we create a object a constractor is automatically created).*/
    Student(){

    }
}

public class Constructor {
    public static void main(String[] args) {

            //for non parameterized constructor
        //Student s1 = new Student();
        // s1.name = "Sudipto";
        // s1.age = 22;
        //s1.printInfo();

            //for parameterized constructor
        //Student s1 = new Student("Fahim",23);
        //s1.printInfo();
        
            //copy constructor
        Student s1 = new Student();
        s1.name = "Sudipto";
        s1.age = 22;
        Student s2 = new Student(s1);
        s2.printInfo();
    }

}