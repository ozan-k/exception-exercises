public class Main {

  public static void main(String[] args) {
    try {
      method1();
    } catch (Exception e) {
      System.err.printf("%s%n%n", e.getMessage());

      StackTraceElement[] traceElements = e.getStackTrace();
      System.out.printf("%nStack trace from getStrackTrace()%n");
      System.out.println("Class\t\t\tFile\t\t\t\t\tLine\tMethod");
      for (StackTraceElement traceElement : traceElements) {
        System.out.printf("%s\t", traceElement.getClassName());
        System.out.printf("%s\t\t", traceElement.getFileName());
        System.out.printf("%02d\t\t", traceElement.getLineNumber());
        System.out.printf("%s%n", traceElement.getMethodName());
      }

      e.printStackTrace();
    }
  }

  public static void method1() throws Exception {
    System.out.println("Method 1 called");
    method2();
  }

  public static void method2() throws Exception {
    System.out.println("Method 2 called");
    method3();
  }

  public static void method3() throws Exception {
    System.out.println("Method 3 called");
    throw new Exception("Exception thrown in method 3");
  }

}

