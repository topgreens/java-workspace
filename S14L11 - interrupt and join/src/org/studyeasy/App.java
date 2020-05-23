package org.studyeasy;

public class App {
	static public int balance = 0;
	public void withdraw(int amount){
		synchronized (this){
		if(balance <= 0){
			try {
				System.out.println("Waiting for balance updation");
				wait();
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted, insuffieciant balance");
			}
		}
		}
		balance = balance - amount;
		System.out.println("Withdrawal successful and the current balance is: "+balance);
	}

	public static void main(String[] args) {
		App app = new App();
		
		Thread thread1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				app.withdraw(1000);
				
			}
		});
		thread1.start();
	
	}
}







