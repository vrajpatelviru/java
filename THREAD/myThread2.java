/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
 class prime1 extends Thread{
    public void run(){
        try{
            int num;
            System.out.println("Enter the num::");
            Scanner sc=new Scanner(System.in);
            num =sc.nextInt();
            
            if(num==2 || num==3 || num==5 || num%2!=0 && num%3!=0 && num%5!=0){
                System.out.println("number="+num+"is prime number:");
            }else{
                System.out.println("number="+num+"is not prime number::");
            }
            Thread.sleep(500);
        }catch(Exception e){
        
        }
    }
 }
    public class myThread2{
        public static void main(String[] args) {
            new prime1().start();
        }
    }

