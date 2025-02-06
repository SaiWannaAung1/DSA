package searching;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<String> personList = new ArrayList<>(
                Arrays.asList("Robin","Lutin","Martin","Cake","Brownie")
        );
//        personList.sort(Comparator.naturalOrder());
        Collections.sort(personList);
        boolean result = new BinarySearch().impl("Martin",personList);
        JOptionPane.showMessageDialog(null, result);

    }

    boolean impl(String searchText, ArrayList<String> personList) {
        int left = 0, right = personList.size() - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (searchText.equals(personList.get(middle))){
                return true;
            }

            if (personList.get(middle).compareTo(searchText) < 0){
                left = middle + 1;
            }else {
                right = middle - 1;
            }
        }

        return false;
    }
}
