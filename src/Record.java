
import java.io.*;
import java.util.Scanner;


public class Record {
public static int my;
public static String recordnumber;


  public static String getrecord()throws Exception{
File myobj= new File("recordno.txt");
        Scanner myreader=new Scanner(myobj);
        while (myreader.hasNextLine()) {
            recordnumber=myreader.nextLine();
       
my=Integer.parseInt(recordnumber);
my++;
        }
myreader.close();
FileWriter mywriter= new FileWriter("recordno.txt");
mywriter.write(Integer.toString(my));

                mywriter.close();

    return recordnumber;

}
}
