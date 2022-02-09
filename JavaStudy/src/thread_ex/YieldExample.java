package thread_ex;

public class YieldExample {
    public static void main(String[] args) {
        Thread_A threadA = new Thread_A();
        Thread_B threadB = new Thread_B();
        threadA.start();
        threadB.start();
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        //A가 다른 스레드에게 양보
        threadA.work = false;
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        threadA.work = true;
        try{
            ThreadA.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        threadA.stop = true;
        threadB.stop = true;
    }
}

class Thread_A extends Thread{
    public boolean stop = false;
    public boolean work = true;

    @Override
    public void run() {
        while(!stop){
            if(work){
                System.out.println("Thread_A 작업 내용");
            }else {
                Thread.yield();
            }
        }
        System.out.println("Thread_A 종료");
    }
}

class Thread_B extends Thread{
    public boolean stop = false;
    public boolean work = true;

    @Override
    public void run() {
        while(!stop){
            if(work){
                System.out.println("Thread_B 작업 내용");
            }else {
                Thread.yield();
            }
        }
        System.out.println("Thread_B 종료");
    }
}