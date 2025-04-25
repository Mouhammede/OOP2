import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class gui implements ActionListener
{
    JFrame w;
    JLabel l;
    JPanel p,u;
    private boolean i=false;
    JButton str,sto,res;
    public gui()
    {
        u=new JPanel();
        u.setSize(300,70);
        u.setLayout(null);
        w=new JFrame("stopwatch");
        w.setResizable(false);
        ImageIcon im=new ImageIcon("ttt.png");
        w.setIconImage(im.getImage());
        w.setSize(300,170);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        str=new JButton("Start");
        str.setBackground(Color.BLUE);
        str.setForeground(Color.WHITE);
        str.addActionListener(this);
        sto=new JButton("Stop");
        sto.setBackground(Color.BLUE);
        sto.setForeground(Color.WHITE);
        sto.addActionListener(this);
        res=new JButton("Reset");
        res.setBackground(Color.BLUE);
        res.setForeground(Color.WHITE);
        res.addActionListener(this);
        l=new JLabel("00 : 00 : 00");
        u.setSize(300,70);
        l.setVerticalAlignment(JLabel.CENTER);
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBackground(Color.WHITE);
        l.setBounds(0,0,300,70);
        u.add(l);
        //l.setVerticalAlignment(JLabel.LEFT);
        l.setFont(new Font("Eras Bold ITC",0,35));
        w.setLayout(new BoxLayout(w.getContentPane(),BoxLayout.Y_AXIS));
        w.add(u);
        p=new JPanel();
        p.setSize(300,50);
        p.setPreferredSize(new Dimension(300,0));
        p.add(str);
        p.add(sto);
        p.add(res);
        p.setBackground(new Color(192, 193, 194));
        w.add(p);
        if(i)
        {
            timeer();
        }
        w.setVisible(true);
    }
    private int s=0,m=0,h=0;
    
    private String ss,sm,sh,r;
    public void timeer()
    {
        if(s<10)
        {
            ss="0"+s;
        }
        else
        {
            ss=""+s;
        }
        if(m<10)
        {
            sm="0"+m;
        }
        else
        {
            sm=""+m;
        }
        if(h<10)
        {
            sh="0"+h;
        }
        else
        {
            sh=""+h;
        }
        r=sh+" : "+sm+" : "+ss;
        l.setText(r);
        System.out.println(r);
        s++;
        if(s==60)
        {
            s=0;
            m++;
        }
        if(m==60)
        {
            m=0;
            h++;
        }
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==str)
        {
            i=true;
            
        }
        if(e.getSource()==sto)
        {
            i=false;
        }
        if(e.getSource()==res)
        {
            i=false;
            s=0;
            m=0;
            h=0;
        }
    }
}
