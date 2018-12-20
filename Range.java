import javax.swing.JOptionPane;

public class Range {
    public static void main(String[] args) {
        int number;
        String input;
        input=JOptionPane.showInputDialog("Enter the number: ");
        number=Integer.parseInt(input);
        if (number>30&&number<60){
            JOptionPane.showMessageDialog(null, "The number is between 30 and 60");
        }
        else if(number<30 || number>60){
            JOptionPane.showMessageDialog(null, "The number is outside 30 to 60");
        }
    System.exit(0);
    }
    }