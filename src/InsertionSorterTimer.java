import java.util.Scanner;

/**
   This program tests the insertion sort algorithm by
   sorting an array that is filled with random numbers.
*/
public class InsertionSorterTimer
{  
   public static void main(String[] args)
   {  
      Scanner in = new Scanner(System.in);
      System.out.print("Enter array size: ");
      int n = in.nextInt();

      // Construct random array
   
      int[] a = ArrayUtil.randomIntArray(n, 100);
      InsertionSorter sorter = new InsertionSorter(a);
      
      // Use stopwatch to time insertion sort
      
      StopWatch timer = new StopWatch();
      
      timer.start();
      sorter.sort();
      timer.stop();
      
      System.out.println("Elapsed time: " 
            + timer.getElapsedTime() + " milliseconds");
   }
}