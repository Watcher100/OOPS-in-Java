class Shape {
    public void area(){
        System.out.println("Display Area");
    }
}
//all class Extends Prent class
    //Extends parent class
class Tringle extends Shape {
    public void area(int l, int h){
        System.out.println(1.0/2*l*h);
    }
}
    //also Extends parent class
class Circle extends Shape {
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Circle t1 = new Circle();
        t1.area(5);
        t1.area();
    }
}
