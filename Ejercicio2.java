public class Ejercicio2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ImprimirTexto("Hola"));
        Thread thread2 = new Thread(new ImprimirTexto("Mundo"));
        
        thread1.start();
        thread2.start();
    }
}

class ImprimirTexto implements Runnable {
    private String texto;
    
    public ImprimirTexto(String texto) {
        this.texto = texto;
        
    }
    
    @Override
    public void run() {
        while (true) {
            System.out.print(texto + " ");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
