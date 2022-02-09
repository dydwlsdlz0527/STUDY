package thread_ex;

import java.awt.*;

public class BeepPrintExample1 {
    //비프음이 발생하고 난 후 프린트가 된다.
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0;i<5;i++){
            //비프음 발생
            toolkit.beep();
            try{
                Thread.sleep(500);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
