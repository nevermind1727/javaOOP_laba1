/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package skip;

public class App {
    public static void main(String[] args) {
        double a = (20+Math.random()*(30-20));
        double b = (40+Math.random()*(50-40));
        System.out.println("Variable a = " + a);
        System.out.println("Variable b = " + b);
        myNumbersProcessing(a, b);
    }
    public static void myNumbersProcessing(double a, double b) {
        System.out.println("Sum of variables = " + (a+b));
        System.out.println("Multiplied variables = " + (a*b));
    }
}
