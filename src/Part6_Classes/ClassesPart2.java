package Part6_Classes;

public class ClassesPart2 {
    public static void main(String[] args) {
        Person MrFinnigan = new Person();
        MrFinnigan.printPersonInfo();
        Person RyanGrant = new Person("Ryan", "Grant", 2005);
        if (RyanGrant.isAdult()){
            System.out.println(RyanGrant.getName() + RyanGrant.getSurName() + "Is an adult");
        }
        else{
            System.out.println(RyanGrant.getName() + RyanGrant.getSurName() + "Is not an adult");
        }
    }
}
