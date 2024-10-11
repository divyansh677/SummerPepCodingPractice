public class Remove_extra_space {
    public static void main(String args[])
    {
        String input="       rahul     is      a        good boy";
        System.out.println(input.replaceAll("\\s+"," ").trim());
    }
}


// before and after space can be removed by trim 