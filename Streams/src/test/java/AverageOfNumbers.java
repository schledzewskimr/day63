import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import static java.lang.Integer.parseInt;

public class AverageOfNumbers {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> inputs = new ArrayList<>();

        System.out.println("Input numbers, type 'end' to stop");
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            inputs.add(parseInt(input));
        }

        double average = inputs.stream()
                .mapToInt(Integer::valueOf)
                .average()
                .getAsDouble();

        System.out.println("inputs:");
        for (Integer input : inputs) {
            System.out.println(input);
        }
        System.out.println("average: " + average);
    }
}
