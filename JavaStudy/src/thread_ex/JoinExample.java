package thread_ex;

public class JoinExample {
    public static void main(String[] args) {
        SumThread sumThread = new SumThread();
        sumThread.start();
        try{
            //sumThread의 실행이 끝날 때까지 기다린다.
            sumThread.join();
        }catch(InterruptedException e){}
        System.out.println("1~100 합 : " + sumThread.getSum());
    }
}

class SumThread extends Thread {
    private long sum;
    public void setSum(long sum) {
        this.sum = sum;
    }
    public long getSum(){
        return sum;
    }
    @Override
    public void run() {
        for (int i=1;i<=100;i++) {
            sum += i;
        }
    }
}
