import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class operationApplet extends Applet implements ActionListener,ItemListener{
    String s1,s2,s3,s4;
    int n1,n2,n3;
    Choice ch;
    Label l1,l2,l3,l4;
    TextField t1,t2,t3;
    Button b;
    public void init(){
        l1=new Label("Num 1");
        l2=new Label("Num 2");
        t1=new TextField(20);
        t2=new TextField(20);
        l4=new Label("data");
        t3=new TextField(20);
        l3=new Label("Choice");
        
        ch=new Choice();
        ch.add(" ");
        ch.add("+");
        ch.add("-");
        ch.add("*");
        ch.add("/");
        b=new Button("result");
        b.addActionListener(this);
        ch.addItemListener(this);
        add(l1);
        add(t1);
        
        
        add(l2);
        add(t2);
        add(l3);
        
        add(ch);
        add(b);
        add(l4);
        add(t3);
        
    }
    public  void itemStateChanged(ItemEvent e){
       s3=ch.getSelectedItem();
       repaint();
    }
    public void actionPerformed(ActionEvent e){
        s1=t1.getText();
        s2=t2.getText();
        
        n1=Integer.parseInt(s1);
        n2=Integer.parseInt(s2);
        repaint();
        
    }
    public void paint(Graphics g){
        if(s3.equals("+")){
            n3=n1+n2;
        }
        else if(s3.equals("-")){
            n3=n1-n2;
        }
        else if(s3.equals("*")){
            n3=n1*n2;
        }
        else if(s3.equals("/")){
            n3=n1/n2;
        }
        s4=Integer.toString(n3);
        t3.setText(s4);
    }
}
