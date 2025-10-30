class Pen {
    String color;
    String type;

    //method
    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);//using (this.) tell which object try to access them (the method)
    }
}

class Student{
    String name;
    int age;

    //another method
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }  
}

public class Class_Object_Method {
    public static void main(String[] args) {
        //create Object
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();  
        
    }
}