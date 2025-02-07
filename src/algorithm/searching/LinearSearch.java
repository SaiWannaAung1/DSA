package algorithm.searching;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        ArrayList<String> personList = new ArrayList<>(
                Arrays.asList("Robin","Lutin","Martin","Cake","Brownie")
        );
        new LinearSearch().impl("Martin",personList);
    }

    public  void impl(String searchKey, ArrayList<String> personList){

        for (String person: personList) {
            if (person.equals(searchKey)){
                JOptionPane.showMessageDialog(null,"Find "+person+" at index "+ personList.indexOf(person));
            }
        }
    }


}
