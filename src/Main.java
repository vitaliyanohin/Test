public class Main {

  public static void main(String[] args) {
    test();
  }

  private static int flipBit(int value, int bitIndex) {
    return value ^ (1 << --bitIndex);
  }

  private static boolean doubleExpression(double a, double b, double c) {

    return Math.abs((a + b) - c) < 1e-4;
  }

  private static int leapYear(int year) {

    return year / 4 - year / 100 + year / 400;
  }

  private static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
    boolean f = false;

    return ((a && b && c && d) ? f : (a && b && !c && !d) ? a : (a && !b && c && !d) ? a : (a && !b && !c && d) ? a :

            (!a && b && c && !d) ? b : (!a && b && !c && d) ? b : (!a && !b && c && d) ? c : f);
  }

  private static void test() {
    System.out.println("Test flipBit");
    System.out.println(flipBit(8, 3));
    System.out.println();
    System.out.println("Test doubleExpression");
    System.out.println(doubleExpression(0.3, 0.2, 0.4999));
    System.out.println(doubleExpression(0.3, 0.2, 0.4998));
    System.out.println();
    System.out.println("Test leapYear");
    System.out.println(leapYear(100));
    System.out.println();
    System.out.println("Test booleanExpression");
    System.out.println(booleanExpression(true, true, true, true));
    System.out.println(booleanExpression(false, false, false, true));
    System.out.println();
    System.out.println(booleanExpression(true, true, false, false));
    System.out.println(booleanExpression(true, false, true, false));
    System.out.println(booleanExpression(true, false, false, true));
    System.out.println();
    System.out.println(booleanExpression(false, true, true, false));
    System.out.println(booleanExpression(false, true, false, true));
    System.out.println();
    System.out.println(booleanExpression(false, true, true, true));
    System.out.println(booleanExpression(true, true, true, false));
    System.out.println();
    System.out.println(booleanExpression(false, false, false, true));
    System.out.println(booleanExpression(true, false, false, false));

  }

}
