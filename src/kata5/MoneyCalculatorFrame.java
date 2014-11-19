package kata5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MoneyCalculatorFrame extends JFrame {

    public MoneyCalculatorFrame() {
        setTitle("MoneyClaculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300, 300)); //Restringir tam ventana
        createComponents();
        setVisible(true);

    }

    private void createComponents() {
        add(createExchangeDialog());
        add(createToolbar(), BorderLayout.SOUTH);
    }

    private JPanel createToolbar() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panel.add(createCalculateButton());
        panel.add(createCloseButton());
        return panel;
    }

    private JPanel createExchangeDialog() {
        JPanel panel = new JPanel();

        panel.add(new MoneyDialog());
        panel.add(new CurrencyDialog());
        return panel;
    }

    private JButton createCalculateButton() {
        JButton button = new JButton("Calculate");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Calculating");//Aqui debemos conectar con las otras clases
            }
        });
        return button;
    }

    private JButton createCloseButton() {
        JButton button = new JButton("Close");
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MoneyCalculatorFrame.this.dispose(); //Cuando queremos usar dispose y ya tenemos uno que se llama igual
            }
        });
        return button;
    }
}
