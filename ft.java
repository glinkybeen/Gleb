import java.util.Scanner;

public class ft {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Выводим сообщение для пользователя
        System.out.println("Простой калькулятор");
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result;

        // Выполняем операцию в зависимости от введённого оператора
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: неверный оператор!");
                return;
        }

        // Выводим результат
        System.out.println("Результат: " + result);
    }
}