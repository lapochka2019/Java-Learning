package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class TicTacToe extends JComponent{
    public static final int Empty = 0;//empty field value
    public static final int Zero = 10;//zero field value
    public static final int Cross = 200;//cross field value
    int[][]arr;//memory
    boolean isCross;// cross move?


    public TicTacToe(){
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
        arr = new int[3][3];
        Game();
    }

    public void Game(){
        for (int i=0;i<3;i++){//all field is empty
            for (int j=0;j<3;j++){
                arr[i][j]=Empty;
            }
        }
        isCross=true;//cross do firs move
    }

    @Override
    protected void processMouseEvent(MouseEvent mouse){
        super.processMouseEvent(mouse);
        if(mouse.getButton()==MouseEvent.BUTTON1){//if left button
            int x = mouse.getX();
            int y = mouse.getY();
            //convert coordinates to array indices
            int i= (int)((float)x/getWidth()*3);
            int j= (int)((float)y/getHeight()*3);
            //check thar choose field is empty
            if(arr[i][j]==Empty){
                arr[i][j]=isCross?Cross:Zero;//(ternary expression) determines whose move
                isCross=!isCross;//change player
                repaint();//redraw grid
                int res=Winner();
                if (res!=0){
                    if (res==Zero*3){
                        JOptionPane.showMessageDialog(this, "Zero is win!", "Game over!",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else if (res==Cross*3){
                        JOptionPane.showMessageDialog(this, "Cross is win!", "Game over!",JOptionPane.INFORMATION_MESSAGE);
                    }else {
                        JOptionPane.showMessageDialog(this, "No win!", "Game over!",JOptionPane.INFORMATION_MESSAGE);
                    }
                    Game();
                    repaint();
                }
            }
        }
    }

    @Override
    protected void paintComponent(Graphics graph){//method which draw circle
        super.paintComponent(graph);
        graph.clearRect(0,0,getWidth(),getHeight());
        drawGrid(graph);
        drawXor0(graph);
    }

    void drawGrid(Graphics graph){//method which draw grid
        int w = getWidth();
        int h = getHeight();
        int dw = w/3;//step horizontal grid
        int dh = h/3;//step vertical grid
        graph.setColor(Color.black);
        for (int i=1;i<3;i++){
            graph.drawLine(0, dh*i, w, dh*i);//horizontal lines
            graph.drawLine(dw*i, 0, dw*i, h);//vertical lines
        }
    }
    void drawCross(int i, int j, Graphics graph){
    graph.setColor(Color.blue);
    int w = getWidth()/3;
    int h = getHeight()/3;
    int x = w*i;
    int y=h*j;
    graph.drawLine(x,y,x+w,y+h);
    graph.drawLine(x,y+h,x+w,y);
    }
    void drawZero(int i, int j, Graphics graph){
        graph.setColor(Color.red);
        int w = getWidth()/3;
        int h = getHeight()/3;
        int x = w*i;
        int y=h*j;
        graph.drawOval(x,y,w,h);
    }
    void drawXor0(Graphics graph){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if(arr[i][j]==Cross){
                    drawCross(i,j,graph);
                }
                else if (arr[i][j]==Zero){
                    drawZero(i,j,graph);
                }
            }
        }
    }
    int Winner(){
        int diag1=0;
        int diag2=0;
        for (int i=0;i<3;i++){
            diag1+=arr[i][i];
            diag2+=arr[i][2-i];
        }
        if(diag1==Zero*3)return diag1;
        if(diag1==Cross*3)return diag1;
        if(diag2==Zero*3)return diag2;
        if(diag2==Cross*3)return diag2;
        boolean hasempty=false;
        for (int i=0;i<3;i++){
            int check_i=0;
            int check_j=0;
            for (int j=0;j<3;j++) {
                if (arr[i][j]==Empty){
                    hasempty=true;
                }
                check_i+=arr[i][j];
                check_j+=arr[j][i];
            }
            if(check_i==Zero*3) return check_i;
            if(check_i==Cross*3)return check_i;
            if(check_j==Zero*3) return check_j;
            if(check_j==Cross*3)return check_j;
        }
        if (hasempty==true)return 0;
        else return -1;
    }
}
