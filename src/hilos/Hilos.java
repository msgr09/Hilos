
package hilos;

/**
 *
 * @author Marlon gonzalez
 */
public class Hilos extends Thread {

    private String name;
    private int retardo;

    public Hilos(String s, int d) {
        name = s;
        retardo = d;

    }
    
    @Override
    public void run() {

        try {

            sleep(retardo);

        } catch (InterruptedException e) {

        }

        System.out.println("Prueba Hilos: " + name + " " + retardo);

    }
}
