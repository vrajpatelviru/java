/*
create table :
                create table xyz(
                     no int(20),
                    name varchar(10),
                    da date
                );
delete table :
                drop table xyz;
create database :
                create database xyz;
show databases :
                show databases;
show table :
                show tables;

*/
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
            System.out.println("3.Update:");
            System.out.println("4.Delete:");
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
                    break;
                case 3:
                    String change_design;int change_no;
                    System.out.println("Enter no that design you have to change:");
                    change_no=sc.nextInt();
                    System.out.println("Enter new design:");
                    change_design=sc.next();
                    
                    sql="update temp set desig='"+ change_design +"' where no="+change_no;
                    stmt.executeUpdate(sql);
                    break;
                case 4:
                    int delete_no;
                    System.out.println("Enter no that you want to delete:");
                    delete_no=sc.nextInt();
                    
                    sql="delete from temp where no="+delete_no;
                    stmt.executeUpdate(sql);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
