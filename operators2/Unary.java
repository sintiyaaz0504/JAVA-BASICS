package operators2;
//a++,a--,++a,--a
public class Unary {
    public static void main(String[]args){
         int a=10;
         int b=++a;// value change and then value use
         System.err.println(a);//11
         System.out.println(b); //11

         int x=10;
         int y=x++; //value use and then value change
         System.out.println(x);//11
         System.out.println(y);//10
    }
}
