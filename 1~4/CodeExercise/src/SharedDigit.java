public class SharedDigit {
    public static void main(String[] args) throws Exception {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(12, 23));
    }

    public static boolean hasSharedDigit(int n1, int n2) {
        if ((n1 < 10 || n1 > 99) || (n2 < 10 || n2 > 99)) {
            return false;
        }

        int digit1 = 0;
        int digit2 = 0;
        int originN2 = n2;
        while (n1 > 0) {
            digit1 = n1 % 10;
            n1 /= 10;
            n2 = originN2;
            while (n2 > 0) {
                digit2 = n2 % 10;
                n2 /= 10;
                if (digit1 == digit2) {
                    return true;
                }
            }
        }
        return false;
    }
}
