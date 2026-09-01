import java.util.Arrays;

public class Prog6 {
    public int findMin(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(){
        int[] numbers = {5, 8, 2, 10, 3, 7, 1,-2, 9};
        Prog6 p = new Prog6();
        int result = p.findMin(numbers);

        System.out.println("Min: " + result);

    }
}

