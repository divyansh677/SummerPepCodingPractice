class Tv{
    
    void switchOn(){System.out.println("Tv in on ");}
    void changeChannel(){System.out.println("Channel is changed ");}
}
class SmartTv extends Tv{
    @Override
    void switchOn(){System.out.println("Smart Tv in on.");}
    @Override
    void changeChannel(){System.out.println("Smart Tv channel is changed.");}
    void browse(){System.out.println("Smart Tv is Browsing");}
}

public class tv{
    public static void main(String args[])
    {
        Tv obj = new SmartTv();
        obj.switchOn();
        obj.changeChannel();
        // obj.browse();
        
    }
}