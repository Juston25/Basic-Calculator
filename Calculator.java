/* This is a Calculator that is used for making basic mathematical calculations. It was created by Juston in 2021. 
*/
public class Calculator{
  public Calculator(){ 
    }
// methods for calculator//
  public int add(int a, int b){
      return a + b;
  }
  public int subtract(int a, int b){
      return a - b;
  }
  public int multiply(int a, int b){
      return a * b;
  }
  public int divide(int a, int b){
      return a / b;
  }
  public int modulo(int a, int b){
      return a % b;
  }
  public static void main(String[] args) {
Calculator myCalculator = new Calculator();
System.out.println(myCalculator.add(5,7));
System.out.println(myCalculator.subtract(45,11));
} 
}

