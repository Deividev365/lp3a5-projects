package aula02;

//EXECUÇÃO DE THREAD USANDO INTERFACES

//A classe MyRunnable implementa a interface Runnable

public class MyRunnable implements Runnable {

    // O  método run contém o código que será executado na nova thre
    public void run () {
//imprime uma mensagem indicando a execução da primeira thread
        System.out.println ("Execução da primeira thread");
    }

}


public class Main {
    public static void main (String[] args) {
// cria uma nova instãncia da classe MyRunnable

        MyRunnable runnable = new MyRunnable ();

//cria a instância de uma nova thread e "passa" a instância MyRunnable como argumento
        Thread thread = new Thread(runnable);

//início da primeira thread
        thread.start();

//imprime uma mensagem indicando a execução da thread principal

        System.out.println("Executando na thread principal");
=    }
}


