
package easytables_;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Reservations extends TableInfo{
    Menu menu=new Menu();
    TableInfo place=new TableInfo();
    
    private String CustomerName;
    private String PhoneNumber;
    private String CustomerEmail;
    public int SerialNumber;

    Scanner Key=new Scanner (System.in);
    Random rand =new Random();
    
    public Reservations(){
      this.CustomerName=CustomerName;
      this.PhoneNumber=PhoneNumber;
      this.CustomerEmail=CustomerEmail;
      this.menu=menu;
      this.place=place;
    }
    
    public void setReservation(String Name,String Mobile,String Email, int person,Menu men,TableInfo plac  ){
       CustomerName=Name;
       PhoneNumber=Mobile;
       CustomerEmail=Email;  
    }
    
    public int setClientNum()throws IOException{
       SerialNumber=rand.nextInt(10000)+1;
       return SerialNumber;
       
    }
    
    public  void DataReception()throws IOException{
        
                Scanner Key=new Scanner(System.in);
                SerialNumber=setClientNum();
                PrintWriter outputFile =new PrintWriter(SerialNumber+".txt");
                Key.nextLine();
                System.out.println("\n First Enter your Name :  ");
                CustomerName=Key.nextLine();
                outputFile.printf("\n|| Customer Name is : %s ",CustomerName);
                System.out.println("***********************************************************");
                System.out.println("\n Then Enter your Phone number : ");
                PhoneNumber=Key.nextLine() ; 
                outputFile.printf("\n|| Phone number is : %s ",PhoneNumber);
                System.out.println("***********************************************************");
                System.out.println("\n Then Enter your email :  ");
                CustomerEmail=Key.nextLine();
                outputFile.printf("\n|| Email is : %s ",CustomerEmail);
                System.out.println("***********************************************************");
                outputFile.println("\n||*********************************************************");
                System.out.println("\n Then Enter Number of people who will come with you  :  ");
                numOfpeople=Key.nextInt();
                outputFile.printf("\n|| Number of people is : %d ",numOfpeople);
                outputFile.printf("\n|| Your serial number is : %d ",SerialNumber);
                outputFile.printf("\n|| Table data is : %s ",gettableData());
                outputFile.printf("\n|| The reservation date : %s ",timeDate());
                outputFile.println("\n||***********************************************************");
                double totalBill = menu.takeOrder();
                outputFile.printf(" Your total bill is: %f$" ,totalBill);
                outputFile.close();
                displayData(SerialNumber);
         
}
    
    public String gettableData(){
        return  place.getNumTable(numOfpeople);
    }
    
    public String timeDate(){
        Date date =new Date();
        SimpleDateFormat dateForm=new SimpleDateFormat("MM/dd  HH:mm a");
        String MyDate =dateForm.format(date);
        return MyDate;
    }
    
     public  void displayData(int SerialNum)throws IOException{
        File file=new File(SerialNum+".txt");
        Scanner read =new Scanner(file);
        
        System.out.println("\n\n***** Done Your Reservation is : *****\n");
        while(read.hasNext()){
         String ClientDate=read.nextLine();
        
         System.out.println(ClientDate);
         
        }
        read.close();
    }
     
   
     
     public String toSring(){
        return "\nDescription of our services : \n"+"reservation class for receiving data,booking time and date , and displaying data \n"+menu+place;
    }
      
    
}
