package kata5;

import java.awt.PopupMenu;
import javax.swing.JComboBox;
import javax.swing.JPanel;

class CurrencyDialog extends JPanel {


    public CurrencyDialog() {
        super();//Llamar al contructor de nuestro padre
        add(createComboBox());
    }

    private JComboBox createComboBox() {
        return new JComboBox(new String [] {"EUR", "USD" , "GBP"});//Sacar de la BD en el MoneyCalculator
                
                }
    
}
