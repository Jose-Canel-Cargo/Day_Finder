import java.util.Scanner;
public class App {
      public static void main(String[] arg){

        Scanner input = new Scanner(System.in);

        int Days_In_Month = 0;
        String Month_Name = "";

        System.out.println("Welcome to Day Finder\nInput the number of a month and its year to see how many days the month has.");
        
        System.out.println("\nInput the number of the month: ");
        int month = input.nextInt();

        System.out.println("Input the year: ");
        int year = input.nextInt();

        switch (month){
            case 1:
            Month_Name = "January ";
            Days_In_Month = 31;
            break;

            case 2:
            Month_Name = "February ";

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                Days_In_Month = 29;
            } else {
                Days_In_Month = 28;
            }
            break;

            case 3:
            Month_Name = "March ";
            Days_In_Month = 31;
            break;

            case 4:
            Month_Name = "April ";
            Days_In_Month = 30 ;
            break;

            case 5:
            Month_Name = "May ";
            Days_In_Month = 31;
            break;

            case 6:
            Month_Name = "June  ";
            Days_In_Month = 30;
            break;

            case 7:
            Month_Name = "July ";
            Days_In_Month = 31;
            break;

            case 8:
            Month_Name = "August ";
            Days_In_Month = 31;
            break;

            case 9:
            Month_Name = "September ";
            Days_In_Month = 30;
            break;

            case 10:
            Month_Name = "October ";
            Days_In_Month = 31;
            break;

            case 11:
            Month_Name = "November ";
            Days_In_Month = 30;
            break;

            case 12:
            Month_Name = "December ";
            Days_In_Month = 31;
            break;
        }
        System.out.println(Month_Name + year + " has " + Days_In_Month + " days!");
        input.close();
        }
}
