public class Strings_functions {
    public static void main(String args[])
    
    {
    // {
    //     String Name="John@gmail.com";
    //     System.out.println(Name.matches("\\w+@gmail(.*)"));
    String str="Programmer@gmail.com";
    int i= str.indexOf("@");
    String uname= str.substring(0, i);
    String lname=str.substring(i+1,str.length());
    System.out.println("Username : " + uname);
    System.out.println("DomainName : " + lname);
    // System.out.println(lname.startsWith("gmail"));
    int j = lname.indexOf(".");
    String name=lname.substring(0,j);
    System.out.println(name.equals("gmail"));




    }
}

//string matching funcitons
//quantifiers
// meta functions