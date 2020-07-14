/* File: States.java
 * Author: Tom Frazier
 * 05-07-2020
 * Purpose: class file for the StatesDataTest.java class file
 */

import java.io.*;
import java.util.*;
import java.lang.*;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.text.DecimalFormat;

public class UsCrimeStats {

    private static DecimalFormat df = new DecimalFormat("###,###");


    public static void main(String[] args) throws IOException {

        //Check for file argument
        if (args.length == 0) {
            System.out.println("\nError: You must enter a file name argument at program startup,");
            System.out.println("e.g. C:>java TestCrime Crime.csv");
            System.out.println("\nPlease re-run the application with a file name argument.");
            System.exit(0);
        }

        // Reference USCrimeFile
        UsCrimeClass[] data = CrimeFileReader.read(args[0]);

        // Declare Variables
        String picked;
        String pickedSub;
        String startOver;
        int yearinput;

        Scanner scanner = new Scanner(System.in);
        InputStreamReader isReader = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(isReader);

        Instant started = Instant.now();

        System.out.println("\n");
        System.out.println("********** Welcome to the US Crime Statistical Application **************************");

        // Program Loop
        do {
            System.out.println("Enter the number of the question you want answered. Enter 'Q' to quit the program: ");
            System.out.println("1.  What were the percentages in population growth for each consecutive year from 1994 - 2013?");
            System.out.println("2.  What year was Violent Crimes total/rate highest/lowest?");
            System.out.println("3.  What year was Murder total/rate highest/lowest?.");
            System.out.println("4.  What year was Rape total/rate highest/lowest?.");
            System.out.println("5.  What year was Robbery total/rate highest/lowest?");
            System.out.println("6.  What year was Aggrevated assault total/rate highest/lowest?");
            System.out.println("7.  What year was Property crime total/rate highest/lowest?");
            System.out.println("8.  What year was Burglary total/rate highest/lowest?");
            System.out.println("9.  What year was Larceny total/rate highest/lowest?");
            System.out.println("10. What year was Motor Vehicle theft total/rate highest/lowest?");
            System.out.println("Q.  Quit the program.");
            picked = scanner.next();

            if (picked.equals("1")) {
                UsCrimeObject.popGrowth(data);
                System.out.println("Press any button to return to the menu.");
                startOver = stdin.readLine();
            }

            if (picked.equals("2")) {
                System.out.println("What statistic would you like to view in regards to Violent Crimes?");
                System.out.println("1.  Violent Crimes total highest/lowest year.");
                System.out.println("2.  Violent Crimes rate highest/lowest year.");
                pickedSub = scanner.next();
                if (pickedSub.equals("1")) {
                    System.out.println("The highest Violent Crime total was " + (df.format(UsCrimeObject.vCrimeTotalHi(data))) + " in " + UsCrimeObject.vCrimeTotalYearHi(data) + ".");
                    System.out.println("The lowest Violent Crime total was " + (df.format(UsCrimeObject.vCrimeTotalLo(data))) + " in " + UsCrimeObject.vCrimeTotalYearLo(data) + ".");
                }
                if (pickedSub.equals("2")) {
                    System.out.println("The highest Violent Crime rate was " + UsCrimeObject.vCrimeRateHi(data) + " in " + UsCrimeObject.vCrimeRateYearHi(data) + ".");
                    System.out.println("The lowest Violent Crime rate was " + UsCrimeObject.vCrimeRateLo(data) + " in " + UsCrimeObject.vCrimeRateYearLo(data) + ".");
                }
                System.out.println("Press any button to return to the menu.");
                startOver = stdin.readLine();
            }

            if (picked.equals("3")) {
                System.out.println("What statistic would you like to view in regards to Murder Crimes?");
                System.out.println("1.  Murder Crimes total highest/lowest year.");
                System.out.println("2.  Murder Crimes rate highest/lowest year.");
                pickedSub = scanner.next();
                if (pickedSub.equals("1")) {
                    System.out.println("The highest Murder Crime total was " + (df.format(UsCrimeObject.vCrimeTotalHi(data))) + " in " + UsCrimeObject.vCrimeTotalYearHi(data) + ".");
                    System.out.println("The lowest Murder Crime total was " + (df.format(UsCrimeObject.vCrimeTotalLo(data))) + " in " + UsCrimeObject.vCrimeTotalYearLo(data) + ".");
                }
                if (pickedSub.equals("2")) {
                    System.out.println("The highest Murder Crime rate was " + UsCrimeObject.vCrimeRateHi(data) + " in " + UsCrimeObject.vCrimeRateYearHi(data) + ".");
                    System.out.println("The lowest Murder Crime rate was " + UsCrimeObject.vCrimeRateLo(data) + " in " + UsCrimeObject.vCrimeRateYearLo(data) + ".");
                }
                System.out.println("Press any button to return to the menu.");
                startOver = stdin.readLine();
            }

            if (picked.equals("4")) {
                System.out.println("What statistic would you like to view in regards to Rape Crimes?");
                System.out.println("1.  Rape Crimes total highest/lowest year.");
                System.out.println("2.  Rape Crimes rate highest/lowest year.");
                pickedSub = scanner.next();
                if (pickedSub.equals("1")) {
                    System.out.println("The highest Rape Crime total was " + (df.format(UsCrimeObject.vCrimeTotalHi(data))) + " in " + UsCrimeObject.vCrimeTotalYearHi(data) + ".");
                    System.out.println("The lowest Rape Crime total was " + (df.format(UsCrimeObject.vCrimeTotalLo(data))) + " in " + UsCrimeObject.vCrimeTotalYearLo(data) + ".");
                }
                if (pickedSub.equals("2")) {
                    System.out.println("The highest Rape Crime rate was " + UsCrimeObject.vCrimeRateHi(data) + " in " + UsCrimeObject.vCrimeRateYearHi(data) + ".");
                    System.out.println("The lowest Rape Crime rate was " + UsCrimeObject.vCrimeRateLo(data) + " in " + UsCrimeObject.vCrimeRateYearLo(data) + ".");
                }
                System.out.println("Press any button to return to the menu.");
                startOver = stdin.readLine();
            }

            if (picked.equals("5")) {
                System.out.println("What statistic would you like to view in regards to Robbery Crimes?");
                System.out.println("1.  Robbery Crimes total highest/lowest year.");
                System.out.println("2.  Robbery Crimes rate highest/lowest year.");
                pickedSub = scanner.next();
                if (pickedSub.equals("1")) {
                    System.out.println("The highest Robbery Crime total was " + (df.format(UsCrimeObject.vCrimeTotalHi(data))) + " in " + UsCrimeObject.vCrimeTotalYearHi(data) + ".");
                    System.out.println("The lowest Robbery Crime total was " + (df.format(UsCrimeObject.vCrimeTotalLo(data))) + " in " + UsCrimeObject.vCrimeTotalYearLo(data) + ".");
                }
                if (pickedSub.equals("2")) {
                    System.out.println("The highest Robbery Crime rate was " + UsCrimeObject.vCrimeRateHi(data) + " in " + UsCrimeObject.vCrimeRateYearHi(data) + ".");
                    System.out.println("The lowest Robbery Crime rate was " + UsCrimeObject.vCrimeRateLo(data) + " in " + UsCrimeObject.vCrimeRateYearLo(data) + ".");
                }
                System.out.println("Press any button to return to the menu.");
                startOver = stdin.readLine();
            }

            if (picked.equals("6")) {
                System.out.println("What statistic would you like to view in regards to Aggrevated Assault Crimes?");
                System.out.println("1.  Aggrevated Assault Crimes total highest/lowest year.");
                System.out.println("2.  Aggrevated Assault Crimes rate highest/lowest year.");
                pickedSub = scanner.next();
                if (pickedSub.equals("1")) {
                    System.out.println("The highest Aggrevated Assault Crime total was " + (df.format(UsCrimeObject.vCrimeTotalHi(data))) + " in " + UsCrimeObject.vCrimeTotalYearHi(data) + ".");
                    System.out.println("The lowest Aggrevated Assault Crime total was " + (df.format(UsCrimeObject.vCrimeTotalLo(data))) + " in " + UsCrimeObject.vCrimeTotalYearLo(data) + ".");
                }
                if (pickedSub.equals("2")) {
                    System.out.println("The highest Aggrevated Assault Crime rate was " + UsCrimeObject.vCrimeRateHi(data) + " in " + UsCrimeObject.vCrimeRateYearHi(data) + ".");
                    System.out.println("The lowest Aggrevated Assault Crime rate was " + UsCrimeObject.vCrimeRateLo(data) + " in " + UsCrimeObject.vCrimeRateYearLo(data) + ".");
                }
                System.out.println("Press any button to return to the menu.");
                startOver = stdin.readLine();
            }
            if (picked.equals("7")) {
                System.out.println("What statistic would you like to view in regards to Property Crimes?");
                System.out.println("1.  Property Crimes total highest/lowest year.");
                System.out.println("2.  Property Crimes rate highest/lowest year.");
                pickedSub = scanner.next();
                if (pickedSub.equals("1")) {
                    System.out.println("The highest Property Crime total was " + (df.format(UsCrimeObject.vCrimeTotalHi(data))) + " in " + UsCrimeObject.vCrimeTotalYearHi(data) + ".");
                    System.out.println("The lowest Property Crime total was " + (df.format(UsCrimeObject.vCrimeTotalLo(data))) + " in " + UsCrimeObject.vCrimeTotalYearLo(data) + ".");
                }
                if (pickedSub.equals("2")) {
                    System.out.println("The highest Property Crime rate was " + UsCrimeObject.vCrimeRateHi(data) + " in " + UsCrimeObject.vCrimeRateYearHi(data) + ".");
                    System.out.println("The lowest Property Crime rate was " + UsCrimeObject.vCrimeRateLo(data) + " in " + UsCrimeObject.vCrimeRateYearLo(data) + ".");
                }
                System.out.println("Press any button to return to the menu.");
                startOver = stdin.readLine();
            }

            if (picked.equals("8")) {
                System.out.println("What statistic would you like to view in regards to Burglary Crimes?");
                System.out.println("1.  Burglary Crimes total highest/lowest year.");
                System.out.println("2.  Burglary Crimes rate highest/lowest year.");
                pickedSub = scanner.next();
                if (pickedSub.equals("1")) {
                    System.out.println("The highest Burglary Crime total was " + (df.format(UsCrimeObject.vCrimeTotalHi(data))) + " in " + UsCrimeObject.vCrimeTotalYearHi(data) + ".");
                    System.out.println("The lowest Burglary Crime total was " + (df.format(UsCrimeObject.vCrimeTotalLo(data))) + " in " + UsCrimeObject.vCrimeTotalYearLo(data) + ".");
                }
                if (pickedSub.equals("2")) {
                    System.out.println("The highest Burglary Crime rate was " + UsCrimeObject.vCrimeRateHi(data) + " in " + UsCrimeObject.vCrimeRateYearHi(data) + ".");
                    System.out.println("The lowest Burglary Crime rate was " + UsCrimeObject.vCrimeRateLo(data) + " in " + UsCrimeObject.vCrimeRateYearLo(data) + ".");
                }
                System.out.println("Press any button to return to the menu.");
                startOver = stdin.readLine();
            }

            if (picked.equals("9")) {
                System.out.println("What statistic would you like to view in regards to Larceny-Theft Crimes?");
                System.out.println("1.  Larceny-Theft Crimes total highest/lowest year.");
                System.out.println("2.  Larceny-Theft Crimes rate highest/lowest year.");
                pickedSub = scanner.next();
                if (pickedSub.equals("1")) {
                    System.out.println("The highest Larceny-Theft Crime total was " + (df.format(UsCrimeObject.vCrimeTotalHi(data))) + " in " + UsCrimeObject.vCrimeTotalYearHi(data) + ".");
                    System.out.println("The lowest Larceny-Theft Crime total was " + (df.format(UsCrimeObject.vCrimeTotalLo(data))) + " in " + UsCrimeObject.vCrimeTotalYearLo(data) + ".");
                }
                if (pickedSub.equals("2")) {
                    System.out.println("The highest Larceny-Theft Crime rate was " + UsCrimeObject.vCrimeRateHi(data) + " in " + UsCrimeObject.vCrimeRateYearHi(data) + ".");
                    System.out.println("The lowest Larceny-Theft Crime rate was " + UsCrimeObject.vCrimeRateLo(data) + " in " + UsCrimeObject.vCrimeRateYearLo(data) + ".");
                }
                System.out.println("Press any button to return to the menu.");
                startOver = stdin.readLine();
            }

            if (picked.equals("10")) {
                System.out.println("What statistic would you like to view in regards to Motor Vehicle Theft Crimes?");
                System.out.println("1.  Motor Vehicle Theft Crimes total highest/lowest year.");
                System.out.println("2.  Motor Vehicle Theft Crimes rate highest/lowest year.");
                pickedSub = scanner.next();
                if (pickedSub.equals("1")) {
                    System.out.println("The highest Motor Vehicle Theft Crime total was " + (df.format(UsCrimeObject.vCrimeTotalHi(data))) + " in " + UsCrimeObject.vCrimeTotalYearHi(data) + ".");
                    System.out.println("The lowest Motor Vehicle Theft Crime total was " + (df.format(UsCrimeObject.vCrimeTotalLo(data))) + " in " + UsCrimeObject.vCrimeTotalYearLo(data) + ".");
                }
                if (pickedSub.equals("2")) {
                    System.out.println("The highest Motor Vehicle Theft Crime rate was " + UsCrimeObject.vCrimeRateHi(data) + " in " + UsCrimeObject.vCrimeRateYearHi(data) + ".");
                    System.out.println("The lowest Motor Vehicle Theft Crime rate was " + UsCrimeObject.vCrimeRateLo(data) + " in " + UsCrimeObject.vCrimeRateYearLo(data) + ".");
                }
                System.out.println("Press any button to return to the menu.");
                startOver = stdin.readLine();
            }

            if (picked.equalsIgnoreCase("Q")) {
                System.out.println("Thank you for trying the US Crimes Statistics Program.");

                Instant ended = Instant.now();
                Duration time = Duration.between(started, ended);

                System.out.println("Elapsed time in seconds was: " + time.getSeconds());
            }
        }  while (!picked.equalsIgnoreCase("Q"));
    }
}