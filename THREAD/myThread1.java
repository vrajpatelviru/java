/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class myThread1 extends Thread{
    public  void run(){
        System.out.println("Thread is running::");
    }
    public static void main(String[] args) {
        myThread1 obj=new myThread1();
        obj.start();
    }
}
