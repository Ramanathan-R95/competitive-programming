public class Rubesh {

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int max = 0;

        for(int i = 0;i <arr.length;i++) {   // logical + runtime error
            if(arr[i] > max) {   // syntax + logical error
                max = arr[i];
            }
        }

        System.out.println("Maximum value is: " + max);
    }
}