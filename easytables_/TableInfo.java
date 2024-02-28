/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easytables_;

import java.util.Random;
import java.util.Scanner;

public class TableInfo {
    Scanner Key=new Scanner (System.in);
    Random rand =new Random();
   
   
    protected String Tdata;
    protected int numOfpeople;
    protected int TableNumber;
    protected int  privaTable;
    protected int outdoorTable;
    protected int indoorTable;
    int choice;
    
    public TableInfo(){
        privaTable=8;
        outdoorTable=12;
        indoorTable=20;
    }
    
   public void SetTables(int Priv,int Out,int in){
       privaTable=Priv;
       outdoorTable=Out;
       indoorTable=in;  
   }
   
   public int getPrivaTable(){
        return privaTable;
    }
   
     public int getOutdoorTable(){
        return  outdoorTable;
    }
     
     public int getIndoorTable(){
         return indoorTable;
     }
  
     
     
    public int setNumOfpeople(){
        System.out.println("\n Then Enter number of peoble  :  ");
                numOfpeople=Key.nextInt();
        return numOfpeople;
    }
    
    public String getNumTable(int numOfpeople){
               Scanner Key=new Scanner(System.in);
               
         System.out.println("\n Dear customer choose your favorite table from this list :\n"
         + " 1-private Table only 1-15 people and 8 tables \n"
         + " 2-outdoor Table only 1-6 people and 12 tables \n" 
         + " 3-indoor Table only 1-10 people and 20 tables \n");
              System.out.println(" Enter your choice");
              choice=Key.nextInt();
       switch(choice){
       case 1 :
             if(numOfpeople>=1&&numOfpeople<=15){
                   TableNumber=rand.nextInt(8)+1;
                   Tdata= getbook(TableNumber,choice);
                  }// End if
           else {
                 while(numOfpeople<1||numOfpeople>15){
                 System.out.println("Error !! number of people is not allowed ");
                 System.out.println("Please Enter Number of person again : ");
                 numOfpeople=Key.nextInt();
                  }
                  TableNumber=rand.nextInt(8)+1;
                 Tdata= getbook(TableNumber,choice);
                  }// End Else
                  
                   break;
     
    case 2 : 
             if(numOfpeople>=1&&numOfpeople<=6){
                   TableNumber=rand.nextInt(12)+1;
                   Tdata= getbook(TableNumber,choice);
                  }// End if
        else {
               while(numOfpeople<1||numOfpeople>6){
               System.out.println("Error !! number of people is not allowed ");
               System.out.println("Please Enter Number of person again : ");
               numOfpeople=Key.nextInt();
               }
                TableNumber=rand.nextInt(12)+1;
                Tdata= getbook(TableNumber,choice);
                }// End Else
             
               break;
               
              
     case 3 :
        if(numOfpeople>=1&&numOfpeople<=10){
             TableNumber=rand.nextInt(20)+1;
              Tdata= getbook(TableNumber,choice);
           }// End if
        else {
               while(numOfpeople<1||numOfpeople>10){
               System.out.println("Error !! number of people is not allowed ");
               System.out.println("Please Enter Number of person again : ");
               numOfpeople=Key.nextInt();
               }//End while
               TableNumber=rand.nextInt(20)+1;
               Tdata= getbook(TableNumber,choice);
               
               }// End Else
               break;
 
 } // End switch
       return Tdata;
  }// End methods
    public String getbook(int Num,int choose){
        
        if(choose==1){
            privaTable--;
            System.out.println("\n---------Done---------\n");
            return  " Your Table type is Private and number : "+ TableNumber;
        }
        else if(choose==2){
            outdoorTable--;
            System.out.println("\n---------Done---------\n");
            return  " Your Table type is outdoor and number : "+ TableNumber;
        }
        else{
            indoorTable--;
            System.out.println("\n---------Done---------\n");
            return " Your Table type is indoor and number : "+ TableNumber;
    }
    }
    
    @Override 
    public String toString() { 
       
        return "\n*************************************************\n"+"\nDescription of our services : \n"+"reservation class for receiving data,booking time and date , and displaying data \n"+"class menu will display the Menu to the user and let user choose his food \n"+"Place class gives the user the table number \n "; 
    } 
    
    
}
