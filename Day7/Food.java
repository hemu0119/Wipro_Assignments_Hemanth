package Day7;

class Order implements Runnable {
    public void run() {
        System.out.println("Order is being processed...");
    }
}

class Payment implements Runnable {
    public void run() {
        try {
            System.out.println("Payment is processing...");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}

class Notification implements Runnable {
    public void run() {
        System.out.println("Notification sent");
    }
}

public class Food {
    public static void main(String[] args) throws InterruptedException {

        Order o = new Order();
        Payment p = new Payment();
        Notification n = new Notification();

        Thread t1 = new Thread(o);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(n);

        t1.setName("Order Thread");
        t2.setName("Payment Thread");
        t3.setName("Notification Thread");

        t1.setPriority(10);     
        t2.setPriority(5);    
        t3.setPriority(1);     
        t1.start();
        t2.start();
        t3.start();
        if(t3.isAlive()) {
        System.out.println(t3.getName()+" is alive.");}
        else {
        	System.out.println(t3.getName()+" not  alive.");}
        
        
        
        System.out.println("Thread 1 name: " + t1.getName());
        System.out.println("Thread 2 name: " + t2.getName());
    }
}