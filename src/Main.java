import java.util.Scanner;
import java.math.BigInteger;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int compared, modComp;
        long Count = 0;
        long indivCount = 0;
        BigInteger bigNum;
        System.out.println("What is the starting number?");
        bigNum = scanner.nextBigInteger();
        BigInteger savedNum = bigNum;
        System.out.println("Num: " + bigNum);
        BigInteger bob = bigNum.mod(II);
        compared = bigNum.compareTo(I);
        modComp = bob.compareTo(I);

        for (int boom = 0; boom<1000000; boom++){
            while (compared != 0)
            {
                if (modComp!=0)
                {
                    bigNum = bigNum.divide(II);
                    indivCount++;
                }
                else
                {
                    System.out.println(bigNum);
                    bigNum = bigNum.multiply(V);
                    bigNum = bigNum.add(I);
                    Count++;
                    indivCount++;
                }
                //System.out.println(bigNum);
                bob = bigNum.mod(II);
                compared = bigNum.compareTo(I);
                modComp = bob.compareTo(I);
            }
            bigNum = savedNum;
        }
        System.out.println("Count: " + Count);
        System.out.println("indivCount: " + indivCount);
    }
    public static final BigInteger II = BigInteger.TWO;
    public static final BigInteger I = BigInteger.ONE;
    public static final BigInteger V = new BigInteger ("5");
    //7 would certainly be an interesting number to look out for in the future patterns. I'd like to see where it stands in the grand scheme of the Nollatz Conjecture. Continue the search for more numbers with interesting Nollatz properties!

    //Maybe add a termination to prevent overload?? Or introduce bigInteger or convert to string?? Not sure what would be worth it. 63455533875
}