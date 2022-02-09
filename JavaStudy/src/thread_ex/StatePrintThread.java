package thread_ex;

public class StatePrintThread extends Thread {

    private Thread targetThread;
    public StatePrintThread(Thread targetThread){
        this.targetThread = targetThread;
    }
    @Override
    public synchronized void run() {
        while(true){
            Thread.State state = targetThread.getState();
            System.out.println("타켓 스레드 상태 : " + state + "  Thread Name:" +  this.getName());
            if(state==Thread.State.NEW){
                targetThread.start();
            }
            if(state== State.TERMINATED){
                break;
            }
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
