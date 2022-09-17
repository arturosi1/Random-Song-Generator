import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;



public class SongShuffleFrame extends JFrame {
  private JPanel title_panel; //for title
  private JPanel main_panel;  //background of application
  private JPanel content_panel; //used to hold the labels
  private JPanel button_panel;  //used to hold button;
  private JLabel title;      //credits label
  private JLabel song;      //label saying "Song:"
  private JTextField song_name; //used for song name generated to be displayed
  private JLabel artist;    //label saying "Artist:"
  private JTextField artist_name; //used for artist name generated to be displayed
  private JButton shuffle_song;
  private JButton shuffle_artist;

  private String song_generated;
  private String artist_generated;


  public SongShuffleFrame()
  {
    super ("Shuffle");
    setTitle("Random Song Generator");
    setLayout(new BorderLayout());
    setLocationRelativeTo(null);

    //setting up title credit panel
    title_panel = new JPanel();
    title = new JLabel("By Arturo Salazar");
    title.setForeground(Color.white);
    title_panel.setBackground(Color.GRAY);
    title_panel.setSize(new Dimension(500,22));
    add(title_panel, BorderLayout.NORTH);
    title_panel.add(title);

    //setting up main panel
    main_panel = new JPanel(new GridLayout(2,1));
    main_panel.setBackground(Color.GRAY);
    main_panel.setSize(new Dimension(500,450));
    add(main_panel);

    //setting up song and artist panel
    content_panel = new JPanel();
    content_panel.setLayout(null);
    content_panel.setSize(new Dimension(500,239));
    content_panel.setBackground(Color.GRAY);
    main_panel.add(content_panel);

    //setting up song and artist label
    song = new JLabel("Song: ");
    song.setForeground(Color.white);
    song.setBounds(100,30,100,30);
    content_panel.add(song);

    song_name = new JTextField(255);
    song_name.setEditable(false);
    song_name.setBounds(170,35,210,20);
    content_panel.add(song_name);

    artist = new JLabel("Artist: ");
    artist.setForeground(Color.white);
    artist.setBounds(100,65,100,30);
    content_panel.add(artist);

    artist_name = new JTextField(255);
    artist_name.setEditable(false);
    artist_name.setBounds(170,70,210,20);
    content_panel.add(artist_name);

    //setting up button panel;
    button_panel = new JPanel();
    button_panel.setLayout(null);
    button_panel.setSize(new Dimension(500,239));
    button_panel.setBackground(Color.GRAY);
    main_panel.add(button_panel);

    //setting up random buttons
    shuffle_song = new JButton("Random Song");
    shuffle_song.setSize(new Dimension(10,10));
    shuffle_song.setBounds(100,50,135,30);
    button_panel.add(shuffle_song);

    shuffle_artist = new JButton("Random Artist");
    shuffle_artist.setSize(new Dimension(10,10));
    shuffle_artist.setBounds(260,50,135,30);
    button_panel.add(shuffle_artist);

    //set up buttons to work
    buttonhandler myhandler = new buttonhandler();
    shuffle_song.addActionListener(myhandler);
    shuffle_artist.addActionListener(myhandler);
  }

  private class buttonhandler implements ActionListener{
    public void actionPerformed(ActionEvent event){
      if(event.getSource() == shuffle_song){
        song_generated = SongShuffleOperations.random_song();
        song_name.setText(song_generated);
        artist_name.setText("");
      }
      else if(event.getSource() == shuffle_artist){
        artist_generated = SongShuffleOperations.random_artist();
        artist_name.setText(artist_generated);
        song_name.setText("");
      }
      else
        System.out.println("Unknown error");
    }
  }

}
