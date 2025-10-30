//import bank.*;  //Import all classes from a package
import bank.Bank_Info; //Import a specific class

class Shape {
    public void area(){
        System.out.println("Display Area");
    }
}

class Tringle extends Shape {
    public void area(int l, int h){
        System.out.println(1.0/2*l*h);
    }
}
    
class Circle extends Shape {
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class Main {
    public static void main(String[] args) {
        bank.Bank_Info account1 = new bank.Bank_Info();
        account1.display();;
    }
}
