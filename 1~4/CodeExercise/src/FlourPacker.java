public class FlourPacker {
    public static void main(String[] args) throws Exception {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        int sum = 0;
        int sumTemp = 0;
        for (int i = 0; i <= bigCount; i++) {
            sum = (i * 5);
            for (int j = 0; (j <= smallCount); j++) {
                sumTemp = sum + j;
                if (sumTemp == goal) {
                    return true;
                }
            }
        }
        return false;
    }
}
