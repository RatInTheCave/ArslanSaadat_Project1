package Part3_ArrayLists;

import java.util.ArrayList;

public class ArrayListsPart1 {

    public static void main(String[] args) {
        System.out.println("ARRAYLIST FOR INTEGERS \n");
        IntegerArrayList();
        System.out.println("ARRAYLIST FOR STRINGS \n");
        StringArrayList();
    }

    public static void IntegerArrayList() {
        ArrayList<Integer> IntegerList = new ArrayList<>();
        int i;
        for (i = 0; i <= 6; i++) {
            IntegerList.add(i);
        }
        System.out.println(IntegerList + " Original ArrayList for Integers\n");
        IntegerList.add(4, 2);
        System.out.println(IntegerList + " Added  an element\n");
        IntegerList.set(3, 5);
        System.out.println(IntegerList + " Set an element\n");
        System.out.println(IntegerList.get(3) + " = requested element of the ArrayList\n");
        IntegerList.remove(3);
        System.out.println(IntegerList + " remove an element\n");
        IntegerList.addAll(3, IntegerList);
        System.out.println(IntegerList + " Added ArrayList at the given position\n");
        System.out.println(IntegerList.indexOf(4) + " Given Index in the ArrayList for a given element\n");
        System.out.println("Iterating through the array\n");
        for (int element : IntegerList) {
            System.out.print(element + " ");
        }
        System.out.println("\n");
        System.out.println(IntegerList.size() + " Size of the IntegerList ");
    }

    public static void StringArrayList() {
        ArrayList<String> StringList = new ArrayList<>();
        int n;
        for (n = 0; n <= 6; n++) {
            StringList.add("String" + n);
        }
        System.out.println(StringList + " Original ArrayList for Strings \n");
        StringList.add(5, "STRING6");
        System.out.println(StringList + " Added  an element\n");
        StringList.set(2, "gnirts3");
        System.out.println(StringList + " Set an element\n");
        System.out.println(StringList.get(1) + " = requested element of the ArrayList\n");
        StringList.remove(2);
        System.out.println(StringList + " remove an element\n");
        StringList.addAll(5, StringList);
        System.out.println(StringList + " Added ArrayList at the given position\n");
        System.out.println(StringList.indexOf("String1") + " Given Index in the ArrayList for a given element\n");
        System.out.println("Iterating through the array\n");
        for (String element : StringList) {
            System.out.print(element + ", ");
        }
        System.out.println("\n");
        System.out.println(StringList.size() + " Size of the StringList");
    }

}



