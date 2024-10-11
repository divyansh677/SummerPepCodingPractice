public class Remove_special_char {
    public static void main(String args[])
    {
        String input="a!B@C#1#$2%3";
        System.out.println(input.replaceAll("[^a-zA-Z0-9]",""));
    }
    
}
