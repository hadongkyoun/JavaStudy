package ObjectOrientedProgramming;

interface Parseable{
  // 구문 분석 작업을 실행한다
  public abstract void parse (String fileName);
}

class ParserManager{
  public static Parseable getParser(String type){
    if(type.equals("XML"))
      return new XMLParser();
    else{
      Parseable p = new HTMLParser();
      return p;
      // same : return new HTMLParser();
    }
  }
}

class XMLParser implements Parseable{
  public void parse(String fileName){
    /* 구문 분석작업을 수행하는 코드... */
    System.out.println(fileName + "- XML parsing completed.");
  }
}

class HTMLParser implements Parseable{
  public void parse(String fileName){
    /*구문 분석작업을 수행하는 코드... */
    System.out.println(fileName + "-HTML parsing completed.");
  }
}
public class ParserTest {
  public static void main(String[] args){
    Parseable parser = ParserManager.getParser("XML");
    parser.parse("document.xml");
    parser = ParserManager.getParser("HTML");
    parser.parse("document2.html");
  }
}
