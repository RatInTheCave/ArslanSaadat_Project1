package Part6_Classes;

public class ClassesPart1 {

    private static int instanceCounter;
        //instanceCounter is private because it is an instance variable, and instance variables are usually declared private so that they are only usable within this class.

        //Constructor
    public ClassesPart1(){
        incrementCount();
        System.out.println(instanceCounter);

    }
    public static int incrementCount(){
        return ++instanceCounter;
        //incrementCount is public, since we need to call it from a different class.
    }

    public int getInstanceCount(){
        return instanceCounter;
        //getInstanceCount is public, for the same reason incrementCount is public. We need to be able to access it from a different method.
    }

}
/*
    Create static variable instanceCounter
    Create static method incrementCount(), which increments instanceCounter
    Create constructor, which call incrementCount() and output to console current count value
    Create getter method getInstanceCount() for instanceCounter
    Demonstrate usage of the class
        Create several objects of the class
        Demonstrate that instance count is working
        Print total count of the objects
*/
