package com.robertsgrants.beziercurves;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Hallow
 */
public class Main {
    public static void main (String [] args) {
        JFrame f = new JFrame();
        f.setTitle("BezierCurves");
        f.getContentPane().add(new BrezierPanel());
        f.pack();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
    
}
