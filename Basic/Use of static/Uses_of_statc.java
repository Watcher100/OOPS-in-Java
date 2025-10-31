class Student {
    String name;
    static String school;//for all student school name will be same.
    
    public static void changeSchool(){
        school = "newschool";
    }
}
//uses of static before(properties,function,block,nested class)
public class Uses_of_statc {
    public static void main(String[] args) {
        //we can access static(method,variable) using class name.
        Student.school = "abcde";//ex school

        Student s1 = new Student();
        s1.name = "Sudipto";
        System.out.println(s1.school);
        
        
    }
}
