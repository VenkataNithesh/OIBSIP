import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Numbergame2 extends JFrame
{
 int Num;
 int i=0,b=3;
 Numbergame2(){
 Scanner s=new Scanner(System.in);
 JFrame f1=new JFrame();
 JLabel g=new JLabel();
 JLabel y=new JLabel("INSTRUCTIONS");
 JLabel x=new JLabel("1.FIRST THE PLAYER SHOULD GENERATE THE NUMBER");
 JLabel z=new JLabel("2.EACH PLAYER HAS ONLY 3 CHANCES");
 JLabel w=new JLabel("3.SCORING PATTERN");
 JLabel x1=new JLabel("a.guessed at 1st chance-->300");
 JLabel x2=new JLabel("b.Guessed at 2nd chance-->200");
 JLabel x3=new JLabel("c.Guessed at 3rd chance-->100");
 x1.setBounds(10,120,300,20);
 x2.setBounds(10,145,300,20);
 x3.setBounds(10,170,300,20);
 y.setBounds(10,10,100,20);
 x.setBounds(10,40,350,20);
 z.setBounds(10,70,300,20);
 w.setBounds(10,95,300,20);
 f1.add(x1);
 f1.add(x2);
 f1.add(x3);
 f1.add(x);
 f1.add(y);
 f1.add(z);
 f1.add(w);
 JButton j=new JButton("Start Game");
 j.setBounds(50,200,100,30);
 f1.add(j);
 j.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
  f1.setVisible(false);
 Random r=new Random();
 JFrame f=new JFrame();
 JLabel l1=new JLabel("RANDOM NUMBER GAME");
 l1.setBackground(Color.RED);
  JLabel l3=new JLabel();
l1.setBounds(200,10,500,40);
 f.add(l1);
 JButton b1=new JButton("CHECK ANSWER");
 JButton b2=new JButton("GENERATE NUMBER");
 b1.setBackground(Color.PINK);
 b2.setBackground(Color.PINK);
 b1.setBounds(300,500,200,20);
 b2.setBounds(50,500,200,20);
 f.add(b1);
 f.add(b2);
 JButton b3=new JButton("Enter Number:");
 b3.setBounds(10,100,200,20);
 JTextField tf1=new JTextField();
  tf1.setBounds(250,100,200,20);
  f.add(b3);
  f.add(tf1);
 JLabel l4=new JLabel("You Have Only 3 Chances");
 l4.setBounds(10,60,200,20);
 f.add(l4);
 JLabel l2=new JLabel("First Generate number then play the game");
 l2.setBounds(10,200,300,20);
 f.add(l2);
 b2.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
  Num=r.nextInt(100);
 b2.setVisible(false);
 }});
 b1.addActionListener(new ActionListener(){
 public void actionPerformed(ActionEvent e){
  if(i!=3)
  {
  String a=tf1.getText();
  int num=Integer.parseInt(a);
  if(Num>num)
  {
     l2.setText("Your number< random number");
     b=b-1;
     l4.setText("You Have Only "+b+" Chances");
     i=i+1;
  }
  else if(Num<num)
  {
     l2.setText("Your number > random number");
     b=b-1;
     l4.setText("You Have Only "+b+" Chances");
     i=i+1;
  }
  else
  {
    if((i+1)==1){
    b=b-1;
    l4.setText("You Have Only "+b+" Chances");
    l2.setText("you won the game,your score is 300");
    b1.setVisible(false);}
    if((i+1)==2){
    b=b-1;
    l4.setText("You Have Only "+b+" Chances");
    l2.setText("you won the game,your score is 200");
    b1.setVisible(false);}
    if((i+1)==3){
    b=b-1;
    l4.setText("You Have Only "+b+" Chances");
    l2.setText("you won the game,your score is 100");
    b1.setVisible(false);}
    JLabel x9=new JLabel();
    JButton b9=new JButton("Play again");
      b9.setBounds(10,300,100,20);
      f.add(b9);
      JButton b10=new JButton("Exit");
      b10.setBounds(200,300,100,20);
      f.add(b10);
      f.add(x9);
      b9.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        new Numbergame2();
        f.setVisible(false);}});
      b10.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        f.setVisible(false);}});
  }
  if(i==3)
  {
      b1.setVisible(false);
       i=0;
      JLabel x5=new JLabel();
      JLabel x9=new JLabel();
      JLabel x10=new JLabel("BETTER LUCK NEXT TIME");
      x10.setBounds(10,270,300,20);
      x5.setText("You Losed the Game,The Generated Number is:"+Num);
      x5.setBounds(10,230,300,20);
      f.add(x5);
      f.add(x10);
      JButton b9=new JButton("Play again");
      b9.setBounds(10,300,100,20);
      f.add(b9);
      JButton b10=new JButton("Exit");
      b10.setBounds(200,300,100,20);
      f.add(b10);
      f.add(x9);
      b9.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        new Numbergame2();
        f.setVisible(false);}});
      b10.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        f.setVisible(false);}});
 }}
 }});
 l3.setBounds(0,0,0,0);
 f.add(l3);
 f.getContentPane().setBackground(Color.GREEN);
 f.setSize(600,600);
 f.setVisible(true);
 }});
 g.setBounds(0,0,0,0);
 f1.add(g);
 f1.getContentPane().setBackground(Color.GREEN);
 f1.setSize(600,600);
 f1.setVisible(true);}
 public static void main(String args[])
 {
   new Numbergame2();
 }
}