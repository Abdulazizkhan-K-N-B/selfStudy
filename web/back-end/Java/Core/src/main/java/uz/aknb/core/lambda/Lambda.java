package uz.aknb.core.lambda;

public class Lambda {

    public static void main(String[] args) {

//        Operation operation = new Operation() {
//            @Override
//            public boolean isPrime(int n) {
//                for (int i = 2; i <= Math.sqrt(n); i++) {
//                    if (n % i == 0){
//                        return false;
//                    }
//                }
//                return true;
//            }
//        };

        Operation operation = (n)->{
            for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0){
                        return false;
                    }
                }
                return true;
        };

        System.out.println(operation.isPrime(17)? "Tub son!" : "Tub son emas");
    }
}
