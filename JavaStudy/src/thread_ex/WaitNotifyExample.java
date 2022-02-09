package thread_ex;

public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject();
        Threada threada = new Threada(sharedObject);
        Threadb threadb = new Threadb(sharedObject);

        threada.start();
        threadb.start();
    }
}

class Threada extends Thread {

    private WorkObject workObject;
    public Threada(WorkObject workObject){
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            workObject.methodA();
        }
    }
}

class Threadb extends Thread {
    private WorkObject workObject;
    public Threadb(WorkObject workObject){
        this.workObject = workObject;
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            workObject.methodB();
        }
    }
}

class WorkObject {
    public synchronized void methodA(){
        System.out.println("ThreadA의 methodA() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void methodB(){
        System.out.println("ThreadB의 methodB() 작업 실행");
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
