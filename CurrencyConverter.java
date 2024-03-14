import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class CurrencyConverter {

    private static final double USD_TO_EUR_RATE = 0.85;
    private static final double USD_TO_INR_RATE = 82.88;
    private static final double USD_TO_KWD_RATE = 0.303;
    private static final double USD_TO_AUD_RATE = 1.32;
    private static final double USD_TO_ZAR_RATE = 14.90;
    private static final double USD_TO_LKR_RATE = 200.50;
    private static final double USD_TO_IDR_RATE = 14300.0;
    private static final double USD_TO_JPY_RATE = 111.25;
    private static final double USD_TO_SGD_RATE = 1.38;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Currency Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(4, 2)); // Adjusted for additional currencies
        JTextField amountField = new JTextField(10);
        JComboBox<String> fromCurrencyCombo = new JComboBox<>(new String[]{"USD", "EUR", "INR", "KWD", "AUD", "ZAR", "LKR", "IDR", "JPY", "SGD"});
        JComboBox<String> toCurrencyCombo = new JComboBox<>(new String[]{"USD", "EUR", "INR", "KWD", "AUD", "ZAR", "LKR", "IDR", "JPY", "SGD"});
        inputPanel.add(new JLabel("Amount: "));
        inputPanel.add(amountField);
        inputPanel.add(new JLabel("From Currency: "));
        inputPanel.add(fromCurrencyCombo);
        inputPanel.add(new JLabel("To Currency: "));
        inputPanel.add(toCurrencyCombo);
        JPanel resultPanel = new JPanel(new FlowLayout());
        JLabel resultLabel = new JLabel("Result: ");
        resultPanel.add(resultLabel);
        JButton convertButton = new JButton("Convert");
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(amountField.getText());
                    String fromCurrency = (String) fromCurrencyCombo.getSelectedItem();
                    String toCurrency = (String) toCurrencyCombo.getSelectedItem();
                    double result = convertCurrency(amount, fromCurrency, toCurrency);
                    DecimalFormat df = new DecimalFormat("#.##");
                    resultLabel.setText("<html>Result: <br>" + df.format(result) + " " + toCurrency + "</html>");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(convertButton);
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(resultPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
    }
    private static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        if ("USD".equals(fromCurrency) && "EUR".equals(toCurrency)) {
            return amount * USD_TO_EUR_RATE;
        } else if ("USD".equals(fromCurrency) && "INR".equals(toCurrency)) {
            return amount * USD_TO_INR_RATE;
        } else if ("USD".equals(fromCurrency) && "KWD".equals(toCurrency)) {
            return amount * USD_TO_KWD_RATE;
        } else if ("USD".equals(fromCurrency) && "AUD".equals(toCurrency)) {
            return amount * USD_TO_AUD_RATE;
        } else if ("USD".equals(fromCurrency) && "ZAR".equals(toCurrency)) {
            return amount * USD_TO_ZAR_RATE;
        } else if ("USD".equals(fromCurrency) && "LKR".equals(toCurrency)) {
            return amount * USD_TO_LKR_RATE;
        } else if ("USD".equals(fromCurrency) && "IDR".equals(toCurrency)) {
            return amount * USD_TO_IDR_RATE;
        } else if ("USD".equals(fromCurrency) && "JPY".equals(toCurrency)) {
            return amount * USD_TO_JPY_RATE;
        } else if ("USD".equals(fromCurrency) && "SGD".equals(toCurrency)) {
            return amount * USD_TO_SGD_RATE;
        } else if ("EUR".equals(fromCurrency) && "USD".equals(toCurrency)) {
            return amount / USD_TO_EUR_RATE;
        } else if ("EUR".equals(fromCurrency) && "INR".equals(toCurrency)) {
            return amount * (USD_TO_INR_RATE / USD_TO_EUR_RATE);
        } else if ("INR".equals(fromCurrency) && "USD".equals(toCurrency)) {
            return amount / USD_TO_INR_RATE;
        } else if ("INR".equals(fromCurrency) && "EUR".equals(toCurrency)) {
            return amount / (USD_TO_INR_RATE / USD_TO_EUR_RATE);
        } else {
            return amount;
        }
    }
}
