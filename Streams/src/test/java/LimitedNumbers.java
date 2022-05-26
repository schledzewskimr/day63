import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();

        System.out.println("enter integers, enter negative number to run");
        while(true){
            int input = scanner.nextInt();
            if(input<0){
                break;
            }
            inputs.add(input);
        }
        inputs.stream()
                .filter(x -> x>=1 && x<=5)
                .forEach(x -> System.out.println(x));
    }
}
