package Methods;
 class Adding_number_using_commadLine {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0;i<args.length;i++)
        {
            if(args[i].matches("[0-9\\.]+"))
                sum+= Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
    
}
