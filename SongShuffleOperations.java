import java.nio.file.Path;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.Random;
import java.util.ArrayList;

public class SongShuffleOperations{

  public static String random_song(){
    ArrayList<String> songs = new ArrayList<>();
    try{
      File f = new File("Songs.txt");
      File myfile = new File(f.getAbsolutePath());
      Scanner reader = new Scanner(myfile);

      while(reader.hasNextLine()){
        String data = reader.nextLine();
        songs.add(data);
      }

      reader.close();
    }catch (FileNotFoundException e){
      System.out.println("An error occured.");
      e.printStackTrace();
    }
    int max = songs.size();

    int random_number = new Random().nextInt(max);

    return songs.get(random_number);
  }

  public static String random_artist(){
    ArrayList<String> songs = new ArrayList<>();
    try{
      File c = new File("Artist.txt");
      File myfile2 = new File(c.getAbsolutePath());
      Scanner reader = new Scanner(myfile2);

      while(reader.hasNextLine()){
        String data = reader.nextLine();
        songs.add(data);
      }

      reader.close();
    }catch (FileNotFoundException e){
      System.out.println("An error occured.");
      e.printStackTrace();
    }
    int max = songs.size();

    int random_number = new Random().nextInt(max);

    return songs.get(random_number);
  }
}
