interface Animal {
    int eyes = 2;//default public,static(sob animal er jonno same),final(value fix)

    void walk();//mathod by default public and abstract

        /*Error interface er constructor hoi na.*/ 
    // Animal(){  
    // }

        /*Error interface er vitor non Abstractor function hoi na*/
    // void eat(){  
    // } 
}

interface Herbivore {

}

 //interface implements
 //interface allow multiple inheritance
 //class don't allow
class Horse implements Animal,Herbivore {
    public void walk(){
        System.out.println("walk on 4 lags");
    }
}

public class Interfaces_exmpl {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.walk();
    }
}
