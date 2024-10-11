package Opps;
class ArrayOfObjects1{
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public ArrayOfObjects1(String subID,String name,int maxMarks)
    {
            this.subID = subID;
            this.name = name;
            this.maxMarks = maxMarks;

    }
    
}


public class ArrayOfObjects{
    public static void main(String[] args) {
        
        ArrayOfObjects1 obj[] = new ArrayOfObjects1[3]; //references to the Array
        obj[0] = new ArrayOfObjects1("s01","Ds",100);
        obj[1] = new ArrayOfObjects1("s02","md",100);
        obj[2] = new ArrayOfObjects1("s03","pd",100);

        for(ArrayOfObjects1 s: obj)
        {
            System.out.println(s);
        }
    }
}


//Student name ==> rollNo, name,dept, subjects // 
