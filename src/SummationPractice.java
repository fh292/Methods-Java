import java.util.ArrayList;
public class SummationPractice {
    public static void main(String[] args) {

        //Declare and Initialize an ArrayList:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);

        //Test Your Summation Method:
        int sumOfList = summation(numbers);

        // Output the Result:
        System.out.println(sumOfList);
    }
    //Create a Method for Summation:
    static int summation(ArrayList<Integer> numbers) {
            //Implement Summation Logic:
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum;
    }

    }
