package thread_ex;

import java.lang.annotation.Target;

public class ThreadStateExample {
    public static void main(String[] args) {
        StatePrintThread statePrintThread = new StatePrintThread(new TargetThread("a"));
        StatePrintThread statePrintThread1 = new StatePrintThread(new TargetThread("b"));
        statePrintThread.start();
        statePrintThread1.start();
    }
}
