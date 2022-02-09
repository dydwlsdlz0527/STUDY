package thread_ex;

public class WaitNotifyExample2 {

    public static void main(String[] args) {
        DataBox dataBox = new DataBox();
        ProducerThread producerThread = new ProducerThread(dataBox);
        ConsumerThread consumerThread = new ConsumerThread(dataBox);
        producerThread.start();
        consumerThread.start();
    }
}

class DataBox {
    private String data;
    public synchronized String getData(){
        if(this.data==null){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String returnValue = data;
        System.out.println("ConsummerThread가 읽은 데이터 : " + returnValue);
        data = null;
        notify();
        return returnValue;
    }

    public synchronized void setData(String data){
        if(this.data!=null){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data = data;
        System.out.println("ProducerThread가 생성한 데이터 : " + data);
        notify();
    }
}

class ProducerThread extends Thread {
    private DataBox dataBox;
    public ProducerThread(DataBox dataBox){
        this.dataBox = dataBox;
    }
    @Override
    public void run() {
        for(int i=1;i<=3;i++){
            String data = "Data-"+i;
            dataBox.setData(data);
        }
    }
}

class ConsumerThread extends Thread {
    private DataBox dataBox;
    public ConsumerThread(DataBox dataBox){
        this.dataBox = dataBox;
    }

    @Override
    public void run() {
        for(int i=1;i<=3;i++){
            String data = dataBox.getData();
        }
    }
}