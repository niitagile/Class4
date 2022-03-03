package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.Scanner;

public class InsertDateExample {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter ID : ");
        int id=s.nextInt();
        s.nextLine();
        System.out.print("Enter Name : ");
        String name=s.next();
        java.util.Date d=new java.util.Date();
        long t = d.getTime();// retrieving only time
        java.sql.Date sqlDate = new java.sql.Date(t); //convert java date to sql date

        try {
//step1 load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");  //com.mysql.jdbc.driver //  oracle.jdbc.driver.OracleDriver

//step2 create  the connection object

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/Mphasis", "root", "Comnet@123");
            PreparedStatement ps=con.prepareStatement("insert into empl(empid,empname,dob)values(?,?,?)");
            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setDate(3,sqlDate);
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
