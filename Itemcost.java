import javax.swing.JOptionPane;

public class ItemCost {
    public static void main(String[] args) {
        try {
            String priceStr = JOptionPane.showInputDialog("Enter the unit price of the item:");
            if (priceStr == null) return;
            double unitPrice = Double.parseDouble(priceStr);

            String qtyStr = JOptionPane.showInputDialog("Enter the quantity:");
            if (qtyStr == null) return;
            int quantity = Integer.parseInt(qtyStr);

            String taxStr = JOptionPane.showInputDialog("Enter the sales tax rate (e.g., enter 5 for 5%):");
            if (taxStr == null) return;
            double taxRate = Double.parseDouble(taxStr);

            double subtotal = unitPrice * quantity;
            double taxAmount = subtotal * (taxRate / 100);
            double totalCost = subtotal + taxAmount;

            String receipt = String.format(
                "--- Purchase Receipt ---%n" +
                "Unit Price: $%.2f%n" +
                "Quantity: %d%n" +
                "Subtotal: $%.2f%n" +
                "Tax (%.1f%%): $%.2f%n" +
                "Total Cost: $%.2f",
                unitPrice, quantity, subtotal, taxRate, taxAmount, totalCost
            );

            JOptionPane.showMessageDialog(null, receipt);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Please enter valid numeric information.");
        }
    }
}
