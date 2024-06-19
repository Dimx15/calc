import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение");
        String input = scanner.nextLine();
        try {
            String result = calc(input);
            System.out.println("Результат: " + result);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
      public static String calc(String input) throws Exception {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new Exception("Неверный формат ввода");
          }
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        String operation = parts[1];
        if (a < 1 || a > 10 || b < 1 || b > 10) {
            throw new Exception("числа должны быть от 1 до 10");
        }
switch (operation) {
    case "+":
        return String.valueOf(a + b);
    case "-":
        return String.valueOf(a - b);
    case "*":
        return String.valueOf(a * b);
    case "/":
            return String.valueOf(a / b);
    default:
        throw new Exception("Неподдерживаемая операция - выберите один из знаков + - * /");
}
}
}