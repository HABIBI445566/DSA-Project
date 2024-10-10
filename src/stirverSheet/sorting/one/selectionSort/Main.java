package stirverSheet.sorting.one.selectionSort;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //based on the algorithm will try to do this myself

       int[] toBeSorted = {13,9,22,10,22,30,55,2,80,5,1,30,20,4,200,492,4,50};
        System.out.println(Arrays.toString(selectionSort(toBeSorted)));


    }

    private static int[] selectionSort(int[] toBeSorted) {
        // we will have a loop of loops, will start from one end and will go to the next element in each iteration and in each iteration will add the smallest one to the next
        for(int i=0; i<toBeSorted.length-1;i++)
        {

            int smallestElementIndex = 0;
            int smalledElementValue = Integer.MAX_VALUE;
            for(int j=i+1;j<toBeSorted.length;j++)
            {
                if(toBeSorted[j]<=smalledElementValue)
                {
                    smalledElementValue = toBeSorted[j];
                    smallestElementIndex = j;
                }
            }
            if(toBeSorted[i]>smalledElementValue)
            {
                toBeSorted[smallestElementIndex] = toBeSorted[i];
                toBeSorted[i] = smalledElementValue;
            }

        }

        return toBeSorted;
    }
}



//******************************************** Here is the Algorithm in texts **********************************************************

/*
Approach:

The algorithm steps are as follows:

First, we will select the range of the unsorted array using a loop (say i) that indicates the starting index of the range.
The loop will run forward from 0 to n-1. The value i = 0 means the range is from 0 to n-1, and similarly, i = 1 means the range is from 1 to n-1, and so on.
        (Initially, the range will be the whole array starting from the first index.)
Now, in each iteration, we will select the minimum element from the range of the unsorted array using an inner loop.
        After that, we will swap the minimum element with the first element of the selected range(in step 1).
Finally, after each iteration, we will find that the array is sorted up to the first index of the range.
*/
