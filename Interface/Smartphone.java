package Interface;

class Phone{
    public void call() {
        System.out.println("Phone call ");
    }
    public void sms()
    {
        System.out.println("Phone Sending SmS");
        
    }
}

interface Icamera{
    void Click();
    void Record();
}
interface Ipayer{
    void play();
    void stop();
}

class SmartPhone extends Phone implements Icamera,Ipayer{
    public void videoCall()
    {
        System.out.println("Smart Phone video Calling");
        
    }
   
    public void Click()
    {
        System.out.println("Smart Phone Click ");
        
    }
    public void Record()
    {
        System.out.println("Record video");
        
    }
    public void play()
    {
        System.out.println("play the music in SmartPhone ");
        
    }
    public void stop()
    {
        System.out.println("Stop the music in SmartPhone ");
        
    }
}
class Smartphone {
    public static void main(String[] args) {
            SmartPhone obj = new SmartPhone();
            obj.videoCall();
            obj.Click();
            obj.Record();
            obj.play();
            
            Phone obj1 = new SmartPhone();
            obj1.sms();
            obj1.call();
            
            Icamera obj2 = new SmartPhone();
            obj2.Click();
            obj2.Record();
            
            Ipayer obj3 = new SmartPhone();
            
            obj3.play();
            obj3.stop();
            
    }
    
}
