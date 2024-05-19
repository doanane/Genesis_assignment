
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author anane365221
 */
public class CreationWeek extends JFrame {

    private JComboBox<String> daySelector;
    private JTextArea outputArea;
    private String[] events = {
        "Creation of light; separation of light from darkness. (Genesis 1:3-5)",
        "Creation of the sky; separation of waters. (Genesis 1:6-8)",
        "Gathering of waters; creation of dry land and vegetation. (Genesis 1:9-13)",
        "Creation of stars, sun, and moon. (Genesis 1:14-19)",
        "Creation of sea creatures and birds. (Genesis 1:20-23)",
        "Creation of land animals and humans. (Genesis 1:24-31)",
        "Rest day; God blessed the seventh day and made it holy. (Genesis 2:1-3)"
    };

    /**
     *
     */
    public CreationWeek() {
        setTitle("Creation Week Events");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        daySelector = new JComboBox<>(new String[]{"Day 1", "Day 2", "Day 3", "Day 4", "Day 5", "Day 6", "Day 7"});
        outputArea = new JTextArea(10, 30);
        outputArea.setEditable(false);

        daySelector.addActionListener((ActionEvent e) -> {
            int selectedIndex = daySelector.getSelectedIndex();
            outputArea.setText(events[selectedIndex]);
        });

        this.add(new JLabel("Select a day:"));
        this.add(daySelector);
        this.add(new JScrollPane(outputArea));
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CreationWeek().setVisible(true);
        });
    }
}

// Explanation
// In the Java code provided:
// JFrame is used to create a GUI window.
// JComboBox allows the user to select a day.
// JTextArea is used to display the event information based on the day selected.
// ActionListener updates the text area when a different day is selected from the combo box.
// By using these components, we construct an interactive GUI where users can visually select any day of the creation week to view the corresponding biblical creation event
