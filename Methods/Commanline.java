package Methods;

public class Commanline {
    public static void main(String[] args) {
        double s =0.0;
        for(String num: args)
        {
s = s+Double.parseDouble(num);
}
System.out.println(s);
}
}
