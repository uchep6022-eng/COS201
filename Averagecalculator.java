import javax.swing.JOptionPane;

public class AverageCalculator {
    public static void main(String[] args) {
        try {
            String countStr = JOptionPane.showInputDialog("How many numbers do you want to average?");
            if (countStr == null) return;
            int count = Integer.parseInt(countStr);

            if (count <= 0) {
                JOptionPane.showMessageDialog(null, "Please enter a count greater than zero.");
                return;
            }

            double sum = 0;
            for (int i = 1; i <= count; i++) {
                String valStr = JOptionPane.showInputDialog("Enter number " + i + " of " + count + ":");
                if (valStr == null) return;
                sum += Double.parseDouble(valStr);
            }

            double average = sum / count;
            JOptionPane.showMessageDialog(null, "The average is: " + average);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Please enter valid numbers.");
        }
    }
}
7
