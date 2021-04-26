import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
public class ChangeButtonBackground extends Applet
{
public void init()
{
Button button1=new Button("Button 1");
Button button2=new Button("Button2");
button1.setBackground(Color.red);
button2.setBackground(Color.green);
add(button1);
add(button2);
}
}