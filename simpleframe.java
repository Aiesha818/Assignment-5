import java.awt.*;
class simpleframe extends Frame
{
simpleframe()
{
Button b=new Button("Simple Frame");
b.setBounds(30,100,80,30);
add(b);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public static void main(String args[])
{
First f=new First();
}
}