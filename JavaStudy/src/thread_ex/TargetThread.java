package thread_ex;

import java.lang.annotation.Target;

public class TargetThread extends Thread {
    private String name;
    public TargetThread(String name){
        this.name = name;
        this.setName(name);
    }
    @Override
    public synchronized void run() {
        //RUNNABLE 상태
        for(long i=0;i<1000000000;i++){
            for(long j=0;j<30;j++){}
        }
        try{
            //TIMED_WAITING 상태
            Thread.sleep(1500);
        }catch (Exception e){ }
        //RUNNABLE
        for (long i=0;i<1000000000;i++){
            for(long j=0;j<30;j++){}
        }
    }
}
