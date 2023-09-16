/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author guill
 */
public class TicTaeToeGame implements ActionListener {
    
    JFrame frame = new JFrame(); // Frame object
    JPanel t_panel = new JPanel(); // Pane for text
    JPanel bt_panel = new JPanel(); // Pane for buttons
    JLabel textfield = new JLabel(); // Label object to display text
    JButton[] bton = new JButton[9]; // Creating an array of button's because tictactoe have 9 position
    
    int chance_flag = 0;
    Random random = new Random();
    boolean pl1_chance;

    public TicTaeToeGame() {
    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setTitle("Tic Tac Toe");
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        
        textfield.setBackground(Color.BLACK);
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic Tac Toe");
        textfield.setOpaque(true);
        
        t_panel.setLayout(new BorderLayout());
        t_panel.setBounds(0, 0, 800, 100);
        
        bt_panel.setLayout(new GridLayout(3, 3));
        bt_panel.setBackground(new Color(150, 150, 150));
        
        for (int i = 0; i < 9; i++) {
            
            bton[i] = new JButton(); // creating object for each button element
            bt_panel.add(bton[i]); // adding each button to button panel
            bton[i].setFont(new Font("Ink Free", Font.BOLD, 120));
            bton[i].setFocusable(false);
            bton[i].addActionListener(this);
        }
        
        t_panel.add(textfield);
        frame.add(t_panel, BorderLayout.NORTH);
        frame.add(bt_panel);
        
        startGame(); // To start game
    }
    
    public void startGame() {
        
        try {
            textfield.setText("Loading. . . .");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        
        int chance = random.nextInt(100);
        
        if (chance % 2 == 0) {
            pl1_chance = true;
            textfield.setText("X Turn");
        } else {
            pl1_chance = false;
            textfield.setText("O Turn");
        }
    }
    
    public void gameOver(String s) {
        chance_flag = 0;
        Object[] option = { "Restart" , "Exit" };
        int n = JOptionPane.showOptionDialog(frame, "Game Over\n" + s, "Game Over", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
        
        if (n == 0) {
            frame.dispose();
            new TicTaeToeGame();
        } else {
            frame.dispose();
        }
    }
    
    public void matchCheck() {
        if ((bton[0].getText() == "X") && (bton[1].getText() == "X") && (bton[2].getText() == "X")) {
            xWins(0, 1, 2);
        }
        else if ((bton[0].getText() == "X") && (bton[4].getText() == "X") && (bton[8].getText() == "X")) {
            xWins(0, 4, 8);
        }
        else if ((bton[0].getText() == "X") && (bton[3].getText() == "X") && (bton[6].getText() == "X")) {
            xWins(0, 3, 6);
        }
        else if ((bton[1].getText() == "X") && (bton[4].getText() == "X") && (bton[7].getText() == "X")) {
            xWins(1, 4, 7);
        }
        else if ((bton[2].getText() == "X") && (bton[4].getText() == "X") && (bton[6].getText() == "X")) {
            xWins(2, 4, 6);
        }
        else if ((bton[2].getText() == "X") && (bton[5].getText() == "X") && (bton[8].getText() == "X")) {
            xWins(2, 5, 8);
        }
        else if ((bton[3].getText() == "X") && (bton[4].getText() == "X") && (bton[5].getText() == "X")) {
            xWins(3, 4, 5);
        }
        else if ((bton[6].getText() == "X") && (bton[7].getText() == "X") && (bton[8].getText() == "X")) {
            xWins(6, 7, 8);
        }
        
        else if ((bton[0].getText() == "O") && (bton[1].getText() == "O") && (bton[2].getText() == "O")) {
            oWins(0, 1, 2);
        }
        else if ((bton[0].getText() == "O") && (bton[4].getText() == "O") && (bton[8].getText() == "O")) {
            oWins(0, 4, 8);
        }
        else if ((bton[0].getText() == "O") && (bton[3].getText() == "O") && (bton[6].getText() == "O")) {
            oWins(0, 3, 6);
        }
        else if ((bton[1].getText() == "O") && (bton[4].getText() == "O") && (bton[7].getText() == "O")) {
            oWins(1, 4, 7);
        }
        else if ((bton[2].getText() == "O") && (bton[4].getText() == "O") && (bton[6].getText() == "O")) {
            oWins(2, 4, 6);
        }
        else if ((bton[2].getText() == "O") && (bton[5].getText() == "O") && (bton[8].getText() == "O")) {
            oWins(2, 5, 8);
        }
        else if ((bton[3].getText() == "O") && (bton[4].getText() == "O") && (bton[5].getText() == "O")) {
            oWins(3, 4, 5);
        }
        else if ((bton[6].getText() == "O") && (bton[7].getText() == "O") && (bton[8].getText() == "O")) {
            oWins(6, 7, 8);
        }
        
        else if (chance_flag == 9) {
            textfield.setText("Match Tie");
            gameOver("Match Tie");
        }
    }
    
    public void xWins(int x1, int x2, int x3) {
        bton[x1].setBackground(Color.RED);
        bton[x2].setBackground(Color.RED);
        bton[x3].setBackground(Color.RED);
        
        for (int i = 0; i < 9; i++) {
            bton[i].setEnabled(false);
        }
        textfield.setText("X Wins");
        gameOver("X Wins");
    }
    
    public void oWins(int x1, int x2, int x3) {
        bton[x1].setBackground(Color.BLUE);
        bton[x2].setBackground(Color.BLUE);
        bton[x3].setBackground(Color.BLUE);
        
        for (int i = 0; i < 9; i++) {
            bton[i].setEnabled(false);
        }
        textfield.setText("O Wins");
        gameOver("O Wins");
    }
    
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == bton[i]) {
                if(pl1_chance) {
                    if(bton[i].getText() == "") {
                        bton[i].setForeground(new Color(255, 0, 0));
                        bton[i].setText("X");
                        pl1_chance = false;
                        textfield.setText("O Turn");
                        chance_flag++;
                        matchCheck();
                    }
                } else {
                    if (bton[i].getText() == "") {
                        bton[i].setForeground(new Color(0, 0, 255));
                        bton[i].setText("O");
                        pl1_chance = true;
                        textfield.setText("X Turn");
                        chance_flag++;
                        matchCheck();
                    }
                }
            }
        }
    }
}
