/**
 * Make the letter H as described in the Readme.md
 * IMPORTANT:  You can only use:
 *      hop()
 *      plant()
 *      turn(LEFT)
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        new JerooGUI();
        runJerooCode();
    }

    /**
     * Put your main Jeroo code here.
     */
    public static void runJerooCode() {
       // Write code here to make a letter here
       Jeroo j = new Jeroo(0, 0, EAST, 100);
  j.hop();
  j.turn(RIGHT);
  j.hop();
  j.plant();
  j.hop();
  j.plant();
  j.hop();
  j.plant();
  j.hop();
  j.plant();
  j.hop();
  j.plant();
  j.turn(LEFT);
  j.turn(LEFT);
  j.hop();
  j.hop();
  j.turn(RIGHT);
  j.hop();
  j.plant();
  j.hop();
  j.plant();
  j.hop();
  j.plant();
  j.turn(LEFT);
  j.hop();
  j.plant();
  j.hop();
  j.plant();
  j.turn(RIGHT);
  j.turn(RIGHT);
  j.hop();
  j.hop();
  j.hop();
  j.plant();
  j.hop();
  j.plant();
  j.hop();
    }

}
