package sample;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
  public static String read() {
    String data ="";
    try {
      File myObj = new File("C:\\Users\\pawel\\OneDrive - Politechnika Łódzka\\Pulpit\\Nowy folder\\SampleFX-20221124-master_loc\\src\\sample\\employees.json");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        data = data +"\n" + myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return data;
  }
}