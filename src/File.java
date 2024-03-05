import javax.swing.*;

public class File extends JFrame {
    private JTextField textField1;
    private JPanel panelMain;
    private JFileChooser fileChooser = new JFileChooser(".");

    public File() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panelMain);
        initComponents();
        pack();

    }

    private void initComponents() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem open = new JMenuItem("Open");
        setJMenuBar(menuBar);
        menuBar.add(menu);
        menu.add(open);
        open.addActionListener(e -> najdiSoubor());

    }
    private void najdiSoubor(){
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
           textField1.setText(fileChooser.getSelectedFile().getAbsolutePath());
        }
        else {
            textField1.setText("");
        }
    }
}
