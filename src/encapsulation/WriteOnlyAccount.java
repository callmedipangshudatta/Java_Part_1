package encapsulation;

public class WriteOnlyAccount {
    private String password;

    //  Setter
    public void setPassword(String password){
        if(password != null && !password.isBlank()){
            this.password = password;
            System.out.println("Password saved successfully");
        }else{
            System.out.println("Password not saved");
        }
    }
}
