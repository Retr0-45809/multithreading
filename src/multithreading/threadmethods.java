/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

class mythreadmethod1 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Child 1 thread id:"+Thread.currentThread().getId());
        System.out.println("Child 1 thread name:"+Thread.currentThread().getName());
        System.out.println("Child 1 thread priority:"+Thread.currentThread().getPriority());
        Thread.currentThread().setName("Karan");
        System.out.println("New child 1 thread name:"+Thread.currentThread().getName());
        Thread.yield();
    }
}

class mythreadmethod2 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Child 2 thread id:"+Thread.currentThread().getId());
        System.out.println("Child 2 thread name:"+Thread.currentThread().getName());
        System.out.println("Child 2 thread priority:"+Thread.currentThread().getPriority());
        Thread.currentThread().setName("Adith");
        System.out.println("New child 2 thread name:"+Thread.currentThread().getName());
        Thread.yield();
    }
}

public class threadmethods {
    public static void main(String[] args) throws InterruptedException {
        mythreadmethod1 t1=new mythreadmethod1();
        t1.start();
        mythreadmethod2 t2=new mythreadmethod2();
        t2.start();
        t2.join();
        System.out.println("Parent thread id:"+Thread.currentThread().getId());
        System.out.println("Parent thread name:"+Thread.currentThread().getName());
        Thread.currentThread().setName("Sajeeth");
        System.out.println("New Parent thread name:"+Thread.currentThread().getName());
        System.out.println("Parent thread priority:"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(1);
        System.out.println("New Parent thread priority:"+Thread.currentThread().getPriority());
        
    }
    
}
