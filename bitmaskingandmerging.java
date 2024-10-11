public class bitmaskingandmerging {
  public static void main(String[] args) {
    // byte a=9,b=12;  it is optional 
    byte c;
    c= (byte)(9<<4);
    c=(byte)(c|12);
    System.out.println((c&0b11110000)>>4);
    System.out.println(c&0b00001111);



  }  
}
