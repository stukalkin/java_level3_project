package java3_lesson4;

public class MainSyncThread {
    public static final Object Locker = new Object();
    private static volatile char currentLetter = 'A';

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (Locker) {
                    try {
                        for (int i = 0; i < 5; i++) {
                            while (currentLetter != 'A') {
                                Locker.wait();
                            }
                            System.out.print("A");
                            currentLetter = 'B';
                            Locker.notifyAll();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (Locker) {
                    try {
                        for (int i = 0; i < 5; i++) {
                            while (currentLetter != 'B') {
                                Locker.wait();
                            }
                            System.out.print("B");
                            currentLetter = 'C';
                            Locker.notifyAll();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (Locker) {
                    try {
                        for (int i = 0; i < 5; i++) {
                            while (currentLetter != 'C') {
                                Locker.wait();
                            }
                            System.out.print("C");
                            System.out.println("");
                            currentLetter = 'A';
                            Locker.notifyAll();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }

}