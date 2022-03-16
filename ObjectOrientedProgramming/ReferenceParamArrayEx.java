package ObjectOrientedProgramming;
public class ReferenceParamArrayEx {
  public static void main(String[] args){
    int [] arr = new int [] {3,2,1,6,5,4};

    printArr(arr); //배열의 모든 요소 출력
    sortArr(arr);
    printArr(arr);
    System.out.println("Sum="+sumArr(arr));
  }

  static void printArr(int [] arr){
    System.out.print("[");
    
    //배열의 출력하는 간단한 경우에 사용
    for(int i : arr)
      System.out.print(i+", ");
    System.out.println("]");
  }

  static void sortArr(int [] arr){
    int save, j;
    
    //삽입정렬 (insertion sort)
    for(int i=1; i<arr.length; i++){
      save = arr[i];
      j = i-1;
      while((j>=0)&&(arr[j]>save)){
        arr[j+1] = arr[j];
        j--;
      }
      arr[j+1] = save;
    }
  }

  static int sumArr(int [] arr){
    int sum = 0;
    
    for(int i=0; i<arr.length; i++)
      sum+=arr[i];
    return sum;
  }
}
