public class P3 {
    public static void main(String[] args) {

//        CheckIfIsSet(128,5);
//        CheckIfIsSet(128,8);
//        System.out.println("_____________________________");

        for(int i=1;i<10;i++){
            // 1235 ---   0 1 0 0 1 1 0 1 0 0 1 1
            //  i---->> 12.11.10.9.8.7.6.5.4.3.2.1
            CheckIfIsSet(1235,i);
            System.out.println("_____________________________");
        }
    }

    public static void CheckIfIsSet(int n,int k){
        int all0exceptK = (1<<(k-1));
        // int all1exceptK = ~all0exceptK;

        int isSet = n & all0exceptK;
        if(isSet>0){
            System.out.println("yes "+k+" is set");
        }
        else {
            System.out.println("no "+k+" is off");
        }
    }
}
