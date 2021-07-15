import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
public class Main extends JFrame implements ActionListener {
    public static void main(String[]args) throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        new Main();
    }


    JButton kill;
    JButton red_vent;
    JButton button0;
    JButton button;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JButton button11;
    JButton button12;
    JButton button13;
    JButton button14;
    JButton button15;
    JButton button16;
    JButton button17;
    JButton button18;
    JButton button19;
    JButton button20;
    JButton button21;
    JButton button22;
    JButton button23;
    JButton button24;
    JButton button25;
    JButton button26;
    JButton button27;
    JButton button28;
    JButton button29;
    JButton button30;
    JButton button31;
    JButton button32;
    JButton button33;
    JButton button34;
    JButton musicoff_Button= new JButton();
    JButton musicon_Button= new JButton();

    JLabel label;
    JLabel blue_Label;
    JLabel deadblue_Label;
    JLabel red_Label;
    JLabel red_kill_Label;
    JLabel IQ_Label= new JLabel();



    JTextField textfield = new JTextField();




    Clip clip;
    Clip clip2;
    Clip Among_Us_Clip;
    Clip impostor_win_clip;
    Clip them_songe_clip;
    Clip vent_in_Clip;
    Clip lofi_beat;


    AudioInputStream audioInputStream;
    AudioInputStream audioInputStream5;
    AudioInputStream audioInputStream6;
    int list=0;
    int list2=0;
    int list3=0;
    int IQ = 0;
    ImageIcon kill_Button  = new ImageIcon("Resources/Button Among us.png");

    ImageIcon blue  = new ImageIcon("Resources/blue.png");
    ImageIcon red = new ImageIcon("Resources/red.png");
    ImageIcon dead_blue = new ImageIcon("Resources/deadblue.png");
    ImageIcon Red_vent = new ImageIcon("Src/red_vent.png");
    ImageIcon focus_icon = new ImageIcon("Resources/focus-icon-png-26.png");
    ImageIcon textbox = new ImageIcon("Resources/text box.png");




    ImageIcon answer_label = new ImageIcon("Resources/Answer_Laber.png");
    ImageIcon imageIcon = new ImageIcon("Resources/Text_Label.png");
    ImageIcon quizicon = new ImageIcon("Resources/Quiz Free icon 1.png");
    ImageIcon red_kill= new ImageIcon("Resources/red_kill.png");


    String[] options = {"Steve Jobs","Bill Gates","James Gosling","Mark Zuckerburg"};

    String[] questions = 	{

            "Q1 : Who is credited with creating Java",

            "Q2 : Which company created Java",

            "Q3 : What was Java originally called"




    };


    File file = new File("Resources/music.wav");
    File theme_song = new File("Resources/AMONG US - OST - MAIN THEME SONG.wav");
    File lofi_beats= new File("Resources/code-fi lofi beat.wav");
    Main() throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException {






        audioInputStream6=AudioSystem.getAudioInputStream(lofi_beats);

        lofi_beat=AudioSystem.getClip();
        lofi_beat.open(audioInputStream6);



        audioInputStream = AudioSystem.getAudioInputStream(file);
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);


        File file2 = new File("Resources/READYSETGO_Trim.wav");
        AudioInputStream audioInputStream2 = AudioSystem.getAudioInputStream(file2);
        clip2 = AudioSystem.getClip();
        clip2.open(audioInputStream2);

        File  amonusfile = new File("Resources/Among Us (Kill) - Sound Effect (HD).wav");
        AudioInputStream audioInputStream3= AudioSystem.getAudioInputStream(amonusfile);
        Among_Us_Clip=AudioSystem.getClip();
        Among_Us_Clip.open(audioInputStream3);


        File impostor_win = new File("Resources/impostor win.wav");
        AudioInputStream audioInputStream4=AudioSystem.getAudioInputStream(impostor_win);
        impostor_win_clip=AudioSystem.getClip();
        impostor_win_clip.open(audioInputStream4);



        audioInputStream5=AudioSystem.getAudioInputStream(theme_song);
        them_songe_clip=AudioSystem.getClip();
        them_songe_clip.open(audioInputStream5);


        File vent_in = new File("Resources/vent_in.wav");
        AudioInputStream audioInputStream6=AudioSystem.getAudioInputStream(vent_in);
        vent_in_Clip=AudioSystem.getClip();
        vent_in_Clip.open(audioInputStream6);









        label = new JLabel();
        label.setBounds(25, 50, 700, 200);
        label.setText("<html>This is the ultimate IQ test <br>do you want to  try it ?</html>");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setFont(new Font("", Font.PLAIN, 25));
        label.setIcon(imageIcon);




        blue_Label = new JLabel();
        blue_Label.setBounds(250, 150,700,300);
        blue_Label.setText("Red Sus");
        blue_Label.setHorizontalTextPosition(JLabel.CENTER);
        blue_Label.setVerticalTextPosition(JLabel.TOP);
        blue_Label.setFont(new Font("", Font.PLAIN, 25));
        blue_Label.setIcon(blue);
        blue_Label.setForeground(Color.white);





        deadblue_Label = new JLabel();
        deadblue_Label.setBounds(250, 150, 700, 220);
        deadblue_Label.setText("Red Sus");
        deadblue_Label.setHorizontalTextPosition(JLabel.CENTER);
        deadblue_Label.setVerticalTextPosition(JLabel.TOP);
        deadblue_Label.setFont(new Font("", Font.PLAIN, 25));
        deadblue_Label.setIcon(dead_blue);
        deadblue_Label.setForeground(Color.white);



        red_Label = new JLabel();
        red_Label.setBounds(25, 90, 700, 300);
        red_Label.setText("Who knows ");
        red_Label.setHorizontalTextPosition(JLabel.CENTER);
        red_Label.setVerticalTextPosition(JLabel.TOP);
        red_Label.setFont(new Font("", Font.PLAIN, 25));
        red_Label.setIcon(red);
        red_Label.setForeground(Color.red.darker());


        red_kill_Label = new JLabel();
        red_kill_Label.setBounds(25, 75, 700, 300);
        red_kill_Label.setText("Who knows ");
        red_kill_Label.setHorizontalTextPosition(JLabel.CENTER);
        red_kill_Label.setVerticalTextPosition(JLabel.TOP);
        red_kill_Label.setFont(new Font("", Font.PLAIN, 25));
        red_kill_Label.setIcon(red_kill);
        red_kill_Label.setForeground(Color.red.darker());



        musicon_Button.addActionListener(this);
        musicon_Button.setBounds(0,0 , 125, 125);
        musicon_Button.setText("<html>Focus mood <b> on <html>");
        musicon_Button.setForeground(Color.white.darker());
        musicon_Button.setFocusable(false);
        musicon_Button.setIcon(focus_icon);
        musicon_Button.setFont(new Font("", Font.PLAIN, 12));
        musicon_Button.setHorizontalTextPosition(JButton.CENTER);




        musicoff_Button.addActionListener(this);
        musicoff_Button.setBounds(0,0 , 125, 125);
        musicoff_Button.setText("<html>Focus mood <b> off <html>");
        musicoff_Button.setForeground(Color.white.darker());
        musicoff_Button.setFocusable(false);
        musicoff_Button.setIcon(focus_icon);
        musicoff_Button.setFont(new Font("", Font.PLAIN, 12));
        musicoff_Button.setHorizontalTextPosition(JButton.CENTER);






        red_vent = new JButton();
        red_vent.addActionListener(this);

        red_vent.setBounds(0,400, 190, 180);
        red_vent.setText(" Use Vent !! ");
        red_vent.setHorizontalTextPosition(JLabel.CENTER);
        red_vent.setVerticalTextPosition(JLabel.TOP);
        red_vent.setFont(new Font("", Font.PLAIN, 25));
        red_vent.setIcon(Red_vent);
        red_vent.setForeground(Color.red.darker());
        red_vent.setBackground(new Color(45, 43, 43));


        kill = new JButton();
        kill.addActionListener(this);
        kill.setBounds(500, 300, 150,150);
        kill.setHorizontalTextPosition(JButton.CENTER);
        kill.setFocusable(false);
        kill.setVisible(true);
        kill.setIcon(kill_Button);
        kill.setBackground(new Color(0,0,0));



        button0 = new JButton();
        button0.addActionListener(this);
        button0.setText("see yor IQ result   ");
        button0.setBounds(150, 250,450,250);
        button0.setHorizontalTextPosition(JButton.CENTER);
        button0.setFont(new Font("", Font.PLAIN, 30));
        button0.setFocusable(false);
        button0.setVisible(true);
        button0.setIcon(textbox);







        textfield.setBounds(0,250,750,150);

        textfield.setBackground(new Color(25,25,25));

        textfield.setForeground(new Color(7, 165, 162));

        textfield.setFont(new Font("Ink Free",Font.BOLD,30));

        textfield.setBorder(BorderFactory.createBevelBorder(1));

        textfield.setHorizontalAlignment(JTextField.CENTER);

        textfield.setEditable(false);



