
package latihangui;

import java.io.FileReader;
import java.io.FileNotFoundException;


public class data {
    public static void main(String[]args) throws FileNotFoundException{
       try{
           FileReader fr = new FileReader("D:\\miranti.txt");
           int i;
           while((i = fr.read())!= -1)
               System.out.print((char) i);
           fr.close();
       }
       catch(Exception e){
           System.out.print("File Tidak Di Temukan");
       }
    }

  
 
    
}
