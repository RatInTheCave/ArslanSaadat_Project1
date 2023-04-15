package Part3_ArrayLists;

import java.util.ArrayList;

public class ArrayListsPart2 {

    public static void main(String[] args) {
        arrayListToEdit();
        listOfNames();
    }

    public static void arrayListToEdit() {
        ArrayList<Integer> ExampleList = new ArrayList<>();
        int i;
        for (i = 0; i <= 6; i++) {
            ExampleList.add(i);
        }
        arrayListRemove(ExampleList, 2);
    }
    public static void arrayListRemove(ArrayList ExampleList, int value) {
        System.out.println("\n");
        System.out.println("Value that this code removes: 2");
        System.out.println(ExampleList + " Before arrayListRemove");
        while (ExampleList.indexOf(value) > 0) {
            ExampleList.remove(ExampleList.indexOf(value));
        }
        System.out.println(ExampleList + " After arrayListRemove");
    }

    public static void listOfNames(){
        ArrayList<String> ListOfNames = new ArrayList<>();
        ListOfNames.add("Benny");
        ListOfNames.add("Robert");
        ListOfNames.add("Joe");
        ListOfNames.add("Simba");
        ListOfNames.sort(null);
        insertName(ListOfNames, "Kevin");
        System.out.println(ListOfNames);
    }
    public static void insertName(ArrayList<String> ListOfNames, String name){
        String objectName = new String(name);
        for (int i = 0; i < ListOfNames.size()-1; i++){
            if (objectName.compareTo(ListOfNames.get(i)) < 0){
                ListOfNames.add(i, name);
                break;
            }
        }
    }
}
