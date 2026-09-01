public class Prog5 {

    public static int[] combine(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[a.length + i] = b[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] a = {6,7,-4,8,33};
        int[] b = {5,6,86,76};
        int[] result = combine(a, b);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}