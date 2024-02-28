
package easytables_;

import java.io.*;

public class EasyTables_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        Reservations Data=new Reservations();
        Menu yourOrder=new Menu();
        TableInfo Type=new TableInfo();
               
        System.out.println("***  Welcome To Easy Table *****");
        System.out.println("* We need some information from you to complete your reservation *");
        Data.DataReception();
        System.out.println( Data.toString());
        
        
        
    }
    
}
