package functionsMethods4;

public class DecimalToBinary {
    public static void decToBin(int decNum){
       int pow=0;
       int binNum=0;
       while(decNum >0){
          int rem=decNum %2;
          binNum=binNum+(rem*(int)Math.pow(10,pow));//10(pow) to place it in its correct position
          pow++;
          decNum=decNum/2; //10-->5---->2
       } 
       System.out.println("the binary form of this decimal number is "+binNum);
    }
    public static void main(String[]args){
      decToBin(7);//111
    }
}
