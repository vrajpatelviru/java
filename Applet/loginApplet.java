import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
    <applet code="loginApplet.class" hight=300,width=300>
    </applet>
*/
public class loginApplet extends Applet implements ActionListener{
        Label l1,l2,l3;
        TextField t1,t2;
        Button b;
        
        public void init(){
            
            l1=new Label("user name::");
            l2=new Label("password::");
            
            t1=new TextField(15);
            t2=new TextField(15);
            t2.setEchoChar('*');
            b=new Button("login");
            b.addActionListener(this);
            add(l1);add(t1);
            add(l2);add(t2);
            add(new Label());
            add(b);
            
            t1.addActionListener(this);
            t2.addActionListener(this);
            b.addActionListener(this);
            
        }
        public void actionPerformed(ActionEvent e){
            repaint();
        }
        public void paint(Graphics g){
                g.drawString("username  "+t1.getText(), 50, 140);
                g.drawString("password  "+t2.getText(), 50, 160);
        }
}
