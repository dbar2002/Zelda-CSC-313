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
    }
}

