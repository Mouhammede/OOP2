import java.awt.*;
import javax.swing.*;
public class gui
{

    JFrame w;
    JLabel u;
    JPanel d;
    button o,t,th,f,fi,s,se,e,n,z,p,m,ml,de,eq,c;
    public gui()
    {
        w=new JFrame("calculator");
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        w.setResizable(false);
        w.setSize(250,220);
        w.setLayout(new BoxLayout(w.getContentPane(),BoxLayout.Y_AXIS));
        u=new JLabel();
        u.setText("eeeeeeeee");
        d=new JPanel();
        d.setLayout(new FlowLayout());
        u.setPreferredSize(new Dimension(25,50));
        w.add(u);
        o=new button("1");
        t=new button("2");
        th=new button("3");
        f=new button("4");
        fi=new button("5");
        s=new button("6");
        se=new button("7");
        e=new button("8");
        n=new button("9");
        z=new button("0");
        p=new button("+");
        m=new button("-");
        ml=new button("*");
        de=new button("/");
        eq=new button("=");
        c=new button("C");
        d.add(o);
        d.add(t);
        d.add(th);
        d.add(f);
        d.add(fi);
        d.add(s);
        d.add(se);
        d.add(e);
        d.add(n);
        d.add(z);
        d.add(p);
        d.add(m);
        d.add(ml);
        d.add(de);
        d.add(eq);
        d.add(c);
        w.add(d);
        w.setVisible(true);
    }
}