//conversion happens when:
//type compatible
//destination type > source type
//byte(1byte)->short(2)->int(4)->float(4)->long(8)->double(8)
//typeconversion is also called as widening conversion
//also implicit conversion
public class TypeConversion6 {
      public static void main(String[]args){
        //possible
        int a=10;
        long b=a;
        System.out.println(b);
        //not possible and gives error lossy conversion or cannot convert
        long x=10;  // storing long(8bytes) in int(4bytes) is not possible 
        //int y=x;
        System.out.println(b);
       }
    }
