//we forcefully convert the datatype of the variable
//typecasting---->narrowing conversion or explicit conversion
public class TypeCasting7 {
    public static void main(String[]args){
          float a=99.999f;
          int b=(int)a;
          System.out.println(b); //output:-99

          char ch='a'; //a ASCII value is 97
          int number=ch;
          System.out.println(number);//output:-97
    }
}
