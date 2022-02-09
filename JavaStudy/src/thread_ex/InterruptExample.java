package thread_ex;

public class InterruptExample {

    public static void main(String[] args) {
        Thread thread = new PrintThread2();
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }
}

class PrintThread2 extends Thread {
    @Override
    public void run() {
//        try {
//            while (true) {
//                System.out.println("실행 중");
//                Thread.sleep(1000);
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        while(true){
            System.out.println("실행 중");
            if(Thread.interrupted()){
                break;
            }
        }
        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
