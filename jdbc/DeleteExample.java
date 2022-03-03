package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteExample {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter ID : ");
        int id=s.nextInt();


        try {
//step1 load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");  //com.mysql.jdbc.driver //  oracle.jdbc.driver.OracleDriver

//step2 create  the connection object

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Mphasis", "root", "Comnet@123");
            PreparedStatement ps=con.prepareStatement("delete from empl where empid=?");

            ps.setInt(1,id);

            int ans=ps.executeUpdate();
            if(ans>0)
                System.out.println("Record Deleted");
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        }
}
