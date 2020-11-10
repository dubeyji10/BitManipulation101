public class OddEven {

   /*
Problem 1. Check if a given integer is even or odd
This is probably one of the simplest and most commonly used bit hack.
The expression (n & 1) will return value 1 or 0
depending upon n is odd or even.


00010100   &                 (n = 20)
00000001                     (1)
~~~~~~~~
00000000


00010101   &                 (n = 21)
00000001                     (1)
~~~~~~~~
00000001

    */
    public static void main(String[] args) {

        isOddEven(23123);
        System.out.println("________________________________");
        isOddEven(222222);
        System.out.println("________________________________");
        isOddEven(0);
        System.out.println("________________________________");
        isOddEven(13);
    }

    public static void isOddEven(int num){
        int ans;
        ans = num&1;
//        ans = num&00000001; // same as above

        if(ans==0){
            System.out.println(num+" is Even");
        }
        else {
            System.out.println(num+" is Odd");
        }
    }
}

