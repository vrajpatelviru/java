import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
    <applet code="choiceApplet.class" height=600 width=600>
    </applet>
*/
public class choiceApplet extends Applet implements ItemListener{
    List country,state,city;
    public void init(){
        country=new List();
        state=new List();
        city=new List(5,true);
        
        country.add("India");
        country.add("UK");
        country.add("USA");
        
        state.add("guj");
        state.add("mp");
        state.add("mh");
        state.add("rj");
        state.add("hr");
        
        city.add("anand");
        city.add("surat");
        city.add("ahmedabad");
        city.add("umreth");
        city.add("ode");
        
        add(country);
        add(state);
        add(city);
        
        country.addItemListener(this);
        state.addItemListener(this);
        city.addItemListener(this);
    }
    public void paint(Graphics g){
        String c1,s1;
        c1=country.getSelectedItem();
        s1=state.getSelectedItem();
        
        String[] city1=city.getSelectedItems();
        String msg=" ";
        
        for(int i=0;i<city1.length;i++){
            msg=city1[i]+" "+msg;
        }
        g.drawString("country="+c1, 50, 120);
        g.drawString("state="+s1, 140, 120);
        g.drawString("city="+msg, 240, 120);
        
    }
    public void itemStateChanged(ItemEvent e){
        repaint();
    }
}
