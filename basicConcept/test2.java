package basicConcept;
import java.util.*;

public class test2 {
  
  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  String input = scanner.nextLine();

  int num = Integer.parseInt(input);

  System.out.println("입력내용: "+input);
  System.out.printf("num=%d", num);

  scanner.close();
  }
}

