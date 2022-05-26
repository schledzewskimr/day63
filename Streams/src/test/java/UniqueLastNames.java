import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();

        while(true){
            System.out.println("Continue personal information input? 'quit' ends:");
            String cont = scanner.nextLine();
            if(cont.equals("quit")){
                break;
            }
            System.out.println("input first name:");
            String fName = scanner.nextLine();
            System.out.println("input last name:");
            String lName = scanner.nextLine();
            inputs.add(lName);
            System.out.println("input year of birth");
            String year = scanner.nextLine();
        }
        System.out.println("unique last names in alphabetical order:");
        inputs.stream()
                .distinct()
                .sorted()
                .forEach(x -> System.out.println(x));

    }
}
