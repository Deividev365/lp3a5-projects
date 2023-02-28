package aula01;
import java.lang.reflect.InvocationTargetException;


public class ThreadJoin {

    public static void main(String[] args) throws InterruptedException,
            InvocationTargetException {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 5; i++)
                    System.out.println(i+": t1");
            }

        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for(int i = 0; i < 5; i++)
                    System.out.println(i+": t2");
            }

        };


        try {
            t1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }



        t1.start();

        t2.start();



    }
}
