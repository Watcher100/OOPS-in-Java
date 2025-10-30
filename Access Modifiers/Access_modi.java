class Account {
    public String name;//all class and package can access
    protected String email;//in own package all can but other only subclass can access.
    private String password;//only own class can access.

    //gettrs and setters
    public String getpassword(){
        return this.password;
    }

    public void setpassword(String pass){
        this.password = pass;
    }
}

public class Access_modi {
    public static void main(String[] args) {
        Account a = new Account();
        a.name = "Sudipto";
        a.email = "sudiptoghosh@gmail.com";

        a.setpassword("abcde");
        System.out.println(a.getpassword());
        
    
    }
    
}
