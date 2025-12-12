import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CompanyAdventureSwing extends JFrame {

    // first screen
    private JTextField fNameField;
    private JTextField lNameField;
    private JTextField ageField;
    private JTextField milesField;
    private JTextField rateField;
    private JLabel errorLabel;

    // second screen
    private JLabel headerLabel;
    private JTextArea storyArea;
    private JPanel choicesPanel;

    // Story state
    private Employee employee;
    private StoryNode[] rootOptions;

    public CompanyAdventureSwing() {
        setTitle("Company Adventure");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 500);
        setLocationRelativeTo(null); // center on screen

        // Start with the setup screen
        showSetupPanel();
    }

    // collect of Employee information.

    private void showSetupPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel titleLabel = new JLabel("Welcome to the Company Adventure Story!");
        titleLabel.setFont(titleLabel.getFont().deriveFont(Font.BOLD, 18f));

        JPanel formPanel = new JPanel(new GridLayout(5, 2, 5, 5));

        fNameField = new JTextField();
        lNameField = new JTextField();
        ageField = new JTextField();
        milesField = new JTextField();
        rateField = new JTextField();

        formPanel.add(new JLabel("First name:"));
        formPanel.add(fNameField);
        formPanel.add(new JLabel("Last name:"));
        formPanel.add(lNameField);
        formPanel.add(new JLabel("Age (19–120):"));
        formPanel.add(ageField);
        formPanel.add(new JLabel("Miles driven daily (1–500):"));
        formPanel.add(milesField);
        formPanel.add(new JLabel("Hourly rate (1–200):"));
        formPanel.add(rateField);

        JButton startButton = new JButton("Start Adventure");
        startButton.addActionListener(this::handleStartAdventure);

        errorLabel = new JLabel(" ");
        errorLabel.setForeground(Color.RED);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(startButton, BorderLayout.CENTER);
        bottomPanel.add(errorLabel, BorderLayout.SOUTH);

        panel.add(titleLabel, BorderLayout.NORTH);
        panel.add(formPanel, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);

        setContentPane(panel);
        revalidate();
        repaint();
    }

    private void handleStartAdventure(ActionEvent e) {
        if (createEmployeeFromFields()) {
            showStoryPanel();
        }
    }

    private boolean createEmployeeFromFields() {
        String fName = fNameField.getText().trim();
        String lName = lNameField.getText().trim();
        String ageText = ageField.getText().trim();
        String milesText = milesField.getText().trim();
        String rateText = rateField.getText().trim();

        if (fName.isEmpty() || lName.isEmpty()
                || ageText.isEmpty() || milesText.isEmpty() || rateText.isEmpty()) {
            errorLabel.setText("Please fill in all fields.");
            return false;
        }

        int age, miles, rate;
        try {
            age = Integer.parseInt(ageText);
            miles = Integer.parseInt(milesText);
            rate = Integer.parseInt(rateText);
        } catch (NumberFormatException e) {
            errorLabel.setText("Age, miles, and rate must be whole numbers.");
            return false;
        }

        if (age < 19 || age > 120) {
            errorLabel.setText("Age must be between 19 and 120.");
            return false;
        }
        if (miles < 1 || miles > 500) {
            errorLabel.setText("Miles must be between 1 and 500.");
            return false;
        }
        if (rate < 1 || rate > 200) {
            errorLabel.setText("Hourly rate must be between 1 and 200.");
            return false;
        }

        //  StoryEngine logic
        int adjustedMiles = StoryEngine.calculateMiles(miles);
        int punchIn = 9;
        int punchOut = 17;
        int totalSalary = StoryEngine.computeSalary(punchIn, punchOut, rate);
        int numEmployees = 50;

        String proPossAdj = "their";
        String proSubj = "they";
        String proObj = "them";
        String address = "123 Company HQ nampa, idaho";
        boolean choose = true;

        employee = new Employee(
                fName,
                lName,
                proPossAdj,
                proSubj,
                proObj,
                address,
                choose,
                age,
                adjustedMiles,
                punchIn,
                punchOut,
                rate,
                totalSalary,
                numEmployees
        );

        //  story options for the  UI
        rootOptions = StoryEngine.buildStoryOptions();

        errorLabel.setText(" ");
        return true;
    }

    //  Story panel

    private void showStoryPanel() {
        JPanel panel = new JPanel(new BorderLayout(15, 15));
        panel.setBorder(BorderFactory.createEmptyBorder(14, 14, 14, 14));

        headerLabel = new JLabel("Company Adventure Story– " + employee.getFullName());
        headerLabel.setFont(headerLabel.getFont().deriveFont(Font.BOLD, 18f));

        storyArea = new JTextArea();
        storyArea.setEditable(false);
        storyArea.setLineWrap(true);
        storyArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(storyArea);

        choicesPanel = new JPanel();
        choicesPanel.setLayout(new BoxLayout(choicesPanel, BoxLayout.Y_AXIS));

        panel.add(headerLabel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(choicesPanel, BorderLayout.SOUTH);

        setContentPane(panel);
        revalidate();
        repaint();

        // StoryEngine introduction
        String[] company = {"Marketing", "Finance", "Human Resources",
                "Customer Service", "Training", "Recruiting"};

        appendText("Company Adventure Story\n\n");
        appendText(employee.getFullName() + " has been a loyal member of our company.\n");
        appendText(employee.getPossAdj() + " role is in the " + company[0] + ", "
                + company[3] + ", " + company[5] + " department.\n");
        appendText(employee.getSubj() + " drives " + employee.getMiles()
                + " miles each day and earns $" + employee.getTotalSalary() + " per day.\n\n");

        showRootChoices();
    }

    private void appendText(String text) {
        storyArea.append(text);
        storyArea.setCaretPosition(storyArea.getDocument().getLength());
    }

    private void showRootChoices() {
        appendText("What will you do today?\n\n");
        choicesPanel.removeAll();

        for (StoryNode node : rootOptions) {
            JButton btn = new JButton(node.getTitle());
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
            btn.addActionListener(e -> playNode(node));
            choicesPanel.add(btn);
        }

        choicesPanel.revalidate();
        choicesPanel.repaint();
    }

    private void playNode(StoryNode node) {
        appendText("\nYou chose: " + node.getTitle() + "\n\n");
        appendText(node.getSceneText(employee) + "\n");

        StoryNode[] next = node.getNextNodes();
        choicesPanel.removeAll();

        if (next.length == 0) {
            endSummary();
        } else {
            appendText("\nNext options:\n\n");
            for (StoryNode child : next) {
                JButton btn = new JButton(child.getTitle());
                btn.setAlignmentX(Component.CENTER_ALIGNMENT);
                btn.addActionListener(e -> playNode(child));
                choicesPanel.add(btn);
            }
        }

        choicesPanel.revalidate();
        choicesPanel.repaint();
    }

    private void endSummary() {
        appendText("\n*** End of this path ***\n\n");
        appendText("At the end of the day, " + employee.getFullName() + " reflects on the achievements.\n");
        appendText("Working with " + employee.getNumEmployees() + " employees, all of "
                + employee.getObj() + " make the company strong.\n");
        appendText("It is " + employee.getChoice()
                + " that teamwork and passion lead to success!\n");
        appendText("Our headquarters at " + employee.getAddress()
                + " continues to grow — thanks to people like you.\n");

        JButton restart = new JButton("Play Again");
        restart.setAlignmentX(Component.CENTER_ALIGNMENT);
        restart.addActionListener(e -> showSetupPanel());
        choicesPanel.add(restart);
    }

    // Main method to launch the GUI

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CompanyAdventureSwing().setVisible(true);
        });
    }
}
