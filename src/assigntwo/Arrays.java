package assigntwo;

public class Arrays {

    // Given Array: array = {1,2,3,4,8,9,14}

    public static int main(String[] args) {

        int array[] = {1,2,3,4,8,9,14};
        int sum = 0;

        // calculate sum of values in array
        for(int i : array) {
            sum = sum + array[i];
        }
        return sum;
    }


}
