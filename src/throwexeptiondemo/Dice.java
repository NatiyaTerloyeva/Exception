package throwexeptiondemo;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.File;

public class Dice {
    private int[] Dice;

    public Dice(int numberOfDice) throws Exception {
        if (numberOfDice < 1)
            throw new Exception("Please send 1 or above");
        int[] dice = new int[numberOfDice];
    }
}


    class TestDice {
        public static void main(String[] args) {
            try {

            PrintStream ps = new PrintStream(new File(""));

        } catch (FileNotFoundException exception) {

            // throw new RuntimeException(Exception.getMessage());

        } catch (NullPointerException exception) {

            System.out.println("null");

        }
            // THIS is what we're looking at:

            try {
                Dice dice = new Dice(-2);
            } catch (Exception e) {
                System.out.println("EXCEPTION: " + e.getMessage());
            } finally {
                System.out.println("Done with the risky buisness.");
            }
            System.out.println("I'm good!");
            }

        }

