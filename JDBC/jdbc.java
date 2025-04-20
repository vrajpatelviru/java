
import java.sql.*;
import java.io.*;
import java.util.*;
public class jdbc {
    public static void main(String[] args) {
        int no,ch;
        String sql,name,date,desig;
        String url="jdbc:mysql://localhost:3306/vraj";
        String id="root";
        String pass="root";
        
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded::");
        }catch(Exception e){
            System.out.println(e);
        }
        try {
            Connection con=DriverManager.getConnection(url,id,pass);
            Statement stmt=con.createStatement();
            ResultSet rs;
            
            Scanner sc=new Scanner(System.in);
            
            System.out.println("1.Insert:");
            System.out.println("2.Show:");
            System.out.println("Enter your choice::");
            ch=sc.nextInt();
            
            switch(ch){
                case 1:
                    System.out.println("1.Enter name:");
                    name=sc.next();
                    System.out.println("2.Enter no:");
                    no=sc.nextInt();
                    System.out.println("3.Enter date:");
                    date=sc.next();
                    
                    System.out.println("4.Enter design:");
                    desig=sc.next();
                    
                    sql="insert into temp values("+no+",'"+name+"','"+date+"','"+desig+"')";
                    stmt.executeUpdate(sql);
                    System.out.println("Record inserted::");
                    break;
                case 2:
                    sql="select * from temp";
                    rs=stmt.executeQuery(sql);
                    
                    while(rs.next()){
                        System.out.println("----------------------");
                        System.out.println("no="+rs.getInt(1));
                        System.out.println("name="+rs.getString(2));
                        System.out.println("date="+rs.getString(3));
                        System.out.println("desing="+rs.getString(4));
                        System.out.println("-------------------------");
                        System.out.println("");
                    }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
