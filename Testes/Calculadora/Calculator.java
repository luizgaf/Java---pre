import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import org.graalvm.polyglot.*;
import calc.Func;

public class Calculator{
    public static void main(String[] args) {
        // Criar o frame (janela)
        JFrame frame = new JFrame("Basic Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(380, 700);
        frame.setMinimumSize(new Dimension(380, 700));
        frame.setMaximumSize(new Dimension(380, 700));
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        //TextField
        JTextField textField = new JTextField(20);
        Font textFont = new Font("Arial", Font.PLAIN, 20);
        textField.setFont(textFont);

        // Criar os botões
        JButton button0 = new JButton("+");
        JButton button1 = new JButton("-");
        JButton button2 = new JButton("x");
        JButton button3 = new JButton("÷");
        JButton buttonEqual = new JButton("=");
        JButton buttonClear = new JButton("C");

        JButton button4 = new JButton("1");
        JButton button5 = new JButton("2");
        JButton button6 = new JButton("3");
        JButton button7 = new JButton("4");
        JButton button8 = new JButton("5");
        JButton button9 = new JButton("6");
        JButton button10 = new JButton("7");
        JButton button11 = new JButton("8");
        JButton button12 = new JButton("9");
        JButton button13 = new JButton("0");
        

        // Adicionar os botões ao frame
        frame.add(textField, BorderLayout.NORTH);
        textField.setLayout(new FlowLayout());
        textField.setPreferredSize(new Dimension(280, 90));

        JPanel operationButtons = new JPanel(); 
        operationButtons.setLayout(new FlowLayout());
        operationButtons.setPreferredSize(new Dimension(100, 400));
        operationButtons.add(button0);
        operationButtons.add(button1);
        operationButtons.add(button2);
        operationButtons.add(button3);
        operationButtons.add(buttonEqual);
        operationButtons.add(buttonClear);

        // Number

        JPanel numberPanel = new JPanel();
        numberPanel.setLayout(new FlowLayout());
        numberPanel.setPreferredSize(new Dimension(100, 400));
        numberPanel.add(button4);
        numberPanel.add(button5);
        numberPanel.add(button6);

        numberPanel.add(button7);
        numberPanel.add(button8);
        numberPanel.add(button9);

        numberPanel.add(button10);
        numberPanel.add(button11);
        numberPanel.add(button12);

        numberPanel.add(button13);

        frame.add(operationButtons, BorderLayout.EAST);  
        frame.add(numberPanel, BorderLayout.CENTER); 


        //size

        Dimension buttonSize = new Dimension(80, 80); 
        button0.setPreferredSize(buttonSize);
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        button3.setPreferredSize(buttonSize);
        button4.setPreferredSize(buttonSize);
        button5.setPreferredSize(buttonSize);
        button6.setPreferredSize(buttonSize);
        button7.setPreferredSize(buttonSize);
        button8.setPreferredSize(buttonSize);
        button9.setPreferredSize(buttonSize);
        button10.setPreferredSize(buttonSize);
        button11.setPreferredSize(buttonSize);
        button12.setPreferredSize(buttonSize);
        button13.setPreferredSize(buttonSize);
        buttonEqual.setPreferredSize(buttonSize);
        buttonClear.setPreferredSize(buttonSize);

        // font
        Font buttonFont = new Font("Arial", Font.PLAIN, 20);
        button0.setFont(buttonFont);
        button1.setFont(buttonFont);
        button2.setFont(buttonFont);
        button3.setFont(buttonFont);
        button4.setFont(buttonFont);
        button5.setFont(buttonFont);
        button6.setFont(buttonFont);
        button7.setFont(buttonFont);
        button8.setFont(buttonFont);
        button9.setFont(buttonFont);
        button10.setFont(buttonFont);
        button11.setFont(buttonFont);
        button12.setFont(buttonFont);
        button13.setFont(buttonFont);
        buttonEqual.setFont(buttonFont);
        buttonClear.setFont(buttonFont);

        //color
        Color grafitti = new Color(45, 45, 45);
        Color white = Color.WHITE;

        
        button0.setBackground(white);
        button1.setBackground(white);
        button2.setBackground(white);
        button3.setBackground(white);
        button4.setBackground(white);
        button5.setBackground(white);
        button6.setBackground(white);
        button7.setBackground(white);
        button8.setBackground(white);
        button9.setBackground(white);
        button10.setBackground(white);
        button11.setBackground(white);
        button12.setBackground(white);
        button13.setBackground(white);
        buttonEqual.setBackground(white);
        buttonClear.setBackground(white);

        // funcoes

        button4.addActionListener(e -> textField.setText(textField.getText() + "1"));
        button5.addActionListener(e -> textField.setText(textField.getText() + "2"));
        button6.addActionListener(e -> textField.setText(textField.getText() + "3"));
        button7.addActionListener(e -> textField.setText(textField.getText() + "4"));
        button8.addActionListener(e -> textField.setText(textField.getText() + "5"));
        button9.addActionListener(e -> textField.setText(textField.getText() + "6"));
        button10.addActionListener(e -> textField.setText(textField.getText() + "7"));
        button11.addActionListener(e -> textField.setText(textField.getText() + "8"));
        button12.addActionListener(e -> textField.setText(textField.getText() + "9"));
        button13.addActionListener(e -> textField.setText(textField.getText() + "0"));

        button0.addActionListener(e -> textField.setText(textField.getText() + "+"));
        button1.addActionListener(e -> textField.setText(textField.getText() + "-"));
        button2.addActionListener(e -> textField.setText(textField.getText() + "x"));
        button3.addActionListener(e -> textField.setText(textField.getText() + "/"));

        buttonClear.addActionListener(e -> textField.setText(" "));

        // Funcionamento

        String expression = textField.getText();

        expression = expression.replace("x", "*").replace("÷", "/");

            Object result = Func.calculate(expression);  
            buttonEqual.addActionListener(e ->textField.setText(result.toString()));  
    }
}
