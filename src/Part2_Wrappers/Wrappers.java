package Part2_Wrappers;

public class Wrappers {
    public static void main(String[] args) {
        Integer I = new Integer(123);
        Double D = new Double(456.1);
        Character C = new Character('F');
        Boolean B = new Boolean(true);
        Integer a = new Integer(2);
        Integer b = new Integer(3);
        System.out.println("Demonstration of intValue, doubleValue, charValue and booleanValue");
        System.out.println(I.intValue());
        System.out.println(D.doubleValue());
        System.out.println(C.charValue());
        System.out.println(B.booleanValue());
        System.out.println("Demonstration of compareTo");
        System.out.println(I.compareTo(1000));
        System.out.println(I.compareTo(123));
        System.out.println(I.compareTo(a));
        System.out.println(C.compareTo('G'));
        System.out.println("Comparing a+b and a.toString+b.toString. a = 2 and b = 3");
        System.out.println(a+b);
        System.out.println(a.toString()+b.toString());
        System.out.println("Demonstration of parseInt");
        System.out.println(I.parseInt("1"));
        System.out.println("Demonstration of hashcode");
        System.out.println(B.hashCode());

    }


}
