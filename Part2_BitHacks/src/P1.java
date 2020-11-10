public class P1 {
    public static void main(String[] args) {
    /*
    Problem 1. Turn off k’th bit in a number
The idea is to use bitwise <<, & and ~ operators.
 By using expression ~ (1 << (k – 1)), we get a number
  which has all its bits set, except the k’th bit.
  If we do a bitwise AND of this expression with n i.e.
   (n & ~(1 << (k – 1))), we get a number which has all bits same
   as n except the k’th bit which will be set to 0.


For example, consider n = 20 and k = 3.

00010100   &             (n = 20)
11111011                 ~ (1 << (3-1))
~~~~~~~~
00010000

     */


        for(int i=1;i<6;i++){
//            TurnOff(256,i);
            // 000100000010
            // only at 2nd it gives 256
            // does nothing with 0 because it is already off

            TurnOff(127,i);
            // 127 -- 01111111
            System.out.println("___________________________");
        }
    }
    public static void TurnOff(int n,int k){
        // this sets all bits except K
        int exceptKth = ~(1<<(k-1)) ;
        
        int Koff = n & exceptKth;
        System.out.println(n+","+k+" bit"+"-> "+Koff);

    }
}
