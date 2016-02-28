import java.io.Console;
public class sm {
 
    public static void main(String[] args) 
    {

        int month ;
        int year ;
      System.out.println("Enter month Number : ");
      Console console = System.console();
      month = Integer.parseInt(console.readLine());
      System.out.println("Enter Year : ");
      year = Integer.parseInt(console.readLine());

        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                System.out.println("\n 31 Days. \n");
                break;
            case 4: case 6:
            case 9: case 11:
                 System.out.println("\n 30 Days. \n");
                break;
            case 2:
                if (((year % 4 == 0) && 
                     !(year % 100 == 0))
                     || (year % 400 == 0))
                    System.out.println("\n 29 Days. \n");
                else
                    System.out.println("\n 28 Days. \n");
                break;
            default:
                System.out.println("Invalid month.");
                break;
                        }
        
    }
}