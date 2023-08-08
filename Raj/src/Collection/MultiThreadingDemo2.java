package Collection;

/*
 * * Sequential                                  Parallel

 *->  Work just like for -loop using			Divide the provided task into many and 
 *	  single core   							run them in different threads
 *->  Run on single core						Runs into multiple core
 *->  Supports lazy evaluation   				Supports lazy evaluation
 *->  Use based on the required task 			Use based on the required task 
 *->  Performance is poor						The performance is high.
 *->  Order is maintained						Doesn’t care about the order
 *->  Each iteration waits for 					Waits only if no cores are free or available at a given time.
 *	  currently running one to finish.	
 
 *
 * Thread and MultiThread:
 *Async is multi-thread, which means operations or programs can run in parallel. 
 *Sync is single-thread, so only one operation or program will run at a time. 
 *Async is non-blocking, which means it will send multiple requests to a server.
 *
->public void run(): is used to perform action for a thread.
-> public void start(): starts the execution of the thread.JVM calls the run() method on the thread.
-> public void sleep(long miliseconds): Causes the currently executing thread to sleep (temporarily cease execution) 
	for the specified number of milliseconds.
-> public void join(): waits for a thread to die.
-> public void join(long miliseconds): waits for a thread to die for the specified miliseconds.
-> public int getPriority(): returns the priority of the thread.
-> public int setPriority(int priority): changes the priority of the thread.
-> public String getName(): returns the name of the thread.
-> public void setName(String name): changes the name of the thread.
-> public Thread currentThread(): returns the reference of currently executing thread.
-> public int getId(): returns the id of the thread.
-> public Thread.State getState(): returns the state of the thread.
-> public boolean isAlive(): tests if the thread is alive.
-> public void yield(): causes the currently executing thread object to temporarily pause and allow other threads to execute.
-> public void suspend(): is used to suspend the thread(depricated).
-> public void resume(): is used to resume the suspended thread(depricated).
-> public void stop(): is used to stop the thread(depricated).
-> public boolean isDaemon(): tests if the thread is a daemon thread.
-> public void setDaemon(boolean b): marks the thread as daemon or user thread.
-> public void interrupt(): interrupts the thread.
-> public boolean isInterrupted(): tests if the thread has been interrupted.
-> public static boolean interrupted(): tests if the current thread has been interrupted.
-> Wait()
The wait() method causes the current thread to wait
 until another thread invokes the notify() or notifyAll() methods for that object.
  The notify() method wakes up a single thread that is waiting on that object's monitor. 
The notifyAll() method wakes up all threads that are waiting on that object's monitor.
It loss the ownership.

-> Volatile keyword is used to modify the value of a variable by different threads.
 It is also used to make classes thread safe.
  It means that multiple threads can use a method and instance of the classes at the same time without any problem.
 The volatile keyword can be used either with primitive type or objects.


The Thread resumes the execution after obtaining the ownership of the monitor.
-> Thread  creation:
-> class num extends Thread{
-> public void run(){
->


 */

class Table {
	synchronized void printTable(int n) {
		for(int i=1;i<5;i++) {
			System.out.println(n*i);
			try{Thread.sleep(1000);} catch(InterruptedException e) {}
			
		}
	}
}
public class MultiThreadingDemo2{
	public static void main(String[] args) {
		
 Table t=new Table();
 
 Thread t1=new Thread() {
	 public void run()
	 {
		 t.printTable(5);
	 }
 };
 Thread t2=new Thread() {
	 public void run()
	 {
		 t.printTable(10);
	 }
 };
 
 t1.start();
 t2.start();
	
	}
}
