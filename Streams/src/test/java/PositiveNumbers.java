import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class PositiveNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        System.out.println("enter a bunch of numbers, 'end' to run");
        while(true){
            String input = scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            numberList.add(parseInt(input));
        }
        System.out.println("positive numbers are: ");
        for(int i = 0; i < positive(numberList).size(); i++){
            System.out.println(positive(numberList).get(i));
        }
    }
    public static List<Integer> positive(List<Integer> numbers){
        return numbers
                .stream()
                .filter(x -> x>0)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
