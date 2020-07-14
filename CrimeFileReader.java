/* File: States.java
 * Author: Tom Frazier
 * 05-07-2020
 * Purpose: class file for the StatesDataTest.java class file
 */

import java.util.Scanner;
import java.io.*;

public class CrimeFileReader {
    public static UsCrimeClass[] read(String filename) {

        // Array Declaration
        UsCrimeClass[] stats = new UsCrimeClass[20];

        // Variable Declaration
        int count = 0;
        String line;

        // Read File
        try {
            Scanner inputReader;
            inputReader = new Scanner(new File(filename));
            inputReader.nextLine();
            while (inputReader.hasNext()) {
                line = inputReader.nextLine();
                String[] data = line.split(",");
                stats[count] = new UsCrimeClass(Integer.parseInt(data[0]));		// Crime Year from file
                stats[count].setPopulation(Integer.parseInt(data[1]));      // Population from file
                stats[count].setViolentCrimeTotal(Integer.parseInt(data[2]));    // Violent crime from file
                stats[count].setViolentCrimeRate(Float.parseFloat(data[3])); // Violent crime rate from file
                stats[count].setMurderTotal(Integer.parseInt(data[4]));     // Murder total from file
                stats[count].setMurderRate(Float.parseFloat(data[5]));		// Crime Murder Rate from file
                stats[count].setRapeTotal(Integer.parseInt(data[6]));       // Rape total from file
                stats[count].setRapeRate(Float.parseFloat(data[7]));		// Crime Rape Rate from file
                stats[count].setRobberyTotal(Integer.parseInt(data[8]));    // Robbery total from file
                stats[count].setRobberyRate(Float.parseFloat(data[9]));		// Crime Robbery Rate from file
                stats[count].setAssaultTotal(Integer.parseInt(data[10]));   // Assault total from file
                stats[count].setAssaultRate(Float.parseFloat(data[11]));    // Assault rate from file
                stats[count].setPropertyTotal(Integer.parseInt(data[12]));  // Property crime total from file
                stats[count].setPropertyRate(Float.parseFloat(data[13]));   // Property crime rate from file
                stats[count].setBurglaryTotal(Integer.parseInt(data[14]));  // Burglary total from file
                stats[count].setBurglaryRate(Float.parseFloat(data[15]));	// Crime Burglary Rate from file
                stats[count].setLarcenyTotal(Integer.parseInt(data[16]));  // Larceny total from file
                stats[count].setLarcenyRate(Float.parseFloat(data[17]));	// Larceny Rate from file
                stats[count].setMotorVehicleTotal(Integer.parseInt(data[18]));  // Motor Vehicle total from file
                stats[count].setMotorVehicleRate(Float.parseFloat(data[19]));	// Motor Vehicle Rate from file
                count++;
            }
            inputReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println();
            System.out.println(e);
            System.out.println("\n1. Please ensure the file name is correct.");
            System.out.println("2. Please ensure the file resides in the same location as the java application.");
            System.out.println("3. Please re-run application.");
            System.exit(0);
        }
        return stats;
    }
}