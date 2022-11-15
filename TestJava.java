public class TestJava {
    public static void main(String[] args) {
        String s = "AASSSDDFFFGGHH";

        System.out.println(res);
    }

    public static int getSumOfDigits(int n) {
        int size = (int) Math.log10(n) + 1;
        int retSum = 0;
        for (int x = 0; x < size; x++) {
            int d = getDigit(n, x);
            retSum += d;
        }
        return retSum;
    }

    public static int getDigit(int num, int ind) {
        double div = Math.pow(10, (ind));
        return (num / (int) div) % 10;
    }
}
