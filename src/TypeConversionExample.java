
public class TypeConversionExample {

    public static void main(String[] args) {

        //case-1 (types are same -> no conversion required)
        int v1=10;
        double v2=2.5;
        //case-2-a (implicit conversion)
        double v3=40;//int to double conversion
        long v4=25;//int to long conversion
        //case-2-b (explicit conversion/forcefully conversion)
        int v5=(int)2.5;//converting double to int
        float v6=(float)4.5;//converting double to float
        //case-2-c (conversion not possible)
        //double v7=(double)true;
        //boolean v8=(boolean)1;
        
        //storing a floating point no to integral variable
        long v9=(long) 2.1f;
        
        
        
        
        
        
        
        
        
    }
}
