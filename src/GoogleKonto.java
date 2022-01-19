import java.util.Scanner;

public class GoogleKonto {

    private String benutzername;
    private String password;



    public GoogleKonto(String benutzername, String password){
        this.benutzername = benutzername;
        this.password = password;
    }


    public String getBenutzername() {return benutzername;}

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        if (password.equals(this.password)){
            System.out.println("Bitte neues passwort eingeben");
            Scanner scanner = new Scanner(System.in);
            String x = scanner.nextLine();
            this.password = x;
            System.out.println("neues pw: " + this.password);
        }else{
            System.out.println("falsches pw");
        }


    this.password = password;
    }
}
