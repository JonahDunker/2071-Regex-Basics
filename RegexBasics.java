import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexBasics {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    String hex = "^[a-f[A-F[0-9]]]{6}$";
    String phone = "^[(]\\d{3}+[)]\\s\\d{3}[-]\\d{4}$"+
    "|^\\d{3}+[-]\\d{3}[-]\\d{4}$"+
    "|^\\d{10}$";
    String email = "^[\\w[._-]]{1,}[@][\\w[-]]{1,}[.][a-zA-Z]{2,4}$";
    System.out.println(in.nextLine().matches(email));
  }
}