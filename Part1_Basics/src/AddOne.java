public class AddOne {

    /*

    Problem 3. Add 1 to a given integer
The expression -~x will add 1 to a given integer.
We know that to get negative of a number,
 we invert its bits and add 1 to it
 (Remember negative numbers are stores in 2’s compliment form). i.e.

-x = ~x + 1;


 ...... -~x = x + 1 (by replacing x by ~x) .......

     */
    public static void main(String[] args) {

//        addOneto(100);
//        System.out.println("_____________________________");
//        addOneto(0);
        for(int i=0;i<10;i++){
            addOneto(i);
            System.out.println("________________________________________");
        }
    }
    public static void addOneto(int n){
        System.out.println("N = "+n);
        int ans;
        int compl1 = ~n;
        ans = -compl1;
        System.out.println("Ones compliment : "+compl1);
        System.out.println("negative of ones compliment : -"+compl1+" = "+ans);
//        int compl2 = compl1+1;
//        System.out.println("2s compliment : "+compl2);
    }
}
