package Threads;

public class BankTest {
    public static void main(String[] args) {
        new BankTest().run();
    }
    public  void  run(){
        BankAccount account = new BankAccount(1000) ;

        Thread Ryan = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++){
                    account.withdraw(50);
                }
            }
        });
        Ryan.setName("Ryan");

        Thread Marry = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    account.withdraw(100);
                }
            }
        });
        Marry.setName("Marry");

        Ryan.start();
        Marry.start();



    }
}
