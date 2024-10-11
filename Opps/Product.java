package Opps;
class CustomerProperties{
    private String customerId;
    private String name;
    private String address;
    private String phoneNumber;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public CustomerProperties(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public CustomerProperties(String customerId, String name, String address, String phoneNumber) {
        this.customerId = customerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    
    public String toString()
    {
        return "customerId :"+ customerId+ "Name :" + name+"Address: "+ address;
    }
}

class ProductProperties{
    private String itemNo;
    private String name;
    private double price;
    private short quantity;

    public String getItemNo() {
        return itemNo;
    }

    public String getProductName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public ProductProperties(String itemNo, String name) {
        this.itemNo = itemNo;
        this.name = name;
    }

    public ProductProperties(String itemNo) {
        this.itemNo = itemNo;
    }

    public ProductProperties(String itemNo, String name, double price, short quantity) {
        this.itemNo = itemNo;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

public class Main {
    public static void main(String args[]) {
        CustomerProperties Arr[] = new CustomerProperties[3];
        Arr[0] = new CustomerProperties("12345", "Dev Masand", "Ramnagar", "234567876543");
        Arr[1] = new CustomerProperties("54321", "John Doe", "Downtown", "987654321234");
        Arr[2] = new CustomerProperties("13579", "Jane Smith", "Uptown", "876543210987");
        for (CustomerProperties obj : Arr) {
            System.out.println(obj);
        }
    }
}