import java.util.Scanner;

public class ReadingInput{
        public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number: ");
        firstNumber=kb.nextInt();
        System.out.println("Enter SEocnd number: ");
        secondNumber=kb.nextInt();
        int secondNumber2 = secondNumber;
		double average = (firstNumber+secondNumber2) /2.0;
        System.out.println("The Average is: "+average);
        String name;
        String surname;
        kb.nextLine();
        System.out.println("Enter your name: ");
        name=kb.nextLine();
        System.out.println("Please enter your surname: ");
        surname=kb.nextLine();
        System.out.println(name+" "+surname);
        kb.close();
    } 
}