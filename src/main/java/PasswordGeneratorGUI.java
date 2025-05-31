import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordGeneratorGUI extends JFrame {
    private PasswordGenerator passwordGenerator;

    public PasswordGeneratorGUI(){
        super("Password Generator");
        setSize(540, 570);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);
        passwordGenerator = new PasswordGenerator();
        addGUIComponents();
    }

    private void addGUIComponents(){
        JLabel titleLabel = new JLabel("Password Generator");
        titleLabel.setForeground(Color.GREEN);
        titleLabel.setBounds(0, 20, 540, 35);
        titleLabel.setFont(new Font("Monospaced", Font.BOLD, 42));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(titleLabel);

        JTextArea passwordOutput = new JTextArea();
        passwordOutput.setBackground(Color.DARK_GRAY);
        passwordOutput.setForeground(Color.GREEN);
        passwordOutput.setEditable(false);
        passwordOutput.setFont(new Font("Monospaced", Font.BOLD, 32));
        JScrollPane passwordOutputPanel = new JScrollPane(passwordOutput);
        passwordOutputPanel.setBounds(25, 97, 479, 70);
        passwordOutputPanel.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        add(passwordOutputPanel);

        JLabel passwordLengthLabel = new JLabel("Password length: ");
        passwordLengthLabel.setForeground(Color.GREEN);
        passwordLengthLabel.setFont(new Font("Monospaced", Font.PLAIN, 26));
        passwordLengthLabel.setBounds(25, 215, 272, 39);
        add(passwordLengthLabel);

        JTextArea passwordLengthInput = new JTextArea();
        passwordLengthInput.setFont(new Font("Monospaced", Font.PLAIN, 32));
        passwordLengthInput.setBackground(Color.DARK_GRAY);
        passwordLengthInput.setForeground(Color.GREEN);
        passwordLengthInput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        passwordLengthInput.setBounds(310, 215, 192, 39);
        add(passwordLengthInput);

        JToggleButton uppercaseToggle = new JToggleButton("Uppercase");
        uppercaseToggle.setBounds(25, 302,225,56);
        uppercaseToggle.setOpaque(true);
        uppercaseToggle.setContentAreaFilled(false); // Keep false to stop default L&F painting
        uppercaseToggle.setFocusPainted(false);
        uppercaseToggle.setBorderPainted(true);
        uppercaseToggle.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        uppercaseToggle.setForeground(Color.decode("#0B7414")); // Initial text color

// Force repaint manually
        uppercaseToggle.addChangeListener(e -> {
            if (uppercaseToggle.isSelected()) {
                uppercaseToggle.setForeground(Color.GREEN);
                uppercaseToggle.setFont(new Font("Monospaced", Font.BOLD, 26));
            } else {
                uppercaseToggle.setForeground(Color.decode("#0B7414"));
                uppercaseToggle.setFont(new Font("Monospaced", Font.PLAIN, 26));
            }
            uppercaseToggle.repaint(); // Force visual update
        });
        uppercaseToggle.setFont(new Font("Monospaced", Font.PLAIN, 26));
        add(uppercaseToggle);

        JToggleButton lowercaseToggle = new JToggleButton("Lowercase");
        lowercaseToggle.setBounds(282, 302,225,56);
        lowercaseToggle.setFont(new Font("Monospaced", Font.PLAIN, 26));
        lowercaseToggle.setOpaque(true);
        lowercaseToggle.setContentAreaFilled(false); // Keep false to stop default L&F painting
        lowercaseToggle.setFocusPainted(false);
        lowercaseToggle.setBorderPainted(true);
        lowercaseToggle.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        lowercaseToggle.setForeground(Color.decode("#0B7414")); // Initial text color

// Force repaint manually
        lowercaseToggle.addChangeListener(e -> {
            if (lowercaseToggle.isSelected()) {
                lowercaseToggle.setForeground(Color.GREEN);
                lowercaseToggle.setFont(new Font("Monospaced", Font.BOLD, 26));
            } else {
                lowercaseToggle.setForeground(Color.decode("#0B7414"));
                lowercaseToggle.setFont(new Font("Monospaced", Font.PLAIN, 26));
            }
            lowercaseToggle.repaint(); // Force visual update
        });
        add(lowercaseToggle);

        JToggleButton numbersToggle = new JToggleButton("Numbers");
        numbersToggle.setBounds(25, 373,225,56);
        numbersToggle.setFont(new Font("Monospaced", Font.PLAIN, 26));
        numbersToggle.setOpaque(true);
        numbersToggle.setContentAreaFilled(false); // Keep false to stop default L&F painting
        numbersToggle.setFocusPainted(false);
        numbersToggle.setBorderPainted(true);
        numbersToggle.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        numbersToggle.setForeground(Color.decode("#0B7414")); // Initial text color

// Force repaint manually
        numbersToggle.addChangeListener(e -> {
            if (numbersToggle.isSelected()) {
                numbersToggle.setForeground(Color.GREEN);
                numbersToggle.setFont(new Font("Monospaced", Font.BOLD, 26));
            } else {
                numbersToggle.setForeground(Color.decode("#0B7414"));
                numbersToggle.setFont(new Font("Monospaced", Font.PLAIN, 26));
            }
            numbersToggle.repaint(); // Force visual update
        });
        add(numbersToggle);

        JToggleButton symbolsToggle = new JToggleButton("Symbols");
        symbolsToggle.setBounds(282, 373,225,56);
        symbolsToggle.setFont(new Font("Monospaced", Font.PLAIN, 26));
        symbolsToggle.setOpaque(true);
        symbolsToggle.setContentAreaFilled(false); // Keep false to stop default L&F painting
        symbolsToggle.setFocusPainted(false);
        symbolsToggle.setBorderPainted(true);
        symbolsToggle.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        symbolsToggle.setForeground(Color.decode("#0B7414")); // Initial text color

// Force repaint manually
        symbolsToggle.addChangeListener(e -> {
            if (symbolsToggle.isSelected()) {
                symbolsToggle.setForeground(Color.GREEN);
                symbolsToggle.setFont(new Font("Monospaced", Font.BOLD, 26));
            } else {
                symbolsToggle.setForeground(Color.decode("#0B7414"));
                symbolsToggle.setFont(new Font("Monospaced", Font.PLAIN, 26));
            }
            symbolsToggle.repaint(); // Force visual update
        });
        add(symbolsToggle);

        JButton generateButton = new JButton("Generate");
        generateButton.setBounds(155, 477, 222, 41);
        generateButton.setFont(new Font("Monospaced", Font.BOLD, 32));
        generateButton.setBackground(Color.GREEN);
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (passwordLengthInput.getText().length() <= 0) return;
                boolean anyToggleSelected = lowercaseToggle.isSelected() || uppercaseToggle.isSelected() || numbersToggle.isSelected() || symbolsToggle.isSelected();
                int passwordLength = Integer.parseInt(passwordLengthInput.getText());
                if (anyToggleSelected){
                    String generatedPassword = passwordGenerator.generatePassword(passwordLength, uppercaseToggle.isSelected(), lowercaseToggle.isSelected(), numbersToggle.isSelected(), symbolsToggle.isSelected());
                    passwordOutput.setText(generatedPassword);
                }
            }
        });
        add(generateButton);
    }
}
