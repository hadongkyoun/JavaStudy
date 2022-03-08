package Baekjoon.Array;

import java.util.*;

public class ArrayEx2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int []data = new int[9];
    int max, pos;

    //배열 데이터 입력
    for(int i=0; i<data.length; i++)
      data[i] = input.nextInt();

    max = data[0];
    //첫번째 숫자
    pos = 1;


    for(int i=1; i<data.length; i++){
      //최댓값과 그 위치
      if(max < data[i]){
        max = data[i];
        pos = i+1;
      }
    }
    
    System.out.printf("%d\n%d", max, pos);

    input.close();
   
  }

}
