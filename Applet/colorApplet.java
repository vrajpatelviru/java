import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* 
    <applet code="colorApplet." hight=300,width=300>
</applet>
*/

public class colorApplet extends Applet implements ItemListener{
    String str;
    Choice ch;
    Label l1;
    
    public void init(){
        l1=new Label("Select the color::");
        ch=new Choice();
        ch.add("red");
        ch.add("pink");
        ch.add("blue");
        ch.addItemListener(this);
        add(l1);
        add(ch);
    }
    
    public void itemStateChanged(ItemEvent e){
        str=ch.getSelectedItem();
        repaint();
    }
    
    public void paint(Graphics g){
        if(str.equals("red")){
            setBackground(Color.red);
        }
        else if(str.equals("pink")){
            setBackground(Color.pink);
        }
        else if(str.equals("blue")){
            setBackground(Color.blue);
        }
    }
}
