package hospitalmanagementsystem;

import com.toedter.calendar.JCalendar;
import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Calendar extends JFrame {
    Calendar(){
        setSize(1000,800);
        JCalendar c=new JCalendar();
        JPanel p=new JPanel();
        p.setBackground(Color.red);
        p.add(c);
        p.setSize(150, 100);
        add(p);
        c.addPropertyChangeListener("calendar", new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (evt.getPropertyName().equals("calendar")) {
                             Date d= c.getDate();
                             LocalDate l=LocalDate.of(d.getYear(),d.getMonth()+1,1);
                             int y=d.getYear();
                            // System.out.println(l.getDayOfMonth()+"-"+l.getMonth()+"-"+);
                }
            }
        });
    }
    public static void main(String []args){
        new Calendar().setVisible(true);
    }
    
}
