import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Exercise 1 loops
//get numbers from user until user enter -1, calculate how many numbers, sum of them abd average
        Scanner scanner = new Scanner(System.in);
//
//        int numbers_of_numbers = 0;
//        int sum_of_numbers = 0;
//        int input_number = 0;
//        while (input_number != -1) {
//            System.out.println("please enter number for calculation, to finish enter -1:");
//            input_number = scanner.nextInt();
//            if (input_number == -1) {
//                break;
//            }
//            sum_of_numbers += input_number;
//            numbers_of_numbers++;
//
//        }
//        float average = sum_of_numbers / numbers_of_numbers;
//        System.out.println("The average of " + numbers_of_numbers + " numbers is " + average + " . The sum of all numbers is: " + sum_of_numbers);

//Exercise 2 loops
//get numbers from user represents meal prices until user enter -1, first get maximum sum, i.e. 500 Nis , check sum before pass limit.
        System.out.println("please enter sum limit for calculation:");
        int limit = scanner.nextInt();
        int sum_meals = 0;

        while (sum_meals <= limit) {
                System.out.println("please enter meal price:");
                int meal_price = scanner.nextInt();
                if ((sum_meals+meal_price)>limit){
                    break;
                }
                sum_meals += meal_price;

           }
        System.out.println("total sum of meals is: "+sum_meals);
    }
}