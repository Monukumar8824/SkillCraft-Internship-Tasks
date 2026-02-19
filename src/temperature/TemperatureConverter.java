package temperature;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Advanced Temperature Converter ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("\nEnter your choice (1-6): ");
        
        int choice = sc.nextInt();
        double input, result;

        switch (choice) {
            case 1: // C to F
                System.out.print("Enter Celsius: ");
                input = sc.nextDouble();
                result = (input * 9 / 5) + 32;
                System.out.printf("%.2f°C = %.2f°F\n", input, result);
                break;
            case 2: // C to K
                System.out.print("Enter Celsius: ");
                input = sc.nextDouble();
                result = input + 273.15;
                System.out.printf("%.2f°C = %.2fK\n", input, result);
                break;
            case 3: // F to C
                System.out.print("Enter Fahrenheit: ");
                input = sc.nextDouble();
                result = (input - 32) * 5 / 9;
                System.out.printf("%.2f°F = %.2f°C\n", input, result);
                break;
            case 4: // F to K
                System.out.print("Enter Fahrenheit: ");
                input = sc.nextDouble();
                result = (input - 32) * 5 / 9 + 273.15;
                System.out.printf("%.2f°F = %.2fK\n", input, result);
                break;
            case 5: // K to C
                System.out.print("Enter Kelvin: ");
                input = sc.nextDouble();
                result = input - 273.15;
                System.out.printf("%.2fK = %.2f°C\n", input, result);
                break;
            case 6: // K to F
                System.out.print("Enter Kelvin: ");
                input = sc.nextDouble();
                result = (input - 273.15) * 9 / 5 + 32;
                System.out.printf("%.2fK = %.2f°F\n", input, result);
                break;
            default:
                System.out.println("Invalid Choice!");
        }

        // Resource leak fix
        sc.close();
    }
}