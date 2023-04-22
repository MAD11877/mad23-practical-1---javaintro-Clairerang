import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  { 
    Scanner in = new Scanner(System.in);
    List<Integer> num_list = new ArrayList<>();

    while (true)
    {
      // System.out.print("Enter the number of integers: ");
      int count = in.nextInt();

      // List<Integer> num_list = new ArrayList<>();
      for (int i = 0; i < count; i++) 
      {
        // System.out.print("Enter an integer: ");
        int number = in.nextInt();
        num_list.add(number);
      }
      // System.out.print(num_list);
      break;
    }

    Map<Integer, Integer> countMap = new HashMap<>();
    int max_count = 0;
    int mode = 0;
    for (int number : num_list)
    {
      int countForNumber = countMap.getOrDefault(number, 0) + 1;
      countMap.put(number, countForNumber);
      
      if (countForNumber > max_count)
      {
        max_count = countForNumber;
        mode = number;
      }

    }
    System.out.println(mode);



    
  }
}
