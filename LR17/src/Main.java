import java.io.*;
import java.util.Scanner;

class SimpleCalculator {
    private double x;
    private double y;

    public double calculateY() {
        y = x - Math.sin(x);
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void save(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("x=" + x);
            writer.newLine();
            writer.write("y=" + y);
            System.out.println("Состояние объекта сохранено в " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SimpleCalculator upload(String filename) {
        SimpleCalculator calculator = new SimpleCalculator();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    if (parts[0].equals("x")) {
                        calculator.setX(Double.parseDouble(parts[1]));
                    } else if (parts[0].equals("y")) {
                        calculator.calculateY(); // пересчитываем y на основе загруженного x
                    }
                }
            }
            System.out.println("Состояние объекта загружено из " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return calculator;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleCalculator calculator = new SimpleCalculator();

        while (true) {
            System.out.print("Введите значение x (или 'exit' для выхода): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) break;

            try {
                double x = Double.parseDouble(input);
                calculator.setX(x);
                double result = calculator.calculateY();
                System.out.println("Результат y = " + result);

                System.out.print("Введите команду ('save' для сохранения, 'upload' для загрузки): ");
                String command = scanner.nextLine();

                if (command.equalsIgnoreCase("save")) {
                    calculator.save("calculator_state.txt");
                } else if (command.equalsIgnoreCase("upload")) {
                    SimpleCalculator loadedCalculator = SimpleCalculator.upload("calculator_state.txt");
                    if (loadedCalculator != null) {
                        System.out.println("Загруженное состояние:");
                        System.out.println("x = " + loadedCalculator.getX());
                        System.out.println("y = " + loadedCalculator.getY());
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите корректное число.");
            }
        }

    }
}