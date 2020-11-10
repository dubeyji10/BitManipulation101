public class SameSign {

    /*
    Problem 2. Detect if two integers have opposite signs or not
The expression output (x ^ y) is negative if x and y have opposite signs.
We know that for a positive number, leftmost bit is 0 and for a negative number,
it is 1. Now for similar sign integers, the XOR operator will set leftmost bit of
output as 0 and for opposite sign integers, it will set leftmost bit as 1.


00…000100   ^              (x = 4)
00…001000                  (y = 8)
~~~~~~~~~
00…001100                  positive number


00…000100   ^              (x = 4)
11…111000                  (y = -8)
~~~~~~~~~
11…111100                  negative number

     */
    public static void main(String[] args) {

        isSigmSame(-213213,312310);
        System.out.println("________________________________");
        isSigmSame(2213,-2310);
        System.out.println("________________________________");
        isSigmSame(2222,90912);
        System.out.println("________________________________");
        isSigmSame(-2132,-312310);
        System.out.println("________________________________");

    }
    public static void isSigmSame(int n1,int n2){
        int ans;
        ans = n1^n2;
        System.out.println(n1+" ^ "+n2+" = "+ans);
        if (ans>0){
            System.out.println("have same signs");
        }
        else {
            System.out.println("different signs");
        }
    }
}
