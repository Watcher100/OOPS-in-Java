//abstract class only exsit we not use it 
abstract class Animal {
    abstract void walk();
    //Constructor
    Animal(){
        System.out.println("You are creating a Animal");
    }

    public void eats(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    //Constructor
    Horse(){
        System.out.println("Created a Horse");
    }

    public void walk(){
        System.out.println("Walk on 4 Lags");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("Walk on 2 Lags");
    }
}

public class Abstraction_exmpl{
    public static void main(String args[]){
        Horse h1 = new Horse();/*called 2 constractor but 1st
                                called the parent class one*/
        // h1.walk();

        // h1.eats();

            //error we can't create abstract class obj.
        //Animal h1 = new Animal(); (This is Runtime error).
    }
}
