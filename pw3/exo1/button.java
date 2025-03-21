import java.awt.Dimension;
import javax.swing.JButton;
public class button extends JButton{
    public button(String s)
    {
        this.setText(s);
        this.setPreferredSize(new Dimension(50,25));
    }
}
