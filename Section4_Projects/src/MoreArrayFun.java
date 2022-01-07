public class MoreArrayFun {
    public static void main(String[] args) {
        int[] moreArrayFun;
        moreArrayFun = new int[10];

        // for loop creating an array with the numbers 1 - 10 in positions 0 - 9
        for(int i = 0; i < moreArrayFun.length; i++) {
            moreArrayFun[i] = i + 1;
        }

        // For loop printing out the values of all positions in the array.
        for (int i = 0; i < moreArrayFun.length; i++) {
            System.out.println(moreArrayFun[i]);
        }
    }
}
