public class Count_words {
    public static void main(String aargs[])
    {
        String input="       rahul     is      a        good boy";
        input=input.replaceAll("\\s+", " ");
        String str[] = input.split("\\s");
        System.out.println(str.length);
    }
    
}



// Split take a regular expression and return an array based on the regular expression

// length is the attribute of the array not the method
