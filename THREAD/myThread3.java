import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class myThread3 {
    public static void main(String[] args) {
        Task t1= new Task("Task1");
        Task t2=new Task("Task2");
        Timer t= new Timer();
        
        t.schedule(t1, 10000);
        t.schedule(t2, 1000,2000);
    }
}

class Task extends TimerTask{
    private String name;
    
    public Task(String name){
        this.name=name;
    }
    
    public void run(){
        System.out.println("["+new Date()+"]"+name+"task executed !");
    }
}
