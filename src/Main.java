import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your expression (e.g., 5 + 3):");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");

        if (parts.length != 3) {
            System.out.println("Invalid input format!");
        } else {
            try {
                int firstNum = Integer.parseInt(parts[0]);
                String operation = parts[1];
                int secondNum = Integer.parseInt(parts[2]);

                switch (operation) {
                    case "+":
                        System.out.println("Result: " + (firstNum + secondNum));
                        break;
                    case "/":
                        if (secondNum != 0) {
                            System.out.println("Result: " + (firstNum / secondNum));
                        } else {
                            System.out.println("Error: Division by zero!");
                        }
                        break;
                    case "-":
                        System.out.println("Result: " + (firstNum - secondNum));
                        break;
                    case "*":
                        System.out.println("Result: " + (firstNum * secondNum));
                        break;
                    default:
                        System.out.println("Error: Invalid operation!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format!");
            }
        }
    }
}
