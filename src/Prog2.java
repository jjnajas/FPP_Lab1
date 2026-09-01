public class Prog2 {
    public static void main(String[] args) {
        float x = 1.27f;
        float y = 3.881f;
        float z = 9.6f;
        float sum = x + y + z;
        int cast = (int) sum;
        long rodun = Math.round(sum);
        System.out.println("Sum as an Int: " + cast);
        System.out.println("Sum as an Int suing Math: " + rodun);
    }
}