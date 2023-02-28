package aula01;

public class Thread {

public static void main(String[] args) throws InterruptedException {

java.lang.Thread t = new java.lang.Thread();

    long time = System.currentTimeMillis();


    for(int pos = 1; pos < 4; pos ++) {
    System.out.println("Executando a rotina " + pos);
    t.sleep(10000);

    }
  }
}