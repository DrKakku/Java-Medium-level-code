import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class fileHandling {

    public static void main(String args[]) throws FileNotFoundException {

        File text = new File(
                "/Users/yashtripathi/Documents/OneDrive/yash docs/Work/Collage/Semister 5/Java Lab/LAB_10/data.csv");

        Scanner scnr = new Scanner(text);
        // String num = new String("new words");
        // Reading each line of the file using Scanner class
        int totalNumbers = 1;
        // int sum = 0;
        while (scnr.hasNextLine()) {
            System.out.println( "Line Number "+totalNumbers+"COntent is :- "+scnr.nextLine());
            // System.out.println("line " + lineNumber + " :" + line);

            totalNumbers ++;
        }

        // File f;
        // try{
        //     f = new File("/Users/yashtripathi/Documents/OneDrive/yash docs/Work/Collage/Semister 5/Java Lab/LAB_10/file.txt");
        //     FileOutputStream foa = new FileOutputStream(f,true);
        //     String x = "\nThis is a test\n";
        //     foa.write(x.getBytes());
        //     foa.write(3);
        //     foa.flush();

        // }
        // catch(IOException e)
        // {}

        scnr.close();

        // try{
        //     FileWriter muneem = new FileWriter("/Users/yashtripathi/Documents/OneDrive/yash docs/Work/Collage/Semister 5/Java Lab/LAB_10/file.txt",true);
        //     muneem.write(num);
        //     muneem.close();
        // }
        // catch (IOException e) {
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        //     }
    }
}