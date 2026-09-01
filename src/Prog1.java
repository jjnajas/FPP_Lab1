import java.util.Random;

public class Prog1 {
    public static void main(String[] args) {

        int x = RandomNumbers.getRandomInt(1, 9);
        int y = RandomNumbers.getRandomInt(3, 14);
        double piX = Math.pow(Math.PI, x);
        double piY = Math.pow(y, Math.PI);
        System.out.println("x = " + x);
        System.out.println("π^x = " + piX);
        System.out.println("y = " + y);
        System.out.println("y^π = " + piY);
    }
}
