package functionsMethods4;

public class callbyvalue {
    public static void swap(int a,int b){
      //swap
        int temp=a;
        a=b;
        b=temp;
    }
    public static void main(String[]args){
        int a=5;
        int b=10;
        swap(a,b);
        //values are not swapped 
        System.out.println("the value of a "+a);//5
        System.out.println("the value of b"+b);//10

    }
}

// changeA(int a){
//     a=10;
// }
// psvm(){
//     int a=5;
//     changeA(a);//copy of a is given to changeA function
//     System.out.println(a);//o/p:-5
// }
