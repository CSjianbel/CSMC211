package Find_future_dates;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    System.out.print("Enter today's day: ");
    int today = input.nextInt();

    System.out.print("Enter the number of days elapsed since today: ");
    int elapsed = input.nextInt();

    int future = (today + elapsed) % 7;

    System.out.printf("Today is %s and the future day is %s\n", days[today], days[future]);

    input.close();
  }
}
