import java.util.Random;

//Using swap method to solve the shuffle problem

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        shuffleArray(array);
        
        // Print the shuffled array
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    
    public static void shuffleArray(int[] array) {
        Random ran = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int index = ran.nextInt(i + 1);
            
            // Swap array[i] and array[index]
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }
}
