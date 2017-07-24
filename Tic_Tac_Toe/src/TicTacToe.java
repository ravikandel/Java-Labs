
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JMenuBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ravi Kandel
 */
public class TicTacToe extends JFrame implements ActionListener{
    Container pane;
    JMenuBar menuBar;
    JMenu gameMenu,aboutMenu,helpMenu;
    JMenuItem menuItemvsComp,menuItemvsHuman,menuItemsReset,menuItemExit;
    JPanel welcomePanel,gamePanel;
    Font f=new Font("Century Gothic",Font.BOLD,36);
    JButton [] grids=new JButton[9];
    Icon icPlayer1,icPlayer2;
    String player1Name,player2Name;
    
    boolean playerState=false;
    
    int solutions[][]={
                        {10,1,2,3,11},{10,1,4,7,11},{10,1,5,9,11},
                        {10,2,5,8,11},{10,3,6,9,11},{10,3,5,7,11},
                        {10,4,5,6,11},{10,7,8,9,11}
                      };
    public TicTacToe(){
        super("TIC-TAC-TOE");
        pane=getContentPane();

        menuBar=new JMenuBar();
        gameMenu=new JMenu("Game");
        aboutMenu=new JMenu("About Us");
        helpMenu=new JMenu("Help");
//        gameMenu.setFont(f);
//        aboutMenu.setFont(f);
//        helpMenu.setFont(f);
        menuBar.add(gameMenu);
        menuBar.add(aboutMenu);
        menuBar.add(helpMenu);
        this.menuItemvsComp=new JMenuItem("Human vs. Computer");
        this.menuItemvsHuman=new JMenuItem("Human vs. Human");
        this.menuItemsReset= new JMenuItem("Reset");
        this.menuItemExit=new JMenuItem("Exit");
        
        this.menuItemvsHuman.addActionListener(this);
        this.menuItemsReset.addActionListener(this);
        this.menuItemExit.addActionListener(this);
        
        gameMenu.add(this.menuItemvsComp);
        gameMenu.add(this.menuItemvsHuman);
        gameMenu.add(this.menuItemsReset);
        gameMenu.addSeparator();
        gameMenu.add(this.menuItemExit);
        this.setJMenuBar(menuBar);
        
        welcomePanel = new JPanel();
        GridLayout welcomeLayout = new GridLayout(4,0);
        welcomePanel.setLayout(welcomeLayout);
        
        JLabel line1= new JLabel("Welcome");
        JLabel line2= new JLabel("To");
        JLabel line3= new JLabel("Tic Tac Toe");
        JLabel line4= new JLabel("- Ravi Kandel");
        welcomePanel.add(line1);
        welcomePanel.add(line2);
        welcomePanel.add(line3);
        welcomePanel.add(line4);
        line1.setFont(f);
        line2.setFont(f);
        line3.setFont(f);
        line1.setForeground(Color.red);
        line2.setForeground(Color.red);
        line3.setForeground(Color.red);
        
        line1.setHorizontalAlignment(SwingConstants.CENTER);
        line2.setHorizontalAlignment(SwingConstants.CENTER);
        line3.setHorizontalAlignment(SwingConstants.CENTER);
        line4.setHorizontalAlignment(SwingConstants.CENTER);
        
        pane.add(welcomePanel);
        this.setSize(400,400);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent event){
        if(event.getSource()==this.menuItemsReset){
            for(int i=0;i<9;i++){
                grids[i].setIcon(null);
            }
            this.playerState=false;
        }
        if(event.getSource()==this.menuItemExit){
            //System.exit(0);
            JOptionPane.showMessageDialog(null, "Want to exit Tic Tac Toe?");
            this.setVisible(false);
            this.dispose();
        }
        if(event.getSource()==this.menuItemvsHuman){
            
            player1Name = JOptionPane.showInputDialog(null, "Player 1 Name: ");
            player2Name = JOptionPane.showInputDialog(null, "Player 2 Name: ");
            welcomePanel.setVisible(false);
            loadGameBoard();
        }
        for(int i=0;i<9;i++){
            if(event.getSource()==grids[i]){
                if(playerState==false){
                    grids[i].setIcon(icPlayer1);
                    playerState=true;
                }
                else{
                    grids[i].setIcon(icPlayer2);
                    playerState=false;
                }
            }
            checkResult();
        }
    }
    public void loadGameBoard(){
        gamePanel = new JPanel();
        GridLayout gameLayout = new GridLayout(3,0);
        gamePanel.setLayout(gameLayout);
        for(int i=0;i<9;i++){
            grids[i]=new JButton();
            grids[i].addActionListener(this);
            gamePanel.add(grids[i]);
        }
        pane.add(gamePanel);
        icPlayer1= new ImageIcon("D:\\o.png");
        icPlayer2= new ImageIcon("D:\\x.png");
    }
    public void checkResult(){
        for(int i=0;i<8;i++){
            Icon icon1=grids[solutions[i][1]-1].getIcon();
            Icon icon2=grids[solutions[i][2]-1].getIcon();
            Icon icon3=grids[solutions[i][3]-1].getIcon();
            if((icon1==icon2&& icon2==icon3) && (icon1!=null)){
                if(icon1==icPlayer1){
                    JOptionPane.showMessageDialog(null,player1Name+" won.");
                    break;
                }
                if(icon1==icPlayer2){
                    JOptionPane.showMessageDialog(null,player2Name+" won.");
                    break;
                }
            }
        }
    }
    public static void main(String []args){
        TicTacToe ttc=new TicTacToe();
        ttc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
