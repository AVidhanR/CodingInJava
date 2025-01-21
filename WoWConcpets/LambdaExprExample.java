/**
 * Lambda Expressions
 */

@FunctionalInterface
interface Addition {
  int addWithReturn(int i, int j);
}

public class LambdaExprExample {
  public static void main(String[] args) {
    Addition x2 = (i, j) -> i+j;
    System.out.println(x2.addWithReturn(10, 20));
  }
}