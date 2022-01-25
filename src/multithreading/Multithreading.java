/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading;

class mythread extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("@Chatting:"+i);
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        mythread t=new mythread();
        t.start();
        
        for(int i=0;i<5;i++)
        {
            System.out.println("@Cooking:"+i);
        }
    }
    
}