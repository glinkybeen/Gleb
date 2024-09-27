import java.util.Scanner;

public class ft {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Приветствую!");

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.println("Введите числа (вводите по одному, для завершения введите 'exit'):");

        double result = 0;
        boolean firstInput = true;

        while (true) {
            String input = scanner.next();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            double num;
            try {
                num = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число или 'exit' для завершения!");
                continue;
            }
            if (firstInput) {
                result = num;
                firstInput = false;
            } else {
                switch (operator) {
                    case '+':
                        result += num;
                        break;
                    case '-':
                        result -= num;
                        break;
                    case '*':
                        result *= num;
                        break;
                    case '/':
                        if (num != 0) {
                            result /= num;
                        } else {
                            System.out.println("Ошибка: деление на ноль!");
                            return;
                        }
                        break;
                    default:
                        System.out.println("Ошибка: неверный оператор!");
                        return;
                }
            }
        }
        System.out.println("Результат: " + result);
    }
}
