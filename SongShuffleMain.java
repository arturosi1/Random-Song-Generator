import javax.swing.JFrame;
import java.awt.Dimension;

public class SongShuffleMain
{
  public static void main(String[] args){
    SongShuffleFrame myframe = new SongShuffleFrame();
    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myframe.setSize(500,300);
    myframe.setVisible(true);
    myframe.setResizable(false);
  }
}
