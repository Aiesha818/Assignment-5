import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MouseEvents extends Applet implements MouseListener
{
String msg="Initial Message";
public void init()
{
addMouseListener(this);
}
public void mouseClicked(MouseEvent me)
{
msg="Mouse Clicked";
repaint();
}
public void mouseEntered(MouseEvent me)
{
msg="Mouse Entered";
repaint();
}
public void mouseExcited(MouseEvent me)
{
msg="Mouse Excited";
repaint();
}
public void mousePressed(MouseEvent me)
{
msg="Mouse Pressed";
repaint();
}
public void mouseReleased(MouseEvent me)
{
msg="Mouse Realeased";
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,20,20);
}
}
