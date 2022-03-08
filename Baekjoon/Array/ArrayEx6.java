package Baekjoon.Array;

import java.util.*;

public class ArrayEx6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int C = input.nextInt(), N, goodStudent;
    int[][] scores = new int [C][];
    double avg;

    for(int i=0; i<C; i++){
      goodStudent = 0;
      avg = 0.0;

      N = input.nextInt();
      scores[i] = new int[N];
      
      //각 케이스 평균
      for(int j=0; j<scores[i].length; j++){
        scores[i][j] = input.nextInt();
        avg += (double) scores[i][j];
      }
      avg = avg/N;

      //평균 이상 학생
      for(int j=0; j<scores[i].length; j++)
          if(avg < scores[i][j])
            goodStudent++;
    
      
      System.out.printf("%.03f%%\n", (double)goodStudent/N*100);
    }

    input.close();

   
  }
}
