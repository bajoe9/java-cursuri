package Threads;

public class BankAccount {
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public synchronized void  withdraw(int amount){

        if(balance >= amount){
            try {
                //if(Thread.currentThread().getName().equals("Ryan")){
                    Thread.sleep(100);
               // }
                Thread.currentThread().getName();
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                balance -= amount;
            }
            //balance -= amount; cel de sus normal e optinal si numai daca vrei sa fie precis pe obiect
            System.out.println("Balance" + balance);
        }

    }
}
