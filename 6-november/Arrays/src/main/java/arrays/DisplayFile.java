package arrays;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DisplayFile {

  public static void main(String[] args) {
    File file = null;
    Scanner input = null;
    try {
      file = new File ("inputs/mm.csv");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
  }
}