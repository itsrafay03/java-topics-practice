package arrays;

public class Rough {
    public static void main(String[] args) {
        int[] list1 = {2,5,7,9,11,7,4,10};

        int firstMax = list1[0];
        int secondMax = list1[0];
        int min = list1[0];
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] > firstMax) {
                secondMax = firstMax;
                firstMax = list1[i];
            } else if (list1[i]>secondMax) {
                secondMax = list1[i];
            } else if (list1[i]<min) {
                min = list1[i];
            }
        }
        System.out.println(firstMax);
        System.out.println(secondMax);
        System.out.println(min);

        int even, odd, prime, notPrime;
        even = odd = prime = notPrime = 0;
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] % 2 == 0) {
                even++;
            }else {
                odd++;
            }
        }

        for (int i = 0; i < list1.length; i++) {
            if (isPrime(list1[i])) {
                prime++;
            }else {
                notPrime++;
            }
        }

        System.out.println("Even "+even);
        System.out.println("Odd "+odd);
        System.out.println("Prime "+prime);
        System.out.println("NotPrime "+notPrime);
    }

    static boolean isPrime(int num){
        int n = 2;
        while (num % n != 0){
            n++;
        }
        if (n == num) {
            return true;
        }else {
            return false;
        }
    }
}
