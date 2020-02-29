package day21;

public class NamePrinter {
    public static void main(String[] args) {

        String name = "My name is Marina";
        int charCount = name.length();
        int lastCharIndex  = charCount -1;

      for (int i =  0; i <=  lastCharIndex; i++){
  //        System.out.print (name.charAt( i )+"->");

          System.out.print(name.substring(i,i+1)+"->");
      }
//  for (int i =0; i <= charCount-2; i++){
  //      System.out.println(name.substring(i,i+2);
    }
}
