import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexBasics {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    String[] regexes = new String[3];
    String[] types = {"hex color code","phone number","email address"};
    regexes[0] = "^[a-f[A-F[0-9]]]{6}$";
    regexes[1] = "^[(]\\d{3}+[)]\\s\\d{3}[-]\\d{4}$"+
    "|^\\d{3}+[-]\\d{3}[-]\\d{4}$"+
    "|^\\d{10}$";
    regexes[2] = "^[\\w[._-]]{1,}[@][\\w[-]]{1,}[.][a-zA-Z]{2,4}$";
    ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
    for(int i = 0; i < 3; i++) {
      Scanner fin = new Scanner(new File(in.nextLine()));
      arr.add(new ArrayList<String>());
      while(fin.hasNextLine()) {
        arr.get(i).add(fin.nextLine());
      }
    }
    for(int i = 0; i < arr.size(); i++) {
      for(int j = 0; j < arr.get(i).size(); j++) {
        System.out.println(
          arr.get(i).get(j)+" is"+
          (arr.get(i).get(j).matches(regexes[i]) ? " " : " not ")+
          "a valid "+types[i]
        );
      }
    }
  }
}