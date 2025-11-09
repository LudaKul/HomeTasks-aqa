package School_OOP;

public class GeneralSchool {

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

        first.winnersFromFC(() ->"Ivanov, Petrov, Sidorov");
        first.winnersFromFC(()->"Sidorov, Ivanov,Petrov");

    }

}