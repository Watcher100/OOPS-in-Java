class Student {
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
        //method overloading(diff method same name)
        //Some rules 
        //different number, types, or order of parameters
    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " + age);
    }
        //diff return type is not overloading
    // int sum(int a, int b) {
    //     return a + b;
    // }

    // double sum(int a, int b) { // ❌ Error
    //     return a + b + 0.5;
    // }
}

public class CompileTime {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Sudipto";
        s1.age = 23;

        s1.printInfo(s1.name,s1.age);
    }
}
