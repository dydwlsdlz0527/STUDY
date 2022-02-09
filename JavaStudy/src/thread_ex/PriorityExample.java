package thread_ex;

public class PriorityExample {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new CalcThread("thread"+i);
            if(i!=10){
                thread.setPriority(Thread.MIN_PRIORITY);
            }else{
                thread.setPriority(Thread.MAX_PRIORITY);
            }
            thread.start();
        }
    }
}
class CalcThread extends Thread {
    public CalcThread(String name){
        setName(name);
    }
    @Override
    public void run() {
        for (double i = 0; i < 2000000000.0; i++) {
        }
        System.out.println(getName());
    }
}
