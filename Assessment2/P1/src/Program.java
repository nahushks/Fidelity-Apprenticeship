import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insurance No: ");
        String insuranceNo = sc.nextLine();
        System.out.print("Insurance Name: ");
        String insuranceName = sc.nextLine();
        System.out.print("Amount covered ; ");
        double amountCovered = sc.nextDouble();
        System.out.println("Select");
        System.out.println("1. Life Insurance");
        System.out.println("2. Motor Insurance");
        int option = sc.nextInt();
        if (option == 1) {
            System.out.print("Policy term: ");
            int policyTerm = sc.nextInt();
            System.out.print("Benifit percent: ");
            float benifitPercent = sc.nextFloat();

            LifeInsurance
                    lifeInsurance=new LifeInsurance(insuranceNo, insuranceName, amountCovered, policyTerm, benifitPercent);
            double premium=addPolicy(lifeInsurance,option);
            System.out.println("Calculated Premium: "+premium);

        }
        else if (option == 2) {
            System.out.print("Depreciation percent: ");
            float depPercent = sc.nextFloat();
            MotorInsurance
                    motorInsurance= new MotorInsurance(insuranceNo, insuranceName, amountCovered, depPercent);
            double premium=addPolicy(motorInsurance,option);
            System.out.println("Calculated Premium: "+premium);


        }
        else{
            System.out.print("Invalid option ");

        }
    }
    public static double addPolicy(Insurance ins, int opt){
        if(opt == 1){
            return ((LifeInsurance) ins).calculatePremium();

        }
        else if(opt == 2){
            return ((MotorInsurance) ins).calculatePremium();
        }
        return 0;
    }
}
