class Shape {
    public void area(){
        System.out.println("Display Area");
    }
}

//Single level
class Tringle extends Shape {
    public void area(int l, int h){
        System.out.println(l*h);
    }
}
// Multi level
class EquilateralTriangle extends Tringle {
    public void area(){
        //super.area(); // calls Shape.area()
        System.out.println("Display Nothing");
    }
}

public class Multi_Inheritance {
    public static void main(String[] args) {
        Shape t1 = new EquilateralTriangle();
        //t1.area(4,6);
        t1.area();//1st search method in the object class.
        t1.area();
    }
}