//       IQ_TextAreasetHorizontalAlignment(JTextField.CENTER);

        IQ_Label.setBounds(50,250, 190, 100);
        IQ_Label.setText(" Use Vent !! ");
        IQ_Label.setHorizontalTextPosition(JLabel.CENTER);
        IQ_Label.setVerticalTextPosition(JLabel.TOP);
        IQ_Label.setFont(new Font("", Font.PLAIN, 25));
        IQ_Label.setForeground(Color.red.darker());
        IQ_Label.setBackground(new Color(45, 43, 43));









        button = new JButton();
        button.addActionListener(this);
        button.setText("yes");
        button.setBounds(250, 300, 100, 100);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFocusable(false);
        button.setVisible(true);
        button.setIcon(answer_label);


        button2 = new JButton();
        button2.addActionListener(this);
        button2.setText("no");
        button2.setBounds(400, 300, 100, 100);
        button2.setHorizontalTextPosition(JButton.CENTER);
        button2.setFocusable(false);
        button2.setVisible(true);
        button2.setIcon(answer_label);


        button3 = new JButton();
        button3.addActionListener(this);
        button3.setText("Math");
        button3.setBounds(100, 300, 150, 100);
        button3.setHorizontalTextPosition(JButton.CENTER);
        button3.setFocusable(false);
        button3.setIcon(answer_label);


        button4 = new JButton();
        button4.addActionListener(this);
        button4.setText("General knowledge");
        button4.setBounds(300, 300, 150, 100);
        button4.setHorizontalTextPosition(JButton.CENTER);
        button4.setFocusable(false);
        button4.setIcon(answer_label);


        button5 = new JButton();
        button5.addActionListener(this);
        button5.setText("programming");
        button5.setBounds(500, 300, 150, 100);
        button5.setHorizontalTextPosition(JButton.CENTER);
        button5.setFocusable(false);
        button5.setIcon(answer_label);


        button6 = new JButton();
        button6.addActionListener(this);
        button6.setText("2");
        button6.setBounds(100, 300, 160, 100);
        button6.setHorizontalTextPosition(JButton.CENTER);
        button6.setFocusable(false);
        button6.setIcon(answer_label);


        button7 = new JButton();
        button7.addActionListener(this);
        button7.setText("4");
        button7.setBounds(300, 300, 170, 100);
        button7.setHorizontalTextPosition(JButton.CENTER);
        button7.setFocusable(false);
        button7.setIcon(answer_label);


        button8 = new JButton();
        button8.addActionListener(this);
        button8.setText("3");
        button8.setBounds(500, 300, 180, 100);
        button8.setHorizontalTextPosition(JButton.CENTER);
        button8.setFocusable(false);
        button8.setIcon(answer_label);


        button9 = new JButton();
        button9.addActionListener(this);
        button9.setText("3");
        button9.setBounds(100, 300, 180, 100);
        button9.setHorizontalTextPosition(JButton.CENTER);
        button9.setFocusable(false);
        button9.setIcon(answer_label);

        button10 = new JButton();
        button10.addActionListener(this);
        button10.setText("3");
        button10.setBounds(300, 300, 180, 100);
        button10.setHorizontalTextPosition(JButton.CENTER);
        button10.setFocusable(false);
        button10.setIcon(answer_label);

        button11 = new JButton();
        button11.addActionListener(this);

        button11.setBounds(500, 300, 180, 100);
        button11.setHorizontalTextPosition(JButton.CENTER);
        button11.setFocusable(false);
        button11.setIcon(answer_label);

        button12 = new JButton();
        button12.addActionListener(this);
        button12.setText("3");
        button12.setBounds(100, 300, 180, 100);
        button12.setHorizontalTextPosition(JButton.CENTER);
        button12.setFocusable(false);
        button12.setIcon(answer_label);


        button13 = new JButton();
        button13.addActionListener(this);
        button13.setText("3");
        button13.setBounds(300, 300, 180, 100);
        button13.setHorizontalTextPosition(JButton.CENTER);
        button13.setFocusable(false);
        button13.setIcon(answer_label);





        button14 = new JButton();
        button14.addActionListener(this);
        button14.setText("3");
        button14.setBounds(500, 300, 180, 100);
        button14.setHorizontalTextPosition(JButton.CENTER);
        button14.setFocusable(false);
        button14.setIcon(answer_label);






        button15 = new JButton();
        button15.addActionListener(this);
        button15.setText("3");
        button15.setBounds(100, 300, 180, 100);
        button15.setHorizontalTextPosition(JButton.CENTER);
        button15.setFocusable(false);
        button15.setIcon(answer_label);




        button16 = new JButton();
        button16.addActionListener(this);
        button16.setText("3");
        button16.setBounds(300, 300, 180, 100);
        button16.setHorizontalTextPosition(JButton.CENTER);
        button16.setFocusable(false);
        button16.setIcon(answer_label);


        button17 = new JButton();
        button17.addActionListener(this);
        button17.setText("3");
        button17.setBounds(500, 300, 180, 100);
        button17.setHorizontalTextPosition(JButton.CENTER);
        button17.setFocusable(false);
        button17.setIcon(answer_label);


        button18 = new JButton();
        button18.addActionListener(this);
        button18.setText("3");
        button18.setBounds(100, 300, 180, 100);
        button18.setHorizontalTextPosition(JButton.CENTER);
        button18.setFocusable(false);
        button18.setIcon(answer_label);


        button19 = new JButton();
        button19.addActionListener(this);
        button19.setText("3");
        button19.setBounds(300, 300, 180, 100);
        button19.setHorizontalTextPosition(JButton.CENTER);
        button19.setFocusable(false);
        button19.setIcon(answer_label);


        button20 = new JButton();
        button20.addActionListener(this);
        button20.setText("3");
        button20.setBounds(500, 300, 180, 100);
        button20.setHorizontalTextPosition(JButton.CENTER);
        button20.setFocusable(false);
        button20.setIcon(answer_label);


        button21 = new JButton();
        button21.addActionListener(this);
        button21.setText("3");
        button21.setBounds(100, 300, 180, 100);
        button21.setHorizontalTextPosition(JButton.CENTER);
        button21.setFocusable(false);
        button21.setIcon(answer_label);


        button22 = new JButton();
        button22.addActionListener(this);

        button22.setBounds(300, 300, 180, 100);
        button22.setHorizontalTextPosition(JButton.CENTER);
        button22.setFocusable(false);
        button22.setIcon(answer_label);

        button23 = new JButton();
        button23.addActionListener(this);
        button23.setText("3");
        button23.setBounds(500, 300, 180, 100);
        button23.setHorizontalTextPosition(JButton.CENTER);
        button23.setFocusable(false);
        button23.setIcon(answer_label);

        button24 = new JButton();
        button24.addActionListener(this);
        button24.setText("3");
        button24.setBounds(100, 300, 180, 100);
        button24.setHorizontalTextPosition(JButton.CENTER);
        button24.setFocusable(false);
        button24.setIcon(answer_label);

        button25 = new JButton();
        button25.addActionListener(this);
        button25.setText("3");
        button25.setBounds(300, 300, 180, 100);
        button25.setHorizontalTextPosition(JButton.CENTER);
        button25.setFocusable(false);
        button25.setIcon(answer_label);

        button26 = new JButton();
        button26.addActionListener(this);
        button26.setText("3");
        button26.setBounds(500, 300, 180, 100);
        button26.setHorizontalTextPosition(JButton.CENTER);
        button26.setFocusable(false);
        button26.setIcon(answer_label);



        button27 = new JButton();
        button27.addActionListener(this);
        button27.setText("3");
        button27.setBounds(100, 300, 180, 100);
        button27.setHorizontalTextPosition(JButton.CENTER);
        button27.setFocusable(false);
        button27.setIcon(answer_label);

        button27 = new JButton();
        button27.addActionListener(this);
        button27.setText("3");
        button27.setBounds(300, 300, 180, 100);
        button27.setHorizontalTextPosition(JButton.CENTER);
        button27.setFocusable(false);
        button27.setIcon(answer_label);

        button28 = new JButton();
        button28.addActionListener(this);
        button28.setText("3");
        button28.setBounds(500, 300, 180, 100);
        button28.setHorizontalTextPosition(JButton.CENTER);
        button28.setFocusable(false);
        button28.setIcon(answer_label);



        button29 = new JButton();
        button29.addActionListener(this);
        button29.setText("3");
        button29.setBounds(100, 300, 180, 100);
        button29.setHorizontalTextPosition(JButton.CENTER);
        button29.setFocusable(false);
        button29.setIcon(answer_label);


        button30 = new JButton();
        button30.addActionListener(this);
        button30.setText("3");
        button30.setBounds(300, 300, 180, 100);
        button30.setHorizontalTextPosition(JButton.CENTER);
        button30.setFocusable(false);
        button30.setIcon(answer_label);


        button31 = new JButton();
        button31.addActionListener(this);
        button31.setText("3");
        button31.setBounds(500, 300, 180, 100);
        button31.setHorizontalTextPosition(JButton.CENTER);
        button31.setFocusable(false);
        button31.setIcon(answer_label);


        button32 = new JButton();
        button32.addActionListener(this);
        button32.setText("3");
        button32.setBounds(100, 300, 180, 100);
        button32.setHorizontalTextPosition(JButton.CENTER);
        button32.setFocusable(false);
        button32.setIcon(answer_label);


        button33 = new JButton();
        button33.addActionListener(this);
        button33.setText("3");
        button33.setBounds(300, 300, 180, 100);
        button33.setHorizontalTextPosition(JButton.CENTER);
        button33.setFocusable(false);
        button33.setIcon(answer_label);


        button34 = new JButton();
        button34.addActionListener(this);
        button34.setText("3");
        button34.setBounds(500, 300, 180, 100);
        button34.setHorizontalTextPosition(JButton.CENTER);
        button34.setFocusable(false);
        button34.setIcon(answer_label);
        clip2.start();

        TimeUnit.SECONDS.sleep(1);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(760, 600);
        this.setVisible(true);
        this.setLocation(400,100);
        this.setTitle(" The ultimate IQ test ");
        this.setIconImage(quizicon.getImage());
        this.add(button);
        this.add(button2);
        this.add(label);
        this.getContentPane().setBackground(new Color(45, 43, 43));
        this.setLayout(null);

        button16.setVisible(false);
        button6.setVisible(false);
        button26.setVisible(false);



    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {


            JOptionPane optionPane = new JOptionPane();
            optionPane.setMessage("                      Good Luck !");
            optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
            optionPane.setOptionType(JOptionPane.DEFAULT_OPTION);
            recursiveUnfocusButtons(optionPane);
            JDialog dialog = optionPane.createDialog(null, "Message");
            dialog.setVisible(true);



            getContentPane().removeAll();
            repaint();


            label.setText("Choose one of those categories");


            this.add(button3);
            this.add(button4);
            this.add(button5);
            this.add(label);
        }
        if (e.getSource() == button2) {
            System.exit(0);
        }
        if (e.getSource() == button3) {
            button6.setVisible(true);
            clip2.stop();
            them_songe_clip.close();
            lofi_beat.close();
            if(!clip.isOpen()){
                try {
                    audioInputStream = AudioSystem.getAudioInputStream(file);
                    clip = AudioSystem.getClip();
                    clip.open(audioInputStream);


                } catch (LineUnavailableException | UnsupportedAudioFileException | IOException lineUnavailableException) {
                    lineUnavailableException.printStackTrace();
                }

            }
            musicoff_Button.setVisible(false);
            if (!musicoff_Button.isVisible()){
                clip.start();

            }

            musicoff_Button.setVisible(true);


            getContentPane().removeAll();
            repaint();
            label.setText("Q1 : What is 1 + 1  ?");

            this.add(button6);
            this.add(button7);
            this.add(button8);
            this.add(label);


        }
        if (e.getSource() == button6 || e.getSource() == button7 || e.getSource() == button8) {

            IQ = IQ + 100;
            getContentPane().removeAll();
            repaint();
            label.setText("<html>Q2 : What is 2*2*2*2/2<html>");
            button9.setText("8");
            button10.setText("4");
            button11.setText("10");
            this.add(label);
            this.add(button9);
            this.add(button10);
            this.add(button11);
        }


        if (e.getSource() == button9 || e.getSource() == button10 || e.getSource() == button11) {


            IQ = IQ + 100;
            getContentPane().removeAll();
            repaint();
            label.setText("<html>Q3 : What is  1+1-1+1+2-2  <html>");
            button12.setText("4");
            button13.setText("2");
            button14.setText("0");
            this.add(label);
            this.add(button12);
            this.add(button13);
            this.add(button14);

        }
        if ((e.getSource() == button12 || e.getSource() == button13 || e.getSource() == button14)) {

            IQ = IQ + 100;
            getContentPane().removeAll();
            repaint();
            label.setText("Choose one of those categories");
            this.add(label);
            if (list2 != 1) {
                this.add(button4);
            }
            if (list3 != 1) {
                this.add(button5);

            }
            list = 1;
            button6.setVisible(false);


        }


        if (e.getSource() == button4) {
            clip2.stop();
            clip.close();
            lofi_beat.close();

            if (!them_songe_clip.isOpen()){
                try {
                    audioInputStream5=AudioSystem.getAudioInputStream(theme_song);
                    them_songe_clip=AudioSystem.getClip();
                    them_songe_clip.open(audioInputStream5);
                } catch (UnsupportedAudioFileException | IOException | LineUnavailableException unsupportedAudioFileException) {
                    unsupportedAudioFileException.printStackTrace();
                }

            }

            musicoff_Button.setVisible(false);
            if (!musicoff_Button.isVisible()){
                them_songe_clip.start();

            }
            musicoff_Button.setVisible(true);





            button16.setVisible(true);
            getContentPane().removeAll();
            repaint();
            label.setText("Q1: What is the best game in the world ");

            this.add(label);


            getContentPane().removeAll();
            repaint();
            button15.setText("League of Legends");
            button16.setText("Overwatch");
            button17.setText("<html><b> Among Us <html>");

            this.add(label);
            this.add(button15);
            this.add(button16);
            this.add(button17);


        }
        if (e.getSource() == button17) {

            clip.stop();
            clip2.stop();


            getContentPane().removeAll();
            repaint();
            this.add(red_Label);
            this.add(blue_Label);
            this.add(kill);


        }
        if (e.getSource() == kill) {
            red_Label.setVisible(false);
            kill.setVisible(false);
            blue_Label.setVisible(false);
            deadblue_Label.setVisible(false);
            red_kill_Label.setVisible(false);
            red_vent.setVisible(false);

            Among_Us_Clip.start();

            this.add(red_Label);
            this.add(red_kill_Label);
            this.add(deadblue_Label);
            this.add(red_vent);


            Timer timer4 = new Timer(0, event -> {
                red_vent.setVisible(true);

            });


            Timer timer3 = new Timer(0, event -> {
                deadblue_Label.setVisible(true);
                timer4.start();

            });

            Timer timer2 = new Timer(1000, event -> {
                this.remove(red_kill_Label);
                red_Label.setVisible(true);
                timer3.start();
            });

            Timer timer1 = new Timer(100, event -> {
                red_kill_Label.setVisible(true);
                timer2.start();
            });
            this.setVisible(true);
            timer1.start();


        }

        if (e.getSource() == button15 || e.getSource() == button16 || e.getSource() == red_vent) {
            clip.stop();
            clip2.stop();
            them_songe_clip.stop();

            Timer timer6 = new Timer(2000, event -> {

                them_songe_clip.start();
            });

            Timer timer5 = new Timer(0, event -> {
                vent_in_Clip.start();

                timer6.start();
            });

            timer5.start();


            IQ = IQ + 100;
            getContentPane().removeAll();
            repaint();
            label.setText("Q2 : What plant do you live in ?");
            button19.setText("Earth ");
            button18.setText("Mars");
            button20.setText("Jupiter ");
            this.add(label);
            this.add(button18);
            this.add(button19);
            this.add(button20);

        }
        if (e.getSource() == button19 || e.getSource() == button18 || e.getSource() == button20) {
            IQ = IQ + 100;
            getContentPane().removeAll();
            repaint();

            label.setText("<html>Q3 : What is the best programming <br>language in the world <html>");
            button21.setText("Java ");
            button22.setText("JavaScript");
            button23.setText("python ");
            this.add(label);
            this.add(button21);
            this.add(button22);
            this.add(button23);


        }
        if (e.getSource() == button23 || e.getSource() == button22 || e.getSource() == button21) {
            IQ = IQ + 100;

            getContentPane().removeAll();
            repaint();

            label.setText("Choose one of those categories");

            this.add(label);
            if (list != 1) {
                this.add(button3);

            }
            if (list3 != 1) {
                this.add(button5);
            }
            list2 = 1;
            button16.setVisible(false);

        }


        if ((e.getSource() == button10 || e.getSource() == button11 || e.getSource() == button7 || e.getSource() == button8 || e.getSource() == button12 || e.getSource() == button14 || e.getSource() == button16 || e.getSource() == button17 || e.getSource() == button18 || e.getSource() == button20 || e.getSource() == button21 || e.getSource() == button22 || e.getSource() == button24 || e.getSource() == button25 || e.getSource() == button28 || e.getSource() == button29 || e.getSource() == button30 || e.getSource() == button31)) {
            IQ = IQ - 100;


        }


        if (e.getSource() == button5) {
            clip2.stop();
            clip.stop();
            them_songe_clip.close();
            if (!lofi_beat.isOpen()){
                try {
                    audioInputStream6 = AudioSystem.getAudioInputStream(lofi_beats);
                    lofi_beat = AudioSystem.getClip();
                    lofi_beat.open(audioInputStream6);


                } catch (LineUnavailableException | UnsupportedAudioFileException | IOException lineUnavailableException) {
                    lineUnavailableException.printStackTrace();
                }
            }
            musicoff_Button.setVisible(false);
            if (!musicoff_Button.isVisible()){
                lofi_beat.start();

            }
            musicoff_Button.setVisible(true);



            button26.setVisible(true);

            getContentPane().removeAll();
            repaint();
            label.setText(questions[0]);
            button24.setText(options[0]);
            button25.setText(options[1]);
            button26.setText(options[2]);
            this.add(button24);
            this.add(button25);
            this.add(button26);
            this.add(label);


        }


        if (e.getSource() == button26 || e.getSource() == button24 || e.getSource() == button25) {

            IQ = IQ + 100;
            getContentPane().removeAll();
            repaint();
            label.setText(questions[1]);
            button27.setText("Sun Microsystems");
            button28.setText("Starbucks");
            button29.setText("mcdonald's");
            this.add(label);
            this.add(button27);
            this.add(button28);
            this.add(button29);

        }
        if (e.getSource() == button27 || e.getSource() == button28 || e.getSource() == button29) {
            IQ = IQ + 100;
            getContentPane().removeAll();
            repaint();
            label.setText(questions[2]);
            button30.setText("black coffe");
            button31.setText("minecraft");
            button32.setText("Oak");
            this.add(label);
            this.add(button30);
            this.add(button31);
            this.add(button32);

        }
        if (e.getSource() == button32 || e.getSource() == button30 || e.getSource() == button31) {
            IQ = IQ + 100;
            getContentPane().removeAll();
            repaint();
            label.setText("Choose one of those categories");
            this.add(label);

            if (list2 != 1) {
                this.add(button4);
            }
            if (list != 1) {
                this.add(button3);

            }
            list3 = 1;
            button26.setVisible(false);


        }

        if (list == 1 && list2 == 1 && list3 == 1) {
            label.setText("Congrats you finished the test ");
            this.add(button0);
            this.add(label);
        }


        if (e.getSource() == button0) {
            getContentPane().remove(button0);
            repaint();
            textfield.setText("You're IQ is : "+ IQ);

            this.add(textfield);

            if (IQ < 900) {

                JOptionPane optionPane = new JOptionPane();
                optionPane.setMessage("                uhhh its not bad :)");
                optionPane.setMessageType(JOptionPane.PLAIN_MESSAGE);
                optionPane.setOptionType(JOptionPane.DEFAULT_OPTION);
                recursiveUnfocusButtons(optionPane);
                JDialog dialog = optionPane.createDialog(null, "Message");
                dialog.setVisible(true);

            }

        }

        if (!(list == 1 && list2 == 1 && list3 == 1)) {
            if (!(clip2.isActive())) {
                this.add(musicoff_Button);
                this.add(musicon_Button);
            }


        }

        if (e.getSource() == musicoff_Button) {

            if (button6.isVisible()) {
                clip.close();
            }
            if (button16.isVisible()) {
                them_songe_clip.close();
            }
            if (button26.isVisible()){
                lofi_beat.close();
            }
            clip.close();
            them_songe_clip.close();
            lofi_beat.close();

            musicon_Button.setVisible(true);
            musicoff_Button.setVisible(false);
            this.add(musicon_Button);


        }
        if (e.getSource() == musicon_Button||e.getSource().equals(musicoff_Button.getAction())) {
            musicoff_Button.setVisible(true);

            if ((e.getSource() == musicon_Button && (button6.isVisible()) || e.getSource() == musicon_Button && button16.isVisible()||e.getSource() == musicon_Button && button26.isVisible())) {


                if (button6.isVisible()) {
                    try {
                        audioInputStream = AudioSystem.getAudioInputStream(file);
                        clip = AudioSystem.getClip();
                        clip.open(audioInputStream);


                    } catch (LineUnavailableException | UnsupportedAudioFileException | IOException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    }

                    if (!clip.isRunning()){
                        clip.start();

                    }



                }
                if (button16.isVisible()) {
                    try {
                        audioInputStream5 = AudioSystem.getAudioInputStream(theme_song);
                        them_songe_clip = AudioSystem.getClip();
                        them_songe_clip.open(audioInputStream5);


                    } catch (LineUnavailableException | UnsupportedAudioFileException | IOException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    }


                    them_songe_clip.start();
                }

                if (button26.isVisible()) {
                    try {
                        audioInputStream6 = AudioSystem.getAudioInputStream(lofi_beats);
                        lofi_beat = AudioSystem.getClip();
                        lofi_beat.open(audioInputStream6);


                    } catch (LineUnavailableException | UnsupportedAudioFileException | IOException lineUnavailableException) {
                        lineUnavailableException.printStackTrace();
                    }

                    if (!lofi_beat.isRunning()){
                        lofi_beat.start();

                    }

                }







            }


            musicon_Button.setVisible(false);
            this.add(musicoff_Button);
        }
    }


    private static void recursiveUnfocusButtons(Component component) {
        if (component instanceof JButton) {
            component.setFocusable(false);
        } else if (component instanceof Container) {
            for (Component c : ((Container) component).getComponents()) {
                recursiveUnfocusButtons(c);
            }
        }
    }



}






