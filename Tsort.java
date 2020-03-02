
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Tsort{

    public static void main(String[]args){        
        String filename="";
        try{            
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\n txt File Sort\n");
            System.out.print("File Name: ");
            filename=console.readLine()+".txt";
            File f = new File(filename);
            if(f.exists()){                
                System.out.println("Sorting: "+filename);
                FileReader fr = new FileReader(f);            
                BufferedReader bf = new BufferedReader(fr);
                String inputLine = "";
                LinkedList<String> ls = new LinkedList<String>();
                while((inputLine=bf.readLine())!=null){
                    ls.add(inputLine);
                }
                Collections.sort(ls);
                bf.close();
                fr.close();
                
                FileWriter fw = new FileWriter(f);
                PrintWriter pw = new PrintWriter(fw);                
                for(String s:ls){
                    pw.println(s);
                }
                System.out.print(filename+" has been sorted");
                pw.close();
                fw.close();                
            }
            else{
                    System.out.println("can't find file: "+filename);
            }
                                            
            
        }catch(Exception e){System.out.println(e.toString());}
        

    }

}