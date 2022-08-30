import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number between 0 and 1000: ");
    int num = input.nextInt();

    int res = 1, copy = num;
    while (num != 0) {
      res *= num % 10;
      num /= 10;
    }

    System.out.println("The multiplication of all digits in " + copy + " is " + res);

    input.close();
  }
}