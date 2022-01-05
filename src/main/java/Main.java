import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String commandLine = "";
        String[] arguments;

        Scanner in = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (!commandLine.equals("quit")) {
            System.out.println("Input: ");
            commandLine = in.nextLine();
            arguments = commandLine.split(" ");
            int answer;

            switch (arguments[0]) {
                case "add":
                    answer = calc.add(Integer.parseInt(arguments[1]), Integer.parseInt(arguments[2]));
                    break;
                case "subtract":
                    answer = calc.subtract(Integer.parseInt(arguments[1]), Integer.parseInt(arguments[2]));
                    break;
                case "multiply":
                    answer = calc.multiply(Integer.parseInt(arguments[1]), Integer.parseInt(arguments[2]));
                    break;
                case "divide":
                    answer = calc.divide(Integer.parseInt(arguments[1]), Integer.parseInt(arguments[2]));
                    break;
                case "fib":
                    answer = calc.fibonacciNumberFinder(Integer.parseInt(arguments[1]));
                    break;
                case "binary":
                    System.out.println("Output: " + calc.intToBinaryNumber(Integer.parseInt(arguments[1])));
                    continue;
                default:
                    answer = 0;
            }

            System.out.println("Output: " + answer);
        }
    }
}
