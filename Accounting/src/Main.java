import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int userInput = scanner.nextInt();
            if (userInput == 1) {

            } else if (userInput == 2) {

            } else if (userInput == 3) {

            } else if (userInput == 4) {

            } else if (userInput == 5) {

            } else if (userInput != 0) {
                System.out.println("Неправильная команда, попробуйте заново");
            } else {
                System.out.println("Программа завершена");
                break;
            }
        }
    }

    private static void printMenu() {
        System.out.println(" ");
        System.out.println("Введите номер команды:");
        System.out.println("1-Считать все месячные отчеты");
        System.out.println("2-Считать годовой отчёт");
        System.out.println("3-Сверить отчёты");
        System.out.println("4-Вывести информацию о всех месячных отчётах");
        System.out.println("5-Вывести информацию о годовом отчёте");
        System.out.println("0-Выйти из приложения");
    }
}
