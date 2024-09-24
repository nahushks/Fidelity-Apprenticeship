import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int mark;
        String grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Emter the mark");
        mark = sc.nextInt();
        if(mark>90){
            System.out.println("Grade: A");
            grade= "A";
        }
        else if(mark>80 && mark<=90){
            System.out.println("Grade: A");
            grade= "B";
        }
        else {
            System.out.println("F");
            grade = "F";
        }
        switch(grade){
            case "A":
                System.out.println("Very good");
                break;
            case "B":
                System.out.println("Average");
                break;
            case "F":
                System.out.println("Bad");
                break;
            default:
                System.out.println("You not get any valid grade");
                break;
        }
    }
}