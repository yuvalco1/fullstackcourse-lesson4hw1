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

//        System.out.println("please enter sum limit for calculation:");
//        int limit = scanner.nextInt();
//        int sum_meals = 0;
//
//        while (sum_meals <= limit) {
//                System.out.println("please enter meal price:");
//                int meal_price = scanner.nextInt();
//                if ((sum_meals+meal_price)>limit){
//                    break;
//                }
//                sum_meals += meal_price;
//
//           }
//        System.out.println("total sum of meals is: "+sum_meals);

//Exercise 3 loops
//loop get numbers from user , if even ignore, if odd , sum it, if negative exit , if sum > 1000 exit.

//        int sum_numbers = 0;
//        while (true) {
//            System.out.println("please enter number:");
//            int input_number = scanner.nextInt();
//            if (input_number < 0) {
//                break;
//            }
//            if (input_number % 2 == 1) {
//                sum_numbers += input_number;
//            }
//            if (sum_numbers > 1000) {
//                break;
//            }
//        }
//        System.out.println(sum_numbers);

//Exercise 4 loops
// draw a random number, ask user to guess, if lower print "too Low", if higer print "too high"; if equal print "BINGO!"
//
//        int random_num = (int) ((Math.random() * 99) + 1);
//        while (true) {
//            System.out.println("please guess the number:");
//            int input_number = scanner.nextInt();
//            if (input_number < random_num) {
//                System.out.println("too low");
//            } else if (input_number > random_num) {
//                System.out.println("too high");
//            } else {
//                System.out.println("BINGO!");
//                break;
//            }
//        }
//

//Exercise 5 loops
// print all integers from 1 to 100
        for (int i=1; i<=100; i++){
            System.out.println(i);
        }

//Exercise 6 loops
// print all even numbers from 1 to 100
        for (int i=1; i<=50; i++){
            System.out.println(i*2);
        }





    }
}