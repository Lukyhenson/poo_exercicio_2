import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Person registerPerson() {
        Person person = new Person();
        Scanner input = new Scanner(System.in);

        System.out.println("Put person name: ");
        person.setName(input.nextLine());

        System.out.println("Put person age: ");
        person.setAge(input.nextInt());

        System.out.println("Put person genre: [male or female]");
        person.setGenre(input.next());

        return person;
    }

    public static void menu() {
        ArrayList<Person> people = new ArrayList<>();

        int option = 0;

        do {
            System.out.println("=================    MENU    ==================");
            System.out.println("| 1 - REGISTER");
            System.out.println("| 2 - GET ALL PERSONS");
            System.out.println("| 3 - GET A PERSON");
            System.out.println("| 4 - EXIT");
            System.out.println("===============================================");

            Scanner input = new Scanner(System.in);

            option = input.nextInt();

            System.out.print("\n");
            switch (option) {
                case 1:
                    System.out.println("================= Register =================");

                    Person person = registerPerson();
                    people.add(person);

                    System.out.println(" ");
                    break;
                case 2:
                    if (people.size() == 0) {
                        System.out.println("You don't have any person registered!");
                    } else {
                        System.out.println("All users registereds on your database!");

                        for (Person ps : people) {
                            ps.getAllInfo();
                        }
                    }

                    break;
                case 3:
                    System.out.println("Select a person to get all info about her:");

                    int ps = input.nextInt();

                    if (ps > people.size()) {
                        System.out.println("Your database contains only " + people.size());
                    } else {
                        people.get(ps).getAllInfo();
                    }

                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("TRY ANOTHER VALUE!");
                    break;
            }
        } while (option != 0);
    }

    public static void main(String args[]) {
        menu();
        System.out.println("Program finished.");
    }
}
