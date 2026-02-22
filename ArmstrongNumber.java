class Solution {

    public static void checkArmstrong(int n) {

        int dup = n;
        int sum = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            sum = sum + (lastdigit * lastdigit * lastdigit);
            n = n / 10;
        }

        if (sum == dup) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not An Armstrong Number");
        }
    }
}
