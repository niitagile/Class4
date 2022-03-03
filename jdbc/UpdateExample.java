package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateExample {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter ID : ");
        int id=s.nextInt();
        s.nextLine();
        System.out.print("Enter Name : ");
        String name=s.next();

        try {
//step1 load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");  //com.mysql.jdbc.driver //  oracle.jdbc.driver.OracleDriver

//step2 create  the connection object

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Mphasis", "root", "Comnet@123");
            PreparedStatement ps=con.prepareStatement("update empl set empname=? where empid=?");
            ps.setString(1,name);
            ps.setInt(2,id);

            int ans=ps.executeUpdate();
            if(ans>0)
                System.out.println("Record is inserted");
            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        }
}
