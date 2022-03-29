public class main {
    public static void main(String[] args) {

//        threads02();
//          threads10();
         threadsAutomatic();

    }
    public static void threadsAutomatic(){
        AutomaticThread automaticThread;
        while(true){
            automaticThread = new AutomaticThread("Quaisquer dados que a thread possa processar.");
            automaticThread.start();
        }

    }

    public static void threads02(){
        System.out.println("Thread main iniciada");

        Thread thread1 = new MyTask("Quaisquer dados que a thread possa processar.");
        Thread thread2 = new MyTask("Quaisquer dados que a thread possa processar.");
        thread1.start();
        thread2.start();

        System.out.println("Thread main finalizada");
    }
    public static void threads10(){
        System.out.println("Thread main iniciada");

        Thread thread1 = new MyTask("Quaisquer dados que a thread possa processar.");
        Thread thread2 = new MyTask("Quaisquer dados que a thread possa processar.");
        Thread thread3 = new MyTask("Quaisquer dados que a thread possa processar.");
        Thread thread4 = new MyTask("Quaisquer dados que a thread possa processar.");
        Thread thread5 = new MyTask("Quaisquer dados que a thread possa processar.");
        Thread thread6 = new MyTask("Quaisquer dados que a thread possa processar.");
        Thread thread7 = new MyTask("Quaisquer dados que a thread possa processar.");
        Thread thread8 = new MyTask("Quaisquer dados que a thread possa processar.");
        Thread thread9 = new MyTask("Quaisquer dados que a thread possa processar.");
        Thread thread10 = new MyTask("Quaisquer dados que a thread possa processar.");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
        System.out.println("Thread main finalizada");
    }

}
class AutomaticThread extends Thread {
    private String anyData;

    public AutomaticThread(String anyData) {
        this.anyData = anyData;
    }

    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "] [data=" + this.anyData + "] Message");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

 class MyTask extends Thread {
        private String anyData;

        public MyTask (String anyData){
            this.anyData = anyData;
        }

        public void run(){
            for(int i = 0; i < 10; i++){
                System.out.println("[" +Thread.currentThread().getName() + "] [data=" + this.anyData + "] Message" );
                try {
                    Thread.sleep(200);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }

}

