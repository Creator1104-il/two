import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextDouble();
        x = Math.abs(x);
        if (x<=1) {
            System.out.print("Введите n: ");
            int n = in.nextInt();
            double sum;
            double a = 1;
            double b = 2 * 3;
            for (double i = 1; i <= n; i++) {

                x = Math.pow(x,3);
                for (double j = 1; j < i; j = j + 2) {
                    x=x*Math.pow(1,2);
                    a = a * j*(x);
                }

                for (double k = 1; k < i; k = k + 2) {
                    b = b * k;
                }

            }
            sum = x + a / b;
            System.out.print(sum);
        }
        else
            System.out.print("X должен быть меньше 1");
    }
}