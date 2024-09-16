package vvverman.lesson1.services;

import java.util.Scanner;

public class CalculatorService {
    public static double getSumForPersons(double sum) {

        double total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько персон разделить счёт, Господа?");
        while (scanner.hasNextInt()) {
            int numberOfPersons = scanner.nextInt();
            if (numberOfPersons == 1) {
                System.out.println("Ошибка, на одного делить нет смысла");
            } else if (numberOfPersons < 1) {
                System.out.println("Ошибка, на 0, вообще, делить незя, и антиматерия в нашей задаче не участвует");
            } else {
                total = sum / numberOfPersons;
                break;
            }
            System.out.println("Попробуй ещё раз");
        }
        return total;
    }

}


//    public static int countPersons(int number) {
//
//        while (scanner.hasNextInt()) {
//
//
//            if (number == 1) {
//                System.out.println("Ошибка, на одного делить нет смысла");
//            } else if (number < 1) {
//                System.out.println("Ошибка, на 0, вообще, делить незя, и антиматерия в нашей задаче не участвует");
//            } else if (number > 1) {
//                total = count / number;
//
//                double value = total;
//                String result = String.format("%.2f", value);
//
//            }
//        }