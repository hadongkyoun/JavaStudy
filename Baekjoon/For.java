package Baekjoon;

import java.util.*;

public class For {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int data = input.nextInt();

    for(int i=1; i<=9; i++){
      System.out.printf("%d * %d = %d\n", data, i, data*i);
    }

    input.close();
  }

}
