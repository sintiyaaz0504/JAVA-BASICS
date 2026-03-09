package functionsMethods4;

public class binaryToDecimal {
    public static void binToDecimal(int binNum){
        int pow=0;
        int dec=0;
        while(binNum>0){
            int lastDigit=binNum%10;
            dec=dec+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("the decimal form of this binary number is : "+ dec);

    }
    public static void main(String[]args){
        binToDecimal(101);
    }
}
