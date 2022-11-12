
package hilos;

/**
 *
 * @author Marlon gonzalez
 */
public class Hiltos {

    
    public static void main(String[] args) {
        Hilos t1, t2, t3;

        t1 = new Hilos("Hilito 1", (int) (Math.random() * 2000));
        t2 = new Hilos("Hilito 2", (int) (Math.random() * 2000));
        t3 = new Hilos("Hilito 3", (int) (Math.random() * 2000));

        t1.start();
        t2.start();
        t3.start();

}

}
