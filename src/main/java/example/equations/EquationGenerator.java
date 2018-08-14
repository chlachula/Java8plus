package example.equations;

/** Sum of numbers divisible by 3 or 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 100 and create equation. For list below 10 it would be "3+5+6+9=23".
 */
public class EquationGenerator {

    protected boolean divisible(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    protected String generate(int max) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        String plus = "";
        for (int i = 1; i < max; i++) {
            if (divisible(i)) {
                sb.append(plus);
                sb.append(i);
                sum += i;
                plus = "+";
            }
        }
        return sb.toString() + "=" + sum;
    }

    private int nextDivisible2(int i){
        while (!divisible(i)) i += 1;
        return i;
    }

    protected String generate2(int max) {
        int i = nextDivisible2(1);
        int sum = i;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        i = nextDivisible2(i+1);
        while (i < max){
            sb.append('+');
            sb.append(i);
            sum += i;
            i = nextDivisible2(i+1);
        }
        return sb.toString() + "=" + sum;
    }

    public static void main(String[] args) {
        EquationGenerator a = new EquationGenerator();
        System.out.println(a.generate(100));
        System.out.println(a.generate2(100));
    }

}
