package bank;
public class Bank {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "Rudra";
        acc1.email = "rudra001@gmail.com";
        acc1.setPassword("muhmele");
        System.out.println(acc1.getPassword());
    }
    
}

class Account {
   public String name; 
   protected String email;
   private String password;

   // using getter and setter for accessing private access modifiers
   public String getPassword() {
    return this.password;
   }


   public void setPassword(String pass) {
    this.password = pass;
   }
}