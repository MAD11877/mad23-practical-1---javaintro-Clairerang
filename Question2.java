import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter your weight in kg: ");

    double weight = in.nextDouble();

    System.out.print("Enter your height in meters: ");

    double height = in.nextDouble();

    double bmi = weight / (height * height);

    System.out.printf("Your BMI is %.2f", bmi);
  }
}
