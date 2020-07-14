/* File: States.java
 * Author: Tom Frazier
 * 05-07-2020
 * Purpose: class file for the StatesDataTest.java class file
 */

import java.lang.*;
import java.util.concurrent.TimeUnit;

public class UsCrimes {

    public static void main(String[] args) {

        long started = System.currentTimeMillis();

        UsCrimeStats stats = new UsCrimeStats(args[0]);
        stats.openFile();
        stats.readFile();
        stats.runProgram();


        long ended = System.currentTimeMillis();
        totalTime = ((ended - started) / 1000.0);

        System.out.println("Elapsed time was: " + totalTime + " seconds.");
    }

}