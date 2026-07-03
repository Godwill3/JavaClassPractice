import java.util.Scanner;
import java.text.NumberFormat;
public class MortageCalculator {    
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;
    public static void main(String args[]) { 
        int principal = (int) readNumber("Principal: ",1000,1000000);
        float annualInterest = (float)readNumber("Annual Interest Rate: ", 0, 30);
        byte years = (byte) readNumber("Period: ",1,30);
        
        printMortage(principal, annualInterest, years);
        
        printPaymentsSchedule(years, principal, annualInterest);
    }

    public static void printMortage(int principal, float annualInterest, byte years) {
        double mortage = calculateMortage(principal,annualInterest,years);
        //formating the mortage value to our currency 
        String mortageFormated = NumberFormat.getCurrencyInstance().format(mortage);
        System.out.println("MORTAGE");
        System.out.println("-------");
        System.out.print("Monthly Payments: " + mortageFormated);
    }

    public static void printPaymentsSchedule(byte years, int principal, float annualInterest) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <=years * MONTHS_IN_YEAR; month++){
            double balance = calculateBalance(principal, annualInterest, years,month);
            System.out.println(NumberFormat.getCompactNumberInstance().format(balance));
        }
    }
    public static double readNumber(String Prompt, double min, double max){
            Scanner scanner = new Scanner(System.in);  
            double value;
            while(true){
                System.out.print(Prompt);
                value = scanner.nextInt();
                if(value >= min && value <= max)
                    break;
                System.out.println("Enter a number between " + min + " and " + max);
            }
            return value;
        }
    public static double calculateBalance(
            int principal,
            float annualInterest,
            byte years,
            short numberOfPaymentsMade){
        
        short numOfPayments = (short)(years * MONTHS_IN_YEAR);
        double monthlyInterest = (annualInterest)/ (PERCENT * MONTHS_IN_YEAR);
        
        double balance = principal * (Math.pow(1+ monthlyInterest, numOfPayments)- Math.pow(1+ monthlyInterest, numberOfPaymentsMade))
                /(Math.pow(1+ monthlyInterest, numOfPayments) - 1);
        
        return balance;
    }
    public static double calculateMortage(
            int principal,
            float annualInterest,
            byte years){
        short numOfPayments = (short)(years * MONTHS_IN_YEAR);
        double monthlyInterest = (annualInterest)/ (PERCENT * MONTHS_IN_YEAR);
        
        double mortage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest , numOfPayments)) 
                / (Math.pow(1 + monthlyInterest, numOfPayments) - 1);
        
        return mortage;
        } 
    }

