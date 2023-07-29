package thrds2;
import static java.lang.Thread.*;

public class Tester {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("main thrd details "+ Thread.currentThread());// Thread [main,5,main]
		//create startnable task instance
		MyRunableTask task=new MyRunableTask();
//		Thread t0=new Thread();
//		t0.start();
		// create child thrds
		//Thread(startnable target,String name)
		Thread t1=new Thread(task,"one");
		Thread t2=new Thread(task,"two");
		Thread t3=new Thread(task,"three");
		Thread t4=new Thread(task,"four");//How many startnable thrds ? 1
		t1.start();
		//t1.start();//restart a dead/runable thread again give main thread will get thread give iTSExecption
		t2.start(); 
		t3.start();
		t4.start();// startNABLE : 1(parent)+4(child)
		for (int i = 0; i < 10; i++) {
			System.out.println(currentThread().getName() + " exec # " + i);
		sleep(100);
		
		}
		System.out.println("main sending interrupt to t1");
		t1.interrupt();
		System.out.println("t1 status" +t1.isAlive());
		//t1.start();
		t1.join();//main is blocked on join (i.e. main waiting for t1 to complete)
		System.out.println("t1 status" +t1.isAlive());
		t2.join();//main is blocked on join (i.e. main waiting for t2 to complete)
		t3.join();//main is blocked on join (i.e. main waiting for t3 to complete)
		t4.join();//main is blocked on join (i.e. main waiting for t4 to complete)
		System.out.println("main over......");

	}

}
