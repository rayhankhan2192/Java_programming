import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Struct;

public class Calculate implements ActionListener {
 
    JFrame frame;
    JTextField textField;
    JButton[] numberOfButton = new JButton[10];
    JButton[] functiButton = new JButton[8];
    JButton sum, sub, mult, div;
    JButton deleteButton, equalButton, decimalButton, clearButton;
    JPanel panel;

    Font myFont = new Font("Ink Free", Font.BOLD, 30);
    double num1, num2, result = 0;
    char operator;

    public Calculate() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(myFont);
        textField.setEditable(false);
        sum = new JButton("+");
        sum.setBackground(Color.orange);
        sub = new JButton("-");
        sub.setBackground(Color.GREEN);
        mult = new JButton("*");
        mult.setBackground(Color.MAGENTA);
        div = new JButton("/");
        div.setBackground(Color.lightGray);
        decimalButton = new JButton(".");
        equalButton = new JButton("=");
        equalButton.setBackground(Color.red);
        deleteButton = new JButton("Delete");
        clearButton = new JButton("Clear");

        functiButton[0] = sum;
        functiButton[1] = sub;
        functiButton[2] = mult;
        functiButton[3] = div;
        functiButton[4] = decimalButton;
        functiButton[5] = equalButton;
        functiButton[6] = deleteButton;
        functiButton[7] = clearButton;

        for (int i = 0; i < 8; i++) {
            functiButton[i].addActionListener(this);
            functiButton[i].setFont(myFont);
            functiButton[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numberOfButton[i] = new JButton(String.valueOf(i));
            numberOfButton[i].addActionListener(this);
            numberOfButton[i].setFont(myFont);
            numberOfButton[i].setFocusable(false);
        }

        deleteButton.setBounds(50, 430, 145, 50);
        clearButton.setBounds(205, 430, 145, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        //panel.setBackground(Color.pink);

        panel.add(numberOfButton[1]);
        panel.add(numberOfButton[2]);
        panel.add(numberOfButton[3]);
        panel.add(sum);
        panel.add(numberOfButton[4]);
        panel.add(numberOfButton[5]);
        panel.add(numberOfButton[6]);
        panel.add(sub);
        panel.add(numberOfButton[7]);
        panel.add(numberOfButton[8]);
        panel.add(numberOfButton[9]);
        panel.add(mult);
        panel.add(decimalButton);
        panel.add(numberOfButton[0]);
        panel.add(equalButton);
        panel.add(div);

        frame.add(panel);
        frame.add(clearButton);
        frame.add(deleteButton);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new Calculate();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberOfButton[i]) {
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if (e.getSource() == decimalButton) {
            textField.setText(textField.getText().concat("."));
        }
        if (e.getSource() == sum) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
        }
        if (e.getSource() == sub) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
        }
        if (e.getSource() == mult) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
        }
        if (e.getSource() == div) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
        }
        if (e.getSource() == equalButton) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;

            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == clearButton) {
            textField.setText("");
        }
        if (e.getSource() == deleteButton) {
            String value = textField.getText();
            textField.setText("");
            for (int i = 0; i < value.length() - 1; i++) {
                textField.setText(textField.getText() + value.charAt(i));
            }
        }

    }
}
