import javax.swing.JOptionPane;

public class SimpleCalculator {
    public static void main(String[] args) {
        try {
            String num1Str = JOptionPane.showInputDialog("Enter the first number:");
            if (num1Str == null) return;
            double num1 = Double.parseDouble(num1Str);

            String operator = JOptionPane.showInputDialog("Enter an operator (+, -, *, /):");
            if (operator == null) return;

            String num2Str = JOptionPane.showInputDialog("Enter the second number:");
            if (num2Str == null) return;
            double num2 = Double.parseDouble(num2Str);

            double result = 0;
            boolean validOperation = true;

            switch (operator.trim()) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error: Invalid operator.");
                    validOperation = false;
            }

            if (validOperation) {
                JOptionPane.showMessageDialog(null, "Result: " + num1 + " " + operator + " " + num2 + " = " + result);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Please enter valid numeric values.");
        }
    }
}
