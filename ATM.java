import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class ATM extends JFrame
{
 int balance=1000,i=0;
 String b[]=new String[1000];
 int pin,accnum;
 ATM(){
 Random r=new Random(1000);
 JFrame f2=new JFrame();
 JLabel x1=new JLabel("PIN GENERATION");
 x1.setBounds(100,10,200,20);
 f2.add(x1);
 JLabel x2=new JLabel("Enter Name:");
 x2.setBounds(10,50,100,20);
 f2.add(x2);
 JLabel x3=new JLabel("Account Number:");
 x3.setBounds(10,80,120,20);
 f2.add(x3);
 JLabel e5=new JLabel("Enter pin:");
 e5.setBounds(10,110,100,20);
 f2.add(e5);
 JTextField e6=new JTextField();
 e6.setBounds(130,110,120,20);
 f2.add(e6);
 JTextField y1=new JTextField();
 y1.setBounds(130,50,100,20);
 f2.add(y1);
 JTextField y2=new JTextField();
 y2.setBounds(130,80,100,20);
 f2.add(y2);
 JButton z1=new JButton("Generate pin");
 z1.setBounds(50,150,200,20);
 f2.add(z1);
 JLabel x4=new JLabel();
 z1.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
     String e8=y2.getText();
     accnum=Integer.parseInt(e8);
     String e7=e6.getText();
     pin=Integer.parseInt(e7);
    JOptionPane.showMessageDialog(f2,"your pin is "+pin);
    f2.setVisible(false);
    JFrame f3=new JFrame();
    JLabel y5=new JLabel("LOGIN TO ACCOUNT");
    y5.setBounds(100,10,200,20);
    f3.add(y5);
   JLabel x7=new JLabel("Account Number:");
   x7.setBounds(10,50,120,20);
   f3.add(x7);
   JLabel x8=new JLabel("Login Pin:");
   x8.setBounds(10,80,120,20);
   f3.add(x8);
  JTextField y6=new JTextField();
   y6.setBounds(130,50,100,20);
   f3.add(y6);
   JTextField y7=new JTextField();
   y7.setBounds(130,80,100,20);
   f3.add(y7);
   JButton z2=new JButton("Login");
   z2.setBounds(50,150,200,20);
   f3.add(z2);
   JLabel x9=new JLabel();
  z2.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e){
   String g2=y6.getText();
   int g3=Integer.parseInt(g2);
   String g=y7.getText();
   int g1=Integer.parseInt(g);
   if(g1!=pin||g3!=accnum)
      JOptionPane.showMessageDialog(f3,"Invalid Credentials!");
  else{
   f3.setVisible(false);
 JFrame f=new JFrame();
 JLabel l1=new JLabel();
 JLabel l2=new JLabel("WELCOME TO ATM");
 l2.setForeground(Color.RED);
 l2.setBounds(200,10,500,40);
 f.add(l2);
 JLabel l9=new JLabel("You have already balance 1000");
 l9.setBounds(10,60,200,20);
 f.add(l9);
 JButton b1=new JButton("WithDrawl");
 JButton b2=new JButton("Deposit");
 JButton b3=new JButton("Balance Check");
 JButton b4=new JButton("History");
 JButton q=new JButton("Transfer");
 JButton q1=new JButton("Exit");
 b1.setBounds(10,100,200,20);
 b2.setBounds(250,100,200,20);
 b3.setBounds(10,150,200,20);
 b4.setBounds(250,150,200,20);
 q.setBounds(10,210,200,20);
 q1.setBounds(250,210,200,20);
 f.add(q1);
 f.add(b1);
 f.add(b2);
 f.add(b3);
 f.add(b4);
 f.add(q);
 f.add(l1);
 b1.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
    f.setVisible(false);
    JFrame f1=new JFrame();
    JLabel l4=new JLabel();
    JLabel l3=new JLabel("Enter Amount to Withdrawl:");
    l3.setBounds(10,100,200,20);
    f1.add(l3);
    JTextField tf1=new JTextField();
    tf1.setBounds(220,100,50,20);
    f1.add(tf1);
    JButton b5=new JButton("Continue");
    b5.setBounds(150,150,100,20);
    f1.add(b5);
    b5.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    String a=tf1.getText();
    int num=Integer.parseInt(a);
    if(num<=balance){
    balance=balance-num;
    b[i]="You have debited "+num+" rupees";
    i=i+1;
    JOptionPane.showMessageDialog(f1,"Collect your "+num+" cash");
     f1.setVisible(false);
     f.setVisible(true);}
    else{
    JOptionPane.showMessageDialog(f1,"Dont have Sufficient Balance");
       }}});
    f1.add(l4);
    f1.getContentPane().setBackground(Color.GREEN);
    f1.setSize(600,600);
    f1.setVisible(true);
 }
 });
 b2.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
    f.setVisible(false);
    JFrame f1=new JFrame();
    JLabel l4=new JLabel();
    JLabel l3=new JLabel("Enter Amount to Deposit:");
    l3.setBounds(10,100,200,20);
    f1.add(l3);
    JTextField tf1=new JTextField();
    tf1.setBounds(220,100,50,20);
    f1.add(tf1);
    JButton b5=new JButton("Continue");
    b5.setBounds(150,150,100,20);
    f1.add(b5);
    b5.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
    String a=tf1.getText();
    int num=Integer.parseInt(a);
    balance=balance+num;
    b[i]="You have credited "+num+" rupees";
    i=i+1;
    JOptionPane.showMessageDialog(f1,"your Cash "+num+" credited to your account");
    f1.setVisible(false);
    f.setVisible(true);}});
    f1.add(l4);
    f1.getContentPane().setBackground(Color.GREEN);
    f1.setSize(600,600);
    f1.setVisible(true);
 }
 });
 b3.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
  JOptionPane.showMessageDialog(f,"Your bank balance is:"+balance);}});
 b4.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
  f.setVisible(false);
  JFrame f1=new JFrame();
  JLabel l4=new JLabel();
  JTextArea l3=new JTextArea();
  l3.setBounds(20,75,250,250);
  f1.add(l3);
  StringBuilder sb=new StringBuilder();
  for(int j=0;j<i;j++)
   sb.append(b[j]+"\n");
  l3.setText(sb.toString());
   JButton b5=new JButton("Back");
  b5.setBounds(10,10,100,20);
  f1.add(b5);
  b5.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e){
    f1.setVisible(false);
    f.setVisible(true);}});
  f1.add(l4);
  f1.getContentPane().setBackground(Color.GREEN);
  f1.setSize(600,600);
  f1.setVisible(true);}});
  q.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
    JFrame f1=new JFrame();
    JLabel l4=new JLabel();
    JLabel s1=new JLabel("Receiver Accont number:");
   s1.setBounds(10,50,150,20);
   f1.add(s1);
  JLabel s2=new JLabel("Amount:");
   s2.setBounds(10,80,120,20);
   f1.add(s2); 
   JTextField s3=new JTextField();
   s3.setBounds(180,50,100,20);
   f1.add(s3);
   JTextField s4=new JTextField();
   s4.setBounds(180,80,100,20);
   f1.add(s4);
   JButton s5=new JButton("Transfer");
   s5.setBounds(50,150,200,20);
   f1.add(s5);
     s5.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent e){
         String e3=s3.getText();
         int e4=Integer.parseInt(e3);
        String e1=s4.getText();
         int e2=Integer.parseInt(e1);
        if(e2<=balance){
         balance=balance-e2;
          b[i]="You have transfered "+e2+" rupees to "+e4;
    i=i+1;
    JOptionPane.showMessageDialog(f1,"your Cash "+e2+" transfered to "+e4);
    f1.setVisible(false);
    f.setVisible(true);}
      else{
    JOptionPane.showMessageDialog(f1,"Dont have Sufficient Balance");
       } }});
     f1.add(l4);
  f1.getContentPane().setBackground(Color.GREEN);
  f1.setSize(600,600);
  f1.setVisible(true);}});
   q1.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
  f.setVisible(false);
  }});
 f.getContentPane().setBackground(Color.GREEN);
 f.setSize(600,600);
 f.setVisible(true);
 }}});
 f3.add(x9);
 f3.getContentPane().setBackground(Color.GREEN);
 f3.setSize(600,600);
 f3.setVisible(true);}});
 f2.add(x4);
 f2.getContentPane().setBackground(Color.GREEN);
 f2.setSize(600,600);
 f2.setVisible(true);}
 public static void main(String args[])
 {
  ATM a=new ATM();
 }
}
