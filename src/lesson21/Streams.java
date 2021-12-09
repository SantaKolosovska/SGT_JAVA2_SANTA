package lesson21;

import java.io.*;
import java.util.Scanner;

public class Streams {

    public static void main(String[] args) {

        // out - STDOUT
        System.out.println("This is System STDOUT");

        // in - STDIN
//        Scanner scanner = new Scanner(System.in);
//        String sysIn = scanner.next();

        // error - STDERR
        // throw  new Exception("Throwing exception into STERR");

        File newFile = new File("myOutput.txt");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
            writer.write("New line");   // writes and overwrites
            writer.append("This is a new line to append to the file");  // appends
            writer.close();
        } catch (IOException e) {
            System.out.println("File does not exist");
        }

        //
//        BufferedWriter bw = null;
//        try {
//            String mycontent = "This String would be written" +
//                    " to the specified File";
//            //Specify the file name and path here
//            File file = new File("myfile.txt");
//
//            /* This logic will make sure that the file
//             * gets created if it is not present at the
//             * specified location*/
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//
//            FileWriter fw = new FileWriter(file);
//            bw = new BufferedWriter(fw);
//            bw.write(mycontent);
//            System.out.println("File written Successfully");
//
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
//        finally
//        {
//            try{
//                if(bw!=null)
//                    bw.close();
//            }catch(Exception ex){
//                System.out.println("Error in closing the BufferedWriter"+ex);
//            }
//        }

    }
}
