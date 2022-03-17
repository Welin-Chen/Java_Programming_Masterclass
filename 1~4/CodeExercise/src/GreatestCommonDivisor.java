public class GreatestCommonDivisor {
    public static void main(String[] args) throws Exception {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(1010, 10));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int maxDivisor = 0;
        int temp;
        if (first > second) {
            temp = second;
            second = first;
            first = temp;
        }
        for (int i = 1; i <= first; i++) {
            if ((first % i == 0) && (second % i == 0) && (i > maxDivisor)) {
                maxDivisor = i;
            }
        }
        return maxDivisor;
    }

}
