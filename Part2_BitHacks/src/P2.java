public class P2 {
    public static void main(String[] args) {
        /*
    Problem 2. Turn on k’th bit in a number
 The idea is to use bitwise << and | operators.
 By using expression (1 << (k – 1)), we get a number which
 has all bits 0, except the k’th bit. If we do bitwise OR of
 this expression with n i.e. (n | (1 << (k – 1))), we get a number
 which has all bits same as n except the k’th bit which will be set to 1.s
 For example, consider n = 20 and k = 4.

00010100   |             (n = 20)
00001000                 (1 << (4 – 1))
~~~~~~~~
00011100
         */
//        TurnOn(8,1); // added 1 simple terms because
        // 8 : 1000 and k=1 => 1001 => 9
//        System.out.println("______________________________");
//
//        for(int i=1;i<6;i++){
////            TurnOn(128,i);
//            // 128 : 10000000
//            // i=1 -- 10000001 , 129
//            // i=2 -- 10000010 , 130
//            // i=3 -- 10000100 , 132
//            // i=4 -- 10001000 , 136
//            // i=5 -- 10010000 , 144
//            TurnOn(101,i);
//            // 101  -- 01100101
//            // i =1 already set
//            System.out.println("______________________________");
//        }

        for(int i=3;i<8;i++){

            TurnOn(16,i);
            // 16  -- 00010000
            // i = 3 ... 0010100 => 20
            // i = 4 ... 0011000 => 24
            // i =5 ... same 001000 => 16
            System.out.println("______________________________");
        }
    }
    public static void TurnOn(int n,int k){
        // this turns all bits to 0 except for k
        int exceptKallOff = (1<<(k-1));
        int onK = n|exceptKallOff;
        System.out.println(n+","+k+" bit-> "+onK);
    }
}
