import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import static java.lang.Integer.parseInt;
public class AverageOfSelectedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();

        System.out.println("Input numbers, type 'end' to stop");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(parseInt(input));
        }
        double average = inputs.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();

        System.out.println("Print the average of negative numbers or positive numbers p/n");
        String selected = scanner.nextLine();
        if(selected.equals("n")){
            double selectedAverage = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(input -> input<0)
                    .average()
                    .getAsDouble();
            System.out.println("negative average = " + selectedAverage);
        }
        else if(selected.equals("p")){
            double selectedAverage = inputs.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(input -> input>0)
                    .average()
                    .getAsDouble();
            System.out.println("positive average = " + selectedAverage);
        }
        else{
            System.out.println("not an option");
        }
    }
}
