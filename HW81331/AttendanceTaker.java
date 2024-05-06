//I worked on the homework assignment alone, using only course material 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.NoSuchElementException;
import java.util.Scanner;
/** 
*This class holds the main method which runs attendence on an input and output file
* @author jEET bhatkar
* @version 1.0
*/
public class AttendanceTaker {
private File inputFile;
private File outputFile;

public void takeAttendance() throws FileNotFoundException{
    String names;
    Scanner input = null;
    String[] namesArray;
    
    try {
        input = new Scanner(inputFile);
        names = input.nextLine();
        
        if(names.length() < 6 || !(names.substring(0, 3).equals("|--")
        || ! (names.substring(names.length() - 3, names.length()).equals("--|")))) {
        throw new BadFileException ("The file doesn't have correct beginning or end");
    }
        //System.out.println(names.substring(0, 3));
        //System.out.println(names.substring(names.length() - 3, names.length()));
        namesArray = names.substring(3, names.length() - 3).split("---");
        } catch (NoSuchElementException e) {
            throw new BadFileException ("The input file was empty");}
 finally {

if (input != null) {
input.close();
}
}


//System.out.println(Arrays.toString(namesArray));
Scanner scan = new Scanner(System.in);
PrintWriter print = new PrintWriter(outputFile);
for (int i = 0; i < namesArray.length; i++) {
try {
    processStudentAttendance (namesArray[i], scan, print);
        } catch (InvalidNameFormatException e) {

    System.out.println("Skipping " + namesArray[i]+" because of an invalid name for + e.getMessage()");}}
    

private static void processStudentAttendance(String name, Scanner consoleScanner,PrintWriter);{
    throws InvalidNameFormatException, InvalidAttendanceInformationException {
    //System.out.println("-" + name + "-");
    if (!(name.equals(name.toUpperCase()))) {
    printWriter.println("-");
    throw new InvalidNameFormatException ("The name isn't uppercase only");
    }
    for (int ch = 0; ch < name.length(); ch++) {
    if (Character.isDigit(name.charAt(ch))) {
    printWriter.println("-");
    throw new InvalidNameFormatException ("The name has a digit");
    } else if (((Character) name.charAt(ch)).equals('|')) {
    printWriter.println("-");
    throw new InvalidNameFormatException ("The name has a pipe character");}
    
    }
    
    System.out.print(name + ": ");
    String userInput = consoleScanner.nextLine();
    if (userInput.equals("")) {
    printWriter.println("-");
    throw new InvalidAttendanceInformationException("Attendance information missing"); } else if (!(userInput.equals("A") || userInput.equals("P"))) {
    }
    printWriter.println("-");
    throw new InvalidAttendanceInformationException("Attendance information is not P o");
    printWriter.println(userInput);
}
    /**
     * Running method for attendance for AttendanceTaker object
     * * Running method for attendance for AttendanceTaker object * @param args both file names for input and output files
    * @throws FileNotFoundException if file doesn't exist
    */
public static void main(String[] args) throws FileNotFoundException {
String file1= args[0];
String file2 = args[1];
AttendanceTaker attendance = new AttendanceTaker(file1, file2);
attendance.takeAttendance();
//AttendanceTaker test1 = new Attendance Taker("testInput.txt", "testOutput.txt"); //test1.takeAttendance();

}

}

    
       