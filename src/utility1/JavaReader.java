package utility1;

import com.sun.org.apache.xerces.internal.parsers.CachingParserPool;

import java.io.*;

public class JavaReader {
    public static String readFile(String filePath) {
        String x = null;
        String text;
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

                while ((text = bufferedReader.readLine())!=null) {
                    x=text;

                }
                fileReader.close();
            } catch(IOException ex){
                ex.printStackTrace();
            }
            System.out.println(x);
            return x;
        }


    public static void main(String[] args) {
        //readFile("src/utility1/info.text");
        //readFile("/Users/jakirhussain/IdeaProjects/Java basic/src/utility1/Information.txt");
        fileWrite("src/utility1/info.text","ola mamy");
    }
    public static void  fileWrite(String filePath,String text){
        try {
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(filePath,true));
      bufferedWriter.write(" " +text);

      bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
