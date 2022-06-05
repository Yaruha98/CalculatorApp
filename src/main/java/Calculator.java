public class Calculator {

    int add(int x, int y) {
        while (y != 0) {
            int c = x & y;
            x = x ^ y;
            y = c << 1;
        }
        return x;
    }

    int substract(int x, int y) {
        while (y != 0) {
            int b = (~x) & y;
            x = x ^ y;
            y = b << 1;
        }
        return x;
    }


    int multiply(int x, int y) {
        if (y == 0)
            return 0;
        if (y > 0)
            return (add(x, multiply(x, substract(y, 1))));
        if (y < 0)
            return -multiply(x, -y);
        return -1;
    }

    int power(int x, int y) {
        if (y == 0)
            return 1;
        int answer = x;
        int increment = x;
        int i, j;
        for (i = 1; i < y; i++) {
            for (j = 1; j < x; j++) {
                answer = add(answer, increment);
            }
            increment = answer;
        }
        return answer;
    }

    // Udało się zrobić tylko z operatorem '-'
    public double divide(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("by zero");
        }

        double i = 0;
        while (x >= y) {
            x = x - y;
            i++;
        }
        return i;
    }


    public static void main(String[] args) {
        Test2012 test2012 = new Test2012();
        test2012.print();
    }
}
