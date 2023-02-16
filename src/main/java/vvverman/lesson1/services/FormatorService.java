package vvverman.lesson1.services;

public class FormatorService {

    public static String getRubleAddition(double formattedResult) {


        int lastCharacter = (int) (Math.floor(formattedResult) % 10);
        String result = String.format("%.2f", formattedResult);
        switch (lastCharacter) {

            case 1:
                return result + " рубль";
            case 2:
            case 3:
            case 4:
                return result + " рубля";
            default:
                return result + " рублей";

        }
    }
}
