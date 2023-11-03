import javax.swing.*;
import java.awt.*;

public class Gui {

    private JFrame frame;
    private JPanel mainPanel;
    private JPanel infoPanel;
    private JButton[] buttons;

    public Gui() {
        frame = new JFrame();
        mainPanel = new JPanel();
        infoPanel = new JPanel();
        buttons = new JButton[12];
    }

    public void criar(int largura, int altura, String titulo) {
        frame.setSize(largura, altura);
        frame.setTitle(titulo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        mainPanel.setLayout(new GridLayout(2, 6));

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("" + i);
            mainPanel.add(buttons[i]);
        }

        infoPanel.add(new JLabel("teste"));

        frame.add(mainPanel, BorderLayout.CENTER);
        frame.add(new JButton("0"), BorderLayout.WEST);
        frame.add(new JButton("0"), BorderLayout.EAST);
        frame.add(infoPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
