import School_OOP.FirstClass;
import School_OOP.Primary_School;
import School_OOP.Secondary_School;

public class Main {

    public static void main(String[] args) {
        FirstClass first = new FirstClass();
        Primary_School primary = new Primary_School();
        Secondary_School secondary = new Secondary_School();

        System.out.println(primary);
        System.out.println();
        System.out.println();
        System.out.println(first);
        System.out.println();
        System.out.println();
        System.out.println(secondary);

        FirstClass fClass = new FirstClass();
        fClass.winnersFromFC(() ->"Ivanov, Petrov, Sidorov");
        fClass.winnersFromFC(()->"Sidorov, Ivanov,Petrov");

    }

}


