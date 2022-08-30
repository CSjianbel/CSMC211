package Num_years;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number of minutes: ");
    int mins = input.nextInt();
    int days = mins / 1440;
    int years = days / 365;
    days = days % 365;
    System.out.printf("%d minutes is approximately %d years and %d days\n", mins, years, days);
    input.close();
  } 
}
