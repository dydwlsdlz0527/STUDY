package thread_ex;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("프로그램 시작 스레드 : " + thread.getName());

        ThreadA threada = new ThreadA();
        System.out.println("작업 스레드 : " + threada.getName());
        threada.start();

        ThreadB threadb = new ThreadB();
        System.out.println("작업 스레드 : " + threadb.getName());
        threadb.start();
    }

}
