

import javax.swing.JOptionPane;

public class ReadJOptionPane {
    /**
     * @param args
     * This is the main method of the class
     */
    public static void main(String[] args) {
        String name;  //this is a comment
        String surname;

        name=JOptionPane.showInputDialog("please enter your name: ");
        surname=JOptionPane.showInputDialog("enter your Surname");
        JOptionPane.showMessageDialog(null, name+" "+surname);
        int first;
        int second;
        String Input;
        String input;
        Input=JOptionPane.showInputDialog("Please enter the first number");
        first=Integer.parseInt(Input);
        input=JOptionPane.showInputDialog("Enter second number: ");
        second=Integer.parseInt(input);
        double average;
        average=(first+second) / 2.0;
        JOptionPane.showMessageDialog(null, "Average: "+average);
    } 

    
}