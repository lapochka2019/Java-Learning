import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JPanel Calculator;
    private JButton b_sep;
    private JButton b_mult;
    private JButton b_minus;
    private JButton b7;
    private JButton b8;
    private JButton b_plus;
    private JButton b9;
    private JButton b6;
    private JButton b5;
    private JButton b4;
    private JButton b3;
    private JButton b2;
    private JButton b1;
    private JButton b_clear;
    private JButton b0;
    private JButton b_result;
    private JTextField textField1;
    private JButton b_point;
    private double a =0.0;
    private double b = 0.0;
    private double r = 0.0;
    private char c = ' ';

    public Calculator() {
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b_text = textField1.getText()+b1.getText();
                textField1.setText(b_text);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b_text = textField1.getText()+b2.getText();
                textField1.setText(b_text);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b_text = textField1.getText()+b3.getText();
                textField1.setText(b_text);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b_text = textField1.getText()+b4.getText();
                textField1.setText(b_text);
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b_text = textField1.getText()+b5.getText();
                textField1.setText(b_text);
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b_text = textField1.getText()+b6.getText();
                textField1.setText(b_text);
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b_text = textField1.getText()+b7.getText();
                textField1.setText(b_text);
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b_text = textField1.getText()+b8.getText();
                textField1.setText(b_text);
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b_text = textField1.getText()+b9.getText();
                textField1.setText(b_text);
            }
        });
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String b_text = textField1.getText()+b0.getText();
                textField1.setText(b_text);
            }
        });
        b_point.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField1.getText().equals("")){
                    textField1.setText("0.");
                }
                else if (textField1.getText().contains(".")){
                    b_point.setEnabled(false);
                }
                else {
                    String b_text = textField1.getText()+b_point.getText();
                    textField1.setText(b_text);
                }
            }
        });
        b_plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText());
                textField1.setText("");
                c='+';
            }
        });
        b_minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText());
                textField1.setText("");
                c='-';
            }
        });
        b_mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText());
                textField1.setText("");
                c='*';
            }
        });
        b_sep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textField1.getText());
                textField1.setText("");
                c='/';
            }
        });
        b_result.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(textField1.getText());
                textField1.setText("");
                switch(c){
                    case '+': r = a+b; textField1.setText(String.format("%.2f", r).replaceAll(",", ".")); break;
                    case '-': r = a-b; textField1.setText(String.format("%.2f", r).replaceAll(",", ".")); break;
                    case '*': r = a*b; textField1.setText(String.format("%.2f", r).replaceAll(",", ".")); break;
                    case '/': r = a/b; textField1.setText(String.format("%.2f", r).replaceAll(",", ".")); break;

                }
                a = 0.0;
                b = 0.0;
                r = 0.0;
                c = ' ';
            }
        });
        b_clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = 0.0;
                b = 0.0;
                r = 0.0;
                c = ' ';
                textField1.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().Calculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
