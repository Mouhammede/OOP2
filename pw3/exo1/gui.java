import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
public class gui implements ActionListener
{

    JFrame w;
    JLabel u;
    JPanel d,l;
    ArrayList<JButton> b;
    public gui()
    {
        w=new JFrame("calculator");
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setResizable(false);
        w.setSize(250,200);
        w.setLayout(new BoxLayout(w.getContentPane(),BoxLayout.Y_AXIS));
        u=new JLabel("");
        u.setSize(240,50);
        u.setPreferredSize(new Dimension(240,50));
        d=new JPanel();
        l=new JPanel();
        l.setLayout(null);
        l.setSize(240,60);
        l.setPreferredSize(new Dimension(240,60));
        d.setPreferredSize(new Dimension(240,200));
        l.setBounds(0,0,240,50);
        l.setBorder(BorderFactory.createLineBorder(new Color(115, 167, 245)));
        d.setLayout(new FlowLayout());
        l.add(u);
        w.add(l);
        b=new ArrayList<>();
        addbuttons();
        w.setVisible(true);
    }
    public void addbuttons()
    {
        for(int i=1;i<=9;i++)
        {
            b.add(new JButton(i+""));
            b.get(i-1).setPreferredSize(new Dimension(50,25));
            d.add(b.get(i-1));
        }
        b.add(new JButton("0"));
        b.get(9).setPreferredSize(new Dimension(50,25));
        d.add(b.get(9));
        //*************************************
        b.add(new JButton("+"));
        b.get(10).setPreferredSize(new Dimension(50,25));
        d.add(b.get(10));
        //**************************************
        b.add(new JButton("-"));
        b.get(11).setPreferredSize(new Dimension(50,25));
        d.add(b.get(11));
        //***************************************
        b.add(new JButton("*"));
        b.get(12).setPreferredSize(new Dimension(50,25));
        d.add(b.get(12));
        //*************************************** 
        b.add(new JButton("/"));
        b.get(13).setPreferredSize(new Dimension(50,25));
        d.add(b.get(13));
        //*************************************** 
        b.add(new JButton("="));
        b.get(14).setPreferredSize(new Dimension(50,25));
        d.add(b.get(14));
        //*************************************** 
        b.add(new JButton("C"));
        b.get(15).setPreferredSize(new Dimension(50,25));
        d.add(b.get(15));
        //*************************************** 
        for(int i=0;i<16;i++)
        {
            b.get(i).addActionListener(this);
        }
        w.add(d);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<b.size();i++)
        {
            if(e.getSource()==b.get(15))
            {
                u.setText("");
            }
            else if(e.getSource()==b.get(i))
            {
                u.setText(u.getText()+b.get(i).getText());
            }
        }
    }
    
}