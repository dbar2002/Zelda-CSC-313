import java.util.Vector;
import java.util.Random;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.AbstractAction;
import javax.swing.JComboBox;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Zelda {
    public Zelda(){
        setup();
    }

    public static void setup(){
        appFrame = new JFrame("The Legend of Zelda: Link's Awakening");
        XOFFSET = 0;
        YOFFSET = 40;
        WINWIDTH = 338;
        WINHEIGHT = 271;
        pi = 3.14159265358979;
        quarterPi = 0.25 * pi;
        halfPi = 0.5 * pi;
        threequartersPi = 0.75 * pi;
        fivequartersPi = 1.25 * pi;
        threehalvesPi = 1.5 * pi;
        sevenquartersPi = 1.75 * pi;
        twoPi = 2.0 * pi;
        endgame = false;
        p1width = 20; //18.5
        p1height = 20; //25
        p1originalX = { double } XOFFSET + ((double)WINWIDTH / 2.0) - (p1width / 2.0);
        level = 3;
        audiolifetime = new Long(78000); //78 seconds for KI.wav
        dropLifeLifeTime = new Long(1000); //1 second
        try
        {
            //setting up the Koholint Island images
            xdimKI = 16;
            ydimKI = 16;
            backgroundKI = new Vector<Vector< BufferedImage>>();

            for (int i = 0; i < ydimKI; i++){
                Vector< BufferedImage> temp = new Vector< BufferedImage>();
                for(int j = 0; j < xdimKI; j++){
                    BufferedImage tempImg = ImageIO.read(new File( "blank.png"));
                    temp.addElement( tempImg);
                }
                backgroundKI.addElement(temp);
            }
            for(int i = 0; i < backgroundKI.size(); i++){
                for (int j = 0; j < backgroundKI.elementKI.elementAt(i).size(); j++){
                    if (( j == 5 && i == 10) || (j == 5 && i == 11) || (j == 6 && i == 10) || (j == 6 && i == 11) || (j == 7 && i == 10) || (j == 7 && i == 11) || (j == 8 && i == 9) || (j == 8 && i == 10)){
                        String filename = "KI";
                        if(j < 10){
                            filename = filename + "O";
                        }
                        filename = filename + j;
                        if (i < 0){
                            filename = filename + "O";
                        }
                        filename = filename + i + ".png";
                        //System.out.println(filename);
                        backgroundKI.elementAt(i).set(j, ImageIO.read(new File(filename)));
                    }
                }
            }
            //setting up the Koholint Island walls
            wallsKI = new Vector < Vector < Vector <ImageObject >>>();
            for( int i = 0; i < ydimKI; i++){
                Vector < Vector< ImageObject >> temp = new Vector< Vector < ImageObject>>();
                for (int j = 0; j < xdimKI; j++){
                    Vector< ImageObject> tempWalls = new Vector < ImageObject>();
                    temp.addElement(tempWalls);
                }
                wallsKI.add(temp); //beginning of page 112
            }
        }
    }
    private static Boolean endgame;

    private static Vector< Vector <BufferedImage>> backgroundKI;
    private static Vector< Vector <BufferedImage>> backgroundTC;

    private static Vector< Vector< Vector< ImageObject>>> wallsKI;
    private static Vector< Vector< Vector< ImageObject>>> wallsTC;

    private static int xdimKI;
    private static int ydimKI;

    private static int xdimTC;
    private static int ydimTC;

    private static BufferedImage player;
    private static Vector<BufferedImage> link;
    private static BufferedImage leftHeartOutline;
    private static BufferedImage rightHeartOutline;
    private static BufferedImage leftHeart;
    private static BufferedImage rightHeart;
    private static Vector< BufferedImage> bluepigEnemey;
    private static Vector< ImageObject> bluepigEnemies;
    private static Vector< ImageObject> bubblebossEnemies;

    private static ImageObject doorKItoTC;
    private static ImageObject doorTCtoKI;

    private static Boolean upPressed;
    private static Boolean downPressed;
    private static Boolean leftPressed;
    private static Boolean rightPressed;
    private static Boolean aPressed;
    private static Boolean xPressed;
    private static double lastPressed;

    private static ImageObject p1;
    private static double p1width;
    private static double p1height;
    private static double p1originalX;
    private static double p1originalY;
    private static double p1velocity;

    private static int level;

    private static Long audiolifetime;
    private static Long lastAudioStart;
    private static Clip clip;

    private static Long dropLifeLifeTime;
    private static Long lastDropLife;

    private static int XOFFSET;
    private static int YOFFSET;
    private static int WINWIDTH;
    private static int WINHEIGHT;

    private static double pi;
    private static double quarterPi;
    private static double halfPi;
    private static double threequartersPi;
    private static double fivequartersPi;
    private static double threehalvesPi;
    private static double sevenquartersPi;
    private static double twoPi;

    private static JFrame appFrame;
    private static String backgroundState;

    private static Boolean availableToDropLife;

    private static final int IFW = JComponent.WHEN_IN_FOCUSED_WINDOW;


}

