Windows Programming 
- java Support windows programming
- Java major API
    1- awt (abstract window toolkit)
       package   java.awt
    2- Swing 
       package   javax.swing

Containers
- Panels are objects of java.awt.Panel.
- Windows are objects of java.awt.Window.
- The two main types of containers are Window and
   Panel.
- Frame is a subclass of Window
...................................................................
Example 1 : Java Frame

import java.awt.*;
class MyFrame{
 MyFrame() {
  Frame f = new Frame("UCP");
  f.setSize(300,300);
  f.setBackground(Color.blue);
  f.setVisible(true);
 }
}
class Test{
public static void main(String a[]){
    MyFrame frame= new MyFrame();
  
}
}
....................................................................
Windows Objects
     1- Label 
     2- Button
     3- Menu
     4- RadioButton
     5- CheckBox
     6- ComboBox (Choice)
     7- List
     8- textField
     9- TextArea
.........................................................................



Example 2:  A Frame with Button

import java.awt.*;
class MyFrame{
 MyFrame() {
  Frame f = new Frame("UCP");
  Button b1 = new Button("Save");
  f.add(b1);
  f.setSize(300,300);
  f.setVisible(true);
 }
}
class Test{
public static void main(String a[]){
    MyFrame frame= new MyFrame();
  
}
}
.....................................................................
Example 3:  A Frame with  two Buttons

import java.awt.*;
class MyFrame{
 MyFrame() {
  Frame f = new Frame("UCP");
  Button b1 = new Button("Save");
  Button b2 = new Button("Edit");
  f.add(b1);
  f.add(b2);
  f.setSize(300,300);//f.pack() also used without  size
  f.setVisible(true);
 }
}
class Test{
public static void main(String a[]){
    MyFrame frame= new MyFrame();
  
}
}
Note: Edit Button will overlap Save button
      Only one button is visible
...........................................................................
Layout

- Component are placed on frame/panel according to layout

Container Layouts

1- BorderLayout
2- FlowLayout
3- GridLayout
4- GridBagLayout
5- CardLayout 

- By default layout of Frame is BorderLayout
- Change Layout to FlowLayout

...........................................................................
Example 4 : A Frame with  two Buttons using flow Layout
import java.awt.*;
class MyFrame{
 MyFrame() {
  Frame f = new Frame("UCP");
  f.setLayout(new FlowLayout());
  Button b1 = new Button("Save");
  Button b2 = new Button("Edit");
  TextField tf1=new TextField(30);
  f.add(b1);
  f.add(b2);
  f.add(tf1);
  f.setSize(300,300);
  f.setVisible(true);
 }
}
class Test{
public static void main(String a[]){
    MyFrame frame= new MyFrame();
  
}
}
.................................................................................
Example 5 : A frame with textfied and labels

import java.awt.*;
class MyFrame{
 MyFrame() {
  Frame f = new Frame("UCP");
  f.setLayout(new FlowLayout());
  Label l1 = new Label("UserName");
  Label l2 = new Label("Password");
  TextField tf1=new TextField(30);
  TextField tf2=new TextField(30);
  f.add(l1);f.add(tf1);
  f.add(l2); f.add(tf2);
  f.setSize(400,400);
  f.setVisible(true);
 }
}
class Test{
public static void main(String a[]){
    MyFrame frame= new MyFrame();
  
}
}
.......................................................................................
Example 6: A Frame with ChoiceBox (combox) with data
import java.awt.*;
class MyFrame{
 MyFrame() {
  Frame f = new Frame("UCP");
  f.setLayout(new FlowLayout());
  Label l = new Label("Select Course");  
  Choice c = new Choice();
  c.addItem("Data Structures");
  c.addItem("Analysis of Algorithms");
  c.addItem("Database Systems");
  c.addItem("Computer Architecture");
  f.add(l);f.add(c);
  f.setSize(400,400);
  f.setVisible(true);
 }
}
class Test{
public static void main(String a[]){
    MyFrame frame= new MyFrame();
  
}
}
.......................................................................................
Example 7: A Frame with CheckBox
 
import java.awt.*;
class MyFrame{
 MyFrame() {
  Frame f = new Frame("UCP");
  f.setLayout(new FlowLayout());
  Label l = new Label("Check Menu");    
  Checkbox cb1= new Checkbox("ZingerBurger", true);
  Checkbox cb2= new Checkbox("MightyZingerBurger", true);
  Checkbox cb3= new Checkbox("Pepsi", false);
  Checkbox cb4= new Checkbox("FrenchFries", false);
  Checkbox cb5= new Checkbox("coffee", false);
  f.add(l);f.add(cb1);f.add(cb2);f.add(cb3);
  f.add(cb4);f.add(cb5);
  f.setSize(400,400);
  f.setVisible(true);
 }
}
class Test{
public static void main(String a[]){
    MyFrame frame= new MyFrame();
  
}
}
...........................................................................
Example 8: A Frame with RadioButton (CheckBox Group)

import java.awt.*;
class MyFrame{
 MyFrame() {
  Frame f = new Frame("UCP");
  f.setLayout(new FlowLayout());
  Label l = new Label("Q1 : In java JDBC Stands for");    
  CheckboxGroup cbg=new CheckboxGroup();
  Checkbox cb1= new Checkbox("java data boring center",cbg, false);
  Checkbox cb2= new Checkbox("java Door Ball Cricket",cbg, false);
  Checkbox cb3= new Checkbox("java Database Connectivity",cbg, false);
  Checkbox cb4= new Checkbox("none of the above",cbg, false);
  f.add(l);
  f.add(cb1);
  f.add(cb2);
  f.add(cb3);
  f.add(cb4);
  f.setSize(200,400);
  f.setVisible(true);
 }
}
class Test{
public static void main(String a[]){
    MyFrame frame= new MyFrame();
  
}
}
..........................................................................
Example 9: A Frame with TextArea 


import java.awt.*;
class MyFrame{
 MyFrame() {
  Frame f = new Frame("My NotePad");
  TextArea ta= new TextArea();
  f.add(ta);
  f.setSize(600,600);
  f.setVisible(true);
 }
}
class Test{
public static void main(String a[]){
    MyFrame frame= new MyFrame();
  
}
}

.........................................................................

Example 10: A Frame with List (Mutiple Selection)

import java.awt.*;
class MyFrame{
 MyFrame() {
  Frame f = new Frame("UCP");
  f.setLayout(new FlowLayout());
  Label l = new Label("Select Courses");
  List list= new List(4,true);
  list.add("Data Structures");
  list.add("Analysis of Algorithms");
  list.add("Database Systems");
  list.add("Computer Architecture");
  f.add(l);f.add(list);
  f.setSize(600,600);
  f.setVisible(true);
 }
}
class Test{
public static void main(String a[]){
    MyFrame frame= new MyFrame();
  
}
}
............................................................................

BorderLayout 
- Default layout in java Frame


Example : Paste five Buttons according to border layout

import java.awt.*;
  class Test{
 public static void main(String a[]){
   Frame f= new Frame("Msg");
   Button bn= new Button("North");
   Button bs= new Button("South");
   Button be= new Button("EAST");
   Button bw= new Button("West");
   Button bc= new Button("Center");
   f.add(bn,BorderLayout.NORTH);
   f.add(bs,BorderLayout.SOUTH);
   f.add(be,BorderLayout.EAST);
   f.add(bw,BorderLayout.WEST);
   f.add(bc,BorderLayout.CENTER);
   f.setSize(400,400);
   f.setVisible(true);
}
}

.....................................................................................







