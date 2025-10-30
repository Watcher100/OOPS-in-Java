//Base/Parent class
class Shape {
    public void area(){
        System.out.println("Display Area");
    }
}
/*one class properties/mathod when another class 
inherite it this is called Inheritance*/

//Sub/Child class
//Single level
class Tringle extends Shape {
    public void area(int l, int h){
        System.out.println(1.0/2*l*h);
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        Tringle t1 = new Tringle();
        t1.area(4,6);
        t1.area();
    }
}
