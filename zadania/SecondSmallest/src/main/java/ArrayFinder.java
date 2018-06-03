public class ArrayFinder {
    public static int findSecondSmallestNumberInArray(int[] array){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < smallest) {
                int temp = smallest;
                smallest = array[i];
                secondSmallest = temp;
            } else if (array[i] < secondSmallest && array[i] != smallest) {
                secondSmallest = array[i];
            }

        }
        return secondSmallest;
    }
}
