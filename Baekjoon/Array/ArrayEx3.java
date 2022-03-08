package Baekjoon.Array;

import java.util.*;

public class ArrayEx3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    //A, B, C 입력
    int A = input.nextInt(), B = input.nextInt(), C = input.nextInt();

    String res = Integer.toString(A*B*C);
    int[] num = new int[10];
    int N;
    
    for(int i=0; i<res.length(); i++){
      N = Character.getNumericValue(res.charAt(i));
      num[N]++;
    }

    for(int i=0; i<10; i++)
      System.out.println(num[i]);
    
    input.close();
  }


}
