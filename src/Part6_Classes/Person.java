package Part6_Classes;

import java.time.Year;

public class Person {
    private String name;
    private String surname;
    private int birthYear;
    public final int COMING_OF_AGE = 18;
    public Person(){
        setName("Not set");
        setSurName("Not set");
        setBirthYear(0);
    }
    //
    public Person(String newName, String newSurName, int newBirthYear){
        setName(newName);
        setSurName(newSurName);
        setBirthYear(newBirthYear);
    }

    //getters
    public String getName(){
        return name;
    }
    public String getSurName(){
        return surname;
    }
    public int getBirthYear(){
        return birthYear;
    }
    //setters
    public void setName(String newName){
        name = newName;
    }
    public void setSurName(String newSurName){
        surname = newSurName;
    }
    public void setBirthYear(int newBirthYear){
        birthYear = newBirthYear;
    }

    public void printPersonInfo(){
        System.out.printf("This Person's name is %s, surname %s, birth year is %d, \n Adult = %b \n", name, surname
                , birthYear, isAdult());
    }

    public boolean isAdult(){
        int CurrentYear = Year.now().getValue();
        boolean result = (CurrentYear - birthYear)>=COMING_OF_AGE;
        return result;
    }
}
