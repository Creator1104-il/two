import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static String regex = "\\s?((\\b1?\\d?\\d\\b|\\b2[0-4]\\d\\b|\\b25[0-5]\\b).){3}(\\b1?\\d?\\d\\b|\\b2[0-4]\\d\\b|\\b25[0-5]\\b)\\s?";
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку с IP адресами");
        String inp = in.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inp);
        while(matcher.find())
        {
            System.out.print(inp.substring(matcher.start(),matcher.end()));
        }
    }
}