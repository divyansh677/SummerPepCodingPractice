package Methods;

public class Returning_object {
    public String Username(String gmail)
    {
        int a = gmail.indexOf('@');
        String userName  = gmail.substring(0, a);
        return userName;

    }
    public static void main(String[] args) {
        // String gmail = "Divyash@gmail.com";
        String gmail = new String("Divyash@gmail.com");

        Returning_object ro = new Returning_object();
        System.out.println(ro.Username(gmail));
        
    }
    
}
