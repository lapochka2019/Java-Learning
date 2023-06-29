package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] arg){
        JFrame frame = new JFrame("TicTacToe");//create new interface
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//add button "close"
        frame.setSize(600,600);//set frame size
        frame.setLayout(new BorderLayout());//choose layout manager
        frame.setLocationRelativeTo(null);//set screen position
        frame.setVisible(true);// set visible
        TicTacToe grid = new TicTacToe();
        frame.add(grid);
    }
}
