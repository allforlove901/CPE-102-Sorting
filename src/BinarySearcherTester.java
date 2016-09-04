/**
   This program tests the binary search algorithm.
*/
public class BinarySearcherTester
{  
   public static void main(String[] args)
   {  
      int[] a = new int[10];
      for (int i = 0; i < 10; i++) a[i] = i * i;
      BinarySearcher searcher = new BinarySearcher(a);
      System.out.println(searcher.search(4));
      System.out.println("Expected: 2");
      System.out.println(searcher.search(81));
      System.out.println("Expected: 9");
      System.out.println(searcher.search(0));
      System.out.println("Expected: 0");
      System.out.println(searcher.search(3));
      System.out.println("Expected: -3");
      System.out.println(searcher.search(-1));
      System.out.println("Expected: -1");
      System.out.println(searcher.search(100));
      System.out.println("Expected: -11");
   }
}