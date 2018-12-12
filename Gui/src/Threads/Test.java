package Threads;

public class Test {
    public static void main(String[] args) {
        new Test().run();
    }
        public void run() {
            Thread first = new Thread(new Job());
                Thread second = new Thread(new Job());
                Thread third = new Thread(new Job());
                first.run();
                second.run();
                third.run();
        }
        class Job implements Runnable {
            @Override
            public void run() {
                    while (true) {
                        System.out.println(Thread.currentThread().getName());
                    }
                }
            }

        }


