/**
 * Created by rlama on 4/22/2017.
 */
package edu.sdsu.cs;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
    public class CSVReader {

        public ArrayList<String[]> getRawData(String filePath){
            ArrayList<String> rawData = new ArrayList<String>();
            ArrayList<String[]> splitRawData = new ArrayList<>();
            try{
                BufferedReader br = new BufferedReader((new FileReader(new File("FullData.csv"))));
                String curline = br.readLine();
                curline = br.readLine();
                while(curline !=null){
                    rawData.add(curline);
                    curline = br.readLine();

                }
                for(String line:rawData){
                    splitRawData.add(line.split(","));

                }

            }catch(FileNotFoundException e){
                System.out.println("File is not valid");
            }catch(IOException e){
                System.out.println("unable to read file");
            }
            return splitRawData;
        }
}
