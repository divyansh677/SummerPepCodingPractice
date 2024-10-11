import java.util.Scanner;

public class website_extractor {
    public static void main(String args[])
    {
        String url ;
        
        Scanner sc = new Scanner(System.in);
        url = sc.nextLine();
        String protocol = url.substring(0,url.indexOf(":"));
        String domain = url.substring(url.lastIndexOf(".")+1) ;

        switch (protocol) {
            case "http": System.out.println("HyperText Markup Language");
                
                break;
            case "ftp": System.out.println("File Transfer Language");
        
            default:
            System.out.println("Invalid Output");
                break;
        }
        switch (domain) {
            case "com": System.out.println("Commercial");
                
                break;
            case "edu": System.out.println("Educational");
            break;
            case  "gov": System.out.println("governmental");
            break;
            default:
            System.out.println("Invalid  ");
                break;
        }

    }
}



