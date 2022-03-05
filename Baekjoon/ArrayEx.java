package Baekjoon;

import java.util.*;

public class ArrayEx {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int N = input.nextInt();
    int []data = new int[N];
    int max, min;

    //배열 데이터 입력
    for(int i=0; i<data.length; i++)
      data[i] = input.nextInt();

    max = data[0];
    min = data[0];

    for(int i=1; i<data.length; i++){

      //최댓값 구하기
      if(max < data[i])
        max = data[i];

      //최솟값 구하기
      else if(min > data[i])
        min = data[i];
    }
    
    System.out.printf("%d %d", min, max);

    input.close();
   
  }

}
