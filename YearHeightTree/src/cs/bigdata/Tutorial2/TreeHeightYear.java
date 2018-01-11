package cs.bigdata.Tutorial2;


import java.io.*;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;



public class TreeHeightYear {

    public static void main(String[] args) throws IOException, NumberFormatException {
        
        
        String localSrc = "/home/cloudera/Downloads/arbres.csv";
        //Open the file
        Configuration conf = new Configuration();
        FileSystem fs = FileSystem.get(conf);
        InputStream in = new BufferedInputStream(new FileInputStream(localSrc));
        
        try{
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(isr);
            Integer nbLines = 0;
            // read line by line
            String line = br.readLine();
            
            while (line !=null){
                // Process of the current line
                //System.out.println(line);
                // go to the next line
                nbLines+=1;
                if(nbLines > 1){
                    Tree tree = new Tree(line);
                    tree.displayTree();
                }
                line = br.readLine();
            }
            System.out.println(nbLines);
        }
        finally{
            //close the file
            in.close();
            fs.close();
            
        }
 
        
        
    }

}