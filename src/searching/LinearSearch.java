package searching;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        new LinearSearch().impl("Martin");
    }
    public  void impl(String searchKey){
        ArrayList<String> personList = new ArrayList<>(
                Arrays.asList("Robin","Lutin","Martin","Cake","Brownie")
        );
        for (String person: personList) {
            if (person.equals(searchKey)){
                JOptionPane.showMessageDialog(null,"Find "+person+" at index "+ personList.indexOf(person));
            }
        }
    }
}
