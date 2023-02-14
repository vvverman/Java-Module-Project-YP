import java.util.Scanner;


public class Main {

    public static void main(final String[] args) {

        System.out.println("На сколько персон разделить счёт, Господа?");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        countPersons(int number);






        System.out.println("Введите имя товара");
        String name = scanner.nextLine();

        System.out.println("Введите цену товара");
        double price = scanner.nextDouble();

        getProductAndPrice(String name, double price);

        double count = 0.0;
        String listProduct = "Добавленные товары:\n ";







        String result = String.format("%.2f", count);

        double formattedResult = Double.parseDouble(result.replace(',','.'));
        String rubString = GetRubleAddition(formattedResult);

        System.out.println("Каждый должен заплатить: " + result + " " + rubString);
        System.out.println(listProduct);

        scanner.close();

    }











    // МЕТОД НИЖЕ ДОБИВАЕТСЯ НОРМАЛЬНОГО КОЛИЧЕСТВА ПЕРСОН, НА КОТОРЫХ БУДУТ ДЕЛИТЬ СЧЁТ
    public static int countPersons(int number) {

        while (true) {


            if (number == 1) {
                System.out.println("Ошибка, на одного делить нет смысла");
            } else if (number < 1) {
                System.out.println("Ошибка, на 0, вообще, делить незя, и антиматерия в нашей задаче не участвует");
            } else if (number > 1) {
                total = count / number;

                double value = total;
                String result = String.format("%.2f", value);

            }
        }
    }

// МЕТОД ВЫШЕ ДОБИВАЕТСЯ НОРМАЛЬНОГО КОЛИЧЕСТВА ПЕРСОН, НА КОТОРЫХ БУДУТ ДЕЛИТЬ СЧЁТ










// МЕТОД НИЖЕ СОБИРАЕТ ТОВАРЫ И ЦЕНЫ НА НИХ

    public static int getProductAndPrice(String name, double price) {

        while (true) {

            if (price > 0) {
                listProduct = listProduct + "\n" + name + "\n";
                count = count + price;

                System.out.println("Товар добавлен успешно");
                System.out.println("Добавить ещё один товар?");

                String agreement = scanner.nextLine();

                if (agreement.equalsIgnoreCase("завершить")) break;

            }
        }
    }
// МЕТОД ВВЫШЕ СОБИРАЕТ ТОВАРЫ И ЦЕНЫ НА НИХ








// МЕТОД НИЖЕ РАЗБИРАЕТСЯ С ПРОБЛЕМОЙ "-БЛЯ"

    public static String GetRubleAddition(double formattedResult) {

    }
    int lastCharacter = (int) (Math.floor(formattedResult) % 10);

                        switch (lastCharacter) {

        case 1:
            return "рубль";
        case 2:
        case 3:
        case 4:
            return "рубля";
        default:
            return "рублей";

    }w

// МЕТОД ВЫШЕ РАЗБИРАЕТСЯ С ПРОБЛЕМОЙ "-БЛЯ"

}