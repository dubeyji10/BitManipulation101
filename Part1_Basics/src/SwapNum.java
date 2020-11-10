public class SwapNum {
    public static void main(String[] args) {
        /*
        This is again one of the simplest and most commonly used bit hack.
        The idea is to use XOR operators for swapping two numbers by their
        property that (x ^ x = 0).
         */
        Swap(23,92);
        Swap(100,100);
    }
    public static void Swap(int a,int b){
        if(a!=b){

            System.out.println("n1 = "+a+" n2 = "+b);
            a = a^b;
//        System.out.println("first xor , a = "+a);
            b = a^b;
            a = a^b;
            System.out.println("after swapping :");
            System.out.println("n1 = "+a+" n2 = "+b);
            System.out.println("____________________");
        }
        else {
            System.out.println("they are same😑");
        }
    }
}
