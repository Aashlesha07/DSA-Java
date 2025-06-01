package BankAccesModifire;

class Account{
   public String Name ;
   protected String email;
   private String password;

//    getter & setter
public String getPassword() {
    return this.password;
}
public void setPassword(String pass){
    this.password = pass;
}

// if setter is private then we have to do like
// public String getPassword() {
//     setPassword(randompass);
//     return this.password;
// }
// private void setPassword(String pass){
//     this.password = pass;
// }
}

public class bank {
    public static void main(String[] args) {
        Account Account1 = new Account();
        Account1.Name = "Satham Class";
        Account1.email = "abc@gmail.com";
        Account1.setPassword("abcd");
        System.out.println(Account1.getPassword());
    }
}
