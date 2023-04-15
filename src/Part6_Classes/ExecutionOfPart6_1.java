package Part6_Classes;

public class ExecutionOfPart6_1 {
    public static void main(String[] args) {
        ClassesPart1 Part6 = new ClassesPart1();
        Part6.incrementCount();
        System.out.println(Part6.getInstanceCount());
        ClassesPart1 Object1 = new ClassesPart1();
        ClassesPart1 Object2 = new ClassesPart1();
        ClassesPart1 Object3 = new ClassesPart1();
        ClassesPart1 Object4 = new ClassesPart1();
        ClassesPart1 Object5 = new ClassesPart1();
        ClassesPart1 Object6 = new ClassesPart1();
        System.out.println( "Total object count: "+ Part6.getInstanceCount());
    }



}
