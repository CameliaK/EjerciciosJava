public class Ejercicio1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ImprimirNumeros(1, 100));
        Thread thread2 = new Thread(new ImprimirNumeros(100, 1));
        
        thread1.start();
        thread2.start();
    }
}

class ImprimirNumeros implements Runnable {
    private int inicio;
    private int fin;
    
    public ImprimirNumeros(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    
    @Override
    public void run() {
        if (inicio < fin) {
            for (int i = inicio; i <= fin; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            for (int i = inicio; i >= fin; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
