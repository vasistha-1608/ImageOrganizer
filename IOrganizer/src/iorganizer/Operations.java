/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iorganizer;

import java.awt.FlowLayout;
import java.awt.Image;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.border.TitledBorder;

/**
 *
 * @author user
 */
public class Operations {
    Image image;
    DefaultListModel<String> link = new DefaultListModel<String>();
             JList<String> linkList = new JList<String>(link);
        
    public Image search(String imgAddress) throws MalformedURLException,java.io.IOException
    {
        URL url = new URL(imgAddress);
        image = ImageIO.read(url);
        return image;
       
    }
   
    
   
    
}
