/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

class runnablea1 implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("@Child:"+i);
        }
    }
}
public class runnablethread {
    public static void main(String[] args)
    {
        runnablea1 r=new runnablea1();
        Thread t1=new Thread(r);
        t1.start();
        
        for(int i=0;i<5;i++)
        {
            System.out.println("@Parent:"+i);
        }
    }
}
