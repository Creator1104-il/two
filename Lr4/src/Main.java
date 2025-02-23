public class Main {
    public static void main(String[] args) {
        Vichislenie prim1 = new Vichislenie();
        System.out.println("Результат выражения 1: " + prim1.primer1(2.3));

        Vichislenie prim2 = new Vichislenie();
        System.out.println("Результат выражения 2: " + prim2.primer2(10.5, 5.8));

        Vichislenie prim3 = new Vichislenie();
        System.out.println("Результат выражения 3: " + prim3.primer3(3, 2.1,2.7));

    }
    public static class Vichislenie {

        public double primer1(double x) {
            double k = 3 * x + 5;
            return k;
        }
        public double primer2(double a, double b) {
            if (b == 0) {
                System.out.println("b не должно быть равно нулю");
            }
            double c = (a + b) / (a - b);
            return c;
        }
        public double primer3(double a, double b,double x) {
            double l = a*x/b;
            double r = resch(l);
            return r;
        }
        double resch(double l) {
            if (l < 1) {
                return 1;
            } else {
                return l * resch(l - 1);
            }
    }
}
}