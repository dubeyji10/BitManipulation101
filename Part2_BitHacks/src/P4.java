public class P4 {
    public static void main(String[] args) {

//        setK(128,1);
//        System.out.println("___________________________________");
//        for(int i=1;i<6;i++){
////            setK(16,i);
//            // 16 -- 00010000
//            // at 5th ... 00000000 -> 0
//            System.out.println("___________________________________");
//        }
        for(int i=4;i<10;i++){
            setK(16,i);
            System.out.println("___________________________________");
        }

    }
    public static void setK(int n,int k){
        int all0exceptK = (1<<(k-1));
        int setK = n^all0exceptK;
        System.out.println(n+" after setting "+k+" bit -->"+setK);
    }
}
