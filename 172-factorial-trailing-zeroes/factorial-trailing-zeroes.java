class Solution {
    public static int trailingZeroes(int n) {
        int count = 0;

        while (n >= 5) {
            n /= 5;
            count += n;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroes(13));
    }
}