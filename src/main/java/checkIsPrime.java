
public class checkIsPrime {
    public static void main(String[] args) {

        for (int i = 2; i < 100; i++) {
            if(checkPrime(i)){
                System.out.println(i);
            }

        }
    }
    private static boolean checkPrime(int n) {
        boolean check = true;
        for(int j = 2; j< n ; j++){
            if(n % j == 0){
                check = false;
                break;
            }
        }
        return  check;
    }


}
