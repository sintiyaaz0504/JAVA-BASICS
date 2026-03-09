public class TypePromotion8 {
    public static void main(String[]args){
        //java automatically promotes each byte,short,char,operand to int when evaluating an expression
        //ex:-
        char x='a';
        char y='b';
        System.out.println(y-x);//o/p--1
        //---------------------------------------------------------------
        // in these case the largest possible is considered
        int a=10;  // int converted to double
        float b=20.25f;  //float converted to double
        long c=25;      // long converted to double
        double d=30;
        double sum=a+b+c+d;
        System.out.println(sum);
        //-----------------------------------------------------
        byte p=5;
        byte q=(byte)(p*2);//this is in int now not byte//in these as p*2 is expression java gives type promotion from byte to int
        System.out.println(q);
    }
}
