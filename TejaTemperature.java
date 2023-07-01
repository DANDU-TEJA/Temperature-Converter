import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class TejaTemperature extends Applet
  {
    Button b1;
    TextField t1,t2,t3;
    Label l1,l2,l3,l4,l5;
    CheckboxGroup cg;
    Checkbox r1,r2;
     public void init()
    { 
       setBackground(Color.cyan);
       setLayout(null);
        l1 = new Label("Enter the Value : ");
        l2 = new Label("Fahrenheit to Celsius is : ");
        l3 = new Label("Celsius to Fahrenheit is : ");
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        cg=new CheckboxGroup();
        r1=new Checkbox("Fahrenheit to Celsius",cg,false);
        r2=new Checkbox("Celsius to Fahrenheit",cg,false);
        b1=new Button("Clear");
        l1.setBounds(170,50,100,25); 
        l2.setBounds(150,150,130,25);
        l3.setBounds(150,200,130,25);
        r1.setBounds(100,100,125,25);
        r2.setBounds(325,100,125,25);
         t1.setBounds(280,50,100,25);
         t2.setBounds(300,150,100,25);
          t3.setBounds(300,200,100,25);
        b1.setBounds(230,250,100,25); 
        add(l1);
        add(l2);
        add(l3);
        add(r1);
        add(r2);
        add(t1);
        add(t2);
        add(t3);
        add(b1);
        b1.addActionListener(new a());
        r1.addItemListener(new aa());
        r2.addItemListener(new aa());
    }

    class aa implements ItemListener
    { 
       double a1,a2,a3;
       public void itemStateChanged(ItemEvent ie)
        {  
         a1 = Double.parseDouble(t1.getText());
         if(ie.getSource()==r1)
            {    a2 = ( (a1-32) * 5) / 9;                  // check the value 222 = 105.556
                  t2.setText(String.valueOf(a2));
            }
         if(ie.getSource()==r2)
           {     a3 = ( ((a1 * 9) / 5) +  32);            // check the value 37 = 98.6
                  t3.setText(String.valueOf(a3));
            }
       }       
    }
     class a implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
       {
         if(e.getSource()==b1)
           {
            t1.setText("");
            t2.setText("");
            t3.setText("");
           }
           showStatus("Designed by Dandu Teja");
       }
    }
    public void paint(Graphics g)
    {
        showStatus("Designed by DANDU TEJA");
    }

}
/*</html>
<body>
<applet code="TejaTemperature.class" height="600" width="600">
</applet>
</body>
</html>*/
