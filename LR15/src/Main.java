import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для поиска IP-адресов:");

        String text = scanner.nextLine();
        String ipRegex = "\\s?((\\b1?\\d?\\d\\b|\\b2[0-4]\\d\\b|\\b25[0-5]\\b).){3}(\\b1?\\d?\\d\\b|\\b2[0-4]\\d\\b|\\b25[0-5]\\b)\\s?";

        Pattern pattern = Pattern.compile(ipRegex);
        Matcher matcher = pattern.matcher(text);

        boolean found = false; // Флаг для проверки наличия корректного IP-адреса

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ip_addresses.txt", true))) { // Открываем файл для записи
            while (matcher.find()) {
                String ipAddress = matcher.group().trim(); // Обрезаем пробелы
                System.out.println("Найден корректный IP-адрес: " + ipAddress);
                writer.write("Найден корректный IP-адрес: " + ipAddress);
                writer.newLine(); // Переход на новую строку
                found = true;
            }
            if (!found) {
                String message = "Корректные IP-адреса не найдены.";
                System.out.println(message);
                writer.write(message); // Записываем сообщение в файл
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace(); // Обработка исключений
        }

        scanner.close(); // Закрываем сканнер

    }
}