package Baekjoon;

import java.util.*;

public class ArrayEx4 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   
    int[] numbers = new int[1001];
    int data, cnt = 0;

    for(int i=0; i<10; i++){
      data = input.nextInt();
      numbers[data%42]++;
    }
    
    for(int i=0; i<1001; i++){
      if(numbers[i] != 0)
        cnt++;
    }

    System.out.println(cnt);
    input.close();
  }
}
