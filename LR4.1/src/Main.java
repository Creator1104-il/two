public class Main {
    public static void main(String[] args) {
        Vichislenie prim1 = new Vichislenie();
        System.out.println("Результат выражения 1: " + prim1.primer1(2.3));

        Vichislenie prim2;
        prim2 = new Vichislenie();

        if (prim2.primer2(3,10.5) == 0){
            System.out.println("выражение не может быть выполнено!");
        }else {
            System.out.println("Результат выражения 2: " + prim2.primer2(3, 10.5));
        }
        Vichislenie prim3 = new Vichislenie();
        System.out.println("Результат выражения 3: " + prim3.primer3(3, 2, 2));
    }
    public static class Vichislenie {
        private double c;
        public double primer1(double x) {
            double k = 3 * x + 5;
            return k;
        }

        public double primer2(double a, double b) {
            if (b == 0) {
                System.out.println("b не должно быть равно нулю");
            } else if (a == b) {
                System.out.print("a не должно быть равно b, ");
            } else {
                c = (a + b) / (a - b);

            }
            return c;
        }

        public double primer3(int a, int b, int x) {
            int l = a * x / b;
            int r = resch(l);
            return r;
        }

        int resch(int l) {
            int res = 1;
            while(l>1){
                res *= l;
                l-=1;
            }
            return res;
        }

    }
}