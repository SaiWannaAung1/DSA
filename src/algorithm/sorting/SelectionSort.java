package algorithm.sorting;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>(
                Arrays.asList(6,2,4,5,1,3)
        );
        ArrayList<Integer> sortedList = new SelectionSort().impl(numList);
        JOptionPane.showMessageDialog(null, sortedList);
    }
    ArrayList<Integer>  impl(ArrayList<Integer> numList) {
        int n = numList.size();
        for(int i = 0; i < n-1; i++) {
            int minIndex = i;
            for(int j = i+1; j < n; j++) {
                if(numList.get(j) < numList.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = numList.get(i);
            numList.set(i, numList.get(minIndex));
            numList.set(minIndex, temp);

        }
        return numList;
    }
}
