
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class USCrime {

    class USCrimeClass {

    }

    // set array size
    private static final int YEARARRAYSIZE = 20;
    private static final int POPARRAYSIZE = 20;
    private static final int VCRIMEARRAYSIZE = 20;
    private static final int VCRIMERARRAYSIZE = 20;
    private static final int MURDERARRAYSIZE = 20;
    private static final int MURDRARRAYSIZE = 20;
    private static final int RAPEARRAYSIZE = 20;
    private static final int RAPERARRAYSIZE = 20;
    private static final int ROBARRAYSIZE = 20;
    private static final int ROBRARRAYSIZE = 20;
    private static final int AGGARRAYSIZE = 20;
    private static final int AGGRARRAYSIZE = 20;
    private static final int PROPARRAYSIZE = 20;
    private static final int PROPRARRAYSIZE = 20;
    private static final int BURGARRAYSIZE = 20;
    private static final int BURGRARRAYSIZE = 20;
    private static final int LARCARRAYSIZE = 20;
    private static final int LARCRARRAYSIZE = 20;
    private static final int THEFTARRAYSIZE = 20;
    private static final int THEFTRARRAYSIZE = 20;
    private static final int INSTRUCTIONLIST = 1;


    public static void main(String[] args) throws IOException, InterruptedException {

        int fileChar;

        try {
            //FileInputStream in = null;
            //in = new FileInputStream("crime.csv");
            DataInputStream targetStream =
                    new DataInputStream(new FileInputStream("crime.csv"));

            System.out.println("Crime File Contents");
            // Read one char at a time
            while ((fileChar = targetStream.read()) != -1) {
                // convert int to char
                System.out.print((char) fileChar);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        // Strings
        String yourChoice;
        String newChoice;

        // Array values

        // Array values of Year
        String[] yearValues = new String[YEARARRAYSIZE];
        yearValues[0] = "1994"; yearValues[1] = "1995"; yearValues[2] = "1996"; yearValues[3] = "1997"; yearValues[4] = "1998";
        yearValues[5] = "1999"; yearValues[6] = "2000"; yearValues[7] = "2001"; yearValues[8] = "2002"; yearValues[9] = "2003";
        yearValues[10] = "2004"; yearValues[11] = "2005"; yearValues[12] = "2006"; yearValues[13] = "2007"; yearValues[14] = "2008";
        yearValues[15] = "2009"; yearValues[16] = "2010"; yearValues[17] = "2011"; yearValues[18] = "2012"; yearValues[19] = "2013";
        // Array values of Population
        double [] popValues = new double[POPARRAYSIZE];
        popValues[0] = 260327021; popValues[1] = 262803276; popValues[2] = 265228572; popValues[3] = 267783607;
        popValues[4] = 270248003; popValues[5] = 272690813; popValues[6] = 281421906; popValues[7] = 285317559;
        popValues[8] = 287973924; popValues[9] = 290788976; popValues[10] = 293656842; popValues[11] = 296507061;
        popValues[12] = 299398484; popValues[13] = 301621157; popValues[14] = 304059724; popValues[15] = 307006550;
        popValues[16] = 309330219; popValues[17] = 311587816; popValues[18] = 313873685; popValues[19] = 316128839;
        // Array values of Violent Crimes
        String[] vioValues = new String[VCRIMEARRAYSIZE];
        vioValues[0] = "1857670"; vioValues[1] = "1798792"; vioValues[2] = "1688540"; vioValues[3] = "1636096";
        vioValues[4] = "1533887"; vioValues[5] = "1426044"; vioValues[6] = "1425486"; vioValues[7] = "1439480";
        vioValues[8] = "1423677"; vioValues[9] = "1383676"; vioValues[10] = "1360088"; vioValues[11] = "1390745";
        vioValues[12] = "1435123"; vioValues[13] = "1422970"; vioValues[14] = "1394461"; vioValues[15] = "1325896";
        vioValues[16] = "1251248"; vioValues[17] = "1206005"; vioValues[18] = "1217057"; vioValues[19] = "1163146";
        // Array values of Violent Crime Rate
        String[] vioRValues = new String[VCRIMERARRAYSIZE];
        vioRValues[0] = "713.6"; vioRValues[1] = "684.5"; vioRValues[2] = "636.6"; vioRValues[3] = "611";
        vioRValues[4] = "567.6"; vioRValues[5] = "523"; vioRValues[6] = "506.5"; vioRValues[7] = "504.5";
        vioRValues[8] = "494.4"; vioRValues[9] = "475.8"; vioRValues[10] = "463.2"; vioRValues[11] = "469";
        vioRValues[12] = "479.3"; vioRValues[13] = "471.8"; vioRValues[14] = "458.6"; vioRValues[15] = "431.9";
        vioRValues[16] = "404.5"; vioRValues[17] = "387.1"; vioRValues[18] = "387.8"; vioRValues[19] = "367.9";
        // Array values of Murder Crimes
        String[] murdValues = new String[MURDERARRAYSIZE];
        murdValues[0] = "23326"; murdValues[1] = "21606"; murdValues[2] = "19645"; murdValues[3] =  "18208";
        murdValues[4] = "16974"; murdValues[5] = "15522"; murdValues[6] = "15586"; murdValues[7] = "16037";
        murdValues[8] = "16229"; murdValues[9] = "16528"; murdValues[10] = "16148"; murdValues[11] = "16740";
        murdValues[12] = "17309"; murdValues[13] = "17128"; murdValues[14] = "16465"; murdValues[15] = "15399";
        murdValues[16] = "14722"; murdValues[17] = "14661"; murdValues[18] = "14856"; murdValues[19] = "14196";
        // Array values of Murder Crime Rate
        String[] murdRValues = new String[MURDRARRAYSIZE];
        murdRValues[0] = "9"; murdRValues[1] = "8.2"; murdRValues[2] = "7.4"; murdRValues[3] = "6.8";
        murdRValues[4] = "6.3"; murdRValues[5] = "5.7"; murdRValues[6] = "5.5"; murdRValues[7] = "5.6";
        murdRValues[8] = "5.6"; murdRValues[9] = "5.7"; murdRValues[10] = "5.5"; murdRValues[11] = "5.6";
        murdRValues[12] = "5.8"; murdRValues[13] = "5.7"; murdRValues[14] = "5.4"; murdRValues[15] = "5";
        murdRValues[16] = "4.8"; murdRValues[17] = "4.7"; murdRValues[18] = "4.7"; murdRValues[19] = "4.5";
        // Array values of Rape Crimes
        String[] rapeValues = new String[RAPEARRAYSIZE];
        rapeValues[0] = "102216"; rapeValues[1] = "97470"; rapeValues[2] = "96252"; rapeValues[3] = "96153";
        rapeValues[4] = "93144"; rapeValues[5] = "89411"; rapeValues[6] = "90178"; rapeValues[7] = "90863";
        rapeValues[8] = "95235"; rapeValues[9] = "93883"; rapeValues[10] = "95089"; rapeValues[11] = "94347";
        rapeValues[12] = "94472"; rapeValues[13] = "92160"; rapeValues[14] = "90750"; rapeValues[15] = "89241";
        rapeValues[16] = "85593"; rapeValues[17] = "84175"; rapeValues[18] = "85141"; rapeValues[19] = "79770";
        // Array values of Rape Crime Rate
        String[] rapeRValues = new String[RAPERARRAYSIZE];
        rapeRValues[0] = "39.3"; rapeRValues[1] = "37.1"; rapeRValues[2] = "36.3"; rapeRValues[3] = "35.9";
        rapeRValues[4] = "34.5"; rapeRValues[5] = "32.8"; rapeRValues[6] = "32"; rapeRValues[7] = "31.8";
        rapeRValues[8] = "33.1"; rapeRValues[9] = "32.3"; rapeRValues[10] = "32.4"; rapeRValues[11] = "31.8";
        rapeRValues[12] = "31.6"; rapeRValues[13] = "30.6"; rapeRValues[14] = "29.8"; rapeRValues[15] = "29.1";
        rapeRValues[16] = "27.7"; rapeRValues[17] = "27"; rapeRValues[18] = "27.1"; rapeRValues[19] = "25.2";
        // Array values of Robbery Crimes
        String[] robValues = new String[ROBARRAYSIZE];
        robValues[0] = "618949"; robValues[1] = "580509"; robValues[2] = "535594"; robValues[3] = "498534";
        robValues[4] = "447186"; robValues[5] = "409371"; robValues[6] = "408016"; robValues[7] = "423557";
        robValues[8] = "420806"; robValues[9] = "414235"; robValues[10] = "401470"; robValues[11] = "417438";
        robValues[12] = "449246"; robValues[13] = "447324"; robValues[14] = "443563"; robValues[15] = "408742";
        robValues[16] = "369089"; robValues[17] = "354746"; robValues[18] = "355051"; robValues[19] = "345031";
        // Array values of Robbery Crime Rate
        String[] robRValues = new String[ROBRARRAYSIZE];
        robRValues[0] = "237.8"; robRValues[1] = "220.9"; robRValues[2] = "201.9"; robRValues[3] = "186.2";
        robRValues[4] = "165.5"; robRValues[5] = "150.1"; robRValues[6] = "145"; robRValues[7] = "148.5";
        robRValues[8] = "146.1"; robRValues[9] = "142.5"; robRValues[10] = "136.7"; robRValues[11] = "140.8";
        robRValues[12] = "150";  robRValues[13] = "148.3"; robRValues[14] = "145.9"; robRValues[15] = "133.1";
        robRValues[16] = "119.3"; robRValues[17] = "113.9"; robRValues[18] = "113.1"; robRValues[19] = "109.1";
        // Array values of Aggravated Assault Crimes
        String[] aggValues = new String[AGGARRAYSIZE];
        aggValues[0] = "1113179"; aggValues[1] = "1099207"; aggValues[2] = "1037049"; aggValues[3] = "1023201";
        aggValues[4] = "976583"; aggValues[5] = "911740"; aggValues[6] = "911706"; aggValues[7] = "909023";
        aggValues[8] = "891407"; aggValues[9] = "859030"; aggValues[10] = "847381"; aggValues[11] = "862220";
        aggValues[12] = "874096"; aggValues[13] = "866358"; aggValues[14] = "843683"; aggValues[15] = "812514";
        aggValues[16] = "781844"; aggValues[17] = "752423"; aggValues[18] = "762009"; aggValues[19] = "724149";
        // Array values of Aggravated Assault Crime Rate
        String[] aggRValues = new String[AGGRARRAYSIZE];
        aggRValues[0] = "427.6"; aggRValues[1] = "418.3"; aggRValues[2] = "391"; aggRValues[3] = "382.1";
        aggRValues[4] = "361.4"; aggRValues[5] = "334.3"; aggRValues[6] = "324"; aggRValues[7] = "318.6";
        aggRValues[8] = "309.5"; aggRValues[9] = "295.4"; aggRValues[10] = "288.6"; aggRValues[11] = "290.8";
        aggRValues[12] = "292";  aggRValues[13] = "287.2"; aggRValues[14] = "277.5"; aggRValues[15] = "264.7";
        aggRValues[16] = "252.8"; aggRValues[17] = "241.5"; aggRValues[18] = "242.8"; aggRValues[19] = "229.1";
        // Array values of Property Crimes
        String[] propValues = new String[PROPARRAYSIZE];
        propValues[0] = "12131873"; propValues[1] = "12063935"; propValues[2] = "11805323"; propValues[3] = "11558475";
        propValues[4] = "10951827"; propValues[5] = "10208334"; propValues[6] = "10182584"; propValues[7] = "10437189";
        propValues[8] = "10455277"; propValues[9] = "10442862"; propValues[10] = "10319386"; propValues[11] = "10174754";
        propValues[12] = "10019601"; propValues[13] = "9882212"; propValues[14] = "9774152"; propValues[15] = "9337060";
        propValues[16] = "9112625"; propValues[17] = "9052743"; propValues[18] = "9001992"; propValues[19] = "8632512";
        // Array values of Property Crime Rate
        String[] propRValues = new String[PROPRARRAYSIZE];
        propRValues[0] = "4660.2"; propRValues[1] = "4590.5"; propRValues[2] = "4451"; propRValues[3] = "4316.3";
        propRValues[4] = "4052.5"; propRValues[5] = "3743.6"; propRValues[6] = "3618.3"; propRValues[7] = "3658.1";
        propRValues[8] = "3630.6"; propRValues[9] = "3591.2"; propRValues[10] = "3514.1"; propRValues[11] = "3431.5";
        propRValues[12] = "3346.6"; propRValues[13] = "3276.4"; propRValues[14] = "3214.6"; propRValues[15] = "3041.3";
        propRValues[16] = "2945.9"; propRValues[17] = "2905.4"; propRValues[18] = "2868"; propRValues[19] = "2730.7";
        // Array values of Burglary Crimes
        String[] burgValues = new String[BURGARRAYSIZE];
        burgValues[0] = "2712774"; burgValues[1] = "2593784"; burgValues[2] = "2506400"; burgValues[3] = "2460526";
        burgValues[4] = "2332735"; burgValues[5] = "2100739"; burgValues[6] = "2050992"; burgValues[7] = "2116531";
        burgValues[8] = "2151252"; burgValues[9] = "2154834"; burgValues[10] = "2144446"; burgValues[11] = "2155448";
        burgValues[12] = "2194993"; burgValues[13] = "2190198"; burgValues[14] = "2228887"; burgValues[15] = "2203313";
        burgValues[16] = "2168459"; burgValues[17] = "2185140"; burgValues[18] = "2109932"; burgValues[19] = "1928465";
        // Array values of Burglary Crime Rate
        String[] burgRValues = new String[BURGRARRAYSIZE];
        burgRValues[0] = "1042.1"; burgRValues[1] = "987"; burgRValues[2] = "945"; burgRValues[3] = "918.8";
        burgRValues[4] = "863.2"; burgRValues[5] = "770.4"; burgRValues[6] = "728.8"; burgRValues[7] = "741.8";
        burgRValues[8] = "747"; burgRValues[9] = "741"; burgRValues[10] = "730.3"; burgRValues[11] = "726.9";
        burgRValues[12] = "733.1"; burgRValues[13] = "726.1"; burgRValues[14] = "733"; burgRValues[15] = "717.7";
        burgRValues[16] = "701"; burgRValues[17] = "701.3"; burgRValues[18] = "672.2"; burgRValues[19] = "610";
        // Array values of Larceny Crimes
        String[] larcValues = new String[LARCARRAYSIZE];
        larcValues[0] = "7879812"; larcValues[1] = "7997710"; larcValues[2] = "7904685"; larcValues[3] = "7743760";
        larcValues[4] = "7376311"; larcValues[5] = "6955520"; larcValues[6] = "6971590"; larcValues[7] = "7092267";
        larcValues[8] = "7057379"; larcValues[9] = "7026802"; larcValues[10] = "6937089"; larcValues[11] = "6783447";
        larcValues[12] = "6626363"; larcValues[13] = "6591542"; larcValues[14] = "6586206"; larcValues[15] = "6338095";
        larcValues[16] = "6204601"; larcValues[17] = "6151095"; larcValues[18] = "6168874"; larcValues[19] = "6004453";
        // Array values of Larceny Crime Rates
        String[] larcRValues = new String[LARCRARRAYSIZE];
        larcRValues[0] = "3026.9"; larcRValues[0] = "3043.2"; larcRValues[0] = "2980.3"; larcRValues[0] = "2891.8";
        larcRValues[0] = "2729.5"; larcRValues[0] = "2550.7"; larcRValues[0] = "2477.3"; larcRValues[0] = "2485.7";
        larcRValues[0] = "2450.7"; larcRValues[0] = "2416.5"; larcRValues[0] = "2362.3"; larcRValues[0] = "2287.8";
        larcRValues[0] = "2213.2"; larcRValues[0] = "2185.4"; larcRValues[0] = "2166.1"; larcRValues[0] = "2064.5";
        larcRValues[0] = "2005.8"; larcRValues[0] = "1974.1"; larcRValues[0] = "1965.4"; larcRValues[0] = "1899.4";
        // Array values of Theft Crimes
        String[] theftValues = new String[THEFTARRAYSIZE];
        theftValues[0] = "1539287"; theftValues[0] = "1472441"; theftValues[0] = "1394238"; theftValues[0] = "1354189";
        theftValues[0] = "1242781"; theftValues[0] = "1152075"; theftValues[0] = "1160002"; theftValues[0] = "1228391";
        theftValues[0] = "1246646"; theftValues[0] = "1261226"; theftValues[0] = "1237851"; theftValues[0] = "1235859";
        theftValues[0] = "1198245"; theftValues[0] = "1100472"; theftValues[0] = "959059"; theftValues[0] = "795652";
        theftValues[0] = "739565"; theftValues[0] = "716508"; theftValues[0] = "723186"; theftValues[0] = "699594";
        // Array values of Theft Crime Rates
        String[] theftRValues = new String[THEFTRARRAYSIZE];
        theftRValues[0] = "591.3"; theftRValues[0] = "560.3"; theftRValues[0] = "525.7"; theftRValues[0] = "505.7";
        theftRValues[0] = "459.9"; theftRValues[0] = "422.5"; theftRValues[0] = "412.2"; theftRValues[0] = "430.5";
        theftRValues[0] = "432.9"; theftRValues[0] = "433.7"; theftRValues[0] = "421.5"; theftRValues[0] = "416.8";
        theftRValues[0] = "400.2"; theftRValues[0] = "364.9"; theftRValues[0] = "315.4"; theftRValues[0] = "259.2";
        theftRValues[0] = "239.1"; theftRValues[0] = "230";  theftRValues[0] = "230.4"; theftRValues[0] = "221.3";

        // formula
        double popChangeOne = 100*((popValues[1] - popValues[0]) / popValues[0]); // Percentage of population increase 1994-1995
        double popChangeTwo = 100*(popValues[2] - popValues[1]) / popValues[1]; // Percentage of population increase 1995-1996
        double popChangeThree = 100*(popValues[3] - popValues[2]) / popValues[2]; // Percentage of population increase 1996-1997
        double popChangeFour = 100*(popValues[4] - popValues[3]) / popValues[3]; // Percentage of population increase 1997-1998
        double popChangeFive = 100*(popValues[5] - popValues[4]) / popValues[4]; // Percentage of population increase 1998-1999
        double popChangeSix = 100*(popValues[6] - popValues[5]) / popValues[5]; // Percentage of population increase 1999-2000
        double popChangeSeven = 100*(popValues[7] - popValues[6]) / popValues[6]; // Percentage of population increase 2000-2001
        double popChangeEight = 100*(popValues[8] - popValues[7]) / popValues[7]; // Percentage of population increase 2001-2002
        double popChangeNine = 100*(popValues[9] - popValues[8]) / popValues[8]; // Percentage of population increase 2002-2003
        double popChangeTen = 100*(popValues[10] - popValues[9]) / popValues[9]; // Percentage of population increase 2003-2004
        double popChangeEleven = 100*(popValues[11] - popValues[10]) / popValues[10]; // Percentage of population increase 2004-2005
        double popChangeTwelve = 100*(popValues[12] - popValues[11]) / popValues[11]; // Percentage of population increase 2005-2006
        double popChangeThirteen = 100*(popValues[13] - popValues[12]) / popValues[12]; // Percentage of population increase 2006-2007
        double popChangeFourteen = 100*(popValues[14] - popValues[13]) / popValues[13]; // Percentage of population increase 2007-2008
        double popChangeFifteen = 100*(popValues[15] - popValues[14]) / popValues[14]; // Percentage of population increase 2008-2009
        double popChangeSixteen = 100*(popValues[16] - popValues[15]) / popValues[15]; // Percentage of population increase 2009-2010
        double popChangeSeventeen = 100*(popValues[17] - popValues[16]) / popValues[16]; // Percentage of population increase 2010-2011
        double popChangeEighteen = 100*(popValues[18] - popValues[17]) / popValues[17]; // Percentage of population increase 2011-2012
        double popChangeNineteen = 100*(popValues[19] - popValues[18]) / popValues[18]; // Percentage of population increase 2012-2013


        // add 2 spaces
        System.out.print("\n \n");
        // finding the time before the operation is executed
        long start = System.currentTimeMillis();
        for (int i = 0; i <5; i++) {
            Thread.sleep(60);
        }

        // Welcome message
        System.out.println("This application lists the statistics of crimes and crime rates ");

        // Display total array length
        System.out.print("This app covers crimes from years 1994-2003, with a total of ");
        System.out.println(yearValues.length + " different parameters"+"\n");

        //initialize utilities
        // Use the Scanner class to read user input
        Scanner scanner = new Scanner(System.in);
        // Define a InputStreamReader based on Standard Input (System.in)
        InputStreamReader isReader = new InputStreamReader(System.in);
        // Send the InputStreamReader to a BufferedReader
        BufferedReader stdin = new BufferedReader(isReader);

        // do statement to assign loop function of app
        do{

            // Print program instructions
            String[] Instruction = new String[INSTRUCTIONLIST];
            Instruction[0] = "Enter the number of the question you want answered. Enter ‘Q’ to quit the program : \n" +
                    "1. What were the percentages in population growth for each consecutive year from 1994 to 2013? \n" +
                    "2. Murder \n3. Robbery \n4. Aggravated Assault \n5. Larceny-Theft \n6. Motor Vehicle Theft \n" +
                    "7. Property Crimes \n8. Rape \n9. Violent Crimes \n10.Burglary \n";
            System.out.println(Instruction[0]);

            //Prompt user for selected question.
            yourChoice = scanner.next();

            if (yourChoice.equals("1")) {
                System.out.println("Enter the number of the question you want answered. Enter ‘Q’ to quit the program : \n");
                System.out.println("Percentage of population increase from 1994-1995 = " + popChangeOne + "\n");
                System.out.println("Percentage of population increase from 1995-1996 = " + popChangeTwo + "\n");
                System.out.println("Percentage of population increase from 1996-1997 = " + popChangeThree + "\n");
                System.out.println("Percentage of population increase from 1997-1998 = " + popChangeFour + "\n");
                System.out.println("Percentage of population increase from 1998-1999 = " + popChangeFive + "\n");
                System.out.println("Percentage of population increase from 1999-2000 = " + popChangeSix + "\n");
                System.out.println("Percentage of population increase from 2000-2001= " + popChangeSeven + "\n");
                System.out.println("Percentage of population increase from 2001-2002 = " + popChangeEight + "\n");
                System.out.println("Percentage of population increase from 2002-2003 = " + popChangeNine + "\n");
                System.out.println("Percentage of population increase from 2003-2004 = " + popChangeTen + "\n");
                System.out.println("Percentage of population increase from 2004-2005 = " + popChangeEleven + "\n");
                System.out.println("Percentage of population increase from 2005-2006 = " + popChangeTwelve + "\n");
                System.out.println("Percentage of population increase from 2006-2007 = " + popChangeThirteen + "\n");
                System.out.println("Percentage of population increase from 2007-2008 = " + popChangeFourteen + "\n");
                System.out.println("Percentage of population increase from 2008-2009 = " + popChangeFifteen + "\n");
                System.out.println("Percentage of population increase from 2009-2010 = " + popChangeSixteen + "\n");
                System.out.println("Percentage of population increase from 2010-2011 = " + popChangeSeventeen + "\n");
                System.out.println("Percentage of population increase from 2011-2012 = " + popChangeEighteen + "\n");
                System.out.println("Percentage of population increase from 2011-2013 = " + popChangeNineteen + "\n");
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }

            if (yourChoice.equals("2")) {
                System.out.println("Enter the number of the question you want answered. Enter ‘Q’ to quit the program : \n");
                System.out.println("2. What were the total amount of Murder Crimes, and the crime rate by the year?");
                System.out.println("3. What year was the Murder Crime rate the highest?");
                System.out.println("4. What year was the Murder Crime rate the lowest?");
                String twoChoice = scanner.next();
                if (twoChoice.equals("2")) {System.out.println("Year = " +Arrays.toString(yearValues) + "\n");
                    System.out.println("Total Crimes = " +Arrays.toString(murdValues) + "\n");
                    System.out.println("Crime Rates = "+ Arrays.toString(murdRValues) + "\n");
                }
                if (twoChoice.equals("3")) {System.out.println(yearValues[0]+ " = Murder Crime Rate of " +murdRValues[0]+ "\n");
                }
                if (twoChoice.equals("4")) {System.out.println(yearValues[19]+ " = Murder Crime Rate of " +murdRValues[19]+ "\n");
                }
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }

            if (yourChoice.equals("3")) {
                System.out.println("Enter the number of the question you want answered. Enter ‘Q’ to quit the program : \n");
                System.out.println("5. What were the total amount of Robbery Crimes by the year?");
                System.out.println("6. What year was the Robbery Crime rate the highest?");
                System.out.println("7. What year was the Robbery Crime rate the lowest?");
                String threeChoice = scanner.next();
                if (threeChoice.equals("5")) {System.out.println("Year = " +Arrays.toString(yearValues) + "\n");
                    System.out.println("Total Crimes = " +Arrays.toString(robValues) + "\n");
                    System.out.println("Crime Rates = "+ Arrays.toString(robRValues) + "\n");
                }
                if (threeChoice.equals("6")) {System.out.println(yearValues[0]+ " = Robbery Crime Rate of " +robRValues[0]+ "\n");
                }
                if (threeChoice.equals("7")) {System.out.println(yearValues[19]+ " = Robbery Crime Rate of " +robRValues[19]+ "\n");
                }
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }

            if (yourChoice.equals("4")) {
                System.out.println("Enter the number of the question you want answered. Enter ‘Q’ to quit the program : \n");
                System.out.println("8. What were the total amount of Aggravated Assault Crimes by the year?");
                System.out.println("9. What year was the Aggravated Assault rate the highest?");
                System.out.println("10. What year was the Aggravated Assault rate the lowest?");
                String fourChoice = scanner.next();
                if (fourChoice.equals("8")) {System.out.println("Year = " +Arrays.toString(yearValues) + "\n");
                    System.out.println("Total Crimes = " +Arrays.toString(aggValues) + "\n");
                    System.out.println("Crime Rates = "+ Arrays.toString(aggRValues) + "\n");
                }
                if (fourChoice.equals("9")) {System.out.println(yearValues[0]+ " = Aggravated Assault Crime Rate of " +aggRValues[0]+ "\n");
                }
                if (fourChoice.equals("10")) {System.out.println(yearValues[19]+ " = Aggravated Assault Crime Rate of " +aggRValues[19]+ "\n");
                }
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }

            if (yourChoice.equals("5")) {
                System.out.println("Enter the number of the question you want answered. Enter ‘Q’ to quit the program : \n");
                System.out.println("11. What were the total amount of Larceny-Theft Crimes by the year?");
                System.out.println("12. What year was the Larceny-Theft rate the highest?");
                System.out.println("13. What year was the Larceny-Theft rate the lowest?");
                String fiveChoice = scanner.next();
                if (fiveChoice.equals("11")) {System.out.println("Year = " +Arrays.toString(yearValues) + "\n");
                    System.out.println("Total Crimes = " +Arrays.toString(larcValues) + "\n");
                    System.out.println("Crime Rates = "+ Arrays.toString(larcRValues) + "\n");
                }
                if (fiveChoice.equals("12")) {System.out.println(yearValues[0]+ " = Larceny-Theft Crime Rate of " +larcRValues[0]+ "\n");
                }
                if (fiveChoice.equals("13")) {System.out.println(yearValues[19]+ " = Larceny-Theft Crime Rate of " +larcRValues[19]+ "\n");
                }
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }

            if (yourChoice.equals("6")) {
                System.out.println("Enter the number of the question you want answered. Enter ‘Q’ to quit the program : \n");
                System.out.println("14. What were the total amount of Motor Vehicle Theft Crimes by the year?");
                System.out.println("15. What year was the Motor Vehicle Theft rate the highest?");
                System.out.println("16. What year was the Motor Vehicle Theft rate the lowest?");
                String sixChoice = scanner.next();
                if (sixChoice.equals("14")) {System.out.println("Year = " +Arrays.toString(yearValues) + "\n");
                    System.out.println("Total Crimes = " +Arrays.toString(theftValues) + "\n");
                    System.out.println("Crime Rates = "+ Arrays.toString(theftRValues) + "\n");
                }
                if (sixChoice.equals("15")) {System.out.println(yearValues[0]+ " = Motor Vehicle Theft Crime Rate of " +theftRValues[0]+ "\n");
                }
                if (sixChoice.equals("16")) {System.out.println(yearValues[19]+ " = Motor Vehicle Theft Crime Rate of " +theftRValues[19]+ "\n");
                }
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }

            if (yourChoice.equals("7")) {
                System.out.println("Enter the number of the question you want answered. Enter ‘Q’ to quit the program : \n");
                System.out.println("17. What were the total amount of Property Crimes by the year?");
                System.out.println("18. What year was the Property Crime rate the highest?");
                System.out.println("19. What year was the Property Crime rate the lowest?");
                String sevenChoice = scanner.next();
                if (sevenChoice.equals("17")) {System.out.println("Year = " +Arrays.toString(yearValues) + "\n");
                    System.out.println("Total Crimes = " +Arrays.toString(propValues) + "\n");
                    System.out.println("Crime Rates = "+ Arrays.toString(propRValues) + "\n");
                }
                if (sevenChoice.equals("18")) {System.out.println(yearValues[0]+ " = Property Crime Rate of " +propRValues[0]+ "\n");
                }
                if (sevenChoice.equals("19")) {System.out.println(yearValues[19]+ " = Property Crime Rate of " +propRValues[19]+ "\n");
                }
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }

            if (yourChoice.equals("8")) {
                System.out.println("Enter the number of the question you want answered. Enter ‘Q’ to quit the program : \n");
                System.out.println("20. What were the total amount of Rape Crimes by the year?");
                System.out.println("21. What year was the Rape Crime rate the highest?");
                System.out.println("22. What year was the Rape Crime rate the lowest?");
                String eightChoice = scanner.next();
                if (eightChoice.equals("20")) {System.out.println("Year = " +Arrays.toString(yearValues) + "\n");
                    System.out.println("Total Crimes = " +Arrays.toString(rapeValues) + "\n");
                    System.out.println("Crime Rates = "+ Arrays.toString(rapeRValues) + "\n");
                }
                if (eightChoice.equals("21")) {System.out.println(yearValues[0]+ " = Rape Crime Rate of " +rapeRValues[0]+ "\n");
                }
                if (eightChoice.equals("22")) {System.out.println(yearValues[19]+ " = Rape Crime Rate of " +rapeRValues[19]+ "\n");
                }
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }

            if (yourChoice.equals("9")) {
                System.out.println("Enter the number of the question you want answered. Enter ‘Q’ to quit the program : \n");
                System.out.println("23. What were the total amount of Violent Crimes by the year?");
                System.out.println("24. What year was the Violent Crime rate the highest?");
                System.out.println("25. What year was the Violent Crime rate the lowest?");
                String nineChoice = scanner.next();
                if (nineChoice.equals("23")) {System.out.println("Year = " +Arrays.toString(yearValues) + "\n");
                    System.out.println("Total Crimes = " +Arrays.toString(vioValues) + "\n");
                    System.out.println("Crime Rates = "+ Arrays.toString(vioRValues) + "\n");
                }
                if (nineChoice.equals("24")) {System.out.println(yearValues[0]+ " = Violent Crime Rate of " +vioRValues[0]+ "\n");
                }
                if (nineChoice.equals("25")) {System.out.println(yearValues[19]+ " = Violent Crime Rate of " +vioRValues[19]+ "\n");
                }
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }

            if (yourChoice.equals("10")) {
                System.out.println("Enter the number of the question you want answered. Enter ‘Q’ to quit the program : \n");
                System.out.println("26. What were the total amount of Burglary Crimes, and the crime rate by the year?");
                System.out.println("27. What year was the Burglary Crime rate the highest?");
                System.out.println("28. What year was the Burglary Crime rate the lowest?");
                String tenChoice = scanner.next();
                if (tenChoice.equals("26")) {System.out.println("Year = " +Arrays.toString(yearValues) + "\n");
                    System.out.println("Total Crimes = " +Arrays.toString(burgValues) + "\n");
                    System.out.println("Crime Rates = "+ Arrays.toString(burgRValues) + "\n");
                }
                if (tenChoice.equals("27")) {System.out.println(yearValues[0]+ " = Burglary Crime Rate of " +burgRValues[0]+ "\n");
                }
                if (tenChoice.equals("28")) {System.out.println(yearValues[19]+ " = Burglary Crime Rate of " +burgRValues[19]+ "\n");
                }
                //pause before loop
                System.out.println("Press enter to go back to beginning");
                newChoice = stdin.readLine();
            }

            if (yourChoice.equalsIgnoreCase("Q")) { System.out.println("Thank you for using the U.S. Crime Info Application");
                // finding the time after the operation is executed
                long end = System.currentTimeMillis();
                //finding the time difference and converting it into seconds
                float sec = (end - start) / 1000F; System.out.println("Total time spent is " + sec + " seconds");
                System.exit(0);


            }

        } while (!yourChoice.equalsIgnoreCase("Q"));
    }
}


